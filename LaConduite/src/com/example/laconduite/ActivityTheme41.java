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

public class ActivityTheme41 extends  Activity {
	RadioGroup rGroupThem4;
	RadioButton buttonThem41,buttonThem42;
	Chronometer ChronometerPriority1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme41);


		rGroupThem4 = (RadioGroup) findViewById(R.id.radioGroupThem4);
		ChronometerPriority1 = (Chronometer) findViewById(R.id.chronometerPriority1);
		
		ChronometerPriority1.start();
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonThem41 = new RadioButton(this);
		buttonThem41.setText("Je cède le passage.................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupThem4.addView(buttonThem41);
		 
		 buttonThem42 = new RadioButton(this);
		buttonThem42.setText("Je passe.................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupThem4.addView(buttonThem42);
		 
		
		 
		rGroupThem4.check(buttonThem41.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme41.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderThem4(View v) 
	
	{ buttonThem41.setTextColor(Color.BLUE);
	
	 rGroupThem4.check(buttonThem41.getId()) ;
	 ChronometerPriority1.stop();
	}	
	
	
	
	
}
