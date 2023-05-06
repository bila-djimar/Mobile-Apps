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

public class ActivitySerie18 extends  Activity {
	RadioGroup rGroupSerie181,rGroupSerie182;
	RadioButton buttonSerie181,buttonSerie182,buttonSerie183,buttonSerie184;
	Chronometer ChronometerS18;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie18);


		rGroupSerie181 = (RadioGroup) findViewById(R.id.radioGroupSerie181);
		rGroupSerie182 = (RadioGroup) findViewById(R.id.radioGroupSerie182);
		ChronometerS18 = (Chronometer) findViewById(R.id.chronometerS18);
		ChronometerS18.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie181 = new RadioButton(this);
		buttonSerie181.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie181.addView(buttonSerie181);
		 
		 buttonSerie182 = new RadioButton(this);
		 buttonSerie182.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie181.addView(buttonSerie182);
		 
		
		 
		rGroupSerie181.check(buttonSerie181.getId()) ;
		
		
		buttonSerie183 = new RadioButton(this);
		buttonSerie183.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie182.addView(buttonSerie183);
		 
		 buttonSerie184 = new RadioButton(this);
		 buttonSerie184.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie182.addView(buttonSerie184);
		 
		
		 
		rGroupSerie182.check(buttonSerie183.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie18.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie18(View v) 
		
		{ buttonSerie182.setTextColor(Color.BLUE);
		
		 rGroupSerie181.check(buttonSerie182.getId()) ;
		 
		 
		 
		 buttonSerie184.setTextColor(Color.BLUE);
			
		 rGroupSerie182.check(buttonSerie184.getId()) ;
		 ChronometerS18.stop();
		}	
		
		
	public void QuitterSerie18(View v) 

	{ Intent IntentQuitterSerie18 = new Intent(ActivitySerie18.this,MainActivity.class);
		startActivity(IntentQuitterSerie18);
	}	
		

	public void SuivanteSerie18(View v) 

	{ Intent IntentSuivanteSerie18 = new Intent(ActivitySerie18.this,ActivitySerie19.class);
	  startActivity(IntentSuivanteSerie18);
	}	

	}
