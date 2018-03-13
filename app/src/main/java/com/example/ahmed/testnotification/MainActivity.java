package com.example.ahmed.testnotification;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
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

    NewMessageNotification messageNotification;
    public void removebtn(View view) {
        messageNotification.cancel(this);
    }

    public void addbtn(View view) {
         messageNotification = new NewMessageNotification();
        messageNotification.notify(this,"Good morning",1234);
    }
}
