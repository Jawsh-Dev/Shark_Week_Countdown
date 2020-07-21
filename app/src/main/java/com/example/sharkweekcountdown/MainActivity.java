package com.example.sharkweekcountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.iwgang.countdownview.CountdownView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountdownView myCountdownView = findViewById(R.id.countdownView);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String countDate = "09-08-2020 08:00:00";
        Date now = new Date();

        try {
            //Formatting from String to Date
            Date date = sdf.parse(countDate);
            long currentTime = now.getTime();
            long sharkWeekDate = date.getTime();
            long countDownToSharkWeek = sharkWeekDate - currentTime;

            myCountdownView.start(countDownToSharkWeek);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}