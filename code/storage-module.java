package de.bytestore.hostinger.proxmox.extensions;

import de.bytestore.hostinger.AutowireLoader;
import de.bytestore.hostinger.process.entity.hosting.enums.StorageType;
import de.bytestore.hostinger.process.entity.hosting.hosting.Virtualized;
import de.bytestore.hostinger.process.extension.virtualization.VirtualizedStorageExtensionPoint;
import de.bytestore.hostinger.process.extension.virtualization.storage.VirtualizedFile;
import de.bytestore.hostinger.process.extension.virtualization.storage.VirtualizedStorage;
import org.pf4j.Extension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@Extension
public class StorageExtension implements VirtualizedStorageExtensionPoint {

    /**
     * Return Name of the extension point Provider Name.
     * @return
     */
    @Override
    public String name() {
        return "proxmox";
    }

    /**
     * Retrieves a list of VirtualizedStorage objects based on the provided Virtualized and StorageType filters.
     *
     * @param virtualizedIO The Virtualized object to filter the list by.
     * @param filterIO      The StorageType enum to filter the list by.
     * @return An ArrayList of VirtualizedStorage objects matching the provided filters.
     */
    @Override
    public ArrayList<VirtualizedStorage> list(Virtualized virtualizedIO, StorageType filterIO, boolean activeIO) {

    }

    /**
     * Retrieves a list of VirtualizedFile objects based on the provided Virtualized and StorageType filters.
     *
     * @param virtualizedIO The Virtualized object to filter the files by.
     * @param filterIO      The StorageType enum to filter the files by.
     * @return An ArrayList of VirtualizedFile objects matching the provided filters.
     */
    @Override
    public ArrayList<VirtualizedFile> files(Virtualized virtualizedIO, StorageType filterIO) {

    }

}
