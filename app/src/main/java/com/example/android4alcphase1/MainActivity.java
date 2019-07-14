package com.example.android4alcphase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onViewALC(View view)
    {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }

    public void onViewProfile(View view)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
}
