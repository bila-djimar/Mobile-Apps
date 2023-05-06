package com.example.laconduite;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.os.Build;

public class ActivityTheme71 extends  Activity {
	RadioGroup rGroupThem7;
	RadioButton buttonThem71,buttonThem72;
	Chronometer Chronometer7;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_theme71);


		rGroupThem7 = (RadioGroup) findViewById(R.id.radioGroupThem7);
        Chronometer7 = (Chronometer) findViewById(R.id.chronometer71);
		
		Chronometer7.start();
		
		 
		OnClickListener radio_listener = new OnClickListener() {
		    public void onClick(View v) {
		        onRadioButtonClick(v);
		    }

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		buttonThem71 = new RadioButton(this);
		buttonThem71.setText("Oui ........................(A)");
		//button1.setTextColor(Color.RED);
		//button1.setOnClickListener(radio_listener);
		rGroupThem7.addView(buttonThem71);
		 
		 buttonThem72 = new RadioButton(this);
		buttonThem72.setText("Non .......................(B)");
		//button2.setTextColor(Color.GREEN);
		//button2.setOnClickListener(radio_listener);
		rGroupThem7.addView(buttonThem72);
		 
		
		 
		rGroupThem7.check(buttonThem71.getId()) ;
		
		
		
		
		
		
		
		
		
		
		
	}

	
	public void onRadioButtonClick(View v) {
	    RadioButton button = (RadioButton) v;
	    Toast.makeText(ActivityTheme71.this,
	        button.getText() + " was chosen.",
	        Toast.LENGTH_SHORT).show();
	}
	
	
	
	
public void ValiderThem7(View v) 
	
	{ buttonThem71.setTextColor(Color.BLUE);
	
	 rGroupThem7.check(buttonThem71.getId()) ;
	 Chronometer7.stop();
	}	
	
	
	
	
}
