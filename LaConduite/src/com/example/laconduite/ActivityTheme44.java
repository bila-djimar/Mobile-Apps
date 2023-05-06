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

public class ActivityTheme44 extends  Activity {
	RadioGroup rGroupTheme41,rGroupTheme42;
	RadioButton buttonTheme41,buttonTheme42,buttonTheme43,buttonTheme44;
	Chronometer ChronometerPriority4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme44);



		rGroupTheme41 = (RadioGroup) findViewById(R.id.radioGroupTheme441);
		rGroupTheme42 = (RadioGroup) findViewById(R.id.radioGroupTheme442);
		
		ChronometerPriority4 = (Chronometer) findViewById(R.id.chronometerPriority4);
		ChronometerPriority4.start();
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme41 = new RadioButton(this);
		buttonTheme41.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme41.addView(buttonTheme41);
		 
		 buttonTheme42 = new RadioButton(this);
		 buttonTheme42.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme41.addView(buttonTheme42);
		 
		
		 
		rGroupTheme41.check(buttonTheme41.getId()) ;
		
		
		buttonTheme43 = new RadioButton(this);
		buttonTheme43.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme42.addView(buttonTheme43);
		 
		 buttonTheme44 = new RadioButton(this);
		 buttonTheme44.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme42.addView(buttonTheme44);
		 
		
		 
		rGroupTheme42.check(buttonTheme43.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme44.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme44(View v) 
		
		{ buttonTheme41.setTextColor(Color.BLUE);
		
		 rGroupTheme41.check(buttonTheme41.getId()) ;
		 
		 
		 
		 buttonTheme44.setTextColor(Color.BLUE);
			
		 rGroupTheme42.check(buttonTheme44.getId()) ;
		 ChronometerPriority4.stop();
		}	
		
		
		
		
	}
