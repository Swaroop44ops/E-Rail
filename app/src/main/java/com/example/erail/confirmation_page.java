package com.example.erail;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class confirmation_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmationpage);

        getSupportActionBar().hide();

        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(39000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent i1 = new Intent(confirmation_page.this, MainActivity1.class);
                    startActivity(i1);
                }
            }
        };thread.start();
    }
}