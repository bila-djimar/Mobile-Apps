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

public class ActivityTheme75 extends  Activity {
	RadioGroup rGroupTheme751,rGroupTheme752;
	RadioButton buttonTheme751,buttonTheme752,buttonTheme753,buttonTheme754;
	Chronometer Chronometer75;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme75);



		
		
		
		rGroupTheme751 = (RadioGroup) findViewById(R.id.radioGroupTheme751);
		rGroupTheme752 = (RadioGroup) findViewById(R.id.radioGroupTheme752);
		
        Chronometer75 = (Chronometer) findViewById(R.id.chronometer75);
		
		Chronometer75.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonTheme751 = new RadioButton(this);
		buttonTheme751.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme751.addView(buttonTheme751);
		 
		 buttonTheme752 = new RadioButton(this);
		 buttonTheme752.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme751.addView(buttonTheme752);
		 
		
		 
		rGroupTheme751.check(buttonTheme751.getId()) ;
		
		
		buttonTheme753 = new RadioButton(this);
		buttonTheme753.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme752.addView(buttonTheme753);
		 
		 buttonTheme754 = new RadioButton(this);
		 buttonTheme754.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme752.addView(buttonTheme754);
		 
		
		 
		rGroupTheme752.check(buttonTheme753.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivityTheme75.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderTheme75(View v) 
		
		{ buttonTheme751.setTextColor(Color.BLUE);
		
		 rGroupTheme751.check(buttonTheme751.getId()) ;
		 
		 
		 
		 buttonTheme753.setTextColor(Color.BLUE);
			
		 rGroupTheme752.check(buttonTheme753.getId()) ;
		 
		 
		 Chronometer75.stop();
		}	
		
		
		
		
	}
