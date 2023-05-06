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

public class ActivitySerie9 extends  Activity {
	RadioGroup rGroupSerie91,rGroupSerie92;
	RadioButton buttonSerie91,buttonSerie92,buttonSerie93,buttonSerie94;
	Chronometer ChronometerS9;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie9);

		rGroupSerie91 = (RadioGroup) findViewById(R.id.radioGroupSerie91);
		rGroupSerie92 = (RadioGroup) findViewById(R.id.radioGroupSerie92);
		ChronometerS9 = (Chronometer) findViewById(R.id.chronometerS9);
		ChronometerS9.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie91 = new RadioButton(this);
		buttonSerie91.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie91.addView(buttonSerie91);
		 
		 buttonSerie92 = new RadioButton(this);
		 buttonSerie92.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie91.addView(buttonSerie92);
		 
		
		 
		rGroupSerie91.check(buttonSerie91.getId()) ;
		
		
		buttonSerie93 = new RadioButton(this);
		buttonSerie93.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie92.addView(buttonSerie93);
		 
		 buttonSerie94 = new RadioButton(this);
		 buttonSerie94.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie92.addView(buttonSerie94);
		 
		
		 
		rGroupSerie92.check(buttonSerie93.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie9.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie9(View v) 
		
		{ buttonSerie92.setTextColor(Color.BLUE);
		
		 rGroupSerie91.check(buttonSerie92.getId()) ;
		 
		 
		 
		 buttonSerie93.setTextColor(Color.BLUE);
			
		 rGroupSerie92.check(buttonSerie93.getId()) ;
		 ChronometerS9.stop();
		 
		}	
		
		
		
		
	public void QuitterSerie9(View v) 

	{ Intent IntentQuitterSerie9 = new Intent(ActivitySerie9.this,MainActivity.class);
		startActivity(IntentQuitterSerie9);
	}	
		

	public void SuivanteSerie9(View v) 

	{Intent IntentSuivanteSerie9 = new Intent(ActivitySerie9.this,ActivitySerie10.class);
	 startActivity(IntentSuivanteSerie9);}	

	}

