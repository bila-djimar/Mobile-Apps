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

public class ActivitySerie44 extends  Activity {
	RadioGroup rGroupSerie441,rGroupSerie442;
	RadioButton buttonSerie441,buttonSerie442,buttonSerie443,buttonSerie444;
	Chronometer ChronometerS44;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie44);


		rGroupSerie441 = (RadioGroup) findViewById(R.id.radioGroupSerie441);
		rGroupSerie442 = (RadioGroup) findViewById(R.id.radioGroupSerie442);
		ChronometerS44 = (Chronometer) findViewById(R.id.chronometerS44);
		ChronometerS44.start();
		
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie441 = new RadioButton(this);
		buttonSerie441.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie441.addView(buttonSerie441);
		 
		 buttonSerie442 = new RadioButton(this);
		 buttonSerie442.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie441.addView(buttonSerie442);
		 
		
		 
		rGroupSerie441.check(buttonSerie441.getId()) ;
		
		
		buttonSerie443 = new RadioButton(this);
		buttonSerie443.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie442.addView(buttonSerie443);
		 
		 buttonSerie444 = new RadioButton(this);
		 buttonSerie444.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie442.addView(buttonSerie444);
		 
		
		 
		rGroupSerie442.check(buttonSerie443.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie44.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie44(View v) 
		
		{ buttonSerie442.setTextColor(Color.BLUE);
		
		 rGroupSerie441.check(buttonSerie442.getId()) ;
		 
		 
		 
		 buttonSerie444.setTextColor(Color.BLUE);
			
		 rGroupSerie442.check(buttonSerie444.getId()) ;
		 
		 ChronometerS44.stop();
		}	
		
		
		
	public void QuitterSerie44(View v) 

	{ Intent IntentQuitterSerie44 = new Intent(ActivitySerie44.this,MainActivity.class);
		startActivity(IntentQuitterSerie44);
	}	
		

	public void SuivanteSerie44(View v) 

	{Intent IntentSuivanteSerie44 = new Intent(ActivitySerie44.this,ActivitySerie45.class);
	 startActivity(IntentSuivanteSerie44);}	

	}
