package com.example.diary_project.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.diary_project.R;

public class membership_join_add_id extends AppCompatActivity {
    Button next_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_join_add_id);
        next_info = findViewById(R.id.next_info);
        next_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent go_membership_password = new Intent(membership_join_add_id.this, membership_join_add_password.class);
                startActivity(go_membership_password);
            }
        });
    }
}