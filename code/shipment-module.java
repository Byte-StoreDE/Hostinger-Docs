package de.bytestore.hostinger.dhl.extensions;

import de.bytestore.hostinger.entity.AddressResult;
import de.bytestore.hostinger.entity.ecommerce.Shipment;
import de.bytestore.hostinger.extension.shipping.ShippingExtensionPoint;
import org.pf4j.Extension;

import java.util.LinkedList;

@Extension
public class ShippingExtension implements ShippingExtensionPoint {

    /**
     * Creates a new shipment Request / Label.
     *
     * @param shipmentIO the shipment object to be created
     */
    @Override
    public void create(Shipment shipmentIO) {

    }

    /**
     * Edit a shipment.
     *
     * @param shipmentIO the shipment object to be edited
     */
    @Override
    public void edit(Shipment shipmentIO) {

    }

    /**
     * Cancels a shipment.
     *
     * @param shipmentIO the shipment object to be cancelled
     */
    @Override
    public void cancel(Shipment shipmentIO) {

    }

    /**
     * Track a Shipment.
     * @param shipmentIO
     */
    @Override
    public LinkedList<AddressResult> track(Shipment shipmentIO) {
        return null;
    }

    /**
     * Return Name of the extension point Provider Name.
     * @return
     */
    @Override
    public String name() {
        return "dhl";
    }
}
