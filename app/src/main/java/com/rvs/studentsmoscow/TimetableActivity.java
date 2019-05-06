package com.rvs.studentsmoscow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TimetableActivity extends AppCompatActivity {

    Button btnMonday;
    Button btnTuesday;
    Button btnWednesday;
    Button btnThursday;
    Button btnFriday;
    Button btnSaturday;



    public void openDayActivity(String day) {

        DayActivity.start(this, day);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        btnMonday = findViewById(R.id.btn_monday);
        btnTuesday = findViewById(R.id.btn_tuesday);
        btnWednesday = findViewById(R.id.btn_wednesday);
        btnThursday = findViewById(R.id.btn_thursday);
        btnFriday = findViewById(R.id.btn_friday);
        btnSaturday = findViewById(R.id.btn_saturday);

        btnMonday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDayActivity("Понедельник");
            }
        });

        btnTuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDayActivity("Вторник");
            }
        });

        btnWednesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDayActivity("Среда");
            }
        });

        btnThursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDayActivity("Четверг");
            }
        });

        btnFriday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDayActivity("Пятница");
            }
        });

        btnSaturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDayActivity("Суббота");
            }
        });
    }

    public static void start(Activity activity){
        Intent intent = new Intent(activity, TimetableActivity.class);
        activity.startActivity(intent);
    }
}
