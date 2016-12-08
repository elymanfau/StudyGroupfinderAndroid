package com.example.dalexi1312.studygroupfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button mSignInButton;
    private Button mChooseSignInButton;

//this is a comment for testingfghgfngfngf
    //now another comment9090909090908
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSignInButton =(Button) findViewById(R.id.signInButton);
        mChooseSignInButton =(Button) findViewById(R.id.chooseSignInButton);


        mSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToClassesView();
            }
        });
        mChooseSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mChooseSignInButton.setTextColor(0xFF002D62);
            }
        });
    }
    private void goToClassesView()
    {
        Intent intent = new Intent(this,ClassesViewer.class);
        startActivity(intent);
    }

}
