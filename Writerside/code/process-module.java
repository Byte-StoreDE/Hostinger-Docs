
package de.bytestore.hostinger.docker.extensions;

import de.bytestore.hostinger.process.entity.hosting.enums.ProcessStatus;
import de.bytestore.hostinger.process.entity.hosting.process.Process;
import de.bytestore.hostinger.process.entity.hosting.storage.Volume;
import de.bytestore.hostinger.process.extension.process.ProcessConsole;
import de.bytestore.hostinger.process.extension.process.ProcessExtensionConfig;
import de.bytestore.hostinger.process.extension.process.ProcessExtensionPoint;
import de.bytestore.hostinger.process.extension.process.ProcessStats;
import org.pf4j.Extension;

import java.io.File;

@Extension
public class ProcessExtension implements ProcessExtensionPoint {
    /**
     * Creates a new process based on the provided Process object.
     *
     * @param processIO The Process object containing the necessary information for creating a new process.
     */
    @Override
    public void create(Process processIO) throws Exception {

    }

    /**
     * Removes the specified process.
     *
     * @param processIO The process to be removed.
     */
    @Override
    public void remove(Process processIO, boolean volumesIO, boolean forceIO) {

    }

    /**
     * Get Volume of the specified process.
     * @param volumeIO
     * @return
     */
    @Override
    public File volume(Volume volumeIO) {
        return null;
    }

    /**
     * Stops the process with the given ID.
     *
     * @param processIO The ID of the process to be stopped.
     */
    @Override
    public void stop(Process processIO) throws Exception {

    }

    /**
     * Starts the process with the given ID.
     *
     * @param processIO The process to be started.
     */
    @Override
    public void start(Process processIO) {

    }

    /**
     * Kills the process with the given ID.
     *
     * @param processIO The process to be killed.
     */
    @Override
    public void kill(Process processIO) {

    }

    /**
     * Retrieves the status of the process.
     *
     * @param processIO The process to retrieve the status for.
     * @return The status of the process.
     */
    @Override
    public ProcessStatus status(Process processIO) {
        return null;
    }

    /**
     * Updates the specified process with new information.
     *
     * @param processIO The process to be updated.
     */
    @Override
    public void edit(Process processIO) {

    }

    /**
     * Attaches a process to a console for input and output.
     *
     * @param processIO  The process to be attached.
     * @param consoleIO  The console to be attached to the process.
     */
    @Override
    public void attach(Process processIO, ProcessConsole consoleIO) {

    }

    /**
     * Detaches a process from its console for input and output.
     *
     * @param processIO  The process to be detached.
     */
    @Override
    public void detach(Process processIO) {

    }

    /**
     * Executes a command using the given process and command string.
     *
     * @param processIO  The process to execute the command with.
     * @param commandIO  The command string to be executed.
     */
    @Override
    public void execute(Process processIO, String commandIO) {

    }

    /**
     * Retrieves the statistics of a given process.
     *
     * @param processIO  The process to retrieve statistics from.
     * @return The statistics of the given process.
     */
    @Override
    public ProcessStats stats(Process processIO) {
        return null;
    }

    /**
     * Logs the process information using logback.
     *
     * @param processIO  The process to log information from.
     * @return A string representation of the logback output.
     */
    @Override
    public String logback(Process processIO) {
        return "";
    }

    /**
     * Return Information about Host Machine (Allowing CPU pinning etc).
     * @return
     */
    @Override
    public ProcessExtensionConfig config() {
        return null;
    }

    /**
     * Return Name of the extension point Provider Name.
     * @return
     */
    @Override
    public String name() {
        return "docker";
    }
}

