package de.bytestore.hostinger.proxmox.extensions;

import de.bytestore.hostinger.process.entity.console.vnc.VNCSocket;
import de.bytestore.hostinger.process.entity.hosting.enums.ProcessStatus;
import de.bytestore.hostinger.process.entity.hosting.hosting.Virtualized;
import de.bytestore.hostinger.process.extension.process.ProcessConsole;
import de.bytestore.hostinger.process.extension.process.ProcessStats;
import de.bytestore.hostinger.process.extension.virtualization.VirtualizedExtensionConfig;
import de.bytestore.hostinger.process.extension.virtualization.VirtualizedExtensionPoint;
import org.pf4j.Extension;

@Extension
public class VirtualizedExtension implements VirtualizedExtensionPoint {
    /**
     * Creates a new virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be created.
     * @throws Exception If an error occurs while creating the virtualized input/output.
     */
    @Override
    public void create(Virtualized virtualizedIO) throws Exception {

    }

    /**
     * Removes the given virtualized input/output. Optionally, it can also remove associated disks and force the removal if needed.
     *
     * @param virtualizedIO The virtualized input/output to be removed.
     * @param disksIO       Determines whether to remove associated disks or not.
     * @param forceIO       Determines whether to force the removal or not.
     */
    @Override
    public void remove(Virtualized virtualizedIO, boolean disksIO, boolean forceIO) {

    }

    /**
     * Stops the given virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be stopped.
     * @throws Exception If an error occurs while stopping the virtualized input/output.
     */
    @Override
    public void stop(Virtualized virtualizedIO) throws Exception {

    }

    /**
     * Starts the virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be started.
     */
    @Override
    public void start(Virtualized virtualizedIO) {

    }

    /**
     * Kills the specified virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be killed.
     */
    @Override
    public void kill(Virtualized virtualizedIO) {

    }

    /**
     * Pauses the specified virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be paused.
     */
    @Override
    public void pause(Virtualized virtualizedIO) {

    }

    /**
     * Resumes the specified virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be resumed.
     */
    @Override
    public void resume(Virtualized virtualizedIO) {

    }

    /**
     * Resets the virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be reset.
     */
    @Override
    public void reset(Virtualized virtualizedIO) {

    }

    /**
     * Returns the status of the given virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to get the status of.
     * @return The status of the given virtualized input/output.
     */
    @Override
    public ProcessStatus status(Virtualized virtualizedIO) {
        return null;
    }

    /**
     * Edits the given virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output to be edited.
     */
    @Override
    public void edit(Virtualized virtualizedIO) {

    }

    /**
     * Attaches a {@link Virtualized} input/output to a {@link ProcessConsole}.
     *
     * @param virtualizedIO The virtualized input/output to be attached.
     * @param consoleIO     The process console for input/output to attach to.
     */
    @Override
    public void attach(Virtualized virtualizedIO, ProcessConsole consoleIO) {

    }

    /**
     * Detaches a Virtualized input/output from its associated resources.
     *
     * @param virtualizedIO The Virtualized input/output to be detached.
     */
    @Override
    public void detach(Virtualized virtualizedIO) {

    }

    /**
     * Executes a command on the specified virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output on which to execute the command.
     * @param commandIO     The command to execute.
     */
    @Override
    public void execute(Virtualized virtualizedIO, String commandIO) {

    }

    /**
     * Creates a VNC WebSocket Socket object for the given Virtualized object.
     *
     * @param virtualized The Virtualized object to create a VNCSocket for.
     * @return A VNCSocket object.
     */
    @Override
    public VNCSocket vnc(Virtualized virtualized) {
        return null;
    }

    /**
     * Calculates the statistics for the given virtualized input/output.
     *
     * @param virtualizedIO The virtualized input/output for which the statistics need to be calculated.
     * @return The statistics for the given virtualized input/output.
     */
    @Override
    public ProcessStats stats(Virtualized virtualizedIO) {
        return null;
    }

    /**
     * This method logs the given {@link Virtualized} object.
     *
     * @param virtualizedIO The {@link Virtualized} object to be logged.
     * @return The log message generated from the {@link Virtualized} object.
     */
    @Override
    public String logback(Virtualized virtualizedIO) {
        return "";
    }

    /**
     * Returns the configuration for the virtualized extension.
     *
     * @return The configuration for the virtualized extension.
     */
    @Override
    public VirtualizedExtensionConfig config() {
        return null;
    }

    /**
     * Returns the configuration for the virtualized machince (hypervisor).
     *
     * @return The configuration for the virtualized machine (hypervisor).
     */
    @Override
    public VirtualizedExtensionConfig config(Virtualized machineIO) {
        return null;
    }

    /**
     * Returns the configuration for the virtualized extension (Sync).
     * @param virtualizedIO
     * @return
     */
    @Override
    public Virtualized current(Virtualized virtualizedIO) {
        return null;
    }

    /**
     * Sets/Changes the password for the given virtualized.
     *
     * @param virtualizedIO The virtualized contains the new password.
     */
    @Override
    public void password(Virtualized virtualizedIO) {

    }

    /**
     * Return Name of the extension point Provider Name.
     * @return
     */
    @Override
    public String name() {
        return "";
    }
}