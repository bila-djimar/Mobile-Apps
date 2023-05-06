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

public class ActivityTheme83 extends  Activity {
	RadioGroup rGroupTheme831,rGroupTheme832;
	RadioButton buttonTheme831,buttonTheme832,buttonTheme833,buttonTheme834;
	Chronometer Chronometer83;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme83);

			
	
	
	
		rGroupTheme831 = (RadioGroup) findViewById(R.id.radioGroupTheme831);
		rGroupTheme832 = (RadioGroup) findViewById(R.id.radioGroupTheme832);
		
        Chronometer83 = (Chronometer) findViewById(R.id.chronometer83);
		
		Chronometer83.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme831 = new RadioButton(this);
		buttonTheme831.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme831.addView(buttonTheme831);
		 
		 buttonTheme832 = new RadioButton(this);
		 buttonTheme832.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme831.addView(buttonTheme832);
		 
		
		 
		rGroupTheme831.check(buttonTheme831.getId()) ;
		
		
		buttonTheme833 = new RadioButton(this);
		buttonTheme833.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme832.addView(buttonTheme833);
		 
		 buttonTheme834 = new RadioButton(this);
		 buttonTheme834.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme832.addView(buttonTheme834);
		 
		
		 
		rGroupTheme832.check(buttonTheme833.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme83.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme83(View v) 
		
		{ buttonTheme831.setTextColor(Color.BLUE);
		
		 rGroupTheme831.check(buttonTheme831.getId()) ;
		 
		 
		 
		 buttonTheme833.setTextColor(Color.BLUE);
			
		 rGroupTheme832.check(buttonTheme833.getId()) ;
		 
		 
		 Chronometer83.stop();
		}	
		
		
		
		
	}
