package com.tajim.heyali;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    ImageView backBtn;
    TextView log_in;
    Animation lTOR, rTOL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        backBtn = findViewById(R.id.backBtn);
        log_in = findViewById(R.id.log_in);

        lTOR = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        rTOL = AnimationUtils.loadAnimation(this, R.anim.right_to_left);
        backBtn.setAnimation(rTOL);
        backBtn.setOnClickListener(v->{
            onBackPressed();
        });
        log_in.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(), SignUp.class));
            finish();
        });

    }
}