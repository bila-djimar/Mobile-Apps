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

public class ActivitySerie15 extends  Activity {
	RadioGroup rGroupSerie151,rGroupSerie152;
	RadioButton buttonSerie151,buttonSerie152,buttonSerie153,buttonSerie154;
	Chronometer ChronometerS15;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie15);


		rGroupSerie151 = (RadioGroup) findViewById(R.id.radioGroupSerie151);
		rGroupSerie152 = (RadioGroup) findViewById(R.id.radioGroupSerie152);
		ChronometerS15 = (Chronometer) findViewById(R.id.chronometerS15);
		ChronometerS15.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie151 = new RadioButton(this);
		buttonSerie151.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie151.addView(buttonSerie151);
		 
		 buttonSerie152 = new RadioButton(this);
		 buttonSerie152.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie151.addView(buttonSerie152);
		 
		
		 
		rGroupSerie151.check(buttonSerie151.getId()) ;
		
		
		buttonSerie153 = new RadioButton(this);
		buttonSerie153.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie152.addView(buttonSerie153);
		 
		 buttonSerie154 = new RadioButton(this);
		 buttonSerie154.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie152.addView(buttonSerie154);
		 
		
		 
		rGroupSerie152.check(buttonSerie153.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie15.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie15(View v) 
		
		{ buttonSerie152.setTextColor(Color.BLUE);
		
		 rGroupSerie151.check(buttonSerie152.getId()) ;
		 
		 
		 
		 buttonSerie153.setTextColor(Color.BLUE);
			
		 rGroupSerie152.check(buttonSerie153.getId()) ;
		 
		 
		 
		 ChronometerS15.stop();
		}	
		
		
		
		
	public void QuitterSerie15(View v) 

	{ Intent IntentQuitterSerie15 = new Intent(ActivitySerie15.this,MainActivity.class);
		startActivity(IntentQuitterSerie15);
	}	
		

	public void SuivanteSerie15(View v) 

	{ Intent IntentSuivanteSerie15 = new Intent(ActivitySerie15.this,ActivitySerie16.class);
	  startActivity(IntentSuivanteSerie15);
	}	

	}
