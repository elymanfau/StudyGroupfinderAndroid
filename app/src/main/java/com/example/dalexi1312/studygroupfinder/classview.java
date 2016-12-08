package com.example.dalexi1312.studygroupfinder;

import android.content.Intent;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class classview extends AppCompatActivity {
TabItem mTabItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classview);
        mTabItem=(TabItem)findViewById(R.id.myGroupsTabButton);

    }
}

