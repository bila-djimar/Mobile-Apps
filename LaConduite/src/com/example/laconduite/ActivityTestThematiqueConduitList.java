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

public class ActivityTestThematiqueConduitList extends Activity {
	ListView listViewTestthematique=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_thematique_conduit_list);


		listViewTestthematique = (ListView) findViewById(R.id.listViewThematiquelist);
		
		
		//Cr�ation de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemthematiqueTest = new ArrayList<HashMap<String, String>>();
 
        //On d�clare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestThematique;
 
       
        //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
        mapTestThematique = new HashMap<String, String>();
        //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
        mapTestThematique.put("titre", "Arr�t stationnement");
        //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
        mapTestThematique.put("description", " Commencer le test");
        //on ins�re la r�f�rence � l'image (convertit en String car normalement c'est un int) que l'on r�cup�rera dans l'imageView cr�� dans le fichier affichageitem.xml
      
        mapTestThematique.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemthematiqueTest.add(mapTestThematique); 
        
        
  
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "Croisement/d�passement");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie2));
        listItemthematiqueTest.add(mapTestThematique);  
        
        
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "Signalisation");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie3));
        listItemthematiqueTest.add(mapTestThematique);  
        
        
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "Priorit�s");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie4));
        listItemthematiqueTest.add(mapTestThematique);  
        
        
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "Visibilit�s/�clairage");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie5));
        listItemthematiqueTest.add(mapTestThematique);  
        
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "R�gles de circulation");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie6));
        listItemthematiqueTest.add(mapTestThematique);  
        
        
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "Conduite �conomique");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie7));
        listItemthematiqueTest.add(mapTestThematique);  
        
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "Tunnels");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie8));
        listItemthematiqueTest.add(mapTestThematique);  
        
        
        mapTestThematique = new HashMap<String, String>();
        mapTestThematique.put("titre", "Questions �crites");
        mapTestThematique.put("description", " Commencer le test");
        mapTestThematique.put("img", String.valueOf(R.drawable.serie9));
        listItemthematiqueTest.add(mapTestThematique);  
        
        
        	
        //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestthematique = new SimpleAdapter (this.getBaseContext(), listItemthematiqueTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut � notre listView l'adapter que l'on vient de cr�er
        listViewTestthematique.setAdapter(mScheduleTestthematique);
        
        
        listViewTestthematique.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on r�cup�re la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewTestthematique.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		 	Intent IntentTheme1 = new Intent(ActivityTestThematiqueConduitList.this,ActivityStationnementList.class);
            		  	startActivity(IntentTheme1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                	Intent IntentTheme2 = new Intent(ActivityTestThematiqueConduitList.this,ActivityCroisementList.class);
        		  	startActivity(IntentTheme2);	
        		  	 break;
    		        
        		   
        		  
            		  	
        		  	 
        		  	 
                case 2:
                	
                	Intent IntentTheme3 = new Intent(ActivityTestThematiqueConduitList.this,ActivitySignalisationList.class);
        		  	startActivity(IntentTheme3);	
        		  	 break;
        		  	 
    		        
        		   
        		  	 
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
                	Intent IntentTheme4 = new Intent(ActivityTestThematiqueConduitList.this,ActivityPriorityList.class);
        		  	startActivity(IntentTheme4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
                	  Intent IntentTheme5 = new Intent(ActivityTestThematiqueConduitList.this,ActivityVisibilityList.class);
          		  	startActivity(IntentTheme5);	
          		  	 break;
        		  	 
        		  	 
        		  	 
                  case 5:
                  	
                      
      		        
          		   		
                	Intent IntentTheme6 = new Intent(ActivityTestThematiqueConduitList.this,ActivityRegleCirculationList.class);
          		  	startActivity(IntentTheme6);	
          		  	 break;
          		  	 
                  case 6:
                  	
                      
      		        
          		   
                	  Intent IntentTheme7 = new Intent(ActivityTestThematiqueConduitList.this,ActivityConduiteEconomiqueList.class);
          		  	startActivity(IntentTheme7);	
          		  	 break;  
          		  	 
                  case 7:
                  	
                      
                	  Intent IntentTheme8 = new Intent(ActivityTestThematiqueConduitList.this,ActivityTunnelList.class);
            		  	startActivity(IntentTheme8);	
          		   		
          		  	 break;   
          		  	 
          		  	 
                  case 8:
                  	
                	  Intent IntentTheme9 = new Intent(ActivityTestThematiqueConduitList.this,ActivityQuestionEcritesList.class);
            		  	startActivity(IntentTheme9);	 
      		        
          		   	
          		  	 break;   
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

            