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

public class ActivityQuestionEcritesList extends  Activity {
	ListView listViewQuestionEcritesSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_question_ecrites_list);



		
		
listViewQuestionEcritesSerie = (ListView) findViewById(R.id.listViewQuestionEcrites);

		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemQuestionEcritesTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerieQuestionEcrites;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestSerieQuestionEcrites = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestSerieQuestionEcrites.put("titre", "S�rie 1");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestSerieQuestionEcrites.put("description", " Commencer la S�rie 1");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestSerieQuestionEcrites.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemQuestionEcritesTest.add(mapTestSerieQuestionEcrites); 
        
        
  
        mapTestSerieQuestionEcrites = new HashMap<String, String>();
        mapTestSerieQuestionEcrites.put("titre", "S�rie 2");
        mapTestSerieQuestionEcrites.put("description", " Commencer la S�rie 2");
        mapTestSerieQuestionEcrites.put("img", String.valueOf(R.drawable.serie2));
        listItemQuestionEcritesTest.add(mapTestSerieQuestionEcrites);  
        
        
        mapTestSerieQuestionEcrites = new HashMap<String, String>();
        mapTestSerieQuestionEcrites.put("titre", "S�rie 3");
        mapTestSerieQuestionEcrites.put("description", " Commencer la S�rie 3");
        mapTestSerieQuestionEcrites.put("img", String.valueOf(R.drawable.serie3));
        listItemQuestionEcritesTest.add(mapTestSerieQuestionEcrites);  
        
        
        mapTestSerieQuestionEcrites = new HashMap<String, String>();
        mapTestSerieQuestionEcrites.put("titre", "S�rie 4");
        mapTestSerieQuestionEcrites.put("description", " Commencer la S�rie 4");
        mapTestSerieQuestionEcrites.put("img", String.valueOf(R.drawable.serie4));
        listItemQuestionEcritesTest.add(mapTestSerieQuestionEcrites);  
        
        
        mapTestSerieQuestionEcrites = new HashMap<String, String>();
        mapTestSerieQuestionEcrites.put("titre", "S�rie 5");
        mapTestSerieQuestionEcrites.put("description", " Commencer la S�rie 5");
        mapTestSerieQuestionEcrites.put("img", String.valueOf(R.drawable.serie5));
        listItemQuestionEcritesTest.add(mapTestSerieQuestionEcrites); 
        
        
        
        
      //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemQuestionEcritesTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewQuestionEcritesSerie.setAdapter(mScheduleTestSerie);
        
        listViewQuestionEcritesSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewQuestionEcritesSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityQuestionEcritesList.this,ActivityTheme91.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityQuestionEcritesList.this,ActivityTheme92.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityQuestionEcritesList.this,ActivityTheme93.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentSerie4 = new Intent(ActivityQuestionEcritesList.this,ActivityTheme94.class);
        		  	startActivity(IntentSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentSerie5 = new Intent(ActivityQuestionEcritesList.this,ActivityTheme95.class);
        		  	startActivity(IntentSerie5);	
        		  	 break; 
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

