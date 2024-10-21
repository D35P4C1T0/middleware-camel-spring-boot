package com.middleware.middleware.route;

import com.middleware.middleware.service.TaskService;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.apache.camel.Exchange;

@Component
public class TasksRoute extends RouteBuilder {

    // Inject your TaskService
    private final TaskService taskService;

    @Value("${camel.servlet.mapping.context-path}")
    private String contextPath;

    public TasksRoute(TaskService taskService) {
        this.taskService = taskService;
    }

    @Override
    public void configure() throws Exception {

        // Configuring the REST DSL
        restConfiguration()
                .port(8091)
                .contextPath(contextPath)
                .component("servlet")
                .bindingMode(RestBindingMode.auto);

        // Defining the REST route for /hello
        rest("/hello")
            .get()
            .consumes("application/json")
            .produces("application/json")
            .to("direct:hello");

        // Defining the REST route for /tasks
        rest("/tasks")
            .get()  // GET all tasks
            .to("direct:getTasks");

        // Route implementations for each operation
        from("direct:getTasks")
            .log("Fetching all tasks")
            .to("bean:taskService?method=findAll");  // Invoking taskService bean to get all tasks

        from("direct:hello")
            .setHeader(Exchange.HTTP_RESPONSE_CODE, constant(200))
            .setBody(constant("HELLO WORLD!!!"));
    }
}
