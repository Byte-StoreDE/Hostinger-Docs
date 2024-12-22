package de.bytestore.hostinger.proxmox.extensions;

import de.bytestore.hostinger.AutowireLoader;
import de.bytestore.hostinger.extension.config.ConfigExtensionPoint;
import de.bytestore.hostinger.modules.service.ModuleService;
import de.bytestore.hostinger.process.entity.hosting.hosting.Machine;
import de.bytestore.hostinger.process.service.MachineService;
import org.pf4j.Extension;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

@Component
@Extension
public class ConfigExtension implements ConfigExtensionPoint {

    @Override
    public HashMap<String, com.vaadin.flow.component.Component> module() {
        HashMap<String, com.vaadin.flow.component.Component> mapIO = new HashMap<String, com.vaadin.flow.component.Component>();

        return mapIO;
    }

    @Override
    public HashMap<String, com.vaadin.flow.component.Component> detail(Object objectIO) {
        HashMap<String, com.vaadin.flow.component.Component> mapIO = new HashMap<String, com.vaadin.flow.component.Component>();

        return mapIO;
    }

    /**
     * Return Name of the extension point Provider Name.
     * @return
     */
    @Override
    public String name() {
        return "proxmox";
    }
}
