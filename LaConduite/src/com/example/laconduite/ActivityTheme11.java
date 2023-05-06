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

public class ActivityTheme11 extends Activity {
	RadioGroup rGroupTheme11,rGroupTheme12;
	RadioButton buttonTheme11,buttonTheme12,buttonTheme13,buttonTheme14;
	Chronometer Chronometer15;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme11);


		rGroupTheme11 = (RadioGroup) findViewById(R.id.radioGroupTheme11);
		rGroupTheme12 = (RadioGroup) findViewById(R.id.radioGroupTheme12);
		
        Chronometer15 = (Chronometer) findViewById(R.id.chronometer11);
		
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
		
		
		
		
		
		buttonTheme11 = new RadioButton(this);
		buttonTheme11.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme11.addView(buttonTheme11);
		 
		 buttonTheme12 = new RadioButton(this);
		 buttonTheme12.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme11.addView(buttonTheme12);
		 
		
		 
		rGroupTheme11.check(buttonTheme11.getId()) ;
		
		
		buttonTheme13 = new RadioButton(this);
		buttonTheme13.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme12.addView(buttonTheme13);
		 
		 buttonTheme14 = new RadioButton(this);
		 buttonTheme14.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme12.addView(buttonTheme14);
		 
		
		 
		rGroupTheme12.check(buttonTheme13.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme11.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme1(View v) 
		
		{ buttonTheme12.setTextColor(Color.BLUE);
		
		 rGroupTheme11.check(buttonTheme12.getId()) ;
		 
		 
		 
		 buttonTheme14.setTextColor(Color.BLUE);
			
		 rGroupTheme12.check(buttonTheme14.getId()) ;
		 Chronometer15.stop();
		 
		}	
		
		
		
		
	}
