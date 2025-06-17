package me.aviloo.empty;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import me.aviloo.empty.ui.NavigationActivity;
import me.aviloo.empty.ui.SalaryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.navigation_button);
        button.setOnClickListener(viewClickListener);
    }

    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,
                    NavigationActivity.class);
            startActivity(intent);

        }
    };

    View.OnClickListener viewClickSalaryListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this,
                    SalaryActivity.class);
            startActivity(intent);

        }
    };

    @SuppressLint("ClickableViewAccessibility")
    private void buttonAnimation(Button button){
        button.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        view.animate().scaleX(0.9f).
                                scaleY(0.9f).setDuration(100).start();
                        break;
                    case MotionEvent.ACTION_CANCEL:
                        view.animate().scaleX(1f).
                                scaleY(1f).setDuration(100).start();
                        break;
                }
                return false;
            }
        });
    }
}

