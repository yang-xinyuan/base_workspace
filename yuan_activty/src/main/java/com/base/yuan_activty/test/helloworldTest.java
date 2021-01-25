package com.base.yuan_activty.test;
import org.activiti.engine.*;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.task.Task;
import org.junit.Test;

import java.util.List;
public class helloworldTest {

    ProcessEngine processEngine= ProcessEngines.getDefaultProcessEngine();

    @Test
    public void test()
    {
        testCreateProcessEngineByCfgXml();
        deployProcess();
        startProcess();
        queryTask();
        //handle();
    }

    @Test
    public void testCreateProcessEngineByCfgXml() {
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        ProcessEngine engine = cfg.buildProcessEngine();
    }

    @Test
    public void deployProcess()
    {
        RepositoryService repositoryService=processEngine.getRepositoryService();
        DeploymentBuilder builder=repositoryService.createDeployment();
        builder.addClasspathResource("helloWorld.bpmn");
        builder.deploy();
    }

    @Test
    public void startProcess()
    {
        RuntimeService runtimeService=processEngine.getRuntimeService();
        runtimeService.startProcessInstanceByKey("myProcess_1");
    }

    @Test
    public void queryTask() {
        TaskService taskService = processEngine.getTaskService();
        String assignee = "manager";
        List<Task> tasks = taskService.createTaskQuery().taskAssignee(assignee).list();

        int size = tasks.size();
        for (int i = 0; i < size; i++) {
            Task task = tasks.get(i);
        }

        for (Task task : tasks) {
            System.out.println("taskId:" + task.getId() +
                    ",taskName:" + task.getName() +
                    ",assignee:" + task.getAssignee() +
                    ",createTime:" + task.getCreateTime());
        }
    }

    @Test
    public void handleTask() {
        TaskService taskService = processEngine.getTaskService();
        String taskId = "22502";
        taskService.complete(taskId);
    }
}
