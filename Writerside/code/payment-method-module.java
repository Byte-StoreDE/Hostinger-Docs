package de.bytestore.hostinger.paypal.extension;

import de.bytestore.hostinger.extension.payment.PaymentMethodExtensionPoint;

public class PaymentMethodExtension implements PaymentMethodExtensionPoint {
    /**
     * Displays a image/icon representation of the Payment Method.
     */
    @Override
    public String icon() {
        return "/assets/img/icon.svg";
    }

    /**
     * Displays a string representation of the Payment Method.
     */
    @Override
    public String display() {
        return "PayPal";
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
