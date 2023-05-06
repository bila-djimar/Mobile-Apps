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

public class ActivityInterieur3 extends  Activity {
	RadioGroup rGroupInterieur3;
	RadioButton buttonInterieur31,buttonInterieur32;
	Chronometer ChronometerI3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_interieur3);



		
		
		
		
		rGroupInterieur3 = (RadioGroup) findViewById(R.id.radioGroupInterieur3);
		
		ChronometerI3 = (Chronometer) findViewById(R.id.chronometerI3);
		ChronometerI3.start();
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonInterieur31 = new RadioButton(this);
		buttonInterieur31.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupInterieur3.addView(buttonInterieur31);
		 
		 buttonInterieur32 = new RadioButton(this);
		buttonInterieur32.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupInterieur3.addView(buttonInterieur32);
		 
		rGroupInterieur3.check(buttonInterieur31.getId()) ;
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityInterieur3.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderInterieur3(View v) 
	
	{ buttonInterieur32.setTextColor(Color.BLUE);
	  rGroupInterieur3.check(buttonInterieur32.getId());
	  ChronometerI3.stop();
	}	
	
	
	
	
}
