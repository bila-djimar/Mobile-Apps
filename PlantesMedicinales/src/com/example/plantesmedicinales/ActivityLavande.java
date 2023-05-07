package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityLavande extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lavande);


		WebView webViewlavande = (WebView)findViewById(R.id.webViewlavande);
		webViewlavande.loadUrl("file:///android_asset/MauxEsprithtm/lavande.html");
		
		
		
		
	}

}
