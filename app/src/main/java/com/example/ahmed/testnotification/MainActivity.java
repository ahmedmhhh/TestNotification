package com.example.ahmed.testnotification;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button addbtn,removeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addbtn = (Button) findViewById(R.id.addbtn);
        removeBtn = (Button) findViewById(R.id.removebtn);
    }
NotificationManager manager;
    static  int id =1;
    public void removebtn(View view) {
        manager.cancelAll();
    }

    public void addbtn(View view) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this)
                .setContentTitle("hi")
                .setContentText("tha raining is coming soon")
                .setSmallIcon(R.drawable.twitter);
        manager =(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(id,builder.build());
        id++;
    }
}
