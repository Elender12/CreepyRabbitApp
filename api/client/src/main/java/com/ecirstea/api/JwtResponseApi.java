package com.ecirstea.api;

import com.ecirstea.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import com.ecirstea.api.model.ExceptionResponse;
import com.ecirstea.api.model.JwtRequest;
import com.ecirstea.api.model.JwtResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface JwtResponseApi {
  /**
   * Authenticate a user by username and password
   *  .
   * @param authenticationRequest JwtRequest object (required)
   * @return Call&lt;JwtResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("authenticate")
  Call<JwtResponse> authenticate(
    @retrofit2.http.Body JwtRequest authenticationRequest
  );

}
