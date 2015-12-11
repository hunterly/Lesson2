package com.example.lxx569378712m.lesson2.All;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.lxx569378712m.lesson2.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Student> studentList = new ArrayList<Student>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initStudent();
        StudentAdapter adapter = new StudentAdapter(MainActivity.this, R.layout.student_item, studentList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Student student = studentList.get(position);
                Toast.makeText(MainActivity.this,student.getName(),
                        Toast.LENGTH_SHORT).show();
                if(position==0){
                    Intent intent=new Intent(MainActivity.this,StudentInformation.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent=new Intent(MainActivity.this,StudentInformation.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent=new Intent(MainActivity.this,StudentInformation.class);
                    startActivity(intent);
                }


                }
        });

    }


    private void initStudent() {
        for (int i = 1; i < 101; i++) {
            Student one = new Student("学生姓名" + i + ":" + "  年级：2015");
            studentList.add(one);
        }


    }
}

