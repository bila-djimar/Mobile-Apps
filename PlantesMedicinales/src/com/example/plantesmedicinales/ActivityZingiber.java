package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityZingiber extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zingiber);


		WebView webViewverZingiber = (WebView)findViewById(R.id.webViewZingiber);
		webViewverZingiber.loadUrl("file:///android_asset/FatiguePhysiqueMentalehtml/Zingiber.html");
		
		
		
		
		
		
		
		
	}

}
