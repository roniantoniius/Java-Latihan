package roniantonius.spring.core.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import roniantonius.spring.core.client.PaymentGateawayClient;

@Component("paymentGateawayClient")
// factory bean kita pakai supaya bisa ubah suatu method dari Third Party
public class PaymentGateawayClientFactoryBean implements FactoryBean<PaymentGateawayClient> {

    @Override
    public PaymentGateawayClient getObject() throws Exception {
        PaymentGateawayClient client = new PaymentGateawayClient();
        client.setEndpoint("https://roni.com");
        client.setPrivateKey("ronia314fio");
        client.setPublicKey("publicr");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGateawayClient.class;
    }
}
