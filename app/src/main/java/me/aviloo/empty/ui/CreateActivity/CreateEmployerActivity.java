package me.aviloo.empty.ui.CreateActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.aviloo.empty.R;
import me.aviloo.empty.Utils.StorageUtils;
import me.aviloo.empty.models.Employer;
import me.aviloo.empty.ui.PersonActivity;

public class CreateEmployerActivity extends Activity {

    private EditText nameInput;
    private EditText addressInput;
    private EditText phoneInput;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_employer);

        nameInput = findViewById(R.id.employer_name_input);
        addressInput = findViewById(R.id.employer_address_input);
        phoneInput = findViewById(R.id.employer_phone_input);

        Button back_button = findViewById(R.id.employer_back_button);
        back_button.setOnClickListener(viewBackClickListener);

        Button add_button = findViewById(R.id.employer_add_button);
        add_button.setOnClickListener(viewCreateClickListener);
    }

    View.OnClickListener viewBackClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CreateEmployerActivity.this, PersonActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener viewCreateClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(nameInput.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(),
                        "Укажите имя ИП!",Toast.LENGTH_LONG).show();
                return;
            }
            if(addressInput.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(),
                        "Укажите адрес ИП!",Toast.LENGTH_LONG).show();
                return;
            }
            if(!isItemExists(nameInput.getText().toString())){
                Toast.makeText(getApplicationContext(),
                        "Такое ИП уже существует!",Toast.LENGTH_LONG).show();
                return;
            }

            if(phoneInput.getText().toString().isEmpty()){
                StorageUtils.addEmployer(new Employer(nameInput.getText().toString(),
                        addressInput.getText().toString()));
            }
            if(!phoneInput.getText().toString().isEmpty()){
                StorageUtils.addEmployer(new Employer(nameInput.getText().toString(),
                        addressInput.getText().toString(),phoneInput.getText().toString()));
            }

            Intent intent = new Intent(CreateEmployerActivity.this, PersonActivity.class);
            startActivity(intent);
        }
    };

    private boolean isItemExists(String name){
        if(StorageUtils.employersArray.isEmpty()){
            return false;
        }

        for(Employer employer : StorageUtils.employersArray){
            if(employer.getName().equals(name)){
                return true;
            }

        }

        return false;
    }

}
