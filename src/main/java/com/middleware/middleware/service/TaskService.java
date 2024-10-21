package com.middleware.middleware.service;

import org.camunda.community.rest.client.api.TaskApi;
import org.camunda.community.rest.client.dto.TaskDto;
import org.camunda.community.rest.client.invoker.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    TaskApi taskApi = new TaskApi();

    private List<TaskDto> tasks = new ArrayList<>();  // In-memory task storage

    // Method to return all tasks as a list
    public List<TaskDto> findAll() throws ApiException {
//        return tasks;
        tasks = taskApi.getTasks(
                null, // taskId
                null, // taskIdIn
                null, // processInstanceId
                null, // processInstanceIdIn
                null, // processInstanceBusinessKey
                null, // processInstanceBusinessKeyExpression
                null, // processInstanceBusinessKeyIn
                null, // processInstanceBusinessKeyLike
                null, // processInstanceBusinessKeyLikeExpression
                null, // processDefinitionId
                null, // processDefinitionKey
                null, // processDefinitionKeyIn
                null, // processDefinitionName
                null, // processDefinitionNameLike
                null, // executionId
                null, // caseInstanceId
                null, // caseInstanceBusinessKey
                null, // caseInstanceBusinessKeyLike
                null, // caseDefinitionId
                null, // caseDefinitionKey
                null, // caseDefinitionName
                null, // caseDefinitionNameLike
                null, // caseExecutionId
                null, // activityInstanceIdIn
                null, // tenantIdIn
                null, // withoutTenantId
                null, // assignee
                null, // assigneeExpression
                null, // assigneeLike
                null, // assigneeLikeExpression
                null, // assigneeIn
                null, // assigneeNotIn
                null, // owner
                null, // ownerExpression
                null, // candidateGroup
                null, // candidateGroupExpression
                null, // candidateUser
                null, // candidateUserExpression
                null, // includeAssignedTasks
                null, // involvedUser
                null, // involvedUserExpression
                null, // assigned
                null, // unassigned
                null, // taskDefinitionKey
                null, // taskDefinitionKeyIn
                null, // taskDefinitionKeyLike
                null, // name
                null, // nameNotEqual
                null, // nameLike
                null, // nameNotLike
                null, // description
                null, // descriptionLike
                null, // priority
                null, // maxPriority
                null, // minPriority
                null, // dueDate
                null, // dueDateExpression
                null, // dueAfter
                null, // dueAfterExpression
                null, // dueBefore
                null, // dueBeforeExpression
                null, // withoutDueDate
                null, // followUpDate
                null, // followUpDateExpression
                null, // followUpAfter
                null, // followUpAfterExpression
                null, // followUpBefore
                null, // followUpBeforeExpression
                null, // followUpBeforeOrNotExistent
                null, // followUpBeforeOrNotExistentExpression
                null, // createdOn
                null, // createdOnExpression
                null, // createdAfter
                null, // createdAfterExpression
                null, // createdBefore
                null, // createdBeforeExpression
                null, // updatedAfter
                null, // updatedAfterExpression
                null, // delegationState
                null, // candidateGroups
                null, // candidateGroupsExpression
                null, // withCandidateGroups
                null, // withoutCandidateGroups
                null, // withCandidateUsers
                null, // withoutCandidateUsers
                null, // active
                null, // suspended
                null, // taskVariables
                null, // processVariables
                null, // caseInstanceVariables
                null, // variableNamesIgnoreCase
                null, // variableValuesIgnoreCase
                null, // parentTaskId
                null, // sortBy
                null, // sortOrder
                null, // firstResult
                null  // maxResults
        );
        System.out.println(tasks);
        return tasks;
    }
}