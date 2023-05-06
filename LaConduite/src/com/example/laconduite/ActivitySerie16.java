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

public class ActivitySerie16 extends  Activity {

	RadioGroup rGroupSerie16;
	RadioButton buttonSerie161,buttonSerie162;
	Chronometer ChronometerS16;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie16);

		rGroupSerie16 = (RadioGroup) findViewById(R.id.radioGroupSerie16);
		ChronometerS16 = (Chronometer) findViewById(R.id.chronometerS16);
		ChronometerS16.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie161 = new RadioButton(this);
		buttonSerie161.setText("80 km/h..........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie16.addView(buttonSerie161);
		 
		 buttonSerie162 = new RadioButton(this);
		buttonSerie162.setText("110 km/h.........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie16.addView(buttonSerie162);
		 
		
		 
		rGroupSerie16.check(buttonSerie161.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie16.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie16(View v) 
	
	{ buttonSerie162.setTextColor(Color.BLUE);
	
	 rGroupSerie16.check(buttonSerie162.getId()) ;
	 ChronometerS16.stop();
	}	
	
	
	
	
public void QuitterSerie16(View v) 

{ Intent IntentQuitterSerie16 = new Intent(ActivitySerie16.this,MainActivity.class);
	startActivity(IntentQuitterSerie16);
}	
	

public void SuivanteSerie16(View v) 

{ Intent IntentSuivanteSerie16 = new Intent(ActivitySerie16.this,ActivitySerie17.class);
  startActivity(IntentSuivanteSerie16);
}	

}
