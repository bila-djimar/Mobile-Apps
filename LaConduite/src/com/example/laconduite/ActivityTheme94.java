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

public class ActivityTheme94 extends  Activity {
	RadioGroup rGroupTheme941,rGroupTheme942;
	RadioButton buttonTheme941,buttonTheme942,buttonTheme943,buttonTheme944;
	Chronometer Chronometer94;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme94);



		
		
		rGroupTheme941 = (RadioGroup) findViewById(R.id.radioGroupTheme941);
		rGroupTheme942 = (RadioGroup) findViewById(R.id.radioGroupTheme942);
		
		Chronometer94 = (Chronometer) findViewById(R.id.chronometer94);
		//Chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
		//Button45 = (Button) findViewById(R.id.ValiderTheme45);
		Chronometer94.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme941 = new RadioButton(this);
		buttonTheme941.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme941.addView(buttonTheme941);
		 
		 buttonTheme942 = new RadioButton(this);
		 buttonTheme942.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme941.addView(buttonTheme942);
		 
		
		 
		rGroupTheme941.check(buttonTheme941.getId()) ;
		
		
		buttonTheme943 = new RadioButton(this);
		buttonTheme943.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme942.addView(buttonTheme943);
		 
		 buttonTheme944 = new RadioButton(this);
		 buttonTheme944.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme942.addView(buttonTheme944);
		 
		
		 
		rGroupTheme942.check(buttonTheme943.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme94.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme94(View v) 
		
		{ buttonTheme941.setTextColor(Color.BLUE);
		
		 rGroupTheme941.check(buttonTheme941.getId()) ;
		 
		 
		 
		 buttonTheme943.setTextColor(Color.BLUE);
			
		 rGroupTheme942.check(buttonTheme943.getId()) ;
		 
		 Chronometer94.stop();
		}	
		
		
		
		
	}
