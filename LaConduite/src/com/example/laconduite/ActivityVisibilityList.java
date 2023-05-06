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

public class ActivityVisibilityList extends  Activity {
	ListView listViewVisibilityTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_visibility_list);



		
		
		
listViewVisibilityTestSerie = (ListView) findViewById(R.id.listViewVisibility);

		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemVisibilitySerieTest = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieVisibility;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestSerieVisibility = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestSerieVisibility.put("titre", "Série 1");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestSerieVisibility.put("description", " Commencer la Série 1");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestSerieVisibility.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemVisibilitySerieTest.add(mapTestSerieVisibility); 
        
        
  
        mapTestSerieVisibility = new HashMap<String, String>();
        mapTestSerieVisibility.put("titre", "Série 2");
        mapTestSerieVisibility.put("description", " Commencer la Série 2");
        mapTestSerieVisibility.put("img", String.valueOf(R.drawable.serie2));
        listItemVisibilitySerieTest.add(mapTestSerieVisibility);  
        
        
        mapTestSerieVisibility = new HashMap<String, String>();
        mapTestSerieVisibility.put("titre", "Série 3");
        mapTestSerieVisibility.put("description", " Commencer la Série 3");
        mapTestSerieVisibility.put("img", String.valueOf(R.drawable.serie3));
        listItemVisibilitySerieTest.add(mapTestSerieVisibility);  
        
        
        mapTestSerieVisibility = new HashMap<String, String>();
        mapTestSerieVisibility.put("titre", "Série 4");
        mapTestSerieVisibility.put("description", " Commencer la Série 4");
        mapTestSerieVisibility.put("img", String.valueOf(R.drawable.serie4));
        listItemVisibilitySerieTest.add(mapTestSerieVisibility);  
        
        
        mapTestSerieVisibility = new HashMap<String, String>();
        mapTestSerieVisibility.put("titre", "Série 5");
        mapTestSerieVisibility.put("description", " Commencer la Série 5");
        mapTestSerieVisibility.put("img", String.valueOf(R.drawable.serie5));
        listItemVisibilitySerieTest.add(mapTestSerieVisibility); 
        
        
        
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestStationnementSerie = new SimpleAdapter (this.getBaseContext(), listItemVisibilitySerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewVisibilityTestSerie.setAdapter(mScheduleTestStationnementSerie);
        
        listViewVisibilityTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewVisibilityTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentStationnementSerie1 = new Intent(ActivityVisibilityList.this,ActivityTheme51.class);
            		  	startActivity(IntentStationnementSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentStationnementSerie2 = new Intent(ActivityVisibilityList.this,ActivityTheme52.class);
        		  	startActivity(IntentStationnementSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentStationnementSerie3 = new Intent(ActivityVisibilityList.this,ActivityTheme53.class);
        		  	startActivity(IntentStationnementSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentStationnementSerie4 = new Intent(ActivityVisibilityList.this,ActivityTheme54.class);
        		  	startActivity(IntentStationnementSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentStationnementSerie5 = new Intent(ActivityVisibilityList.this,ActivityTheme55.class);
        		  	startActivity(IntentStationnementSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

     