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

public class ActivityTheme22 extends  Activity {
	RadioGroup rGroupTheme22;
	RadioButton buttonTheme221,buttonTheme222;
	Chronometer Chronometer22;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme22);



		rGroupTheme22 = (RadioGroup) findViewById(R.id.radioGroupTheme22);
         Chronometer22 = (Chronometer) findViewById(R.id.chronometer22);
		
		Chronometer22.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme221 = new RadioButton(this);
		buttonTheme221.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme22.addView(buttonTheme221);
		 
		 buttonTheme222 = new RadioButton(this);
		buttonTheme222.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme22.addView(buttonTheme222);
		 
		
		 
		rGroupTheme22.check(buttonTheme221.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme22.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme22(View v) 
	
	{ buttonTheme222.setTextColor(Color.BLUE);
	
	 rGroupTheme22.check(buttonTheme222.getId()) ;
	 Chronometer22.stop();
	}	
	
	
	
	
}
