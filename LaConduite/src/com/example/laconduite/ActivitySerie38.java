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

public class ActivitySerie38 extends  Activity {
	RadioGroup rGroupSerie38;
	RadioButton buttonSerie381,buttonSerie382;
	Chronometer ChronometerS38;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie38);



		rGroupSerie38 = (RadioGroup) findViewById(R.id.radioGroupSerie38);
		ChronometerS38 = (Chronometer) findViewById(R.id.chronometerS38);
		ChronometerS38.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie381 = new RadioButton(this);
		buttonSerie381.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie38.addView(buttonSerie381);
		 
		 buttonSerie382 = new RadioButton(this);
		buttonSerie382.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie38.addView(buttonSerie382);
		 
		
		 
		rGroupSerie38.check(buttonSerie381.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie38.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie38(View v) 
	
	{ buttonSerie381.setTextColor(Color.BLUE);
	
	 rGroupSerie38.check(buttonSerie381.getId()) ;
	 ChronometerS38.stop();
	}	
	
	
	
	
public void QuitterSerie38(View v) 

{ Intent IntentQuitterSerie38 = new Intent(ActivitySerie38.this,MainActivity.class);
	startActivity(IntentQuitterSerie38);
}	
	

public void SuivanteSerie38(View v) 

{Intent IntentSuivanteSerie38 = new Intent(ActivitySerie38.this,ActivitySerie39.class);
 startActivity(IntentSuivanteSerie38);}	

}
