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

public class ActivitySerie3 extends  Activity {
	RadioGroup rGroupSerie3;
	RadioButton buttonSerie31,buttonSerie32;
	Chronometer ChronometerS3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie3);


		
		rGroupSerie3 = (RadioGroup) findViewById(R.id.radioGroupSerie3);
		ChronometerS3 = (Chronometer) findViewById(R.id.chronometerS3);
		ChronometerS3.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie31 = new RadioButton(this);
		buttonSerie31.setText("Je passe...........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie3.addView(buttonSerie31);
		 
		 buttonSerie32 = new RadioButton(this);
		buttonSerie32.setText("Je m'arrête ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie3.addView(buttonSerie32);
		 
		
		 
		rGroupSerie3.check(buttonSerie31.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie3.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie3(View v) 
	
	{ buttonSerie31.setTextColor(Color.BLUE);
	
	 rGroupSerie3.check(buttonSerie31.getId()) ;
	 
	 ChronometerS3.stop();
	}	
	
	
	
public void QuitterSerie3(View v) 

{ Intent IntentQuitterSerie3 = new Intent(ActivitySerie3.this,MainActivity.class);
	startActivity(IntentQuitterSerie3);
}	
	

public void SuivanteSerie3(View v) 

{Intent IntentSuivanteSerie3 = new Intent(ActivitySerie3.this,ActivitySerie4.class);
 startActivity(IntentSuivanteSerie3);}	

}
