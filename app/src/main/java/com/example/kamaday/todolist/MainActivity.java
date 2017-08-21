package com.example.kamaday.todolist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity{


    public static CheckBox ToDoList;
    public static Button inputListButton;
    public static EditText inputListText;

    private LinearLayout mainLayout;
    private InputMethodManager inputMethodManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //edittextにフォーカスが当たり、アプリ起動時からIMEが開いている状態を回避するコード
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

        ToDoList = (CheckBox) findViewById(R.id.ToDoList);
        inputListButton = (Button) findViewById(R.id.inputListButton);
        inputListText = (EditText) findViewById(R.id.inputListText);

        inputListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inputToDoList();
            }
        });

    }

    public void inputToDoList() {

        final String ListText = inputListText.getText().toString();
        ToDoList.setText(ListText);




    }
}