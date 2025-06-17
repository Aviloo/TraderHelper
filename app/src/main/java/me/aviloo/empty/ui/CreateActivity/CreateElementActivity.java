package me.aviloo.empty.ui.CreateActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import me.aviloo.empty.R;
import me.aviloo.empty.ui.ProviderActivity;

public class CreateElementActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_element);

        Button back_button = findViewById(R.id.back_button);
        back_button.setOnClickListener(viewClickListener);
    }

    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CreateElementActivity.this, ProviderActivity.class);
            startActivity(intent);
        }
    };
}
