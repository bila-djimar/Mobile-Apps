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

public class ActivitySerie41 extends  Activity {
	RadioGroup rGroupSerie41;
	RadioButton buttonSerie411,buttonSerie412;
	Chronometer ChronometerS41;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie41);

		rGroupSerie41 = (RadioGroup) findViewById(R.id.radioGroupSerie41);
		ChronometerS41 = (Chronometer) findViewById(R.id.chronometerS41);
		ChronometerS41.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie411 = new RadioButton(this);
		buttonSerie411.setText("Oui .........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie41.addView(buttonSerie411);
		 
		 buttonSerie412 = new RadioButton(this);
		buttonSerie412.setText("Non ........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie41.addView(buttonSerie412);
		 
		
		 
		rGroupSerie41.check(buttonSerie411.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie41.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie41(View v) 
	
	{ buttonSerie412.setTextColor(Color.BLUE);
	
	 rGroupSerie41.check(buttonSerie412.getId()) ;
	 
	 ChronometerS41.stop();
	}	
	
	
	
	
public void QuitterSerie41(View v) 

{   Intent IntentQuitterSerie41 = new Intent(ActivitySerie41.this,MainActivity.class);
	startActivity(IntentQuitterSerie41);}	
	

public void SuivanteSerie41(View v) 

{Intent IntentSuivanteSerie41 = new Intent(ActivitySerie41.this,ActivitySerie42.class);
 startActivity(IntentSuivanteSerie41);}	

}
