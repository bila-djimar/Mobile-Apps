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

public class ActivitySerie14 extends  Activity {
	RadioGroup rGroupSerie14;
	RadioButton buttonSerie141,buttonSerie142;
	Chronometer ChronometerS14;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie14);


		rGroupSerie14 = (RadioGroup) findViewById(R.id.radioGroupSerie14);
		ChronometerS14 = (Chronometer) findViewById(R.id.chronometerS14);
		ChronometerS14.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie141 = new RadioButton(this);
		buttonSerie141.setText("Oui ..........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie14.addView(buttonSerie141);
		 
		 buttonSerie142 = new RadioButton(this);
		buttonSerie142.setText("Non .........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie14.addView(buttonSerie142);
		 
		
		 
		rGroupSerie14.check(buttonSerie141.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie14.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie14(View v) 
	
	{ buttonSerie142.setTextColor(Color.BLUE);
	
	 rGroupSerie14.check(buttonSerie142.getId()) ;
	 
	 
	 
	 ChronometerS14.stop();
	}	
	
	
	
	
public void QuitterSerie14(View v) 

{ Intent IntentQuitterSerie14 = new Intent(ActivitySerie14.this,MainActivity.class);
	startActivity(IntentQuitterSerie14);
}	
	

public void SuivanteSerie14(View v) 

{ Intent IntentSuivanteSerie14 = new Intent(ActivitySerie14.this,ActivitySerie15.class);
  startActivity(IntentSuivanteSerie14);
}	

}
