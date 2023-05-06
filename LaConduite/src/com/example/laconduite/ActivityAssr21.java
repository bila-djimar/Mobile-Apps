package com.example.laconduite;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityAssr21 extends ActionBarActivity {
	RadioGroup rGroupAssr21;
	RadioButton buttonAssr211,buttonAssr212,buttonAssr213,buttonAssr214;
	Chronometer ChronometerASSR21;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr21);
		


		
		
		
		
		rGroupAssr21 = (RadioGroup) findViewById(R.id.radioGroupAssr21);
		ChronometerASSR21 = (Chronometer) findViewById(R.id.chronometerASR21);
		ChronometerASSR21.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonAssr211 = new RadioButton(this);
		buttonAssr211.setText("Non-port du casque par le conducteur....(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupAssr21.addView(buttonAssr211);
		 
		 buttonAssr212 = new RadioButton(this);
		buttonAssr212.setText("Défaut d'assurance..................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupAssr21.addView(buttonAssr212);
		 
		 buttonAssr213 = new RadioButton(this);
		 buttonAssr213.setText("Conduite sans être titulaire du BSR..........(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr21.addView(buttonAssr213);
		 
		
		
		 buttonAssr214 = new RadioButton(this);
		 buttonAssr214.setText("Bruit excessif............................................(D)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupAssr21.addView(buttonAssr214);
		
		
		
		rGroupAssr21.check(buttonAssr211.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityAssr21.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderAssr21(View v) 
	
	{ 
	
	
	 buttonAssr211.setTextColor(Color.BLUE);
		
	 rGroupAssr21.check(buttonAssr211.getId()) ;
	 
	 
	 buttonAssr212.setTextColor(Color.BLUE);
		
	 rGroupAssr21.check(buttonAssr212.getId()) ;
	 
	 
	 buttonAssr213.setTextColor(Color.BLUE);
		
	 rGroupAssr21.check(buttonAssr213.getId()) ;
	 
	 
	
	 buttonAssr214.setTextColor(Color.BLUE);
	
	 rGroupAssr21.check(buttonAssr214.getId()) ;
	 
	 ChronometerASSR21.stop();
	}	
	
	
	
	
}
