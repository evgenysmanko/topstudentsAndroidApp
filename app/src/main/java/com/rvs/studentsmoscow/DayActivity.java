package com.rvs.studentsmoscow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DayActivity extends AppCompatActivity {

    TextView dayTextView;
    Button btn1Class;
    Button btn2Class;
    Button btn3Class;
    Button btn4Class;
    Button btn5Class;
    Button btn6Class;
    Button btn7Class;
    Button btn8Class;



    private static final String DAY = "DAY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        final String day = getIntent().getStringExtra(DAY);
        dayTextView = findViewById(R.id.textView_day);

        dayTextView.setText(day);

        btn1Class = findViewById(R.id.btn_1class);
        btn2Class=findViewById(R.id.btn_2class);
        btn3Class=findViewById(R.id.btn_3class);
        btn4Class=findViewById(R.id.btn_4class);
        btn5Class=findViewById(R.id.btn_5class);
        btn6Class=findViewById(R.id.btn_6class);
        btn7Class=findViewById(R.id.btn_7class);
        btn8Class=findViewById(R.id.btn_8class);

        btn1Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"1");
            }
        });
        btn2Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"2");
            }
        });
        btn3Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"3");
            }
        });
        btn4Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"4");
            }
        });
        btn5Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"5");
            }
        });
        btn6Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"6");
            }
        });
        btn7Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"7");
            }
        });
        btn8Class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClassActivity(day,"8");
            }
        });



    }

    public static void start(Activity activity, String day){
        Intent intent = new Intent(activity, DayActivity.class);
        intent.putExtra(DAY, day);
        activity.startActivity(intent);
    }

    public void openClassActivity(String day, String classNumber) {

        ClassActivity.start(this, day, classNumber);
    }
}
