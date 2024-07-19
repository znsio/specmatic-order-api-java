package com.store;

import com.store.model.DB;
import io.specmatic.test.SpecmaticContractTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class ContractTest implements SpecmaticContractTest {
    private static ConfigurableApplicationContext context;

    @BeforeAll
    public static void setUp() {
        System.setProperty("host", "localhost");
        System.setProperty("port", "8090");
        System.setProperty("endpointsAPI", "http://localhost:8090/actuator/mappings");
        System.setProperty("SPECMATIC_GENERATIVE_TESTS", "true");
        System.setProperty("SPECMATIC_TEST_PARALLELISM", "auto");

        DB.INSTANCE.resetDB();

        context = SpringApplication.run(Application.class);
    }

    @AfterAll
    public static void tearDown() {
        context.close();
    }
}
