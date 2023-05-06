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

public class ActivityTheme14 extends  Activity {
	RadioGroup rGroupTheme14;
	RadioButton buttonTheme141,buttonTheme142;
	Chronometer Chronometer14;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme14);



		
		
		rGroupTheme14 = (RadioGroup) findViewById(R.id.radioGroupTheme14);
		
        Chronometer14 = (Chronometer) findViewById(R.id.chronometer82);
		
		Chronometer14.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme141 = new RadioButton(this);
		buttonTheme141.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme14.addView(buttonTheme141);
		 
		 buttonTheme142 = new RadioButton(this);
		buttonTheme142.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme14.addView(buttonTheme142);
		 
		
		 
		rGroupTheme14.check(buttonTheme141.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme14.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme14(View v) 
	
	{ buttonTheme141.setTextColor(Color.BLUE);
	
	 rGroupTheme14.check(buttonTheme141.getId()) ;
	 
	 Chronometer14.stop();
	}	
	
	
	
	
}
