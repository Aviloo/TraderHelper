package me.aviloo.empty;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateFolderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_folder_menu);

        Button back_button = findViewById(R.id.back_button2);
        back_button.setOnClickListener(viewClickListener);

        Button create_button = findViewById(R.id.create_button);
        create_button.setOnClickListener(viewCreateClickListener);
    }

    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CreateFolderActivity.this,ProviderActivity.class);
            startActivity(intent);
        }
    };

    View.OnClickListener viewCreateClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {


            Intent intent = new Intent(CreateFolderActivity.this,ProviderActivity.class);
            startActivity(intent);
        }
    };
}
