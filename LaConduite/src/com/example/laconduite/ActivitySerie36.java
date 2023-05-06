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

public class ActivitySerie36 extends  Activity {
	RadioGroup rGroupSerie36;
	RadioButton buttonSerie361,buttonSerie362;
	Chronometer ChronometerS36;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie36);



		

		
		rGroupSerie36 = (RadioGroup) findViewById(R.id.radioGroupSerie36);
		ChronometerS36 = (Chronometer) findViewById(R.id.chronometerS36);
		ChronometerS36.start();
		
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie361 = new RadioButton(this);
		buttonSerie361.setText("A droite...........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie36.addView(buttonSerie361);
		 
		 buttonSerie362 = new RadioButton(this);
		buttonSerie362.setText("A gauche .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie36.addView(buttonSerie362);
		 
		
		 
		rGroupSerie36.check(buttonSerie361.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie36.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie36(View v) 
	
	{ buttonSerie361.setTextColor(Color.BLUE);
	
	 rGroupSerie36.check(buttonSerie361.getId()) ;
	 
	 ChronometerS36.stop();
	}	
	
	
public void QuitterSerie36(View v) 

{ Intent IntentQuitterSerie36 = new Intent(ActivitySerie36.this,MainActivity.class);
	startActivity(IntentQuitterSerie36);
}	
	

public void SuivanteSerie36(View v) 

{Intent IntentSuivanteSerie36 = new Intent(ActivitySerie36.this,ActivitySerie37.class);
 startActivity(IntentSuivanteSerie36);}	

}
