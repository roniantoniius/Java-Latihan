package roniantonius.spring.core.client;

import lombok.Data;

@Data
public class PaymentGateawayClient {
    private String endpoint;
    private String privateKey;
    private String publicKey;
}
