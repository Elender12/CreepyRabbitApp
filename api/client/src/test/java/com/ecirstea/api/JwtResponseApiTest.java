package com.ecirstea.api;

import com.ecirstea.ApiClient;
import com.ecirstea.api.model.ExceptionResponse;
import com.ecirstea.api.model.JwtRequest;
import com.ecirstea.api.model.JwtResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JwtResponseApi
 */
public class JwtResponseApiTest {

    private JwtResponseApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(JwtResponseApi.class);
    }

    /**
     * Authenticate a user by username and password
     *
     *  .
     */
    @Test
    public void authenticateTest() {
        JwtRequest authenticationRequest = null;
        // JwtResponse response = api.authenticate(authenticationRequest);

        // TODO: test validations
    }
}
