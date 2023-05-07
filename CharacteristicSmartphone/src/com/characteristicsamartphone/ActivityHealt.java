package com.characteristicsamartphone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityHealt extends Activity {
  
	
	private TextView  textviewmessage;
	private ImageView imageavertissement,imageautorisation;
	private Button  ButtonHealt;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_healt);

		textviewmessage = (TextView) this.findViewById(R.id.textViewmessage);	
		textviewmessage.setVisibility(View.INVISIBLE);
		
		ButtonHealt = (Button) this.findViewById(R.id.healt);	
		ButtonHealt.setVisibility(View.VISIBLE);
		ButtonHealt.setGravity(Gravity.CENTER);
		
		imageavertissement = (ImageView) findViewById(R.id.imageViewavertissement);
		imageautorisation = (ImageView) findViewById(R.id.imageViewautorisation);
		imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);
	}
	
	
	
public void ContryofManufacturer(View v) 
	
	{ 
	TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
    String IMEI = tm.getDeviceId();
    
    
    
    String IMEII=IMEI.substring(6, 8);
    
    
	TextView	textView = (TextView)findViewById(R.id.textView1);
	Integer Sante = new Integer(IMEII);
	
	int ss=Sante;
	
	if((IMEII.equals("02")) || (IMEII.equals("20")))
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	  textviewmessage.setText("Your smartphone is assembled and manufactured in Emirates which is very poor quality.  (NB: Some Indian sets have this number) "); 
	  textviewmessage.setVisibility(View.VISIBLE);
	  imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);
	 }
	
	else{
	
	 if((IMEII.equals("08")) || (IMEII.equals("80")))
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	  textviewmessage.setText("Your smartphone is manufactured in Germany which is fair quality.."); 
	  textviewmessage.setVisibility(View.VISIBLE);
	  imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);}
	
	 else{
	
	 if((IMEII.equals("01")) || (IMEII.equals("10")))
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	  textviewmessage.setText("Your smartphone is manufactured in Finland, which is  high quality."); 
	  textviewmessage.setVisibility(View.VISIBLE);
	  imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);}
	
	 else{
	 if((IMEII.equals("00")) )
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	  textviewmessage.setText("Your smartphone is manufactured  in the original factory which ensures the best quality.  "); 
	  textviewmessage.setVisibility(View.VISIBLE);
	  imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);}
	
	 else{
	 
	 if((IMEII.equals("03")) || (IMEII.equals("30"))  ||  (IMEII.equals("04")) || (IMEII.equals("40")))
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	    textviewmessage.setText("Your smartphone is manufactured in China, but the quality is good. "
	    		+ "But worse than other smartphones originals.  "); 
		textviewmessage.setVisibility(View.VISIBLE);
		imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);}
	
	 else{
	 if((IMEII.equals("05")) || (IMEII.equals("50")))//05 ou 50
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	
	  textviewmessage.setText("Your smartphone is manufactured either in Brazil, United States or Finland ."); 
	  textviewmessage.setVisibility(View.VISIBLE);
	  imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);}
	 
	 else{
	 
	 if((IMEII.equals("06")) || (IMEII.equals("60")))
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	  textviewmessage.setText("Your smartphone is made either in  Hong Kong, China, Mexico or Algeria."); 
	  textviewmessage.setVisibility(View.VISIBLE);
	  imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);}
	
	 else{
	 if((IMEII.equals("13")) )
	 {textviewmessage.setTextColor(Color.parseColor("#000000"));
	  textviewmessage.setText("Your mobile phone is assembled in Azerbaijan which is too bad. And it is also dangerous for health!  "); 
	  textviewmessage.setVisibility(View.VISIBLE);
	  imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);}
	 
	 else{
		 
		 textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone is assembled in an unknown factory!!.  "); 
		  textviewmessage.setVisibility(View.VISIBLE); 
		  imageavertissement.setVisibility(View.INVISIBLE);
			imageautorisation.setVisibility(View.INVISIBLE);
	 }}}}}}}}
	
	  /*  textviewmessage.setVisibility(View.INVISIBLE); 
	    imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);
	
	
		Context contexthealt = getApplicationContext();
        CharSequence texthealt = "It must to pay for to know the originality of your smartphone...!";
        int durationhealt = Toast.LENGTH_LONG;
        Toast toasthealt = Toast.makeText(contexthealt, texthealt, durationhealt);
        toasthealt.show(); */
	
	
	 }
	
	
	
		
	
	
	
	public void health(View v) 
	
	{ 
		
		
	TelephonyManager tm = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
	    String IMEI = tm.getDeviceId();
	    
	    
	    
	    String IMEII=IMEI.substring(6, 8);
	    
	    
		TextView	textView = (TextView)findViewById(R.id.textView1);
		Integer Sante = new Integer(IMEII);
		
		int ss=Sante;
		
		
		
		
		
		if((IMEII.equals("02")) || (IMEII.equals("20")))
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are  dangerous  for your health, it is possible  to influence negatively on your health."); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  imageavertissement.setVisibility(View.VISIBLE);
		  imageautorisation.setVisibility(View.INVISIBLE); 
		 
		 }
		 
		 
		else{ 
		 
		 if((IMEII.equals("08")) || (IMEII.equals("80")))
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are not  dangerous  for your health."); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  
		  imageavertissement.setVisibility(View.INVISIBLE);
		  imageautorisation.setVisibility(View.VISIBLE);}
		 
		 
		 
		 else{
		 
		 
		 if((IMEII.equals("01")) || (IMEII.equals("10")))
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are not  dangerous  for your health. "); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  imageavertissement.setVisibility(View.INVISIBLE);
		  imageautorisation.setVisibility(View.VISIBLE);}
		 
		 
		 else{
		 
		 if((IMEII.equals("00")) )
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are not  dangerous  for your health. "); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  imageavertissement.setVisibility(View.INVISIBLE);
		  imageautorisation.setVisibility(View.VISIBLE);}
		 
		 
		 
		 else{
		 
		 if((IMEII.equals("03")) || (IMEII.equals("30"))  ||  (IMEII.equals("04")) || (IMEII.equals("40")))
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are not dangerous  for your health.	 "); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  imageavertissement.setVisibility(View.INVISIBLE);
		  imageautorisation.setVisibility(View.VISIBLE);}
		 
		
		 else{
		 
		 
		 if((IMEII.equals("05")) || (IMEII.equals("50")))
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are not  dangerous for your health."); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  imageavertissement.setVisibility(View.INVISIBLE);
		  imageautorisation.setVisibility(View.VISIBLE);}
		 
		 
		 else{
		 
		 
		 if((IMEII.equals("06")) || (IMEII.equals("60")))
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are not  dangerous  for your health.  "); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  imageavertissement.setVisibility(View.INVISIBLE);
		  imageautorisation.setVisibility(View.VISIBLE);}
		 
		
		 else{ 
		 
		 
		 if((IMEII.equals("13")) )
		 {textviewmessage.setTextColor(Color.parseColor("#000000"));
		  textviewmessage.setText("Your smartphone components are  dangerous  for your health, it is possible to influence negatively on your health."); 
		  textviewmessage.setVisibility(View.VISIBLE);
		  imageavertissement.setVisibility(View.VISIBLE);
		  imageautorisation.setVisibility(View.INVISIBLE);}
		 
		 
		 else{
			 
			 textviewmessage.setTextColor(Color.parseColor("#000000"));
			  textviewmessage.setText("Your smartphone components are not originals, it is possible to influence negatively on your health."); 
			  textviewmessage.setVisibility(View.VISIBLE); 
			  imageavertissement.setVisibility(View.VISIBLE);
			  imageautorisation.setVisibility(View.INVISIBLE);
		 }}}}}}}}
		
		
		
	/*	textviewmessage.setVisibility(View.INVISIBLE); 
	    imageavertissement.setVisibility(View.INVISIBLE);
		imageautorisation.setVisibility(View.INVISIBLE);
	
	
		Context contexthealt1 = getApplicationContext();
        CharSequence texthealt1 = "it must to pay for to know the influence of your smartphone on your health...!";
        int durationhealt1 = Toast.LENGTH_LONG;
        Toast toasthealt1 = Toast.makeText(contexthealt1, texthealt1, durationhealt1);
        toasthealt1.show(); 
*/



		 
		 
		 
		 
		 
	}	
	
	
public void help(View v) 
	
	{ 
	
	 
	 
	Intent intenthelp = new Intent(ActivityHealt.this,ActivityHelp.class); 
	
	
	startActivity(intenthelp);
	
	
	textviewmessage.setText(" "); 
	imageavertissement.setVisibility(View.INVISIBLE);
	  imageautorisation.setVisibility(View.INVISIBLE);
	}	
	

	
	
	
}
