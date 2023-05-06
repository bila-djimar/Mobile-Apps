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

public class ActivitySerie4 extends  Activity {
	RadioGroup rGroupSerie4;
	RadioButton buttonSerie41,buttonSerie42,buttonSerie43;
	Chronometer ChronometerS4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie4);



		
		rGroupSerie4 = (RadioGroup) findViewById(R.id.radioGroupSerie4);
		ChronometerS4 = (Chronometer) findViewById(R.id.chronometerS4);
		ChronometerS4.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie41 = new RadioButton(this);
		buttonSerie41.setText("En feux de route ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie4.addView(buttonSerie41);
		 
		 buttonSerie42 = new RadioButton(this);
		buttonSerie42.setText("En feux de croisement ..............(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie4.addView(buttonSerie42);
		 
		 buttonSerie43 = new RadioButton(this);
		buttonSerie43.setText("En feux de brouillard avant .......(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie4.addView(buttonSerie43);
		 
		rGroupSerie4.check(buttonSerie41.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie4.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie4(View v) 
	
	{ buttonSerie42.setTextColor(Color.BLUE);
	
	 rGroupSerie4.check(buttonSerie42.getId()) ;
	 ChronometerS4.stop();
	}	
	
	
	
public void QuitterSerie4(View v) 

{ Intent IntentQuitterSerie4 = new Intent(ActivitySerie4.this,MainActivity.class);
	startActivity(IntentQuitterSerie4);
}	
	

public void SuivanteSerie4(View v) 

{Intent IntentSuivanteSerie4 = new Intent(ActivitySerie4.this,ActivitySerie5.class);
 startActivity(IntentSuivanteSerie4);}	

}
