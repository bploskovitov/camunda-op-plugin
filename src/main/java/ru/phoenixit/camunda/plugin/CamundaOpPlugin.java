package ru.phoenixit.camunda.plugin;

import org.camunda.bpm.cockpit.plugin.spi.impl.AbstractCockpitPlugin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CamundaOpPlugin extends AbstractCockpitPlugin {

    public static final String ID = "op-plugin";

    public String getId() {
        return ID;
    }

    @Override
    public List<String> getMappingFiles() {
        return Arrays.asList("ru/phoenixit/camunda/plugin/mapper/sample.xml");
    }

    @Override
    public Set<Class<?>> getResourceClasses() {
        Set<Class<?>> classes = new HashSet<Class<?>>();

        classes.add(SamplePluginRootResource.class);

        return classes;
    }
}