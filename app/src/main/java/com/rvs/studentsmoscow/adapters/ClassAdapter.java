package com.rvs.studentsmoscow.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rvs.studentsmoscow.R;

import java.util.ArrayList;
import java.util.List;



public class ClassAdapter extends RecyclerView.Adapter<ClassAdapter.ClassViewHolder> {

    

    private List<ClassModel> list;

    public ClassAdapter(List<ClassModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ClassViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ClassViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClassViewHolder holder, int position) {

        holder.bind(list.get(position));
        notifyDataSetChanged();




    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ClassViewHolder extends RecyclerView.ViewHolder {

         TextView textView_className, textView_classType,
                 textView_classRoom, textView_teacher;

         CheckBox checkBox1, checkBox2, checkBox3, checkBox4,
                 checkBox5, checkBox6, checkBox7, checkBox8,
                 checkBox9, checkBox10, checkBox11, checkBox12,
                 checkBox13, checkBox14, checkBox15, checkBox16;

        public ClassViewHolder(View itemView) {
            super(itemView);

            textView_className = itemView.findViewById(R.id.textView_className);
            textView_classType = itemView.findViewById(R.id.textView_classType);
            textView_classRoom = itemView.findViewById(R.id.textView_classRoom);
            textView_teacher = itemView.findViewById(R.id.textView_teacher);



        }

        public void bind(ClassModel classModel) {

            textView_className.setText(classModel.className);
            textView_classType.setText(classModel.classType);
            textView_classRoom.setText(classModel.classRoom);
            textView_teacher.setText(classModel.teacher);

            notifyDataSetChanged();


        }


    }
    public void setItems(ArrayList<ClassModel> classModels) {

        list.addAll(classModels);
        notifyDataSetChanged();

    }
}


