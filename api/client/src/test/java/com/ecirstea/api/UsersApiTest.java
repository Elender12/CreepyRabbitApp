package com.ecirstea.api;

import com.ecirstea.ApiClient;
import com.ecirstea.api.model.ExceptionResponse;
import java.util.UUID;
import com.ecirstea.api.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private UsersApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(UsersApi.class);
    }

    /**
     * Add a new user.
     *
     * Takes a User object, saves it, and returns it with the saved id.
     */
    @Test
    public void addUserTest() {
        User body = null;
        // User response = api.addUser(body);

        // TODO: test validations
    }
    /**
     * Delete an existing User by id.
     *
     * Takes an existing User, deletes it, and returns the new object.
     */
    @Test
    public void deleteUsersTest() {
        UUID id = null;
        // User response = api.deleteUsers(id);

        // TODO: test validations
    }
    /**
     * Get all users.
     *
     * Returns all Users.
     */
    @Test
    public void getAllUsersTest() {
        // List<User> response = api.getAllUsers();

        // TODO: test validations
    }
    /**
     * Get a user by id.
     *
     * Returns one User by id.
     */
    @Test
    public void getUsersByIDTest() {
        UUID id = null;
        // User response = api.getUsersByID(id);

        // TODO: test validations
    }
    /**
     * Update an existing user.
     *
     * Takes an existing User, updates it, and returns the new object.
     */
    @Test
    public void updateUsersTest() {
        User body = null;
        // User response = api.updateUsers(body);

        // TODO: test validations
    }
}
