package me.aviloo.empty.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.aviloo.empty.MainActivity;
import me.aviloo.empty.R;

public class NavigationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_activity);

        Button main_button = findViewById(R.id.nav_main_button);
        Button provider_button = findViewById(R.id.nav_provider_button);
        Button salary_button = findViewById(R.id.nav_salary_button);
        Button person_button = findViewById(R.id.nav_person_button);

        main_button.setOnClickListener(viewMainClickListener);
        provider_button.setOnClickListener(viewProviderClickListener);
        salary_button.setOnClickListener(viewSalaryClickListener);
        person_button.setOnClickListener(viewPersonClickListener);

    }

    View.OnClickListener viewMainClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(NavigationActivity.this, MainActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener viewProviderClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(NavigationActivity.this, ProviderActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener viewSalaryClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(NavigationActivity.this, SalaryActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener viewPersonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(NavigationActivity.this, PersonActivity.class);
            startActivity(intent);
        }
    };

}
