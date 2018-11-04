package com.example.hashi.menuview;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class BaseActivity extends Activity
    {
        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch(item.getItemId())
            {
                case R.id.menu1:
                    Toast.makeText(this, "Clicked: Menu No. 1 ", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.submenu1:
                    Toast.makeText(this, "Clicked: Menu No. 2 - SubMenu No. 1", Toast.LENGTH_SHORT).show();
                    return true;

                case R.id.submenu2:
                    Toast.makeText(this, "Clicked: Menu No. 2 - SubMenu No. 2", Toast.LENGTH_SHORT).show();
                    return true;

                default:
                    return super.onOptionsItemSelected(item);
            }



        }
    }
