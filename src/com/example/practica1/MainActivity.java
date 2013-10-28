package com.example.practica1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button butButton1 = (Button)findViewById(R.id.ac5_button_test);
        
        butButton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), Activity2.class);
		    	startActivity(intent);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    /*
    public void ShowActivity2(View view)
    {
    	// Toast t = Toast.makeText(this, "Press2", Toast.LENGTH_LONG).show();
    	Intent intent = new Intent(this, Activity2.class);
    	startActivity(intent);
    }
    */
    
    public void ShowActivity3(View view)
    {
    	// Toast t = Toast.makeText(this, "Press2", Toast.LENGTH_LONG).show();
    	Intent intent = new Intent(this, Activity3.class);
    	startActivity(intent);
    }    
    
    public void ShowActivity4(View view)
    {
    	// Toast t = Toast.makeText(this, "Press2", Toast.LENGTH_LONG).show();
    	Intent intent = new Intent(this, Activity4.class);
    	startActivity(intent);
    }    
    
    public void ShowActivity5(View view)
    {
    	// Toast t = Toast.makeText(this, "Press5", Toast.LENGTH_LONG).show();
    	Intent intent = new Intent(this, Activity5.class);
    	startActivity(intent);
    } 
    
    public void close_main(View v)
    {
    	finish();
    }
}
