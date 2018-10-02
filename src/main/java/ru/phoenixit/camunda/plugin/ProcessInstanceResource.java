package ru.phoenixit.camunda.plugin;

import java.util.List;
import javax.ws.rs.GET;

import org.camunda.bpm.cockpit.db.QueryParameters;
import org.camunda.bpm.cockpit.db.QueryService;
import org.camunda.bpm.cockpit.plugin.resource.AbstractPluginResource;
import ru.phoenixit.camunda.plugin.dto.ProcessInstanceCountDto;

public class ProcessInstanceResource extends AbstractPluginResource {

    public ProcessInstanceResource(String engineName) {
        super(engineName);
    }

    @GET
    public List<ProcessInstanceCountDto> getProcessInstanceCounts() {

        QueryService queryService = getQueryService();
        return queryService.executeQuery(
            "cockpit.sample.selectProcessInstanceCountsByProcessDefinition",
            new QueryParameters<ProcessInstanceCountDto>());
    }
}