package me.aviloo.empty.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import me.aviloo.empty.R;
import me.aviloo.empty.Utils.SalaryUtils;

public class SalaryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.salary_activity);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView plan_text = findViewById(R.id.plan_num_text);
        plan_text.setText(SalaryUtils.getPlan());

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView current_text = findViewById(R.id.salary_text2);
        current_text.setText(SalaryUtils.getCurrentRevenue());

        TextView today_text = findViewById(R.id.current_num_text);
        today_text.setText(SalaryUtils.getToday());

        TextView salary = findViewById(R.id.salary_text6);
        salary.setText(SalaryUtils.getSalary());

        ProgressBar progress = findViewById(R.id.progressBar);
        progress.setMax(SalaryUtils.getPlan());
        progress.setProgress(SalaryUtils.getCurrentRevenue());
    }
}
