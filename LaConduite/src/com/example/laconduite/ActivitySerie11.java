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

public class ActivitySerie11 extends Activity {
	RadioGroup rGroupSerie11;
	RadioButton buttonSerie111,buttonSerie112,buttonSerie113;
	Chronometer ChronometerS11;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie11);


		rGroupSerie11 = (RadioGroup) findViewById(R.id.radioGroupSerie11);
		ChronometerS11 = (Chronometer) findViewById(R.id.chronometerS11);
		ChronometerS11.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonSerie111 = new RadioButton(this);
		buttonSerie111.setText("Une route nationale ..........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie11.addView(buttonSerie111);
		 
		 buttonSerie112 = new RadioButton(this);
		buttonSerie112.setText("Une autoroute ...................................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie11.addView(buttonSerie112);
		 
		 buttonSerie113 = new RadioButton(this);
		buttonSerie113.setText("Un itinéraire européen ....................(C)");
		//button3.setTextColor(Color.BLUE);
	   //button3.setOnClickListener(radio_listener); 
		rGroupSerie11.addView(buttonSerie113);
		 
		rGroupSerie11.check(buttonSerie111.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivitySerie11.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderSerie11(View v) 
	
	{ buttonSerie112.setTextColor(Color.BLUE);
	buttonSerie113.setTextColor(Color.BLUE);
	 rGroupSerie11.check(buttonSerie112.getId()) ;
	 rGroupSerie11.check(buttonSerie113.getId()) ;
	 
	 
	 ChronometerS11.stop();
	}	
	
	
public void QuitterSerie11(View v) 

{ Intent IntentQuitterSerie11 = new Intent(ActivitySerie11.this,MainActivity.class);
	startActivity(IntentQuitterSerie11);
}	
	

public void SuivanteSerie11(View v) 

{ Intent IntentSuivanteSerie11 = new Intent(ActivitySerie11.this,ActivitySerie12.class);
  startActivity(IntentSuivanteSerie11);
}	

}
