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

public class ActivityAssr23 extends  Activity {
	RadioGroup rGroupAssr23;
	RadioButton buttonAssr231,buttonAssr232;
	Chronometer ChronometerASSR23;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr23);
		


		
		
		rGroupAssr23 = (RadioGroup) findViewById(R.id.radioGroupAssr23);
		ChronometerASSR23 = (Chronometer) findViewById(R.id.chronometerASR23);
		ChronometerASSR23.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr231 = new RadioButton(this);
		buttonAssr231.setText("Le cyclomotoriste...................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr23.addView(buttonAssr231);
		 
		 buttonAssr232 = new RadioButton(this);
		buttonAssr232.setText("L'automobiliste ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr23.addView(buttonAssr232);
		 
		
		 
		rGroupAssr23.check(buttonAssr231.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr23.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr23(View v) 
	
	{ buttonAssr231.setTextColor(Color.BLUE);
	
	 rGroupAssr23.check(buttonAssr231.getId()) ;
	 
	 ChronometerASSR23.stop();
	}	
	
	
	
	
}
