package com.example.plantesmedicinales;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class ActivityTheVert extends  Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_the_vert);



		WebView webViewverTheVert = (WebView)findViewById(R.id.webViewTheVert);
		webViewverTheVert.loadUrl("file:///android_asset/minceurhtml/thevert.html");
		
		
		
	}

}
