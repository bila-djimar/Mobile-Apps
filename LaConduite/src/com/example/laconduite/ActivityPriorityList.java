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

public class ActivityPriorityList extends  Activity {
	ListView listViewPriorityTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_priority_list);



		
		listViewPriorityTestSerie = (ListView) findViewById(R.id.listViewPriority);

		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemPrioritySerieTest = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSeriePriority;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestSeriePriority = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestSeriePriority.put("titre", "Série 1");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestSeriePriority.put("description", " Commencer la Série 1");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemPrioritySerieTest.add(mapTestSeriePriority); 
        
        
  
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "Série 2");
        mapTestSeriePriority.put("description", " Commencer la Série 2");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie2));
        listItemPrioritySerieTest.add(mapTestSeriePriority);  
        
        
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "Série 3");
        mapTestSeriePriority.put("description", " Commencer la Série 3");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie3));
        listItemPrioritySerieTest.add(mapTestSeriePriority);  
        
        
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "Série 4");
        mapTestSeriePriority.put("description", " Commencer la Série 4");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie4));
        listItemPrioritySerieTest.add(mapTestSeriePriority);  
        
        
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "Série 5");
        mapTestSeriePriority.put("description", " Commencer la Série 5");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie5));
        listItemPrioritySerieTest.add(mapTestSeriePriority); 
        
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestStationnementSerie = new SimpleAdapter (this.getBaseContext(), listItemPrioritySerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewPriorityTestSerie.setAdapter(mScheduleTestStationnementSerie);
        
        listViewPriorityTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewPriorityTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentStationnementSerie1 = new Intent(ActivityPriorityList.this,ActivityTheme41.class);
            		  	startActivity(IntentStationnementSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentStationnementSerie2 = new Intent(ActivityPriorityList.this,ActivityTheme42.class);
        		  	startActivity(IntentStationnementSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentStationnementSerie3 = new Intent(ActivityPriorityList.this,ActivityTheme43.class);
        		  	startActivity(IntentStationnementSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentStationnementSerie4 = new Intent(ActivityPriorityList.this,ActivityTheme44.class);
        		  	startActivity(IntentStationnementSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentStationnementSerie5 = new Intent(ActivityPriorityList.this,ActivityTheme45.class);
        		  	startActivity(IntentStationnementSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

     