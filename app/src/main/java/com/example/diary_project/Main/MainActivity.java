package com.example.diary_project.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diary_project.R;

public class MainActivity extends AppCompatActivity {
    Button membership_join,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        membership_join = findViewById(R.id.membership_join);
        login = findViewById(R.id.login);
        membership_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_membership = new Intent(MainActivity.this, membership_join_add_id.class);
                startActivity(go_membership);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_login = new Intent(MainActivity.this, login.class);
                startActivity(go_login);
            }
        });
    }
}