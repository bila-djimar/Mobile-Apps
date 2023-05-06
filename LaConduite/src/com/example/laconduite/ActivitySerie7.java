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

public class ActivitySerie7 extends  Activity {
	RadioGroup rGroupSerie7;
	RadioButton buttonSerie71,buttonSerie72;
	Chronometer ChronometerS7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie7);



		rGroupSerie7 = (RadioGroup) findViewById(R.id.radioGroupSerie7);
		ChronometerS7 = (Chronometer) findViewById(R.id.chronometerS7);
		ChronometerS7.start();
		
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie71 = new RadioButton(this);
		buttonSerie71.setText("Oui .........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie7.addView(buttonSerie71);
		 
		 buttonSerie72 = new RadioButton(this);
		buttonSerie72.setText("Non ........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie7.addView(buttonSerie72);
		 
		
		 
		rGroupSerie7.check(buttonSerie71.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie7.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie7(View v) 
	
	{ buttonSerie72.setTextColor(Color.BLUE);
	
	 rGroupSerie7.check(buttonSerie72.getId()) ;
	 
	 ChronometerS7.stop();
	}	
	
	
	
public void QuitterSerie7(View v) 

{ Intent IntentQuitterSerie7 = new Intent(ActivitySerie7.this,MainActivity.class);
	startActivity(IntentQuitterSerie7);
}	
	

public void SuivanteSerie7(View v) 

{Intent IntentSuivanteSerie7 = new Intent(ActivitySerie7.this,ActivitySerie8.class);
 startActivity(IntentSuivanteSerie7);}	

}
