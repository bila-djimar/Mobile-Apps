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

public class ActivitySerie5 extends    Activity {
	RadioGroup rGroupSerie51,rGroupSerie52;
	RadioButton buttonSerie51,buttonSerie52,buttonSerie53,buttonSerie54;
	Chronometer ChronometerS5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie5);


		rGroupSerie51 = (RadioGroup) findViewById(R.id.radioGroupSerie51);
		rGroupSerie52 = (RadioGroup) findViewById(R.id.radioGroupSerie52);
		ChronometerS5 = (Chronometer) findViewById(R.id.chronometerS5);
		ChronometerS5.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie51 = new RadioButton(this);
		buttonSerie51.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie51.addView(buttonSerie51);
		 
		 buttonSerie52 = new RadioButton(this);
		 buttonSerie52.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie51.addView(buttonSerie52);
		 
		
		 
		rGroupSerie51.check(buttonSerie51.getId()) ;
		
		
		buttonSerie53 = new RadioButton(this);
		buttonSerie53.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie52.addView(buttonSerie53);
		 
		 buttonSerie54 = new RadioButton(this);
		 buttonSerie54.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie52.addView(buttonSerie54);
		 
		
		 
		rGroupSerie52.check(buttonSerie53.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie5.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie5(View v) 
		
		{ buttonSerie51.setTextColor(Color.BLUE);
		
		 rGroupSerie51.check(buttonSerie51.getId()) ;
		 
		 
		 
		 buttonSerie54.setTextColor(Color.BLUE);
			
		 rGroupSerie52.check(buttonSerie54.getId()) ;
		 
		 ChronometerS5.stop();
		}	
		
		
	public void QuitterSerie5(View v) 

	{ Intent IntentQuitterSerie5 = new Intent(ActivitySerie5.this,MainActivity.class);
		startActivity(IntentQuitterSerie5);
	}	
		

	public void SuivanteSerie5(View v) 

	{Intent IntentSuivanteSerie5 = new Intent(ActivitySerie5.this,ActivitySerie6.class);
	 startActivity(IntentSuivanteSerie5);}	

	}
