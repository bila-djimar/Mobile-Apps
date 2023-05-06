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

public class ActivityTheme13 extends  Activity {
	RadioGroup rGroupTheme131,rGroupTheme132;
	RadioButton buttonTheme131,buttonTheme132,buttonTheme133,buttonTheme134;
	Chronometer Chronometer13;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme13);



		
		rGroupTheme131 = (RadioGroup) findViewById(R.id.radioGroupTheme131);
		rGroupTheme132 = (RadioGroup) findViewById(R.id.radioGroupTheme132);
        
		Chronometer13 = (Chronometer) findViewById(R.id.chronometer13);
		
		Chronometer13.start();
		
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme131 = new RadioButton(this);
		buttonTheme131.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme131.addView(buttonTheme131);
		 
		 buttonTheme132 = new RadioButton(this);
		 buttonTheme132.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme131.addView(buttonTheme132);
		 
		
		 
		rGroupTheme131.check(buttonTheme131.getId()) ;
		
		
		buttonTheme133 = new RadioButton(this);
		buttonTheme133.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme132.addView(buttonTheme133);
		 
		 buttonTheme134 = new RadioButton(this);
		 buttonTheme134.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme132.addView(buttonTheme134);
		 
		
		 
		rGroupTheme132.check(buttonTheme133.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme13.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme13(View v) 
		
		{ buttonTheme132.setTextColor(Color.BLUE);
		
		 rGroupTheme131.check(buttonTheme132.getId()) ;
		 
		 
		 
		 buttonTheme134.setTextColor(Color.BLUE);
			
		 rGroupTheme132.check(buttonTheme134.getId()) ;
		 
		 Chronometer13.stop();
		}	
		
		
		
		
	}
