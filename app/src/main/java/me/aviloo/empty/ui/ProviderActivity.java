package me.aviloo.empty.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import me.aviloo.empty.R;
import me.aviloo.empty.Utils.ActivityUtil;
import me.aviloo.empty.ui.CreateActivity.CreateElementActivity;
import me.aviloo.empty.ui.CreateActivity.CreateFolderActivity;

public class ProviderActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.provider_activity);

        Button button = findViewById(R.id.add_button2);
        buttonAnimation(button);
        button.setOnClickListener(viewClickListener);
    }

    View.OnClickListener viewClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showPopupMenu(v);
        }
    };

    private void showPopupMenu(View v) {
        PopupMenu popupMenu = new PopupMenu(this, v);
        popupMenu.inflate(R.menu.popup_menu);

        popupMenu
                .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if(item.getItemId() == R.id.menu1){
                            Intent intent = new Intent(ProviderActivity.this,
                                    CreateFolderActivity.class);
                            ActivityUtil.addCurrentActivity(this.getClass());
                            startActivity(intent);
                            return true;
                        }
                        if(item.getItemId() == R.id.menu2){
                            Intent intent = new Intent(ProviderActivity.this,
                                    CreateElementActivity.class);
                            ActivityUtil.addCurrentActivity(this.getClass());
                            startActivity(intent);
                            return true;
                        }

                        return false;
                    }
                });

        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
            @Override
            public void onDismiss(PopupMenu menu) {
            }
        });
        popupMenu.show();
    }

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
