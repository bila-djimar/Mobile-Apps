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

		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemTestList = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestElement;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElement = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElement.put("titre", "Tests séries");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElement.put("description", " Commencer l'ensemble de tests séries");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElement.put("img", String.valueOf(R.drawable.teste1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTestList.add(mapTestElement); 
        
        
  
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "Tests thématiques");
        mapTestElement.put("description", " Commencer l'ensemble de tests thématiques");
        mapTestElement.put("img", String.valueOf(R.drawable.teste2));
        listItemTestList.add(mapTestElement);
        
        
        
        
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElement = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElement.put("titre", "Vérifications interieures");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElement.put("description", " Commencer l'ensemble de tests");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElement.put("img", String.valueOf(R.drawable.interieures));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTestList.add(mapTestElement); 
        
        
  
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "Vérifications  exterieures");
        mapTestElement.put("description", " Commencer l'ensemble de tests");
        mapTestElement.put("img", String.valueOf(R.drawable.exterieures));
        listItemTestList.add(mapTestElement);
        
        
        
        
        
      //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestElement = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestElement.put("titre", "BSR");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestElement.put("description", " Test brevet de sécurité routière");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestElement.put("img", String.valueOf(R.drawable.bsr));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemTestList.add(mapTestElement); 
        
        
  
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "ASSR1");
        mapTestElement.put("description", " Séléctionner une série ASSR1");
        mapTestElement.put("img", String.valueOf(R.drawable.asr1));
        listItemTestList.add(mapTestElement);	
		
		
        mapTestElement = new HashMap<String, String>();
        mapTestElement.put("titre", "ASSR2");
        mapTestElement.put("description", " Séléctionner une série ASSR2");
        mapTestElement.put("img", String.valueOf(R.drawable.asr2));
        listItemTestList.add(mapTestElement);
        
        
        
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemTestList, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewTestlist.setAdapter(mScheduleTestSerie);
        
        listViewTestlist.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
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
