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

public class SignUp extends AppCompatActivity {


    ImageView backBtn;
    TextView sign_up;
    Animation lTOR, rTOL;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        backBtn = findViewById(R.id.backBtn);
        sign_up = findViewById(R.id.sign_up);

        lTOR = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        rTOL = AnimationUtils.loadAnimation(this, R.anim.right_to_left);
        backBtn.setAnimation(rTOL);

        backBtn.setOnClickListener(v->{
            onBackPressed();
        });
        sign_up.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(), Login.class));
            finish();
        });


    }
}