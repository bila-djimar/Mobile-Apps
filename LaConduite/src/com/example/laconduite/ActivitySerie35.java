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

public class ActivitySerie35 extends  Activity {

	RadioGroup rGroupSerie351,rGroupSerie352;
	RadioButton buttonSerie351,buttonSerie352,buttonSerie353,buttonSerie354;
	Chronometer ChronometerS35;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie35);


		rGroupSerie351 = (RadioGroup) findViewById(R.id.radioGroupSerie351);
		rGroupSerie352 = (RadioGroup) findViewById(R.id.radioGroupSerie352);
		ChronometerS35 = (Chronometer) findViewById(R.id.chronometerS35);
		ChronometerS35.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie351 = new RadioButton(this);
		buttonSerie351.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie351.addView(buttonSerie351);
		 
		 buttonSerie352 = new RadioButton(this);
		 buttonSerie352.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie351.addView(buttonSerie352);
		 
		
		 
		rGroupSerie351.check(buttonSerie351.getId()) ;
		
		
		buttonSerie353 = new RadioButton(this);
		buttonSerie353.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie352.addView(buttonSerie353);
		 
		 buttonSerie354 = new RadioButton(this);
		 buttonSerie354.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie352.addView(buttonSerie354);
		 
		
		 
		rGroupSerie352.check(buttonSerie353.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie35.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie35(View v) 
		
		{ buttonSerie352.setTextColor(Color.BLUE);
		
		 rGroupSerie351.check(buttonSerie352.getId()) ;
		 
		 
		 
		 buttonSerie354.setTextColor(Color.BLUE);
			
		 rGroupSerie352.check(buttonSerie354.getId()) ;
		 
		 ChronometerS35.stop();
		}	
		
		
		
	public void QuitterSerie35(View v) 

	{ Intent IntentQuitterSerie35 = new Intent(ActivitySerie35.this,MainActivity.class);
		startActivity(IntentQuitterSerie35);
	}	
		

	public void SuivanteSerie35(View v) 

	{Intent IntentSuivanteSerie35 = new Intent(ActivitySerie35.this,ActivitySerie36.class);
	 startActivity(IntentSuivanteSerie35);}	

	}
