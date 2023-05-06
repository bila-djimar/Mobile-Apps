package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityExterieur2 extends  Activity {
	RadioGroup rGroupExterieur21,rGroupExterieur22;
	RadioButton buttonExterieur21,buttonExterieur22,buttonExterieur23,buttonExterieur24;
	Chronometer ChronometerEX2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exterieur2);



	
	
	
		rGroupExterieur21 = (RadioGroup) findViewById(R.id.radioGroupExterieur21);
		rGroupExterieur22 = (RadioGroup) findViewById(R.id.radioGroupExterieur22);
		
        ChronometerEX2 = (Chronometer) findViewById(R.id.chronometerE2);
		
		ChronometerEX2.start();
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonExterieur21 = new RadioButton(this);
		buttonExterieur21.setText("Oui................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupExterieur21.addView(buttonExterieur21);
		 
		 buttonExterieur22 = new RadioButton(this);
		 buttonExterieur22.setText("Non................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupExterieur21.addView(buttonExterieur22);
		 
		
		 
		rGroupExterieur21.check(buttonExterieur21.getId()) ;
		
		
		buttonExterieur23 = new RadioButton(this);
		buttonExterieur23.setText("Oui.................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupExterieur22.addView(buttonExterieur23);
		 
		 buttonExterieur24 = new RadioButton(this);
		 buttonExterieur24.setText("Non................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupExterieur22.addView(buttonExterieur24);
		 
		
		 
		rGroupExterieur22.check(buttonExterieur23.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityExterieur2.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderExterieur2(View v) 
		
		{ 
		 
		 buttonExterieur22.setTextColor(Color.BLUE);
			
		 rGroupExterieur21.check(buttonExterieur22.getId()) ;
		 
		 buttonExterieur23.setTextColor(Color.BLUE);
			
		 rGroupExterieur22.check(buttonExterieur23.getId()) ;
		 ChronometerEX2.stop();
		}	
		
		
		
		
	}
