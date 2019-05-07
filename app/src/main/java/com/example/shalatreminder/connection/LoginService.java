package com.example.shalatreminder.connection;

import com.example.shalatreminder.model.SholatResponse;
import com.example.shalatreminder.model.login.LoginResponse;
import com.example.shalatreminder.model.update.UpdateResponse;
import com.example.shalatreminder.model.user.UserResponse;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface LoginService {

    @FormUrlEncoded //header
    @POST("/users")
    Call<JSONObject> createUser(@Field("email") String email,
                                @Field("password") String password,
                                @Field("name") String name);

    @FormUrlEncoded
    @POST("/users/login")
    Call<LoginResponse> getLogin (@Field("email") String email,
                                  @Field("password") String password);
    @GET("/users/")
    Call<UserResponse> getUser (@Header("x-access-token")String token);

    @FormUrlEncoded
    @PUT("/users/")
    Call<UpdateResponse> getUpdate (@Header("x-access-token")String token, @Field("name") String name);

}
