package com.ecirstea.api;

import com.ecirstea.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HomeControllerApi
 */
public class HomeControllerApiTest {

    private HomeControllerApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(HomeControllerApi.class);
    }

    /**
     * config
     *
     * 
     */
    @Test
    public void configUsingGETTest() {
        // Map<String, String> response = api.configUsingGET();

        // TODO: test validations
    }
    /**
     * healthcheck
     *
     * 
     */
    @Test
    public void healthcheckUsingGETTest() {
        // String response = api.healthcheckUsingGET();

        // TODO: test validations
    }
    /**
     * index
     *
     * 
     */
    @Test
    public void indexUsingGETTest() {
        // String response = api.indexUsingGET();

        // TODO: test validations
    }
}
