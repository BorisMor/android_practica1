package com.example.practica1;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity5 extends Activity implements OnItemSelectedListener {

	private Spinner spiScaleType;
	private List<ScaleType> valScaleType;
	private ImageView imageKotik5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity5);
		
		this.imageKotik5 = (ImageView)findViewById(R.id.imageKotik5);		
		
		List<String> list = new ArrayList<String>();
		list.add("CENTER");
		list.add("CENTER_INSIDE");
		list.add("CENTER_CROP");
		list.add("FIT_XY");
		list.add("FIT_START");
		list.add("FIT_END");
		list.add("MATRIX");	
		
		this.valScaleType = new ArrayList<ScaleType>();
		this.valScaleType.add(ImageView.ScaleType.CENTER);
		this.valScaleType.add(ImageView.ScaleType.CENTER_INSIDE);
		this.valScaleType.add(ImageView.ScaleType.CENTER_CROP);
		this.valScaleType.add(ImageView.ScaleType.FIT_XY);
		this.valScaleType.add(ImageView.ScaleType.FIT_START);
		this.valScaleType.add(ImageView.ScaleType.FIT_END);
		this.valScaleType.add(ImageView.ScaleType.MATRIX);

		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		this.spiScaleType = (Spinner)findViewById(R.id.spiScaleType);		
		this.spiScaleType.setAdapter(dataAdapter);
		this.spiScaleType.setSelection(1);
		this.spiScaleType.setOnItemSelectedListener(this);	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity5, menu);				
		return true;
	}
	
	public void CloseAct5(View v)
	{
		finish();
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// Toast.makeText(getApplicationContext(), "select " + String.valueOf(position) , Toast.LENGTH_SHORT).show();
		ScaleType ct = this.valScaleType.get(position);
		this.imageKotik5.setScaleType(ct);
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub		
	}
	

}
