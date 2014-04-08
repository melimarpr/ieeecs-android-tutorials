package mmarquezpr.helloworldsample2.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener{

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);



        tv = (TextView) findViewById(R.id.textView2);
        Button buttonAzul = (Button)findViewById(R.id.button); //Azul
        Button buttonRojo = (Button) findViewById(R.id.button2); //Rofo


        tv.setOnClickListener(this);
        buttonAzul.setOnClickListener(this);

        buttonRojo.setOnClickListener(this);







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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.button:
                tv.setTextColor(getResources().getColor(
                        android.R.color.holo_blue_light
                ));
                break;
            case R.id.button2:
                tv.setTextColor(getResources().getColor(
                        android.R.color.holo_red_light
                ));
                break;
            case R.id.textView2:
                tv.setText("I change when Click");
                break;
        }


        tv.invalidate();
    }
}
