
package de.bytestore.hostinger.docker.extensions;

import de.bytestore.hostinger.process.entity.console.vnc.VNCSocket;
import de.bytestore.hostinger.process.entity.hosting.enums.ProcessStatus;
import de.bytestore.hostinger.process.entity.hosting.hosting.Machine;
import de.bytestore.hostinger.process.extension.machine.MachineExtensionConfig;
import de.bytestore.hostinger.process.extension.machine.MachineExtensionPoint;
import de.bytestore.hostinger.process.extension.process.ProcessConsole;
import de.bytestore.hostinger.process.extension.process.ProcessStats;
import org.pf4j.Extension;

@Extension
public class MachineExtensions implements MachineExtensionPoint {
    /**
     * Calculates the statistics for a given machine.
     *
     * @param machineIO The Machines object representing the machine for which the statistics should be calculated.
     * @return The ProcessStats object containing the calculated statistics.
     */
    @Override
    public ProcessStats stats(Machine machineIO) {
        return null;
    }

    /**
     * Retrieves the configuration for a given machine.
     *
     * @param machineIO The Machines object representing the machine for which the configuration should be retrieved.
     * @return The MachineExtensionConfig object containing the configuration settings for the specified machine.
     */
    @Override
    public MachineExtensionConfig config(Machine machineIO) {
        return null;
    }

    /**
     * Retrieves the configuration for a given machine.
     *
     * @return The MachineExtensionConfig object containing the configuration settings for the specified machine.
     */
    @Override
    public MachineExtensionConfig config() {
        return null;
    }

    /**
     * Creates a VNCSocket for virtualized Machines.
     *
     * @param virtualized the Machines object representing the virtualized machine
     * @return the VNCSocket object containing the information necessary for VNC connection (ticket, cert, port, hostname, user)
     */
    @Override
    public VNCSocket vnc(Machine virtualized) {
        return null;
    }

    /**
     * Retrieves the status of the specified Machines object by executing the status action using available machine extension points.
     *
     * @param machinesIO the Machines object for which the status needs to be retrieved
     * @return the ProcessStatus representing the status of the specified Machines object
     */
    @Override
    public ProcessStatus status(Machine machinesIO) {
        return null;
    }

    /**
     * Restarts the given Machines object.
     *
     * @param machinesIO the Machines object that needs to be restarted
     */
    @Override
    public void restart(Machine machinesIO) {

    }

    /**
     * Stops the given Machines object.
     *
     * @param machinesIO The Machines object representing the machine to be stopped.
     */
    @Override
    public void stop(Machine machinesIO) {

    }

    /**
     * Send WOL Magic Packet to given Machines to Wake Up on Lan.
     * @param machinesIO
     */
    @Override
    public void wol(Machine machinesIO) {

    }

    /**
     * Retrieves the log for the specified Machines object.
     *
     * @param machinesIO The Machines object for which the log needs to be retrieved.
     * @return The log string for the specified Machines object.
     */
    @Override
    public String log(Machine machinesIO) {
        return "";
    }

    /**
     * Attaches the specified console to the given machine (Serial Console).
     *
     * @param machineIO The Machine object to which the console will be attached.
     * @param consoleIO The ProcessConsole object representing the console to be attached.
     */
    @Override
    public void attach(Machine machineIO, ProcessConsole consoleIO) {

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
