package io.skc.bpm.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class MyBusinessDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("MyTask : Time Task executed");
        System.out.println("MyTask : variable "+ delegateExecution.getVariables());
    }
}
