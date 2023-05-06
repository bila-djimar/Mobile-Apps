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

public class ActivitySerie30 extends  Activity {
	RadioGroup rGroupSerie30;
	RadioButton buttonSerie301,buttonSerie302;
	Chronometer ChronometerS30;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie30);


		rGroupSerie30 = (RadioGroup) findViewById(R.id.radioGroupSerie30);
		ChronometerS30 = (Chronometer) findViewById(R.id.chronometerS30);
		ChronometerS30.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie301 = new RadioButton(this);
		buttonSerie301.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie30.addView(buttonSerie301);
		 
		 buttonSerie302 = new RadioButton(this);
		buttonSerie302.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie30.addView(buttonSerie302);
		 
		
		 
		rGroupSerie30.check(buttonSerie301.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie30.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie30(View v) 
	
	{ buttonSerie302.setTextColor(Color.BLUE);
	
	 rGroupSerie30.check(buttonSerie302.getId()) ;
	 
	 ChronometerS30.stop();
	}	
	
	
public void QuitterSerie30(View v) 

{ Intent IntentQuitterSerie30 = new Intent(ActivitySerie30.this,MainActivity.class);
	startActivity(IntentQuitterSerie30);
}	
	

public void SuivanteSerie30(View v) 

{Intent IntentSuivanteSerie30 = new Intent(ActivitySerie30.this,ActivitySerie31.class);
 startActivity(IntentSuivanteSerie30);}	

}
