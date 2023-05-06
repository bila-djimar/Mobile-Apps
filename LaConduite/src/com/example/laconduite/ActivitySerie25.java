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

public class ActivitySerie25 extends  Activity {
	RadioGroup rGroupSerie25;
	RadioButton buttonSerie251,buttonSerie252;
	Chronometer ChronometerS25;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie25);


		rGroupSerie25 = (RadioGroup) findViewById(R.id.radioGroupSerie25);
		ChronometerS25 = (Chronometer) findViewById(R.id.chronometerS25);
		ChronometerS25.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie251 = new RadioButton(this);
		buttonSerie251.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie25.addView(buttonSerie251);
		 
		 buttonSerie252 = new RadioButton(this);
		buttonSerie252.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie25.addView(buttonSerie252);
		 
		
		 
		rGroupSerie25.check(buttonSerie251.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie25.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie25(View v) 
	
	{ buttonSerie251.setTextColor(Color.BLUE);
	
	 rGroupSerie25.check(buttonSerie251.getId()) ;
	 
	 ChronometerS25.stop();
	 
	}	
	



public void QuitterSerie25(View v) 

{Intent IntentQuitterSerie25 = new Intent(ActivitySerie25.this,MainActivity.class);
	startActivity(IntentQuitterSerie25);}	
	

public void SuivanteSerie25(View v) 

{ Intent IntentSuivanteSerie25 = new Intent(ActivitySerie25.this,ActivitySerie26.class);
  startActivity(IntentSuivanteSerie25);
}	

}
