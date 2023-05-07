package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityGinseng extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ginseng);


		WebView webViewverGinseng = (WebView)findViewById(R.id.webViewGinseng);
		webViewverGinseng.loadUrl("file:///android_asset/FatiguePhysiqueMentalehtml/Ginseng.html");
		
		
		
		
		
	}

}
