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

public class ActivitySerie42 extends  Activity {
	RadioGroup rGroupSerie421,rGroupSerie422;
	RadioButton buttonSerie421,buttonSerie422,buttonSerie423,buttonSerie424;
	Chronometer ChronometerS42;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie42);


		rGroupSerie421 = (RadioGroup) findViewById(R.id.radioGroupSerie421);
		rGroupSerie422 = (RadioGroup) findViewById(R.id.radioGroupSerie422);
		ChronometerS42 = (Chronometer) findViewById(R.id.chronometerS42);
		ChronometerS42.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie421 = new RadioButton(this);
		buttonSerie421.setText("Oui.........................................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie421.addView(buttonSerie421);
		 
		 buttonSerie422 = new RadioButton(this);
		 buttonSerie422.setText("Non .......................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie421.addView(buttonSerie422);
		 
		
		 
		rGroupSerie421.check(buttonSerie421.getId()) ;
		
		
		buttonSerie423 = new RadioButton(this);
		buttonSerie423.setText("Des 2 côtés............................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie422.addView(buttonSerie423);
		 
		 buttonSerie424 = new RadioButton(this);
		 buttonSerie424.setText("Par la gauche seulement ......(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie422.addView(buttonSerie424);
		 
		
		 
		rGroupSerie422.check(buttonSerie423.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie42.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie42(View v) 
		
		{ buttonSerie421.setTextColor(Color.BLUE);
		
		 rGroupSerie421.check(buttonSerie421.getId()) ;
		 
		 
		 
		 buttonSerie423.setTextColor(Color.BLUE);
			
		 rGroupSerie422.check(buttonSerie423.getId()) ;
		 
		 buttonSerie424.setTextColor(Color.BLUE);
			
		 rGroupSerie422.check(buttonSerie424.getId()) ;
		 ChronometerS42.stop();
		}	
		
		
	public void QuitterSerie42(View v) 

	{   Intent IntentQuitterSerie42 = new Intent(ActivitySerie42.this,MainActivity.class);
		startActivity(IntentQuitterSerie42);
	}	
		

	public void SuivanteSerie42(View v) 

	{Intent IntentSuivanteSerie42 = new Intent(ActivitySerie42.this,ActivitySerie43.class);
	 startActivity(IntentSuivanteSerie42);}	

	}
