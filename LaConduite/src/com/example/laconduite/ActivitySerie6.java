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

public class ActivitySerie6 extends  Activity {
	RadioGroup rGroupSerie6;
	RadioButton buttonSerie61,buttonSerie62;
	Chronometer ChronometerS6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie6);


		rGroupSerie6 = (RadioGroup) findViewById(R.id.radioGroupSerie6);
		ChronometerS6 = (Chronometer) findViewById(R.id.chronometerS6);
		ChronometerS6.start();
		
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie61 = new RadioButton(this);
		buttonSerie61.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie6.addView(buttonSerie61);
		 
		 buttonSerie62 = new RadioButton(this);
		buttonSerie62.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie6.addView(buttonSerie62);
		 
		
		 
		rGroupSerie6.check(buttonSerie61.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie6.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie6(View v) 
	
	{ buttonSerie62.setTextColor(Color.BLUE);
	
	 rGroupSerie6.check(buttonSerie62.getId()) ;
	 
	 ChronometerS6.stop();
	}	
	
	
	
	
public void QuitterSerie6(View v) 

{ Intent IntentQuitterSerie6 = new Intent(ActivitySerie6.this,MainActivity.class);
	startActivity(IntentQuitterSerie6);
}	
	

public void SuivanteSerie6(View v) 

{Intent IntentSuivanteSerie6 = new Intent(ActivitySerie6.this,ActivitySerie7.class);
 startActivity(IntentSuivanteSerie6);}	

}
