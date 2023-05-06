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

public class ActivityTheme45 extends  Activity {
	//Button  Button45;
	RadioGroup rGroupTheme45;
	RadioButton buttonTheme451,buttonTheme452;
		Chronometer ChronometerPriority5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme45);



		
		
		rGroupTheme45 = (RadioGroup) findViewById(R.id.radioGroupTheme45);
		
		ChronometerPriority5 = (Chronometer) findViewById(R.id.chronometerPriority5);
		
		ChronometerPriority5.start();
	
		

		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme451 = new RadioButton(this);
		buttonTheme451.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme45.addView(buttonTheme451);
		 
		 buttonTheme452 = new RadioButton(this);
		buttonTheme452.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme45.addView(buttonTheme452);
		 
		
		 
		rGroupTheme45.check(buttonTheme451.getId()) ;
		
		
		 String currentTime= ChronometerPriority5.getText().toString();
		 
		 
		 
		
		/*if(!currentTime.equals("00:10")) //put time according to you
	    {
			Button45.setEnabled(false); 
			
			buttonTheme451.setTextColor(Color.BLUE);
			
			 rGroupTheme45.check(buttonTheme451.getId()) ;
			 Chronometer1.stop();
			
			
			 Chronometer2.setText(currentTime);
			
	     }*/
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme45.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme45(View v) 
	
	{ buttonTheme451.setTextColor(Color.BLUE);
	
	  rGroupTheme45.check(buttonTheme451.getId()) ;
	  ChronometerPriority5.stop();
	 
	 
	 // String currentTime= Chronometer1.getText().toString();
	  //Chronometer2.setText(currentTime);
	}	
	
	
	
	
}
