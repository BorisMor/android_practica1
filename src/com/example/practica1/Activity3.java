package com.example.practica1;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Activity3 extends Activity {
	private TextView tvTest; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity3);
		this.tvTest = (TextView)findViewById(R.id.tvTest);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity3, menu);
		return true;
	}
	
	public void Activity3butClose(View v)
	{
		finish();
	}
	
	public void setRedColor(View v)
	{
		this.tvTest.setTextColor(Color.RED);
	}
	
	public void setBlueColor(View v)
	{
		this.tvTest.setTextColor(Color.BLUE);
	}	
	
	public void setGreenColor(View v)
	{
		this.tvTest.setTextColor(Color.GREEN);
	}	
	
	public void UpFont(View v)
	{
		float font_size = this.tvTest.getTextSize();
		font_size++;
		this.tvTest.setTextSize(font_size);
	}
	
	public void DownFont(View v)
	{
		float font_size = this.tvTest.getTextSize();
		font_size--;
		this.tvTest.setTextSize(font_size);		
	}
	

}
