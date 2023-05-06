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

public class ActivitySerie26 extends  Activity {
	RadioGroup rGroupSerie261,rGroupSerie262;
	RadioButton buttonSerie261,buttonSerie262,buttonSerie263,buttonSerie264;
	Chronometer ChronometerS26;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie26);


		rGroupSerie261 = (RadioGroup) findViewById(R.id.radioGroupSerie261);
		rGroupSerie262 = (RadioGroup) findViewById(R.id.radioGroupSerie262);
		ChronometerS26 = (Chronometer) findViewById(R.id.chronometerS26);
		ChronometerS26.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie261 = new RadioButton(this);
		buttonSerie261.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie261.addView(buttonSerie261);
		 
		 buttonSerie262 = new RadioButton(this);
		 buttonSerie262.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie261.addView(buttonSerie262);
		 
		
		 
		rGroupSerie261.check(buttonSerie261.getId()) ;
		
		
		buttonSerie263 = new RadioButton(this);
		buttonSerie263.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie262.addView(buttonSerie263);
		 
		 buttonSerie264 = new RadioButton(this);
		 buttonSerie264.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie262.addView(buttonSerie264);
		 
		
		 
		rGroupSerie262.check(buttonSerie263.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie26.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie26(View v) 
		
		{ buttonSerie261.setTextColor(Color.BLUE);
		
		 rGroupSerie261.check(buttonSerie261.getId()) ;
		 
		 
		 
		 buttonSerie264.setTextColor(Color.BLUE);
			
		 rGroupSerie262.check(buttonSerie264.getId()) ;
		 
		 ChronometerS26.stop(); 
		 
		}	
		


	
	public void QuitterSerie26(View v) 

	{ Intent IntentQuitterSerie26 = new Intent(ActivitySerie26.this,MainActivity.class);
		startActivity(IntentQuitterSerie26);
	}	
		

	public void SuivanteSerie26(View v) 

	{ Intent IntentSuivanteSerie26 = new Intent(ActivitySerie26.this,ActivitySerie27.class);
	  startActivity(IntentSuivanteSerie26);
	}	

	}
