package com.rvs.studentsmoscow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class UniversityActivity extends AppCompatActivity {

    private Button btnUniversity;
    private EditText editTextUniversity;
    String university;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        btnUniversity = findViewById(R.id.btn_university);
        editTextUniversity = findViewById(R.id.editText_university);

        btnUniversity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                university = editTextUniversity.getText().toString();
                openActivityGroup();

            }
        });
    }


    public static void start(Activity activity){
        Intent intent = new Intent(activity, UniversityActivity.class);
        activity.startActivity(intent);
    }

    public void openActivityGroup() {

        GroupActivity.start(this, university);
    }
}
