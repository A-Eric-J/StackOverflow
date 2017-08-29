package com.hfad.stackoverflow;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.hfad.stackoverflow.webservice.Models.BaseModel;
import com.hfad.stackoverflow.webservice.connectionProvider;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public  static  String[] tags=new String[50];

    public  static String tag1=null;
    public  static String tag2=null;
    public  static String tag3=null;
    public  static String tag4=null;
    public  static String tag5=null;
    public  static String tag6=null;
    public  static String tag7=null;
    public  static String tag8=null;
    public  static String tag9=null;
    public  static String tag10=null;

    public  static String[] image=new String[10];
    public  static String[] sub=new String [10];
    public  static String[] flag=new String [10];
    public  static String[] name=new String [10];
    public  static String[] score=new String [10];
    public  static String[] Qlink=new String [10];

    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        if(!isConnected(MainActivity.this)) buildDialog(MainActivity.this).show();
        else {

            Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();

            setContentView(R.layout.activity_main);

            toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);


            final MediaPlayer myMediaPLayer = MediaPlayer.create(this, R.raw.slack);
            myMediaPLayer.start();
            connectionProvider provider = new connectionProvider();

            Call<BaseModel> getQuestion = provider.getTService().getQuestion(1, 10, "desc", "activity", "stackoverflow");
            getQuestion.enqueue(new Callback<BaseModel>() {
                @Override
                public void onResponse(Call<BaseModel> call, Response<BaseModel> response) {
                    if (response.isSuccessful()) {
                        BaseModel res = response.body();
                        //1)**********************************************************************************
                        int f = res.getItems().get(0).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(0).getTags().get(i);

                            if (i != 0)
                                tag1 = tag1 + " " + tags[i];
                            else
                                tag1 = tags[i];

                        }
                        image[0] = res.getItems().get(0).getOwner().getProfile_image();
                        sub[0] = res.getItems().get(0).getTitle();
                        flag[0] = res.getItems().get(0).is_answered();
                        name[0] = res.getItems().get(0).getOwner().getDisplay_name();
                        score[0] = res.getItems().get(0).getScore();
                        Qlink[0] = res.getItems().get(0).getLink();

                        //2)**********************************************************************************


                        f = res.getItems().get(1).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(1).getTags().get(i);

                            if (i != 0)
                                tag2 = tag2 + " " + tags[i];
                            else
                                tag2 = tags[i];

                        }
                        image[1] = res.getItems().get(1).getOwner().getProfile_image();
                        sub[1] = res.getItems().get(1).getTitle();
                        flag[1] = res.getItems().get(1).is_answered();

                        name[1] = res.getItems().get(1).getOwner().getDisplay_name();
                        score[1] = res.getItems().get(1).getScore();
                        Qlink[1] = res.getItems().get(1).getLink();


                        //3)**********************************************************************************

                        f = res.getItems().get(2).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(2).getTags().get(i);

                            if (i != 0)
                                tag3 = tag3 + " " + tags[i];
                            else
                                tag3 = tags[i];

                        }
                        image[2] = res.getItems().get(2).getOwner().getProfile_image();
                        sub[2] = res.getItems().get(2).getTitle();
                        flag[2] = res.getItems().get(2).is_answered();

                        name[2] = res.getItems().get(2).getOwner().getDisplay_name();
                        score[2] = res.getItems().get(2).getScore();
                        Qlink[2] = res.getItems().get(2).getLink();


                        //4)**********************************************************************************

                        f = res.getItems().get(3).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(3).getTags().get(i);

                            if (i != 0)
                                tag4 = tag4 + " " + tags[i];
                            else
                                tag4 = tags[i];

                        }
                        image[3] = res.getItems().get(3).getOwner().getProfile_image();
                        sub[3] = res.getItems().get(3).getTitle();
                        flag[3] = res.getItems().get(3).is_answered();


                        name[3] = res.getItems().get(3).getOwner().getDisplay_name();
                        score[3] = res.getItems().get(3).getScore();
                        Qlink[3] = res.getItems().get(3).getLink();


                        //5)**********************************************************************************


                        f = res.getItems().get(4).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(4).getTags().get(i);

                            if (i != 0)
                                tag5 = tag5 + " " + tags[i];
                            else
                                tag5 = tags[i];

                        }
                        image[4] = res.getItems().get(4).getOwner().getProfile_image();
                        sub[4] = res.getItems().get(4).getTitle();
                        flag[4] = res.getItems().get(4).is_answered();

                        name[4] = res.getItems().get(4).getOwner().getDisplay_name();
                        score[4] = res.getItems().get(4).getScore();
                        Qlink[4] = res.getItems().get(4).getLink();


                        //6)**********************************************************************************

                        f = res.getItems().get(5).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(5).getTags().get(i);

                            if (i != 0)
                                tag6 = tag6 + " " + tags[i];
                            else
                                tag6 = tags[i];

                        }
                        image[5] = res.getItems().get(5).getOwner().getProfile_image();
                        sub[5] = res.getItems().get(5).getTitle();
                        flag[5] = res.getItems().get(5).is_answered();


                        name[5] = res.getItems().get(5).getOwner().getDisplay_name();
                        score[5] = res.getItems().get(5).getScore();
                        Qlink[5] = res.getItems().get(5).getLink();


                        //7)**********************************************************************************


                        f = res.getItems().get(6).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(6).getTags().get(i);

                            if (i != 0)
                                tag7 = tag7 + " " + tags[i];
                            else
                                tag7 = tags[i];

                        }
                        image[6] = res.getItems().get(6).getOwner().getProfile_image();
                        sub[6] = res.getItems().get(6).getTitle();
                        flag[6] = res.getItems().get(6).is_answered();


                        name[6] = res.getItems().get(6).getOwner().getDisplay_name();
                        score[6] = res.getItems().get(6).getScore();
                        Qlink[6] = res.getItems().get(6).getLink();

                        //8)**********************************************************************************

                        f = res.getItems().get(7).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(7).getTags().get(i);

                            if (i != 0)
                                tag8 = tag8 + " " + tags[i];
                            else
                                tag8 = tags[i];

                        }
                        image[7] = res.getItems().get(7).getOwner().getProfile_image();
                        sub[7] = res.getItems().get(7).getTitle();
                        flag[7] = res.getItems().get(7).is_answered();

                        name[7] = res.getItems().get(7).getOwner().getDisplay_name();
                        score[7] = res.getItems().get(7).getScore();
                        Qlink[7] = res.getItems().get(7).getLink();


                        //9)**********************************************************************************

                        f = res.getItems().get(8).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(8).getTags().get(i);

                            if (i != 0)
                                tag9 = tag9 + " " + tags[i];
                            else
                                tag9 = tags[i];

                        }
                        image[8] = res.getItems().get(8).getOwner().getProfile_image();
                        sub[8] = res.getItems().get(8).getTitle();
                        flag[8] = res.getItems().get(8).is_answered();


                        name[8] = res.getItems().get(8).getOwner().getDisplay_name();
                        score[8] = res.getItems().get(8).getScore();
                        Qlink[8] = res.getItems().get(8).getLink();


                        //10)**********************************************************************************
                        f = res.getItems().get(9).getTags().size();


                        for (int i = 0; i < f; i++) {
                            tags[i] = res.getItems().get(9).getTags().get(i);

                            if (i != 0)
                                tag10 = tag10 + " " + tags[i];
                            else
                                tag10 = tags[i];

                        }
                        image[9] = res.getItems().get(9).getOwner().getProfile_image();
                        sub[9] = res.getItems().get(9).getTitle();
                        flag[9] = res.getItems().get(9).is_answered();


                        name[9] = res.getItems().get(9).getOwner().getDisplay_name();
                        score[9] = res.getItems().get(9).getScore();
                        Qlink[9] = res.getItems().get(9).getLink();

                        //end**********************************************************************************


                        //  Log.e("LOG",res.getItems().get(0).getTags().get(0));
//                    res=null; this line is just for test
                    }
                }

                @Override
                public void onFailure(Call<BaseModel> call, Throwable t) {
                    //this method calls if intenet is not avalable

                    Log.e("FAILED", t.getMessage());

                }
            });


            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intn = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intn);

                }
            }, 5000);


        }
    }



    public boolean isConnected(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netinfo = cm.getActiveNetworkInfo();

        if (netinfo != null && netinfo.isConnectedOrConnecting()) {
            android.net.NetworkInfo wifi = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobile = cm.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobile != null && mobile.isConnectedOrConnecting()) || (wifi != null && wifi.isConnectedOrConnecting())) return true;
        else return false;
        } else
        return false;
    }

    public AlertDialog.Builder buildDialog(Context c) {

        AlertDialog.Builder builder = new AlertDialog.Builder(c);
        builder.setTitle("No Internet Connection");
        builder.setMessage("You need to have Mobile Data or wifi to access this. Press ok to Exit");

        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        return builder;
    }

}
