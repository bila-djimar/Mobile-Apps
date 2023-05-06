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

public class ActivityAssr25 extends  Activity {
	RadioGroup rGroupAssr25;
	RadioButton buttonAssr251,buttonAssr252,buttonAssr253;
	Chronometer ChronometerASSR25;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr25);



		
		

		rGroupAssr25 = (RadioGroup) findViewById(R.id.radioGroupAssr25);
		ChronometerASSR25 = (Chronometer) findViewById(R.id.chronometerASR25);
		ChronometerASSR25.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr251 = new RadioButton(this);
		buttonAssr251.setText("Je ralentis.........................................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr25.addView(buttonAssr251);
		 
		 buttonAssr252 = new RadioButton(this);
		buttonAssr252.setText("Je regarde à droite et à gauche.........(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr25.addView(buttonAssr252);
		 
		 buttonAssr253 = new RadioButton(this);
		 buttonAssr253.setText("Je regarde à gauche et à droite.........(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr25.addView(buttonAssr253);
		 
		
		
		
		
		
		
		rGroupAssr25.check(buttonAssr251.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr25.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr25(View v) 
	
	{ 
	
	
	 buttonAssr251.setTextColor(Color.BLUE);
		
	 rGroupAssr25.check(buttonAssr251.getId()) ;
	 
	 
	 buttonAssr251.setTextColor(Color.BLUE);
		
	 rGroupAssr25.check(buttonAssr251.getId()) ;
	 
	 
	 buttonAssr253.setTextColor(Color.BLUE);
		
	 rGroupAssr25.check(buttonAssr253.getId()) ;
	 
	 ChronometerASSR25.stop();
	
	
	}	
	
	
	
	
}
