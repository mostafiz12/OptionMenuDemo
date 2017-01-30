package myappsapps.com.optionmenudemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int selectedId = item.getItemId();
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainL);
        switch (selectedId) {
            case R.id.mniRed:
                mainLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.mniGreen:
                mainLayout.setBackgroundColor(Color.GREEN);
                break;
            case R.id.mniYellow:
                mainLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.mniBlue:
                mainLayout.setBackgroundColor(Color.BLUE);
                break;


        }
        return super.onOptionsItemSelected(item);
    }
}