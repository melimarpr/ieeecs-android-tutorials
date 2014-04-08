package mmarquezpr.datademo.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    protected void onResume() {
        super.onResume();

        SharedPreferences pref = this.getSharedPreferences(Keys.SharedPref.FILE, Context.MODE_PRIVATE);

        int i = pref.getInt(Keys.SharedPref.COUNTER_KEY, 0);

        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(Keys.SharedPref.COUNTER_KEY, i+1);
        editor.commit();


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
        switch (item.getItemId()){
            case R.id.abFactory:
                factoryListener();
                break;

            case R.id.abIntentActivity:
                intentActitvityListener();
                break;
            case R.id.abIntentFragment:
                intentFragmentListener();
                break;
            case R.id.abSharedPref:
                sharePrefListener();
                break;


        }
        return super.onOptionsItemSelected(item);
    }


    private void factoryListener(){



        getFragmentManager().beginTransaction()
                .replace(R.id.container, FactoryFragment.getInstance("Factory String"))
                .commit();

    }

    private void intentActitvityListener(){

        Bundle bnd = new Bundle();
        bnd.putString("FRAG_KEY", "String");

        Intent intent = new Intent(this, DataActivity.class);
        intent.putExtras(bnd);

        startActivity(intent);



    }

    private void intentFragmentListener(){

        Bundle bnd = new Bundle();
        bnd.putSerializable(Keys.Bundle.SERIAL_KEY, new SerialObject("Serial String"));

        NormalFragment normalFragment = new NormalFragment();

        normalFragment.setArguments(bnd);

        getFragmentManager().beginTransaction()
                .replace(R.id.container, normalFragment)
                .commit();


    }

    private void sharePrefListener(){

        startActivity(new Intent(this, SharedPrefActivity.class));

    }


}
