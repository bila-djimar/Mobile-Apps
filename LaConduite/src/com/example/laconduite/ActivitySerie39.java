package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivitySerie39 extends  Activity {
	RadioGroup rGroupSerie39;
	RadioButton buttonSerie391,buttonSerie392,buttonSerie393;
	Chronometer ChronometerS39;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie39);


		rGroupSerie39 = (RadioGroup) findViewById(R.id.radioGroupSerie39);
		ChronometerS39 = (Chronometer) findViewById(R.id.chronometerS39);
		ChronometerS39.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie391 = new RadioButton(this);
		buttonSerie391.setText("A partir des premiers panneaux ............(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie39.addView(buttonSerie391);
		 
		 buttonSerie392 = new RadioButton(this);
		buttonSerie392.setText("A 50 m ..................................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie39.addView(buttonSerie392);
		 
		 buttonSerie393 = new RadioButton(this);
		buttonSerie393.setText("A 150 m ................................................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie39.addView(buttonSerie393);
		 
		rGroupSerie39.check(buttonSerie391.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie39.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie39(View v) 
	
	{ buttonSerie391.setTextColor(Color.BLUE);
	
	 rGroupSerie39.check(buttonSerie391.getId()) ;
	 ChronometerS39.stop();
	}	
	
	
	
public void QuitterSerie39(View v) 

{ Intent IntentQuitterSerie39 = new Intent(ActivitySerie39.this,MainActivity.class);
	startActivity(IntentQuitterSerie39);
}	
	

public void SuivanteSerie39(View v) 

{Intent IntentSuivanteSerie39 = new Intent(ActivitySerie39.this,ActivitySerie40.class);
 startActivity(IntentSuivanteSerie39);}	

}
