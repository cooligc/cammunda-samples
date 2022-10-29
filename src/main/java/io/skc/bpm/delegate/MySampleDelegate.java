package io.skc.bpm.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MySampleDelegate implements JavaDelegate {


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("MyTask :  <<<<<<<<<<<<<<<<<<<<<<<<<< Started >>>>>>>>>>>>>>>>>>>>");
        System.out.println("MyTask :  <<<<<<<<<<<<<<<<<<<<<<<<<< "+ delegateExecution.getVariables()+" >>>>>>>>>>>>>>>>>>>>");
        delegateExecution.setVariable("taskStatus", "Completed");
        System.out.println("MyTask : <<<<<<<<<<<<<<<<<<<<<<<<<< Exit >>>>>>>>>>>>>>>>>>>>");
    }
}
