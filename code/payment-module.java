package de.bytestore.hostinger.paypal.extension;


import de.bytestore.hostinger.entity.ecommerce.Invoices;
import de.bytestore.hostinger.entity.ecommerce.Payment;
import de.bytestore.hostinger.entity.ecommerce.Shipment;
import de.bytestore.hostinger.extension.payment.PaymentExtensionConfig;
import de.bytestore.hostinger.extension.payment.PaymentExtensionPoint;
import de.bytestore.hostinger.paypal.config.PaymentConfig;
import de.bytestore.hostinger.paypal.handler.PaypalHandler;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.pf4j.Extension;

@Extension
public class PaymentExtension implements PaymentExtensionPoint {

    /**
     * Handle incoming Requests of Payment Gateway eq. PayPal IPN.
     * @param requestIO
     * @param responseIO
     */
    @Override
    public void authorize(HttpServletRequest requestIO, HttpServletResponse responseIO) {

    }

    /**
     * Create new Invoice for Payment Provider/Gateway.
     *
     * @param invoiceIO
     */
    @Override
    public Payment create(Invoices invoiceIO) {

        return null
    }

    /**
     * Retrieve Payment by ID / Token.
     *
     * @param paymentIO
     * @return
     */
    @Override
    public Payment query(Payment paymentIO) {

        return null;
    }

    /**
     * Cancel Payment eq. Membership.
     *
     * @param paymentIO
     */
    @Override
    public void cancel(Payment payment) {

    }

    /**
     * Edit Payment eq. Price from Membership.
     *
     * @param paymentIO
     */
    @Override
    public void edit(Payment payment) {

    }

    /**
     * Create Refund for Payment Provider/Gateway.
     *
     * @param paymentIO
     * @return
     */
    @Override
    public boolean refund(Payment payment) {

        return false;
    }

    /**
     * Return Information about Host Machine (Allowing Refund etc).
     * @return
     */
    @Override
    public PaymentExtensionConfig config() {

        return null;
    }

    /**
     * Update Tracking Information for Payment Provider/Gate.
     * @param paymentIO
     * @param shipmentIO
     * @param addIO
     */
    @Override
    public void tracking(Payment payment, Shipment shipment) {

    }

    /**
     * Return Name of the extension point Provider Name.
     * @return
     */
    @Override
    public String name() {

        return "paypal";
    }
}
