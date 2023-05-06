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

public class ActivitySerie12 extends Activity {
	RadioGroup rGroupSerie121,rGroupSerie122;
	RadioButton buttonSerie121,buttonSerie122,buttonSerie123,buttonSerie124;
	Chronometer ChronometerS12;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie12);




		rGroupSerie121 = (RadioGroup) findViewById(R.id.radioGroupSerie121);
		rGroupSerie122 = (RadioGroup) findViewById(R.id.radioGroupSerie122);
		ChronometerS12 = (Chronometer) findViewById(R.id.chronometerS12);
		ChronometerS12.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie121 = new RadioButton(this);
		buttonSerie121.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie121.addView(buttonSerie121);
		 
		 buttonSerie122 = new RadioButton(this);
		 buttonSerie122.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie121.addView(buttonSerie122);
		 
		
		 
		rGroupSerie121.check(buttonSerie121.getId()) ;
		
		
		buttonSerie123 = new RadioButton(this);
		buttonSerie123.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie122.addView(buttonSerie123);
		 
		 buttonSerie124 = new RadioButton(this);
		 buttonSerie124.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie122.addView(buttonSerie124);
		 
		
		 
		rGroupSerie122.check(buttonSerie123.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie12.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie12(View v) 
		
		{ buttonSerie122.setTextColor(Color.BLUE);
		
		 rGroupSerie121.check(buttonSerie122.getId()) ;
		 
		 
		 
		 buttonSerie124.setTextColor(Color.BLUE);
			
		 rGroupSerie122.check(buttonSerie124.getId()) ;
		 
		 
		 
		 ChronometerS12.stop();
		}	
		
		
	public void QuitterSerie12(View v) 

	{ Intent IntentQuitterSerie12 = new Intent(ActivitySerie12.this,MainActivity.class);
		startActivity(IntentQuitterSerie12);
	}	
		

	public void SuivanteSerie12(View v) 

	{ Intent IntentSuivanteSerie12 = new Intent(ActivitySerie12.this,ActivitySerie13.class);
	  startActivity(IntentSuivanteSerie12);
	}	

	}
