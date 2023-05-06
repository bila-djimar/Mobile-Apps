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

public class ActivityTheme84 extends  Activity {
	RadioGroup rGroupTheme84;
	RadioButton buttonTheme841,buttonTheme842;
	Chronometer Chronometer84;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme84);



		
		
		  rGroupTheme84 = (RadioGroup) findViewById(R.id.radioGroupTheme84);
			
	        Chronometer84 = (Chronometer) findViewById(R.id.chronometer84);
			
			Chronometer84.start();
			
			 
			OnClickListener radio_listener = new OnClickListener() {
			    public void onClick(View v) {
			        onRadioButtonClick(v);
			    }

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			};
			
			
			buttonTheme841 = new RadioButton(this);
			buttonTheme841.setText("Dès maintenant ........................(A)");
			//button1.setTextColor(Color.RED);
			//button1.setOnClickListener(radio_listener);
			rGroupTheme84.addView(buttonTheme841);
			 
			 buttonTheme842 = new RadioButton(this);
			buttonTheme842.setText("Seulement à l'entrée du tunnel........(B)");
			//button2.setTextColor(Color.GREEN);
			//button2.setOnClickListener(radio_listener);
			rGroupTheme84.addView(buttonTheme842);
			 
			
			 
			rGroupTheme84.check(buttonTheme841.getId()) ;
			
			
			
			
			
			
			
			
			
			
			
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme84.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme84(View v) 
		
		{ buttonTheme841.setTextColor(Color.BLUE);
		
		 rGroupTheme84.check(buttonTheme841.getId()) ;
		 
		 Chronometer84.stop();
		}	
		
		
		
		
	}
