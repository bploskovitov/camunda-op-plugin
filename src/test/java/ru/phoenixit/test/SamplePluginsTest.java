package ru.phoenixit.test;

import org.camunda.bpm.cockpit.Cockpit;
import org.camunda.bpm.cockpit.db.QueryParameters;
import org.camunda.bpm.cockpit.db.QueryService;
import org.camunda.bpm.cockpit.plugin.spi.CockpitPlugin;
import org.camunda.bpm.cockpit.plugin.test.AbstractCockpitPluginTest;
import org.junit.Assert;
import org.junit.Test;
import ru.phoenixit.camunda.plugin.dto.ProcessInstanceCountDto;

import java.util.List;

public class SamplePluginsTest extends AbstractCockpitPluginTest {
    @Test
    public void testPluginDiscovery() {
        CockpitPlugin samplePlugin = Cockpit.getRuntimeDelegate().getPluginRegistry().getPlugin("op-plugin");

        Assert.assertNotNull(samplePlugin);
    }

    @Test
    public void testSampleQueryWorks() {

        QueryService queryService = getQueryService();

        List<ProcessInstanceCountDto> instanceCounts =
                queryService
                        .executeQuery(
                                "cockpit.sample.selectProcessInstanceCountsByProcessDefinition",
                                new QueryParameters<ProcessInstanceCountDto>());

        Assert.assertEquals(0, instanceCounts.size());
    }
}
