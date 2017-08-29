package com.hfad.stackoverflow.webservice;


import com.hfad.stackoverflow.webservice.Models.BaseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by amir ali on 8/22/2017.
 */

public interface connectionService {

    @GET("questions")
    Call<BaseModel> getQuestion(@Query("page") int page,
                                @Query("pagesize") int pageSize,
                                @Query("order") String orderType,
                                @Query("sort") String sort,
                                @Query("site") String site);
 }
