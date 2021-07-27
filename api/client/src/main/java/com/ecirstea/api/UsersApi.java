package com.ecirstea.api;

import com.ecirstea.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.ecirstea.api.model.ExceptionResponse;
import java.util.UUID;
import com.ecirstea.api.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface UsersApi {
  /**
   * Add a new user.
   * Takes a User object, saves it, and returns it with the saved id.
   * @param body User object (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("users")
  Call<User> addUser(
    @retrofit2.http.Body User body
  );

  /**
   * Delete an existing User by id.
   * Takes an existing User, deletes it, and returns the new object.
   * @param id User object to update. (required)
   * @return Call&lt;User&gt;
   */
  @DELETE("users/{id}")
  Call<User> deleteUsers(
    @retrofit2.http.Path("id") UUID id
  );

  /**
   * Get all users.
   * Returns all Users.
   * @return Call&lt;List&lt;User&gt;&gt;
   */
  @GET("users")
  Call<List<User>> getAllUsers();
    

  /**
   * Get a user by id.
   * Returns one User by id.
   * @param id Returns a user by Id (required)
   * @return Call&lt;User&gt;
   */
  @GET("users/{id}")
  Call<User> getUsersByID(
    @retrofit2.http.Path("id") UUID id
  );

  /**
   * Update an existing user.
   * Takes an existing User, updates it, and returns the new object.
   * @param body User object to update. (required)
   * @return Call&lt;User&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("users")
  Call<User> updateUsers(
    @retrofit2.http.Body User body
  );

}
