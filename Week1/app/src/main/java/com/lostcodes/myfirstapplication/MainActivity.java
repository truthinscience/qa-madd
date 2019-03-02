package com.lostcodes.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "My_App";
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }

    private void addListenerOnButton(){
        btnSubmit = findViewById(R.id._btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navToActivity();
            }
        });
    }

    private void navToActivity() {
        Intent intent = new Intent(this, Main2Activity.class);
        /**
         *  Passing a message to another activity
         */
        intent.putExtra(EXTRA_MESSAGE, "Message comes here");
        startActivity(intent);
    }


}
