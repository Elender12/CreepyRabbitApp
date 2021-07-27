package com.ecirstea.api;

import com.ecirstea.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface HomeControllerApi {
  /**
   * config
   * 
   * @return Call&lt;Map&lt;String, String&gt;&gt;
   */
  @GET("config")
  Call<Map<String, String>> configUsingGET();
    

  /**
   * healthcheck
   * 
   * @return Call&lt;String&gt;
   */
  @GET("healthcheck")
  Call<String> healthcheckUsingGET();
    

  /**
   * index
   * 
   * @return Call&lt;String&gt;
   */
  @GET("")
  Call<String> indexUsingGET();
    

}
