package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
@BindView(R.id.button)Button BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
              Toast.makeText(this, "hahah", Toast.LENGTH_SHORT).show();
    }

}
