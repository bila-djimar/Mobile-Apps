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

public class ActivityTheme93 extends  Activity {
	RadioGroup rGroupTheme931,rGroupTheme932;
	RadioButton buttonTheme931,buttonTheme932,buttonTheme933,buttonTheme934;
	Chronometer Chronometer93;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme93);



		rGroupTheme931 = (RadioGroup) findViewById(R.id.radioGroupTheme931);
		rGroupTheme932 = (RadioGroup) findViewById(R.id.radioGroupTheme932);
		
		Chronometer93 = (Chronometer) findViewById(R.id.chronometer93);
		//Chronometer2 = (Chronometer) findViewById(R.id.chronometer2);
		//Button45 = (Button) findViewById(R.id.ValiderTheme45);
		Chronometer93.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme931 = new RadioButton(this);
		buttonTheme931.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme931.addView(buttonTheme931);
		 
		 buttonTheme932 = new RadioButton(this);
		 buttonTheme932.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme931.addView(buttonTheme932);
		 
		
		 
		rGroupTheme931.check(buttonTheme931.getId()) ;
		
		
		buttonTheme933 = new RadioButton(this);
		buttonTheme933.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme932.addView(buttonTheme933);
		 
		 buttonTheme934 = new RadioButton(this);
		 buttonTheme934.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme932.addView(buttonTheme934);
		 
		
		 
		rGroupTheme932.check(buttonTheme933.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme93.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme93(View v) 
		
		{ buttonTheme931.setTextColor(Color.BLUE);
		
		 rGroupTheme931.check(buttonTheme931.getId()) ;
		 
		 
		 
		 buttonTheme933.setTextColor(Color.BLUE);
			
		 rGroupTheme932.check(buttonTheme933.getId()) ;
		 
		 Chronometer93.stop();
		}	
		
		
		
		
	}
