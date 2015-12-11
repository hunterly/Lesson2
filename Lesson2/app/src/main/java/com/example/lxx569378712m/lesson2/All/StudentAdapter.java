package com.example.lxx569378712m.lesson2.All;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.lxx569378712m.lesson2.R;

import java.util.List;

/**
 * Created by lxx569378712m on 2015/12/7.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    private int resourceId;
    public StudentAdapter(Context context,int textViewResourceId,
                          List<Student> objects){
        super(context,textViewResourceId,objects);
        resourceId=textViewResourceId;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Student student= getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId, null);
        TextView studentName=(TextView) view.findViewById(R.id.student_name);
        studentName.setText(student.getName());
        return view;
    }
}
