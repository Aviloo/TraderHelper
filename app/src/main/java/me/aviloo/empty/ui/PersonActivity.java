package me.aviloo.empty.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.aviloo.empty.R;
import me.aviloo.empty.Utils.Adapters.EmployerAdapter;
import me.aviloo.empty.Utils.StorageUtils;
import me.aviloo.empty.models.Employer;
import me.aviloo.empty.ui.CreateActivity.CreateEmployerActivity;

public class PersonActivity extends Activity {

    private EmployerAdapter adapter;
    private ArrayList<Employer> personList = StorageUtils.employersArray;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.person_activity);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        RecyclerView recyclerView = findViewById(R.id.employer_recycle);

        // Настройка RecyclerView
        adapter = new EmployerAdapter(personList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        Button button = findViewById(R.id.create_employer_button);
        button.setOnClickListener(viewClickListener);
    }

    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(PersonActivity.this, CreateEmployerActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onStop(){
        super.onStop();

        personList.clear();
    }

}
