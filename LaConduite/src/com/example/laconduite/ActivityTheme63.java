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

public class ActivityTheme63 extends  Activity {
	RadioGroup rGroupTheme63;
	RadioButton buttonTheme631,buttonTheme632;
	Chronometer Chronometer63;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme63);



		
		
		
		 rGroupTheme63 = (RadioGroup) findViewById(R.id.radioGroupTheme63);
			
	        Chronometer63 = (Chronometer) findViewById(R.id.chronometer63);
			
			Chronometer63.start();
			
			 
			OnClickListener radio_listener = new OnClickListener() {
			    public void onClick(View v) {
			        onRadioButtonClick(v);
			    }

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			};
			
			
			buttonTheme631 = new RadioButton(this);
			buttonTheme631.setText("A droite de la fontaine ..........(A)");
			//button1.setTextColor(Color.RED);
			//button1.setOnClickListener(radio_listener);
			rGroupTheme63.addView(buttonTheme631);
			 
			 buttonTheme632 = new RadioButton(this);
			buttonTheme632.setText("A gauche de la fontaine ........(B)");
			//button2.setTextColor(Color.GREEN);
			//button2.setOnClickListener(radio_listener);
			rGroupTheme63.addView(buttonTheme632);
			 
			
			 
			rGroupTheme63.check(buttonTheme631.getId()) ;
			
			
			
			
			
			
			
			
			
			
			
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme63.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme63(View v) 
		
		{ buttonTheme632.setTextColor(Color.BLUE);
		
		 rGroupTheme63.check(buttonTheme632.getId()) ;
		 
		 Chronometer63.stop();
		}	
		
		
		
		
	}
