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

public class ActivityTheme52 extends  Activity {
	RadioGroup rGroupTheme51,rGroupTheme52;
	RadioButton buttonTheme51,buttonTheme52,buttonTheme53,buttonTheme54;
	Chronometer ChronometerVisibility2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme52);



		rGroupTheme51 = (RadioGroup) findViewById(R.id.radioGroupTheme521);
		rGroupTheme52 = (RadioGroup) findViewById(R.id.radioGroupTheme522);
		
		ChronometerVisibility2 = (Chronometer) findViewById(R.id.chronometerVisibility2);
		//Chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
		//Button45 = (Button) findViewById(R.id.ValiderTheme45);
		ChronometerVisibility2.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme51 = new RadioButton(this);
		buttonTheme51.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme51.addView(buttonTheme51);
		 
		 buttonTheme52 = new RadioButton(this);
		 buttonTheme52.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme51.addView(buttonTheme52);
		 
		
		 
		rGroupTheme51.check(buttonTheme51.getId()) ;
		
		
		buttonTheme53 = new RadioButton(this);
		buttonTheme53.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme52.addView(buttonTheme53);
		 
		 buttonTheme54 = new RadioButton(this);
		 buttonTheme54.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme52.addView(buttonTheme54);
		 
		
		 
		rGroupTheme52.check(buttonTheme53.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme52.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme52(View v) 
		
		{ buttonTheme51.setTextColor(Color.BLUE);
		
		 rGroupTheme51.check(buttonTheme51.getId()) ;
		 
		 
		 
		 buttonTheme54.setTextColor(Color.BLUE);
			
		 rGroupTheme52.check(buttonTheme54.getId()) ;
		 
		 ChronometerVisibility2.stop();
		}	
		
		
		
		
	}
