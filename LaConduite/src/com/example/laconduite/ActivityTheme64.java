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

public class ActivityTheme64 extends  Activity {
	RadioGroup rGroupTheme64;
	RadioButton buttonTheme641,buttonTheme642;
	Chronometer Chronometer64;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme64);
		
		
		 rGroupTheme64 = (RadioGroup) findViewById(R.id.radioGroupTheme64);
			
	        Chronometer64 = (Chronometer) findViewById(R.id.chronometer64);
			
			Chronometer64.start();
			
			 
			OnClickListener radio_listener = new OnClickListener() {
			    public void onClick(View v) {
			        onRadioButtonClick(v);
			    }

				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			};
			
			
			buttonTheme641 = new RadioButton(this);
			buttonTheme641.setText("Je ralentis dès maintenant ......................(A)");
			//button1.setTextColor(Color.RED);
			//button1.setOnClickListener(radio_listener);
			rGroupTheme64.addView(buttonTheme641);
			 
			 buttonTheme642 = new RadioButton(this);
			buttonTheme642.setText("j'attends d'être dans la voie du milieu .....(B)");
			//button2.setTextColor(Color.GREEN);
			//button2.setOnClickListener(radio_listener);
			rGroupTheme64.addView(buttonTheme642);
			 
			
			 
			rGroupTheme64.check(buttonTheme641.getId()) ;
			
			
			
			
			
			
			
			
			
			
			
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme64.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme64(View v) 
		
		{ buttonTheme641.setTextColor(Color.BLUE);
		
		 rGroupTheme64.check(buttonTheme641.getId()) ;
		 
		 Chronometer64.stop();
		}	
		
		
		
		
	}
