package com.tajim.heyali;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    TextView left_to_right, started;
    TextView btn,sign_up;
    Animation lTOR, rTOL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        left_to_right = findViewById(R.id.left_to_right);
        started = findViewById(R.id.started);
        sign_up = findViewById(R.id.sign_up);
        btn = findViewById(R.id.btn);
        lTOR = AnimationUtils.loadAnimation(this, R.anim.left_to_right);
        rTOL = AnimationUtils.loadAnimation(this, R.anim.right_to_left);

        left_to_right.startAnimation(lTOR);
        started.startAnimation(rTOL);
        btn.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(), SignUp.class));
        });

        sign_up.setOnClickListener(v->{
            startActivity(new Intent(getApplicationContext(), Login.class));
        });

    }


}