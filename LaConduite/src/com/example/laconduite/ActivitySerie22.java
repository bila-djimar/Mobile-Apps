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

public class ActivitySerie22 extends  Activity {
	RadioGroup rGroupSerie221,rGroupSerie222;
	RadioButton buttonSerie221,buttonSerie222,buttonSerie223,buttonSerie224;
	Chronometer ChronometerS22;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_serie22);



		rGroupSerie221 = (RadioGroup) findViewById(R.id.radioGroupSerie221);
		rGroupSerie222 = (RadioGroup) findViewById(R.id.radioGroupSerie222);
		ChronometerS22 = (Chronometer) findViewById(R.id.chronometerS22);
		ChronometerS22.start();
		
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		
		
		
		buttonSerie221 = new RadioButton(this);
		buttonSerie221.setText("Oui........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie221.addView(buttonSerie221);
		 
		 buttonSerie222 = new RadioButton(this);
		 buttonSerie222.setText("Non ......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie221.addView(buttonSerie222);
		 
		
		 
		rGroupSerie221.check(buttonSerie221.getId()) ;
		
		
		buttonSerie223 = new RadioButton(this);
		buttonSerie223.setText("Oui........................(C)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupSerie222.addView(buttonSerie223);
		 
		 buttonSerie224 = new RadioButton(this);
		 buttonSerie224.setText("Non ......................(D)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupSerie222.addView(buttonSerie224);
		 
		
		 
		rGroupSerie222.check(buttonSerie223.getId()) ;
		
		
		
		
		
		}

		
		public void onRadioButtonClick(View v) {
		    RadioButton button = (RadioButton) v;
		    Toast.makeText(ActivitySerie22.this,
		        button.getText() + " was chosen.",
		        Toast.LENGTH_SHORT).show();
		}
		
		
		
		
	public void ValiderSerie22(View v) 
		
		{ buttonSerie222.setTextColor(Color.BLUE);
		
		 rGroupSerie221.check(buttonSerie222.getId()) ;
		 
		 
		 
		 buttonSerie224.setTextColor(Color.BLUE);
			
		 rGroupSerie222.check(buttonSerie224.getId()) ;
		 
		 ChronometerS22.stop();
		}	
		
		
		
	public void QuitterSerie22(View v) 

	{ Intent IntentQuitterSerie22 = new Intent(ActivitySerie22.this,MainActivity.class);
		startActivity(IntentQuitterSerie22);
	}	
		

	public void SuivanteSerie22(View v) 

	{ Intent IntentSuivanteSerie22 = new Intent(ActivitySerie22.this,ActivitySerie23.class);
	  startActivity(IntentSuivanteSerie22);
	}	

	}
