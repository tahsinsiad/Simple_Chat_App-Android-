package com.example.tonu.chatappdemo1.Fragments;

import com.example.tonu.chatappdemo1.Notifications.MyResponse;
import com.example.tonu.chatappdemo1.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAARFtaYOo:APA91bHqwN3vd4D9Hr7b6SRRbbP8VxlOXKgnJLjPrKCF4cqn4Fq_yWDVt1oK38dUnTrTfoAxdlBPApZnmTLYCtcz9x44ZX4l_tgulOmNu2Y18dr29To_3gRP8lLHVug-abs2AbU7_qk9"
            }

    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
