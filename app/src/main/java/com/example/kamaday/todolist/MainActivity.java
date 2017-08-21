package com.example.kamaday.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{


    public static CheckBox ToDoList;
    public static Button inputListButton;
    public static EditText inputListText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToDoList = (CheckBox) findViewById(R.id.ToDoList);
        inputListButton = (Button) findViewById(R.id.inputListButton);
        inputListText = (EditText) findViewById(R.id.inputListText);


    }
}