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

public class ActivityInterieur4 extends  Activity {
	RadioGroup rGroupInterieur4;
	RadioButton buttonInterieur41,buttonInterieur42,buttonInterieur43;
	Chronometer ChronometerI4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interieur4);



		
		
		rGroupInterieur4 = (RadioGroup) findViewById(R.id.radioGroupInterieur4);
		ChronometerI4 = (Chronometer) findViewById(R.id.chronometerI4);
		ChronometerI4.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonInterieur41 = new RadioButton(this);
		buttonInterieur41.setText("Améliore le confort....................................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupInterieur4.addView(buttonInterieur41);
		 
		 buttonInterieur42 = new RadioButton(this);
		buttonInterieur42.setText("Diminue la fatigue.....................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupInterieur4.addView(buttonInterieur42);
		 
		 buttonInterieur43 = new RadioButton(this);
		 buttonInterieur43.setText("Facilite l'appui sur la pédaled'embrayage.(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupInterieur4.addView(buttonInterieur43);
		 
		
		
		
		
		
		
		rGroupInterieur4.check(buttonInterieur41.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityInterieur4.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderInterieur4(View v) 
	
	{ 
	
	 buttonInterieur41.setTextColor(Color.BLUE);
		
	 rGroupInterieur4.check(buttonInterieur41.getId()) ;
	 
	
	 buttonInterieur42.setTextColor(Color.BLUE);
	
	 rGroupInterieur4.check(buttonInterieur42.getId()) ;
	 ChronometerI4.stop();
	}	
	
	
	
	
}
