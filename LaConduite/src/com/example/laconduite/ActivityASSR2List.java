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

public class ActivityASSR2List extends  Activity {
	ListView listViewASSR2TestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_assr2_list);


listViewASSR2TestSerie = (ListView) findViewById(R.id.listViewASSR2list);

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemASSR2SerieTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieASSR2;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSerieASSR2 = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSerieASSR2.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSerieASSR2.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSerieASSR2.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemASSR2SerieTest.add(mapTestSerieASSR2); 
        
        
  
        mapTestSerieASSR2 = new HashMap<String, String>();
        mapTestSerieASSR2.put("titre", "S�rie 2");
        mapTestSerieASSR2.put("description", " Commencer la S�rie 2");
        mapTestSerieASSR2.put("img", String.valueOf(R.drawable.serie2));
        listItemASSR2SerieTest.add(mapTestSerieASSR2);  
        
        
        mapTestSerieASSR2 = new HashMap<String, String>();
        mapTestSerieASSR2.put("titre", "S�rie 3");
        mapTestSerieASSR2.put("description", " Commencer la S�rie 3");
        mapTestSerieASSR2.put("img", String.valueOf(R.drawable.serie3));
        listItemASSR2SerieTest.add(mapTestSerieASSR2);  
        
        
        mapTestSerieASSR2 = new HashMap<String, String>();
        mapTestSerieASSR2.put("titre", "S�rie 4");
        mapTestSerieASSR2.put("description", " Commencer la S�rie 4");
        mapTestSerieASSR2.put("img", String.valueOf(R.drawable.serie4));
        listItemASSR2SerieTest.add(mapTestSerieASSR2);  
        
        
        mapTestSerieASSR2 = new HashMap<String, String>();
        mapTestSerieASSR2.put("titre", "S�rie 5");
        mapTestSerieASSR2.put("description", " Commencer la S�rie 5");
        mapTestSerieASSR2.put("img", String.valueOf(R.drawable.serie5));
        listItemASSR2SerieTest.add(mapTestSerieASSR2);  
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemASSR2SerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewASSR2TestSerie.setAdapter(mScheduleTestSerie);
        
        listViewASSR2TestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewASSR2TestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityASSR2List.this,ActivityAssr21.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityASSR2List.this,ActivityAssr22.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityASSR2List.this,ActivityAssr23.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentSerie4 = new Intent(ActivityASSR2List.this,ActivityAssr24.class);
        		  	startActivity(IntentSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentSerie5 = new Intent(ActivityASSR2List.this,ActivityAssr25.class);
        		  	startActivity(IntentSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

             