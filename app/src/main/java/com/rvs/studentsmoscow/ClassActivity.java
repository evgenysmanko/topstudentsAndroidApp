package com.rvs.studentsmoscow;

import android.app.Activity;
import android.content.Intent;;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.rvs.studentsmoscow.adapters.ClassAdapter;
import com.rvs.studentsmoscow.adapters.ClassModel;

import java.util.ArrayList;
import java.util.List;

public class ClassActivity extends AppCompatActivity {

    private static final String DAY = "DAY";
    private static final String CLASS_NUMBER = "CLASS_NUMBER";

    TextView textViewDayClass;
    TextView textViewClassNumber;

    private RecyclerView recyclerView;
    public ArrayList<ClassModel> result;
    private ClassAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class);

        final String day = getIntent().getStringExtra(DAY);
        final String classNumber = getIntent().getStringExtra(CLASS_NUMBER);

        textViewDayClass = findViewById(R.id.textView_day_class);
        textViewClassNumber = findViewById(R.id.textView_classNumber);

        textViewDayClass.setText(day);
        textViewClassNumber.setText(classNumber + " - ая пара");

        result = new ArrayList<>();
        recyclerView = findViewById(R.id.class_list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager lin = new LinearLayoutManager(this);
        lin.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(lin);

        createResult();







        adapter=new ClassAdapter(result);
        adapter.setItems(result);
        recyclerView.setAdapter(adapter);





    }

    private void createResult() {


        for (int i = 0; i<10; i++) {
            result.add(new ClassModel("Matan", "лк", "A10", "Ivanov"));
        }
    }

    public static void start(Activity activity, String day, String classNumber){
        Intent intent = new Intent(activity, ClassActivity.class);
        intent.putExtra(DAY, day);
        intent.putExtra(CLASS_NUMBER, classNumber);
        activity.startActivity(intent);
    }


}
