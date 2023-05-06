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

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemPrioritySerieTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSeriePriority;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSeriePriority = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSeriePriority.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSeriePriority.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemPrioritySerieTest.add(mapTestSeriePriority); 
        
        
  
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "S�rie 2");
        mapTestSeriePriority.put("description", " Commencer la S�rie 2");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie2));
        listItemPrioritySerieTest.add(mapTestSeriePriority);  
        
        
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "S�rie 3");
        mapTestSeriePriority.put("description", " Commencer la S�rie 3");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie3));
        listItemPrioritySerieTest.add(mapTestSeriePriority);  
        
        
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "S�rie 4");
        mapTestSeriePriority.put("description", " Commencer la S�rie 4");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie4));
        listItemPrioritySerieTest.add(mapTestSeriePriority);  
        
        
        mapTestSeriePriority = new HashMap<String, String>();
        mapTestSeriePriority.put("titre", "S�rie 5");
        mapTestSeriePriority.put("description", " Commencer la S�rie 5");
        mapTestSeriePriority.put("img", String.valueOf(R.drawable.serie5));
        listItemPrioritySerieTest.add(mapTestSeriePriority); 
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestStationnementSerie = new SimpleAdapter (this.getBaseContext(), listItemPrioritySerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewPriorityTestSerie.setAdapter(mScheduleTestStationnementSerie);
        
        listViewPriorityTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
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

     