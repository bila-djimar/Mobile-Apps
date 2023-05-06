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

public class ActivitySerie8 extends  Activity {
	RadioGroup rGroupSerie81,rGroupSerie82;
	RadioButton buttonSerie81,buttonSerie82,buttonSerie83,buttonSerie84;
	Chronometer ChronometerS8;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie8);



		rGroupSerie81 = (RadioGroup) findViewById(R.id.radioGroupSerie81);
		rGroupSerie82 = (RadioGroup) findViewById(R.id.radioGroupSerie82);
		ChronometerS8 = (Chronometer) findViewById(R.id.chronometerS8);
		ChronometerS8.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie81 = new RadioButton(this);
		buttonSerie81.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie81.addView(buttonSerie81);
		 
		 buttonSerie82 = new RadioButton(this);
		 buttonSerie82.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie81.addView(buttonSerie82);
		 
		
		 
		rGroupSerie81.check(buttonSerie81.getId()) ;
		
		
		buttonSerie83 = new RadioButton(this);
		buttonSerie83.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie82.addView(buttonSerie83);
		 
		 buttonSerie84 = new RadioButton(this);
		 buttonSerie84.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie82.addView(buttonSerie84);
		 
		
		 
		rGroupSerie82.check(buttonSerie83.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie8.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie8(View v) 
		
		{ buttonSerie81.setTextColor(Color.BLUE);
		
		 rGroupSerie81.check(buttonSerie81.getId()) ;
		 
		 
		 
		 buttonSerie83.setTextColor(Color.BLUE);
			
		 rGroupSerie82.check(buttonSerie83.getId()) ;
		 
		 ChronometerS8.stop();
		}	
		
		
		
		
	public void QuitterSerie8(View v) 

	{ Intent IntentQuitterSerie8 = new Intent(ActivitySerie8.this,MainActivity.class);
		startActivity(IntentQuitterSerie8);
	}	
		

	public void SuivanteSerie8(View v) 

	{Intent IntentSuivanteSerie8 = new Intent(ActivitySerie8.this,ActivitySerie9.class);
	 startActivity(IntentSuivanteSerie8);}	

	}
