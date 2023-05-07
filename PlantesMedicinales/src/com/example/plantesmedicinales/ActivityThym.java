package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityThym extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thym);


		WebView webViewverThym = (WebView)findViewById(R.id.webViewThym);
		webViewverThym.loadUrl("file:///android_asset/MauxQuotidienhtml/Thym.html");
		
		
		
		
	}

}
