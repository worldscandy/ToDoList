package com.example.kamaday.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    ScrollView scrollView_list;
    LinearLayout linearLayout_list;
    LinearLayout inoutLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //edittextにフォーカスが当たり、アプリ起動時からIMEが開いている状態を回避するコード
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        //setContentView(R.layout.activity_main);


        scrollView_list = new ScrollView(this);
        linearLayout_list = new LinearLayout(this);
        linearLayout_list.setOrientation(LinearLayout.VERTICAL);

        inoutLayout = new LinearLayout(this);


        for (int i = 0; i < 30; i++) {
            CheckBox ToDolist = new CheckBox(this);
            linearLayout_list.addView(ToDolist);
        }

        // ScrollView に View を追加
        scrollView_list.addView(linearLayout_list);

        setContentView(scrollView_list);
    }
}



