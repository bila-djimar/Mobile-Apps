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

public class ActivityTheme61 extends  Activity {
	RadioGroup rGroupThem6;
	RadioButton buttonThem61,buttonThem62;
	Chronometer Chronometer6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme61);



		rGroupThem6 = (RadioGroup) findViewById(R.id.radioGroupThem6);
        Chronometer6 = (Chronometer) findViewById(R.id.chronometer61);
		
		Chronometer6.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonThem61 = new RadioButton(this);
		buttonThem61.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupThem6.addView(buttonThem61);
		 
		 buttonThem62 = new RadioButton(this);
		buttonThem62.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupThem6.addView(buttonThem62);
		 
		
		 
		rGroupThem6.check(buttonThem61.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme61.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderThem6(View v) 
	
	{ buttonThem61.setTextColor(Color.BLUE);
	
	 rGroupThem6.check(buttonThem61.getId()) ;
	 Chronometer6.stop();
	}	
	
	
	
	
}
