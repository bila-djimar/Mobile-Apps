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

public class ActivitySerie32 extends  Activity {
	RadioGroup rGroupSerie32;
	RadioButton buttonSerie321,buttonSerie322;
	Chronometer ChronometerS32;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie32);


		rGroupSerie32 = (RadioGroup) findViewById(R.id.radioGroupSerie32);
		ChronometerS32 = (Chronometer) findViewById(R.id.chronometerS32);
		ChronometerS32.start();
		
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie321 = new RadioButton(this);
		buttonSerie321.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie32.addView(buttonSerie321);
		 
		 buttonSerie322 = new RadioButton(this);
		buttonSerie322.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie32.addView(buttonSerie322);
		 
		
		 
		rGroupSerie32.check(buttonSerie321.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie32.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie32(View v) 
	
	{ buttonSerie322.setTextColor(Color.BLUE);
	
	 rGroupSerie32.check(buttonSerie322.getId()) ;
	 
	 ChronometerS32.stop();
	}	
	
	
	
	
public void QuitterSerie32(View v) 

{ Intent IntentQuitterSerie32 = new Intent(ActivitySerie32.this,MainActivity.class);
	startActivity(IntentQuitterSerie32);
}	
	

public void SuivanteSerie32(View v) 

{Intent IntentSuivanteSerie32 = new Intent(ActivitySerie32.this,ActivitySerie33.class);
 startActivity(IntentSuivanteSerie32);}	

}
