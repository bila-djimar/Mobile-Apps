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

public class ActivityTheme33 extends  Activity {
	RadioGroup rGroupTheme33;
	RadioButton buttonTheme331,buttonTheme332;
	Chronometer Chronometer33;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme33);



		
		rGroupTheme33 = (RadioGroup) findViewById(R.id.radioGroupTheme33);
		
        Chronometer33 = (Chronometer) findViewById(R.id.chronometer33);
		
		Chronometer33.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonTheme331 = new RadioButton(this);
		buttonTheme331.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupTheme33.addView(buttonTheme331);
		 
		 buttonTheme332 = new RadioButton(this);
		buttonTheme332.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupTheme33.addView(buttonTheme332);
		 
		
		 
		rGroupTheme33.check(buttonTheme331.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme33.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderTheme33(View v) 
	
	{ buttonTheme332.setTextColor(Color.BLUE);
	
	 rGroupTheme33.check(buttonTheme332.getId()) ;
	 Chronometer33.stop();
	}	
	
	
	
	
}
