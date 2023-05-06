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

public class ActivitySerie23 extends  Activity {
	RadioGroup rGroupSerie23;
	RadioButton buttonSerie231,buttonSerie232;
	Chronometer ChronometerS23;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie23);


		rGroupSerie23 = (RadioGroup) findViewById(R.id.radioGroupSerie23);
		ChronometerS23 = (Chronometer) findViewById(R.id.chronometerS23);
		ChronometerS23.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie231 = new RadioButton(this);
		buttonSerie231.setText("Oui .........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie23.addView(buttonSerie231);
		 
		 buttonSerie232 = new RadioButton(this);
		buttonSerie232.setText("Non ........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie23.addView(buttonSerie232);
		 
		
		 
		rGroupSerie23.check(buttonSerie231.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie23.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie23(View v) 
	
	{ buttonSerie231.setTextColor(Color.BLUE);
	
	 rGroupSerie23.check(buttonSerie231.getId()) ;
	 
	 ChronometerS23.stop();
	}	
	
	
public void QuitterSerie23(View v) 

{ Intent IntentQuitterSerie23 = new Intent(ActivitySerie23.this,MainActivity.class);
	startActivity(IntentQuitterSerie23);
}	
	

public void SuivanteSerie23(View v) 

{ Intent IntentSuivanteSerie23 = new Intent(ActivitySerie23.this,ActivitySerie24.class);
  startActivity(IntentSuivanteSerie23);
}	

}
