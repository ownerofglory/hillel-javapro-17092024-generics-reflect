package ua.ithillel.genrefl.model.payment;

import java.util.List;

public class PaymentProcessor {
    public static void processPayments(List<? extends PaymentMethod> paymentMethods) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            paymentMethod.process();
        }
    }
}
