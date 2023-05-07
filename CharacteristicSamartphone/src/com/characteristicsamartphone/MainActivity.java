package com.characteristicsamartphone;

import android.annotation.SuppressLint;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

@SuppressLint("NewApi")
public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Resources res = getResources();
		TabHost tabHost = getTabHost();
		
		
		TabHost.TabSpec spec;
		Intent intent;	
		
		
		
		intent = new Intent().setClass(this, ActivityRapportOfSensor.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Sensors",null).setContent(intent);
		tabHost.addTab(spec);
		
		
		intent = new Intent().setClass(this, ActivityHealt.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Health",null).setContent(intent);
		
		tabHost.setScrollY(tabHost.getWidth());
		tabHost.addTab(spec);
		
		
		intent = new Intent().setClass(this, ActivityBattery.class);
		//intent = new Intent().setClass(this, ActivityBattery.class);M_hhhhhhhhhhh
		spec = tabHost.newTabSpec("Form").setIndicator("battery",null).setContent(intent);
		tabHost.setScrollX(tabHost.getWidth());
		tabHost.addTab(spec);
		
	
		intent = new Intent().setClass(this, ActivitySystemProcessor.class);
		spec = tabHost.newTabSpec("Form").setIndicator("System",null).setContent(intent);
		tabHost.addTab(spec);
		
		
		intent = new Intent().setClass(this, ActivitySmartphoneOtherInformation.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Other ",null).setContent(intent);
	
		tabHost.addTab(spec);
		
		
		intent = new Intent().setClass(this,ActivityContacteUs.class);
		spec = tabHost.newTabSpec("Form").setIndicator("Contact us ",null).setContent(intent);
	
		tabHost.addTab(spec);
		
		 tabHost.getTabWidget().setBackgroundColor(Color.RED);
		 
		/* tabHost.getTabWidget().getChildAt(0).getLayoutParams().width = 300;
		 tabHost.getTabWidget().getChildAt(1).getLayoutParams().width = 310;
		 tabHost.getTabWidget().getChildAt(2).getLayoutParams().width = 90;
		 tabHost.getTabWidget().getChildAt(3).getLayoutParams().width = 340;
		 tabHost.getTabWidget().getChildAt(4).getLayoutParams().width = 310;*/
			for(int i=0; i < tabHost.getTabWidget().getChildCount();i++)
				{//--la couleur du font des onglet
				tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FAB000"));
				//tabHost.getTabWidget().getChildAt(i).getLayoutParams().width = 195;
				//-----la coleur de l'ecriture des onglet
				TextView tv = (TextView) tabHost.getTabWidget().getChildAt(i).findViewById(android.R.id.title); //Unselected Tabs
	            tv.setTextColor(Color.parseColor("#130C9E"));
	           
	           
	            
	            
				}
			
			
			
			tabHost.setCurrentTab(0);	
		
		
		
		
		
	   }

	}
