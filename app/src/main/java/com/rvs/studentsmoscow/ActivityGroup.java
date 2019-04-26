package com.rvs.studentsmoscow;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class ActivityGroup extends AppCompatActivity {

    private static final String UNIVERSITY = "UNIVERSITY";

    private Button btnGroup;
    private EditText editTextGroup;
    private EditText editTextGroupPass;
    private ArrayList<String> groupList = new ArrayList<String>();

    DatabaseReference mDatabase;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        final String university = getIntent().getStringExtra(UNIVERSITY);

        mDatabase = FirebaseDatabase.getInstance().getReference();


        btnGroup = findViewById(R.id.btn_group);
        editTextGroup = findViewById(R.id.editText_group);
        editTextGroupPass = findViewById(R.id.editText_group_pass);

        mDatabase.child("Universities").child(university).child("Groups").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

                String value = dataSnapshot.getKey();

                groupList.add(value);
            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        btnGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String group = editTextGroup.getText().toString();
                String groupPass = editTextGroupPass.getText().toString();

                if (groupList.contains(group)){

                    Toast.makeText(ActivityGroup.this, "Группа уже существует", Toast.LENGTH_LONG).show();
                }
                else {

                    mDatabase.child("Universities").child(university).child("Groups").child(group).child("ID Starosti").setValue("My ID");
                    mDatabase.child("Universities").child(university).child("Groups").child(group).child("Password").setValue(groupPass);

                }
            }
        });

    }

    public static void start(Activity activity, String university){
        Intent intent = new Intent(activity, ActivityGroup.class);
        intent.putExtra(UNIVERSITY, university);
        activity.startActivity(intent);
    }
}
