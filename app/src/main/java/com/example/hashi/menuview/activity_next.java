package com.example.hashi.menuview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_next extends AppCompatActivity implements View.OnClickListener {
    private static final int MENU3 = 1;
    Button goBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        goBack = findViewById(R.id.goBack);
        goBack.setOnClickListener(this);

    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menu3 = menu.findItem(MENU3);
        if (menu3 == null)
        {
            menu3 = menu.add(Menu.NONE, MENU3, 3,"Menu No. 3");
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);

        switch(item.getItemId())
        {
            case MENU3:
                Toast.makeText(this, "Clicked: Menu No. 3 ", Toast.LENGTH_SHORT).show();
                return true;

                default:
                    return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.goBack:
                finish();
                break;
        }
    }
}
