package com.example.erail;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.erail.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class a extends AppCompatActivity {
    Button button;
    Button logout;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        getSupportActionBar().hide();

        firebaseAuth=FirebaseAuth.getInstance();
        FirebaseUser user=firebaseAuth.getCurrentUser();
        button=findViewById(R.id.bookticket);
        logout=findViewById(R.id.logoutmenu);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(a.this,MainActivity1.class);
                startActivity(intent);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseUser firebaseUser=firebaseAuth.getCurrentUser();
                Intent intent1=new Intent(a.this,MainActivity.class);
                startActivity(intent1);
                firebaseAuth.signOut();
            }
        });


    }
}