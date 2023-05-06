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

public class ActivityTheme92 extends  Activity {
	RadioGroup rGroupTheme92;
	RadioButton buttonTheme921,buttonTheme922;
	Chronometer Chronometer92;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme92);



		
		
		 rGroupTheme92 = (RadioGroup) findViewById(R.id.radioGroupTheme92);
			
	        Chronometer92 = (Chronometer) findViewById(R.id.chronometer92);
			
			Chronometer92.start();
			
			 
			OnClickListener radio_listener = new OnClickListener() {
			    public void onClick(View v) {
			        onRadioButtonClick(v);
			    }

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			};
			
			
			buttonTheme921 = new RadioButton(this);
			buttonTheme921.setText("Oui ........................(A)");
			//button1.setTextColor(Color.RED);
			//button1.setOnClickListener(radio_listener);
			rGroupTheme92.addView(buttonTheme921);
			 
			 buttonTheme922 = new RadioButton(this);
			buttonTheme922.setText("Non .......................(B)");
			//button2.setTextColor(Color.GREEN);
			//button2.setOnClickListener(radio_listener);
			rGroupTheme92.addView(buttonTheme922);
			 
			
			 
			rGroupTheme92.check(buttonTheme921.getId()) ;
			
			
			
			
			
			
			
			
			
			
			
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme92.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme92(View v) 
		
		{ buttonTheme921.setTextColor(Color.BLUE);
		
		 rGroupTheme92.check(buttonTheme921.getId()) ;
		 
		 Chronometer92.stop();
		}	
		
		
		
		
	}
