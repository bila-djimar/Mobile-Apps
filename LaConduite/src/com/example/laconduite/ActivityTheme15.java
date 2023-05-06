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

public class ActivityTheme15 extends  Activity {
	RadioGroup rGroupTheme151,rGroupTheme152;
	RadioButton buttonTheme151,buttonTheme152,buttonTheme153,buttonTheme154;
	Chronometer Chronometer15;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme15);


		rGroupTheme151 = (RadioGroup) findViewById(R.id.radioGroupTheme151);
		rGroupTheme152 = (RadioGroup) findViewById(R.id.radioGroupTheme152);
		
        Chronometer15 = (Chronometer) findViewById(R.id.chronometer75);
		
		Chronometer15.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme151 = new RadioButton(this);
		buttonTheme151.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme151.addView(buttonTheme151);
		 
		 buttonTheme152 = new RadioButton(this);
		 buttonTheme152.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme151.addView(buttonTheme152);
		 
		
		 
		rGroupTheme151.check(buttonTheme151.getId()) ;
		
		
		buttonTheme153 = new RadioButton(this);
		buttonTheme153.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme152.addView(buttonTheme153);
		 
		 buttonTheme154 = new RadioButton(this);
		 buttonTheme154.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme152.addView(buttonTheme154);
		 
		
		 
		rGroupTheme152.check(buttonTheme153.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme15.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme15(View v) 
		
		{ buttonTheme152.setTextColor(Color.BLUE);
		
		 rGroupTheme151.check(buttonTheme152.getId()) ;
		 
		 
		 
		 buttonTheme154.setTextColor(Color.BLUE);
			
		 rGroupTheme152.check(buttonTheme154.getId()) ;
		 
		 
		 Chronometer15.stop();
		}	
		
		
		
		
	}
