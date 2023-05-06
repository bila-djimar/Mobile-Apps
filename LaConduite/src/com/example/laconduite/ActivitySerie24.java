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

public class ActivitySerie24 extends  Activity {
	RadioGroup rGroupSerie24;
	RadioButton buttonSerie241,buttonSerie242,buttonSerie243;
	Chronometer ChronometerS24;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie24);

		rGroupSerie24 = (RadioGroup) findViewById(R.id.radioGroupSerie24);
		
		ChronometerS24 = (Chronometer) findViewById(R.id.chronometerS24);
		ChronometerS24.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie241 = new RadioButton(this);
		buttonSerie241.setText("90 km/h ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie24.addView(buttonSerie241);
		 
		 buttonSerie242 = new RadioButton(this);
		buttonSerie242.setText("110 km/h ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie24.addView(buttonSerie242);
		 
		 buttonSerie243 = new RadioButton(this);
		buttonSerie243.setText("130 km/H ......................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie24.addView(buttonSerie243);
		 
		rGroupSerie24.check(buttonSerie241.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie24.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie24(View v) 
	
	{ buttonSerie242.setTextColor(Color.BLUE);
	
	 rGroupSerie24.check(buttonSerie242.getId()) ;
	 
	 
	 ChronometerS24.stop();
	}	
	
	
	
	
public void QuitterSerie24(View v) 

{ Intent IntentQuitterSerie24 = new Intent(ActivitySerie24.this,MainActivity.class);
	startActivity(IntentQuitterSerie24);
}	
	

public void SuivanteSerie24(View v) 

{ Intent IntentSuivanteSerie24 = new Intent(ActivitySerie24.this,ActivitySerie25.class);
  startActivity(IntentSuivanteSerie24);
}	

}

