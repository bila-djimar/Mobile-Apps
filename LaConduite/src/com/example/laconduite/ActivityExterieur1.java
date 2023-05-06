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

public class ActivityExterieur1 extends  Activity {
	RadioGroup rGroupExterieur11,rGroupExterieur12;
	RadioButton buttonExterieur11,buttonExterieur12,buttonExterieur13,buttonExterieur14;
	Chronometer ChronometerEX1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exterieur1);



		rGroupExterieur11 = (RadioGroup) findViewById(R.id.radioGroupExterieur11);
		rGroupExterieur12 = (RadioGroup) findViewById(R.id.radioGroupExterieur12);
        ChronometerEX1 = (Chronometer) findViewById(R.id.chronometerE1);
		ChronometerEX1.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonExterieur11 = new RadioButton(this);
		buttonExterieur11.setText("Peut empêcher de bien voir vers l'avant....(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupExterieur11.addView(buttonExterieur11);
		 
		 buttonExterieur12 = new RadioButton(this);
		 buttonExterieur12.setText("Peux empêcher d'être bien vu....................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupExterieur11.addView(buttonExterieur12);
		 
		
		 
		rGroupExterieur11.check(buttonExterieur11.getId()) ;
		
		
		buttonExterieur13 = new RadioButton(this);
		buttonExterieur13.setText("Oui............................................................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupExterieur12.addView(buttonExterieur13);
		 
		 buttonExterieur14 = new RadioButton(this);
		 buttonExterieur14.setText("Non ..........................................................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupExterieur12.addView(buttonExterieur14);
		 
		
		 
		rGroupExterieur12.check(buttonExterieur13.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityExterieur1.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderExterieur1(View v) 
		
		{ buttonExterieur11.setTextColor(Color.BLUE);
		
		 rGroupExterieur11.check(buttonExterieur11.getId()) ;
		 
		 buttonExterieur12.setTextColor(Color.BLUE);
			
		 rGroupExterieur11.check(buttonExterieur12.getId()) ;
		 
		 buttonExterieur13.setTextColor(Color.BLUE);
			
		 rGroupExterieur12.check(buttonExterieur13.getId()) ;
		 ChronometerEX1.stop();
		}	
		
		
		
		
	}
