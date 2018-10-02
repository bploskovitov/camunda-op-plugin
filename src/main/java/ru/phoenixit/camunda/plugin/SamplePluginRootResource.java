package ru.phoenixit.camunda.plugin;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.camunda.bpm.cockpit.plugin.resource.AbstractPluginRootResource;


@Path("plugin/" + CamundaOpPlugin.ID)
public class SamplePluginRootResource extends AbstractPluginRootResource {

    public SamplePluginRootResource() {
        super(CamundaOpPlugin.ID);
    }

    @Path("{engineName}/process-instance")
    public ProcessInstanceResource getProcessInstanceResource(@PathParam("engineName") String engineName) {
        return subResource(new ProcessInstanceResource(engineName), engineName);
    }
}