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

public class ActivitySerie20 extends   Activity {
	RadioGroup rGroupSerie201,rGroupSerie202;
	RadioButton buttonSerie201,buttonSerie202,buttonSerie203,buttonSerie204;
	Chronometer ChronometerS20;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie20);

		
		rGroupSerie201 = (RadioGroup) findViewById(R.id.radioGroupSerie201);
		rGroupSerie202 = (RadioGroup) findViewById(R.id.radioGroupSerie202);
		ChronometerS20 = (Chronometer) findViewById(R.id.chronometerS20);
		ChronometerS20.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie201 = new RadioButton(this);
		buttonSerie201.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie201.addView(buttonSerie201);
		 
		 buttonSerie202 = new RadioButton(this);
		 buttonSerie202.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie201.addView(buttonSerie202);
		 
		
		 
		rGroupSerie201.check(buttonSerie201.getId()) ;
		
		
		buttonSerie203 = new RadioButton(this);
		buttonSerie203.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie202.addView(buttonSerie203);
		 
		 buttonSerie204 = new RadioButton(this);
		 buttonSerie204.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie202.addView(buttonSerie204);
		 
		
		 
		rGroupSerie202.check(buttonSerie203.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie20.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie20(View v) 
		
		{ buttonSerie201.setTextColor(Color.BLUE);
		
		 rGroupSerie201.check(buttonSerie201.getId()) ;
		 
		 
		 
		 buttonSerie203.setTextColor(Color.BLUE);
			
		 rGroupSerie202.check(buttonSerie203.getId()) ;
		 
		 ChronometerS20.stop();
		}	
		
		
		
	public void QuitterSerie20(View v) 

	{Intent IntentQuitterSerie20 = new Intent(ActivitySerie20.this,MainActivity.class);
		startActivity(IntentQuitterSerie20);}	
		

	public void SuivanteSerie20(View v) 

	{ Intent IntentSuivanteSerie20 = new Intent(ActivitySerie20.this,ActivitySerie21.class);
	  startActivity(IntentSuivanteSerie20);
	}	

	}
