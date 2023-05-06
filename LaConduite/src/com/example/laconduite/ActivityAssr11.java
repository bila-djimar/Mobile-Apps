package com.example.laconduite;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ZoomControls;

@SuppressLint("NewApi")
public class ActivityAssr11 extends  Activity {
	RadioGroup rGroupAssr11;
	RadioButton buttonAssr111,buttonAssr112;
	Chronometer ChronometerASSR11;
	ZoomControls zoom;
	ImageView img;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr11);

		rGroupAssr11 = (RadioGroup) findViewById(R.id.radioGroupAssr11);
		ChronometerASSR11 = (Chronometer) findViewById(R.id.chronometerASR11);
		ChronometerASSR11.start();
		zoom = (ZoomControls) findViewById(R.id.zoomControls1);
		img = (ImageView) findViewById(R.id.imageViewAssr11);
		
		
		
		 zoom.setOnZoomInClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					float x = img.getScaleX();
					float y = img.getScaleY();
					
					img.setScaleX((float) (x+1));
					img.setScaleY((float) (y+1));
				}
			});
		
		
		 zoom.setOnZoomOutClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
		 
					float x = img.getScaleX();
					float y = img.getScaleY();
					
					img.setScaleX((float) (x-1));
					img.setScaleY((float) (y-1));
				}
			});
		
		
		
		
		buttonAssr111 = new RadioButton(this);
		buttonAssr111.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr11.addView(buttonAssr111);
		 
		 buttonAssr112 = new RadioButton(this);
		buttonAssr112.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr11.addView(buttonAssr112);
		 
		
		 
		rGroupAssr11.check(buttonAssr111.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr11.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr11(View v) 
	
	{ buttonAssr111.setTextColor(Color.BLUE);
	
	 rGroupAssr11.check(buttonAssr111.getId()) ;
	 ChronometerASSR11.stop();
	}	
	
	
	
	
}
