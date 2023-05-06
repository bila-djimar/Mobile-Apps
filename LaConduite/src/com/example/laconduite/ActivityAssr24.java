package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityAssr24 extends  Activity {
	RadioGroup rGroupAssr241,rGroupAssr242;
	RadioButton buttonAssr241,buttonAssr242,buttonAssr243,buttonAssr244;
	Chronometer ChronometerASSR24;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr24);



		
		
		rGroupAssr241 = (RadioGroup) findViewById(R.id.radioGroupAssr241);
		rGroupAssr242 = (RadioGroup) findViewById(R.id.radioGroupAssr242);
		
		ChronometerASSR24 = (Chronometer) findViewById(R.id.chronometerASR24);
		ChronometerASSR24.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonAssr241 = new RadioButton(this);
		buttonAssr241.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr241.addView(buttonAssr241);
		 
		 buttonAssr242 = new RadioButton(this);
		 buttonAssr242.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr241.addView(buttonAssr242);
		 
		
		 
		rGroupAssr241.check(buttonAssr241.getId()) ;
		
		
		buttonAssr243 = new RadioButton(this);
		buttonAssr243.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr242.addView(buttonAssr243);
		 
		 buttonAssr244 = new RadioButton(this);
		 buttonAssr244.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr242.addView(buttonAssr244);
		 
		
		 
		rGroupAssr242.check(buttonAssr243.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityAssr24.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderAssr24(View v) 
		
		{ buttonAssr241.setTextColor(Color.BLUE);
		
		 rGroupAssr241.check(buttonAssr241.getId()) ;
		 
		 
		 
		 buttonAssr243.setTextColor(Color.BLUE);
			
		 rGroupAssr242.check(buttonAssr243.getId()) ;
		 ChronometerASSR24.stop();
		 
		 
		}	
		
		
		
		
	}
