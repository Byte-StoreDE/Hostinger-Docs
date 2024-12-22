package de.bytestore.unielektro.extensions;

import de.bytestore.hostinger.entity.ecommerce.Shipment;
import de.bytestore.hostinger.entity.ecommerce.Warehouses;
import de.bytestore.hostinger.entity.logistics.LogisticsOrder;
import de.bytestore.hostinger.entity.logistics.LogisticsResult;
import de.bytestore.hostinger.entity.logistics.LogisticsResultItem;
import de.bytestore.hostinger.extension.logistics.LogisticsExtensionPoint;
import de.bytestore.hostinger.extension.logistics.LogisticsFilter;
import de.bytestore.unielektro.handler.UniElektroStoreHandler;
import org.pf4j.Extension;

import java.util.ArrayList;

@Extension
public class LogisticsItemExtension implements LogisticsExtensionPoint {
    /**
     * Performs a purchase of a product from a warehouse.
     *
     * @param productIO   the product to be purchased
     * @param warehouseIO the warehouse from which to purchase the product
     */
    @Override
    public LogisticsOrder buy(LogisticsResult logisticsProduct, Warehouses warehouses) {
        return null;
    }

    /**
     * Performs a query on the available products based on the given logistics filter.
     *
     * @param filterIO the logistics filter used for querying the products
     * @return an ArrayList of Products that match the given logistics filter
     */
    @Override
    public ArrayList<LogisticsResultItem> query(LogisticsFilter logisticsFilter) {
        return null;
    }


    /**
     * Cancels a logistics order.
     *
     * @param orderIO the logistics order to be canceled
     */
    @Override
    public void cancel(LogisticsOrder logisticsOrder) {

    }

    /**
     * Tracks the shipment of a logistics order.
     *
     * @param orderIO the logistics order to track
     * @return the shipment details of the logistics order
     */
    @Override
    public Shipment track(LogisticsOrder logisticsOrder) {
        return null;
    }

    /**
     * Return Name of the extension point Provider Name.
     * @return
     */
    @Override
    public String name() {
        return "unielektro";
    }
}
