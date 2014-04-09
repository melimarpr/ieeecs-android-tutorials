package mmarquezpr.fragmentdemo.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getActionBar();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id){
            case R.id.abRed:
//
                /* FragmentManager fragmentManager = this.getFragmentManager();
//                FragmentTransaction ft = fragmentManager.beginTransaction();
//                ft.add(R.id.container, new RedFragment());
//                ft.commit();*/

                getFragmentManager().beginTransaction()
                        .replace(R.id.container, new RedFragment())
                        .commit();
                break;
            case R.id.abGreen:
                getFragmentManager().beginTransaction()
                        .replace(R.id.container, new GreenFragment())
                        .commit();
                break;
            case R.id.abCrazy:
                startActivity(new Intent(this, CrazyActivity.class));
                break;
        }
        return true;
    }



}
