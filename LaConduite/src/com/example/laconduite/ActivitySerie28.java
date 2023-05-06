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

public class ActivitySerie28 extends  Activity {
	RadioGroup rGroupSerie28;
	RadioButton buttonSerie281,buttonSerie282,buttonSerie283;
	Chronometer ChronometerS28;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie28);


		rGroupSerie28 = (RadioGroup) findViewById(R.id.radioGroupSerie28);
		ChronometerS28 = (Chronometer) findViewById(R.id.chronometerS28);
		ChronometerS28.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie281 = new RadioButton(this);
		buttonSerie281.setText("Annonce une réduction du nombre de voies..");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie28.addView(buttonSerie281);
		 
		 buttonSerie282 = new RadioButton(this);
		buttonSerie282.setText("Annonce un changement de chaussée ...(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie28.addView(buttonSerie282);
		 
		 buttonSerie283 = new RadioButton(this);
		buttonSerie283.setText("Est temporaire ........................................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie28.addView(buttonSerie283);
		 
		rGroupSerie28.check(buttonSerie281.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie28.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie28(View v) 
	
	{ buttonSerie281.setTextColor(Color.BLUE);
	
	 rGroupSerie28.check(buttonSerie281.getId()) ;
	 
	 buttonSerie283.setTextColor(Color.BLUE);
		
	 rGroupSerie28.check(buttonSerie283.getId()) ;
	 
	 
	 ChronometerS28.stop();
	}	
	
	
	
	
public void QuitterSerie28(View v) 

{ Intent IntentQuitterSerie28 = new Intent(ActivitySerie28.this,MainActivity.class);
	startActivity(IntentQuitterSerie28);
}	
	

public void SuivanteSerie28(View v) 

{ Intent IntentSuivanteSerie28 = new Intent(ActivitySerie28.this,ActivitySerie29.class);
  startActivity(IntentSuivanteSerie28);
}	

}
