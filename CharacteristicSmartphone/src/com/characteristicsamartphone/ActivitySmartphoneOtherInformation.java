package com.characteristicsamartphone;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;

public class ActivitySmartphoneOtherInformation extends Activity {
 private TextView	textViewDeviceId1;
 private TextView textViewDeviceSoftwareVersion1;
 private TextView textViewCountryIso1;
 private TextView textViewSimOperator1;
 private TextView textViewSimOperatorName1;
 private TextView textViewSimSerialNumber1;
 private TextView textViewSubscriberId1, textViewNetworkOperatorName1,
                  textViewNetworkOperator1,textViewNetworkCountryIso1,
                  textViewLine1Number1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_other_information);

		
		
		
		
		TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
		   String IMEI = tm.getDeviceId();
		   
		   
		    textViewDeviceId1=(TextView) this.findViewById(R.id.textViewIMEI);
			
		    textViewDeviceId1.setText("          "+IMEI);
		    textViewDeviceId1.setTextColor(Color.parseColor("#0000FF"));
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    String DeviceSoftwareVersion= tm.getDeviceSoftwareVersion();
		    textViewDeviceSoftwareVersion1=(TextView) this.findViewById(R.id.textViewDeviceSoftwareVersion);
		    textViewDeviceSoftwareVersion1.setText("          "+DeviceSoftwareVersion);
		    textViewDeviceSoftwareVersion1.setTextColor(Color.parseColor("#0000FF"));
		    
		    
		    
		    
		    
		    
		    
		    
		    String CountryIso= tm.getSimCountryIso();
		    textViewCountryIso1=(TextView) this.findViewById(R.id.textViewCountryIso);
		    textViewCountryIso1.setText("          "+CountryIso);
		    textViewCountryIso1.setTextColor(Color.parseColor("#0000FF"));
		    
		    
		    
		    
		    
		    
		    String SimOperator= tm.getSimOperator(); 
		    textViewSimOperator1=(TextView) this.findViewById(R.id.textViewSimOperator);
		    textViewSimOperator1.setText("          "+SimOperator);
		    textViewSimOperator1.setTextColor(Color.parseColor("#0000FF"));
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    String SimOperatorName= tm.getSimOperatorName(); 
		    textViewSimOperatorName1=(TextView) this.findViewById(R.id.textViewSimOperatorName);
		    
		    textViewSimOperatorName1.setText("          "+SimOperatorName);
		    textViewSimOperatorName1.setTextColor(Color.parseColor("#0000FF"));
		    
		    
		    
		    
		    
		    String SimSerialNumber= tm.getSimSerialNumber(); 
		    textViewSimSerialNumber1=(TextView) this.findViewById(R.id.textViewSimSerialNumber);
		    textViewSimSerialNumber1.setText("          "+SimSerialNumber);
		    textViewSimSerialNumber1.setTextColor(Color.parseColor("#0000FF"));
		    
		    
		    
		    
		    
		    
		    
		    
		    String SubscriberId= tm.getSubscriberId(); 
		    textViewSubscriberId1=(TextView) this.findViewById(R.id.textViewSubscriberId);
		    textViewSubscriberId1.setText("          "+SubscriberId);
		    textViewSubscriberId1.setTextColor(Color.parseColor("#0000FF"));
		    
		    String NetworkOperatorName= tm.getNetworkOperatorName(); 
		    textViewNetworkOperatorName1=(TextView) this.findViewById(R.id.textViewNetworkOperatorName);
		    textViewNetworkOperatorName1.setText("          "+NetworkOperatorName);
		    textViewNetworkOperatorName1.setTextColor(Color.parseColor("#0000FF"));
		    
		    
		    String NetworkOperator= tm.getNetworkOperator(); 
		    textViewNetworkOperator1=(TextView) this.findViewById(R.id.textViewNetworkOperator);
		    textViewNetworkOperator1.setText("          "+NetworkOperator);
		    textViewNetworkOperator1.setTextColor(Color.parseColor("#0000FF"));
		    
		    String NetworkCountryIso= tm.getNetworkCountryIso(); 
		    textViewNetworkCountryIso1=(TextView) this.findViewById(R.id.textViewNetworkCountryIso);
		    textViewNetworkCountryIso1.setText("          "+NetworkCountryIso);
		    textViewNetworkCountryIso1.setTextColor(Color.parseColor("#0000FF"));
		    
		   /* String Line1Number= tm.getLine1Number(); 
		    textViewLine1Number1=(TextView) this.findViewById(R.id.textViewLine1Number);
		    textViewLine1Number1.setText("          "+Line1Number);*/
		    
		    
		    
	}
	
	


}
