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

public class ActivitySerie2 extends  Activity {
	RadioGroup rGroupSerie2;
	RadioButton buttonSerie21,buttonSerie22;
	Chronometer ChronometerS2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie2);

		rGroupSerie2 = (RadioGroup) findViewById(R.id.radioGroupSerie2);
		ChronometerS2 = (Chronometer) findViewById(R.id.chronometerS2);
		ChronometerS2.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie21 = new RadioButton(this);
		buttonSerie21.setText("Oui .........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie2.addView(buttonSerie21);
		 
		 buttonSerie22 = new RadioButton(this);
		buttonSerie22.setText("Non ........................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie2.addView(buttonSerie22);
		 
		
		 
		rGroupSerie2.check(buttonSerie21.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie2.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie2(View v) 
	
	{ buttonSerie21.setTextColor(Color.BLUE);
	
	 rGroupSerie2.check(buttonSerie21.getId()) ;
	 
	 ChronometerS2.stop();
	}	
	
	
	
public void QuitterSerie2(View v) 

{ Intent IntentQuitterSerie2 = new Intent(ActivitySerie2.this,MainActivity.class);
	startActivity(IntentQuitterSerie2);
}	
	

public void SuivanteSerie2(View v) 

{ Intent IntentSuivanteSerie2 = new Intent(ActivitySerie2.this,ActivitySerie3.class);
  startActivity(IntentSuivanteSerie2);
}	

}
