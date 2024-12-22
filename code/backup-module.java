package de.bytestore.hostinger.proxmox.extensions;

import de.bytestore.hostinger.process.entity.Backup;
import de.bytestore.hostinger.process.extension.backup.BackupExtensionConfig;
import de.bytestore.hostinger.process.extension.backup.BackupExtensionPoint;
import de.bytestore.hostinger.proxmox.config.BackupConfig;
import org.pf4j.Extension;
import org.springframework.beans.factory.annotation.Autowired;

@Extension
public class BackupExtension implements BackupExtensionPoint {
    /**
     * Creates a new Backup entity or performs operations to initialize it.
     *
     * @param backupIO the Backup entity to be created or initialized
     */
    @Override
    public void create(Backup backupIO) {

    }

    /**
     * Deletes a specified Backup entity.
     *
     * @param backupIO the Backup entity to be deleted
     */
    @Override
    public void delete(Backup backupIO) {

    }

    /**
     * Restores a specific Backup entity. This method is responsible for
     * initiating or performing the restoration process for the given Backup.
     *
     * @param backupIO the Backup entity to be restored
     */
    @Override
    public void restore(Backup backupIO) {

    }

    /**
     * Downloads the specified backup and returns its contents as a byte array.
     *
     * @param backupIO the Backup entity to be downloaded
     * @return a byte array representing the downloaded backup data
     */
    @Override
    public byte[] download(Backup backupIO) {

    }

    /**
     * Provides the configuration for the Backup extension.
     *
     * @param backupIO the backup instance used to configure the extension
     * @return an instance of BackupExtensionConfig containing the configuration details
     */
    @Override
    public BackupExtensionConfig config(Backup backupIO) {
        return new BackupConfig();
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
