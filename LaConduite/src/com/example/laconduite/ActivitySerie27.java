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

public class ActivitySerie27 extends  Activity {

	RadioGroup rGroupSerie27;
	RadioButton buttonSerie271,buttonSerie272;
	Chronometer ChronometerS27;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie27);


		rGroupSerie27 = (RadioGroup) findViewById(R.id.radioGroupSerie27);
		
		ChronometerS27 = (Chronometer) findViewById(R.id.chronometerS27);
		ChronometerS27.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie271 = new RadioButton(this);
		buttonSerie271.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie27.addView(buttonSerie271);
		 
		 buttonSerie272 = new RadioButton(this);
		buttonSerie272.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie27.addView(buttonSerie272);
		 
		
		 
		rGroupSerie27.check(buttonSerie271.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie27.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie27(View v) 
	
	{ buttonSerie271.setTextColor(Color.BLUE);
	
	 rGroupSerie27.check(buttonSerie271.getId()) ;
	 
	 ChronometerS27.stop();
	 
	}	
	
public void QuitterSerie27(View v) 

{ Intent IntentQuitterSerie27 = new Intent(ActivitySerie27.this,MainActivity.class);
	startActivity(IntentQuitterSerie27);
}	
	

public void SuivanteSerie27(View v) 

{ Intent IntentSuivanteSerie27 = new Intent(ActivitySerie27.this,ActivitySerie28.class);
  startActivity(IntentSuivanteSerie27);
}	

}
