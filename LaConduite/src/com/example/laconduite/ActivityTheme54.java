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

public class ActivityTheme54 extends  Activity {
	RadioGroup rGroupTheme51,rGroupTheme54;
	RadioButton buttonTheme51,buttonTheme52,buttonTheme53,buttonTheme54;
	Chronometer ChronometerVisibility4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme54);



		

		rGroupTheme51 = (RadioGroup) findViewById(R.id.radioGroupTheme541);
		rGroupTheme54 = (RadioGroup) findViewById(R.id.radioGroupTheme542);
		
		ChronometerVisibility4 = (Chronometer) findViewById(R.id.chronometerVisibility4);
		//Chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
		//Button45 = (Button) findViewById(R.id.ValiderTheme45);
		ChronometerVisibility4.start();
		
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
		 
		 buttonTheme54 = new RadioButton(this);
		 buttonTheme54.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme51.addView(buttonTheme54);
		 
		
		 
		rGroupTheme51.check(buttonTheme51.getId()) ;
		
		
		buttonTheme53 = new RadioButton(this);
		buttonTheme53.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme54.addView(buttonTheme53);
		 
		 buttonTheme54 = new RadioButton(this);
		 buttonTheme54.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme54.addView(buttonTheme54);
		 
		
		 
		rGroupTheme54.check(buttonTheme53.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme54.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme54(View v) 
		
		{ buttonTheme51.setTextColor(Color.BLUE);
		
		 rGroupTheme51.check(buttonTheme51.getId()) ;
		 
		 
		 
		 buttonTheme54.setTextColor(Color.BLUE);
			
		 rGroupTheme54.check(buttonTheme54.getId()) ;
		 ChronometerVisibility4.stop();
		}	
		
		
		
		
	}
