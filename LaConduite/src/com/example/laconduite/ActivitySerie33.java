package com.example.laconduite;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivitySerie33 extends  Activity {
	RadioGroup rGroupSerie33;
	RadioButton buttonSerie331,buttonSerie332;
	Chronometer ChronometerS33;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie33);


		rGroupSerie33 = (RadioGroup) findViewById(R.id.radioGroupSerie33);
		ChronometerS33 = (Chronometer) findViewById(R.id.chronometerS33);
		ChronometerS33.start();
		
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie331 = new RadioButton(this);
		buttonSerie331.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie33.addView(buttonSerie331);
		 
		 buttonSerie332 = new RadioButton(this);
		buttonSerie332.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie33.addView(buttonSerie332);
		 
		
		 
		rGroupSerie33.check(buttonSerie331.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie33.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie33(View v) 
	
	{ buttonSerie332.setTextColor(Color.BLUE);
	
	 rGroupSerie33.check(buttonSerie332.getId()) ;
	 
	 ChronometerS33.stop();
	}	
	
	
	
public void QuitterSerie33(View v) 

{ Intent IntentQuitterSerie33 = new Intent(ActivitySerie33.this,MainActivity.class);
	startActivity(IntentQuitterSerie33);
}	
	

public void SuivanteSerie33(View v) 

{Intent IntentSuivanteSerie33 = new Intent(ActivitySerie33.this,ActivitySerie34.class);
 startActivity(IntentSuivanteSerie33);}	

}
