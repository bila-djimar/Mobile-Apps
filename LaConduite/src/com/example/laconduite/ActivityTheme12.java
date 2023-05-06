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

public class ActivityTheme12 extends  Activity {
	RadioGroup rGroupTheme121,rGroupTheme122;
	RadioButton buttonTheme121,buttonTheme122,buttonTheme123,buttonTheme124;
	Chronometer Chronometer12;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme12);



		
		
		
		rGroupTheme121 = (RadioGroup) findViewById(R.id.radioGroupTheme121);
		rGroupTheme122 = (RadioGroup) findViewById(R.id.radioGroupTheme122);
		
		
        Chronometer12 = (Chronometer) findViewById(R.id.chronometer12);
		
		Chronometer12.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme121 = new RadioButton(this);
		buttonTheme121.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme121.addView(buttonTheme121);
		 
		 buttonTheme122 = new RadioButton(this);
		 buttonTheme122.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme121.addView(buttonTheme122);
		 
		
		 
		rGroupTheme121.check(buttonTheme121.getId()) ;
		
		
		buttonTheme123 = new RadioButton(this);
		buttonTheme123.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme122.addView(buttonTheme123);
		 
		 buttonTheme124 = new RadioButton(this);
		 buttonTheme124.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme122.addView(buttonTheme124);
		 
		
		 
		rGroupTheme122.check(buttonTheme123.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme12.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme12(View v) 
		
		{ buttonTheme121.setTextColor(Color.BLUE);
		
		 rGroupTheme121.check(buttonTheme121.getId()) ;
		 
		 
		 
		 buttonTheme123.setTextColor(Color.BLUE);
			
		 rGroupTheme122.check(buttonTheme123.getId()) ;
		 
		 Chronometer12.stop();
		}	
		
		
		
		
	}
