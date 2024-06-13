package io.github.ynap.productsup.client;

import io.github.ynap.productsup.client.client.PlatformApiClient;
import io.github.ynap.productsup.client.config.ProductsUpAutoConfiguration;
import org.mockserver.client.MockServerClient;
import org.mockserver.junit.jupiter.MockServerSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest(classes = ProductsUpAutoConfiguration.class, properties = "productsup.token=1:1")
@ActiveProfiles(value = "test")
@MockServerSettings(ports = {8787})
public abstract class BasePlatformApiClient {

    private final MockServerClient mockServerClient;

    @Autowired
    private PlatformApiClient platformApiClient;

    public BasePlatformApiClient(MockServerClient mockServerClient) {
        this.mockServerClient = mockServerClient;
    }

    protected MockServerClient mockClient() {
        return this.mockServerClient;
    }

    protected PlatformApiClient platformApiClient() {
        return this.platformApiClient;
    }
}
