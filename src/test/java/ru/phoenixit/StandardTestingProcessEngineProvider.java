package ru.phoenixit;

import org.camunda.bpm.engine.rest.spi.ProcessEngineProvider;

import java.util.Set;

public class StandardTestingProcessEngineProvider implements ProcessEngineProvider {

    public org.camunda.bpm.engine.ProcessEngine getDefaultProcessEngine() {
        return null;
    }

    public org.camunda.bpm.engine.ProcessEngine getProcessEngine(String s) {
        return null;
    }

    public Set<String> getProcessEngineNames() {
        return null;
    }
}
