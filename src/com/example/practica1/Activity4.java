package com.example.practica1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RadioGroup;

public class Activity4 extends Activity {
	private ImageView kotik;
	private RadioGroup rgScaleType; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity4);
		this.kotik = (ImageView)findViewById(R.id.imageKotik);	
		this.rgScaleType = (RadioGroup)findViewById(R.id.rgScaleType);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity4, menu);
		return true;
	}

	public void ChenImg(View v)
	{						
		if(this.kotik == null)
			return;
		
		int idButton = this.rgScaleType.getCheckedRadioButtonId();
		switch (idButton) {
		case R.id.rbCENTER:
			this.kotik.setScaleType(ImageView.ScaleType.CENTER);
			break;
		case R.id.rbCENTER_CROP:
			this.kotik.setScaleType(ImageView.ScaleType.CENTER_CROP);
			break;
		case R.id.rbFIT_START:
			this.kotik.setScaleType(ImageView.ScaleType.FIT_START);
			break;
		case R.id.rbFIT_XY:
			this.kotik.setScaleType(ImageView.ScaleType.FIT_XY);
			break;
		case R.id.rbFIT_END:
			this.kotik.setScaleType(ImageView.ScaleType.FIT_END);
			break;						
		case R.id.rbMATRIX:
			this.kotik.setScaleType(ImageView.ScaleType.MATRIX);
			break;	
		case R.id.rbCENTER_INSIDE:
			this.kotik.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
			break;				
		default:
			break;
		}

	}
}
