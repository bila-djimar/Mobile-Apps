package com.example.laconduite;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class ActivityTestList extends  Activity {
	ListView listViewTestlist=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_list);

		listViewTestlist = (ListView) findViewById(R.id.listViewTestlist);

		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemTestList = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElement;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestElement = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestElement.put("titre", "Tests s�ries");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestElement.put("description", " Commencer l'ensemble de tests s�ries");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestElement.put("img", String.valueOf(R.drawable.teste1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTestList.add(mapTestElement); 
        
        
  
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "Tests th�matiques");
        mapTestElement.put("description", " Commencer l'ensemble de tests th�matiques");
        mapTestElement.put("img", String.valueOf(R.drawable.teste2));
        listItemTestList.add(mapTestElement);
        
        
        
        
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestElement = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestElement.put("titre", "V�rifications interieures");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestElement.put("description", " Commencer l'ensemble de tests");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestElement.put("img", String.valueOf(R.drawable.interieures));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTestList.add(mapTestElement); 
        
        
  
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "V�rifications  exterieures");
        mapTestElement.put("description", " Commencer l'ensemble de tests");
        mapTestElement.put("img", String.valueOf(R.drawable.exterieures));
        listItemTestList.add(mapTestElement);
        
        
        
        
        
      //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestElement = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestElement.put("titre", "BSR");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestElement.put("description", " Test brevet de s�curit� routi�re");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestElement.put("img", String.valueOf(R.drawable.bsr));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTestList.add(mapTestElement); 
        
        
  
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "ASSR1");
        mapTestElement.put("description", " S�l�ctionner une s�rie ASSR1");
        mapTestElement.put("img", String.valueOf(R.drawable.asr1));
        listItemTestList.add(mapTestElement);	
		
		
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "ASSR2");
        mapTestElement.put("description", " S�l�ctionner une s�rie ASSR2");
        mapTestElement.put("img", String.valueOf(R.drawable.asr2));
        listItemTestList.add(mapTestElement);
        
        
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemTestList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewTestlist.setAdapter(mScheduleTestSerie);
        
        listViewTestlist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewTestlist.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityTestList.this,ActivityTestSerieConduitList.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityTestList.this,ActivityTestThematiqueConduitList.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityTestList.this,ActivityVerificationInterieurList.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;
        		  	 
        		  	 
            case 3:
            	
                
		        
    		   	Intent IntentSerie4 = new Intent(ActivityTestList.this,ActivityVerificationExterieurList.class);
    		  	startActivity(IntentSerie4);	
    		  	 break;
    		  	 
    		  	 
    		  	 
    		  	 
    		  	 
    		  	 
    		  	 
    		  	 
            case 4:
            	
                
		        
    		   	Intent IntentSerie5 = new Intent(ActivityTestList.this,ActivityBSRlist.class);
    		  	startActivity(IntentSerie5);	
    		  	 break;
    		  	 
    		  	 
        case 5:
        	
            
	        
		   	Intent IntentSerie6 = new Intent(ActivityTestList.this,ActivityASSR1List.class);
		  	startActivity(IntentSerie6);	
		  	 break;   
		  	 
		  	 
         case 6:
        	
            
	        
		   	Intent IntentSerie7 = new Intent(ActivityTestList.this,ActivityASSR2List.class);
		  	startActivity(IntentSerie7);	
		  	 break;   
        		  	 
                    
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
		
	}

}
