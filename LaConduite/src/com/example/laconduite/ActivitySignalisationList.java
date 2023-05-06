package com.example.laconduite;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.AdapterView.OnItemClickListener;

public class ActivitySignalisationList extends Activity {
	ListView listViewSignalisationTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signalisation_list);


		listViewSignalisationTestSerie = (ListView) findViewById(R.id.listViewSignalisationList);

		
		
		

		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemSignalisationListSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieSignalisationList;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestSerieSignalisationList = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestSerieSignalisationList.put("titre", "Série 1");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestSerieSignalisationList.put("description", " Commencer la Série 1");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestSerieSignalisationList.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemSignalisationListSerieTest.add(mapTestSerieSignalisationList); 
        
        
  
        mapTestSerieSignalisationList = new HashMap<String, String>();
        mapTestSerieSignalisationList.put("titre", "Série 2");
        mapTestSerieSignalisationList.put("description", " Commencer la Série 2");
        mapTestSerieSignalisationList.put("img", String.valueOf(R.drawable.serie2));
        listItemSignalisationListSerieTest.add(mapTestSerieSignalisationList);  
        
        
        mapTestSerieSignalisationList = new HashMap<String, String>();
        mapTestSerieSignalisationList.put("titre", "Série 3");
        mapTestSerieSignalisationList.put("description", " Commencer la Série 3");
        mapTestSerieSignalisationList.put("img", String.valueOf(R.drawable.serie3));
        listItemSignalisationListSerieTest.add(mapTestSerieSignalisationList);  
        
        
        mapTestSerieSignalisationList = new HashMap<String, String>();
        mapTestSerieSignalisationList.put("titre", "Série 4");
        mapTestSerieSignalisationList.put("description", " Commencer la Série 4");
        mapTestSerieSignalisationList.put("img", String.valueOf(R.drawable.serie4));
        listItemSignalisationListSerieTest.add(mapTestSerieSignalisationList);  
        
        
        mapTestSerieSignalisationList = new HashMap<String, String>();
        mapTestSerieSignalisationList.put("titre", "Série 5");
        mapTestSerieSignalisationList.put("description", " Commencer la Série 5");
        mapTestSerieSignalisationList.put("img", String.valueOf(R.drawable.serie5));
        listItemSignalisationListSerieTest.add(mapTestSerieSignalisationList); 
        
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestStationnementSerie = new SimpleAdapter (this.getBaseContext(), listItemSignalisationListSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewSignalisationTestSerie.setAdapter(mScheduleTestStationnementSerie);
        
        listViewSignalisationTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewSignalisationTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentStationnementSerie1 = new Intent(ActivitySignalisationList.this,ActivityTheme31.class);
            		  	startActivity(IntentStationnementSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentStationnementSerie2 = new Intent(ActivitySignalisationList.this,ActivityTheme32.class);
        		  	startActivity(IntentStationnementSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentStationnementSerie3 = new Intent(ActivitySignalisationList.this,ActivityTheme33.class);
        		  	startActivity(IntentStationnementSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentStationnementSerie4 = new Intent(ActivitySignalisationList.this,ActivityTheme34.class);
        		  	startActivity(IntentStationnementSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentStationnementSerie5 = new Intent(ActivitySignalisationList.this,ActivityTheme35.class);
        		  	startActivity(IntentStationnementSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

       