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

public class ActivityTestSerieConduitList extends Activity {
	ListView listViewTestSerie=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_serie_conduit_list);

		listViewTestSerie = (ListView) findViewById(R.id.listViewTesteSerieConduite);

		
		
		//Création de la ArrayList qui nous permettra de remplire la listView
        ArrayList<HashMap<String, String>> listItemSerieTest = new ArrayList<HashMap<String, String>>();
 
        //On déclare la HashMap qui contiendra les informations pour un item
        HashMap<String, String> mapTestSerie;
 
       
        //Création d'une HashMap pour insérer les informations du premier item de notre listView
        mapTestSerie = new HashMap<String, String>();
        //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
        mapTestSerie.put("titre", "Série 1");
        //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
        mapTestSerie.put("description", " Commencer la Série 1");
        //on insère la référence à l'image (convertit en String car normalement c'est un int) que l'on récupérera dans l'imageView créé dans le fichier affichageitem.xml
      
        mapTestSerie.put("img", String.valueOf(R.drawable.serie1));
        
      //enfin on ajoute cette hashMap dans la arrayList
        listItemSerieTest.add(mapTestSerie); 
        
        
  
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 2");
        mapTestSerie.put("description", " Commencer la Série 2");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie2));
        listItemSerieTest.add(mapTestSerie);  
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 3");
        mapTestSerie.put("description", " Commencer la Série 3");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie3));
        listItemSerieTest.add(mapTestSerie);  
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 4");
        mapTestSerie.put("description", " Commencer la Série 4");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie4));
        listItemSerieTest.add(mapTestSerie);  
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 5");
        mapTestSerie.put("description", " Commencer la Série 5");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie5));
        listItemSerieTest.add(mapTestSerie);  
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 6");
        mapTestSerie.put("description", " Commencer la Série 6");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie6));
        listItemSerieTest.add(mapTestSerie);  
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 7");
        mapTestSerie.put("description", " Commencer la Série 7");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie7));
        listItemSerieTest.add(mapTestSerie);  
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 8");
        mapTestSerie.put("description", " Commencer la Série 8");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie8));
        listItemSerieTest.add(mapTestSerie);  
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 9");
        mapTestSerie.put("description", " Commencer la Série 9");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie9));
        listItemSerieTest.add(mapTestSerie);  
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 10");
        mapTestSerie.put("description", " Commencer la Série 10");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie10));
        listItemSerieTest.add(mapTestSerie); 
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 11 ");
        mapTestSerie.put("description", " Commencer la Série 11");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie11));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 12 ");
        mapTestSerie.put("description", " Commencer la Série 12");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie12));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 13 ");
        mapTestSerie.put("description", " Commencer la Série 13");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie13));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 14 ");
        mapTestSerie.put("description", " Commencer la Série 14");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie14));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 15 ");
        mapTestSerie.put("description", " Commencer la Série 15");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie15));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 16 ");
        mapTestSerie.put("description", " Commencer la Série 16");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie16));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 17 ");
        mapTestSerie.put("description", " Commencer la Série 17");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie17));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 18 ");
        mapTestSerie.put("description", " Commencer la Série 18");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie18));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 19 ");
        mapTestSerie.put("description", " Commencer la Série 19");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie19));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 20 ");
        mapTestSerie.put("description", " Commencer la Série 20");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie20));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 21 ");
        mapTestSerie.put("description", " Commencer la Série 21");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie21));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 22 ");
        mapTestSerie.put("description", " Commencer la Série 22");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie22));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 23 ");
        mapTestSerie.put("description", " Commencer la Série 23");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie23));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 24 ");
        mapTestSerie.put("description", " Commencer la Série 24");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie24));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 25 ");
        mapTestSerie.put("description", " Commencer la Série 25");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie25));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 26 ");
        mapTestSerie.put("description", " Commencer la Série 26");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie26));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 27 ");
        mapTestSerie.put("description", " Commencer la Série 27");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie27));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 28 ");
        mapTestSerie.put("description", " Commencer la Série 28");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie28));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 29 ");
        mapTestSerie.put("description", " Commencer la Série 29");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie29));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 30 ");
        mapTestSerie.put("description", " Commencer la Série 30");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie30));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 31 ");
        mapTestSerie.put("description", " Commencer la Série 31");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie31));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 32 ");
        mapTestSerie.put("description", " Commencer la Série 32");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie32));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 33 ");
        mapTestSerie.put("description", " Commencer la Série 33");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie33));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 34 ");
        mapTestSerie.put("description", " Commencer la Série 34");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie34));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 35 ");
        mapTestSerie.put("description", " Commencer la Série 35");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie35));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 36 ");
        mapTestSerie.put("description", " Commencer la Série 36");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie36));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 37 ");
        mapTestSerie.put("description", " Commencer la Série 37");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie37));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 38 ");
        mapTestSerie.put("description", " Commencer la Série 38");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie38));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 39 ");
        mapTestSerie.put("description", " Commencer la Série 39");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie39));
        listItemSerieTest.add(mapTestSerie);
        
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 40 ");
        mapTestSerie.put("description", " Commencer la Série 40");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie40));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 41 ");
        mapTestSerie.put("description", " Commencer la Série 41");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie41));
        listItemSerieTest.add(mapTestSerie);
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 42 ");
        mapTestSerie.put("description", " Commencer la Série 42");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie42));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 43 ");
        mapTestSerie.put("description", " Commencer la Série 43");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie43));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 44 ");
        mapTestSerie.put("description", " Commencer la Série 44");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie44));
        listItemSerieTest.add(mapTestSerie);
        
        
        mapTestSerie = new HashMap<String, String>();
        mapTestSerie.put("titre", "Série 45 ");
        mapTestSerie.put("description", " Commencer la Série 45");
        mapTestSerie.put("img", String.valueOf(R.drawable.serie45));
        listItemSerieTest.add(mapTestSerie);
        
      //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
        SimpleAdapter mScheduleTestSerie = new SimpleAdapter (this.getBaseContext(), listItemSerieTest, R.layout.affichageitem,
               new String[] {"img", "titre", "description"}, new int[] {R.id.img, R.id.titre, R.id.description});
 
        //On attribut à notre listView l'adapter que l'on vient de créer
        listViewTestSerie.setAdapter(mScheduleTestSerie);
        
        listViewTestSerie.setOnItemClickListener(new OnItemClickListener() {
			@Override
        	@SuppressWarnings("unchecked")
         	public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				//on récupère la HashMap contenant les infos de notre item (titre, description, img)
        		HashMap<String, String> map = (HashMap<String, String>) listViewTestSerie.getItemAtPosition(position);


        		switch (position) {
                case 0:
                	
                   
            		        
            		   	Intent IntentSerie1 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie1.class);
            		  	startActivity(IntentSerie1);	
            		  	 break;
            		  	 
            		  	 
                case 1:
                	
                    
    		        
        		   	Intent IntentSerie2 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie2.class);
        		  	startActivity(IntentSerie2);	
        		  	 break;   
                    
            		  	
        		  	 
        		  	 
                case 2:
                	
                    
    		        
        		   	Intent IntentSerie3 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie3.class);
        		  	startActivity(IntentSerie3);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                case 3:
                	
                    
    		        
        		   	Intent IntentSerie4 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie4.class);
        		  	startActivity(IntentSerie4);	
        		  	 break;
        		  	 
        		  	 
        		  	 
                  case 4:
                	
                    
    		        
        		   	Intent IntentSerie5 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie5.class);
        		  	startActivity(IntentSerie5);	
        		  	 break; 
        		  	 
        		  	 
        		  	 
                  case 5:
                  	
                      
      		        
          		   	Intent IntentSerie6 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie6.class);
          		  	startActivity(IntentSerie6);	
          		  	 break;   
          		  	 
                  case 6:
                  	
                      
      		        
          		   	Intent IntentSerie7 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie7.class);
          		  	startActivity(IntentSerie7);	
          		  	 break;   
          		  	 
                  case 7:
                  	
                      
      		        
          		   	Intent IntentSerie8 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie8.class);
          		  	startActivity(IntentSerie8);	
          		  	 break;   
          		  	 
          		  	 
                  case 8:
                  	
                      
      		        
          		   	Intent IntentSerie9 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie9.class);
          		  	startActivity(IntentSerie9);	
          		  	 break;   
          		  	 
          		  	 
                  case 9:
                  	
                      
      		        
          		   	Intent IntentSerie10 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie10.class);
          		  	startActivity(IntentSerie10);	
          		  	 break;   
        		
                  case 10:
                    	
                      
        		        
            		   	Intent IntentSerie11 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie11.class);
            		  	startActivity(IntentSerie11);	
            		  	 break;    	 
                  case 11:
                  	
                      
      		        
          		   	Intent IntentSerie12 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie12.class);
          		  	startActivity(IntentSerie12);	
          		  	 break; 
          		  	 
          		  	 
                  case 12:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie13 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie13.class);
             		 	startActivity(IntentSerie13); 
                      
                     
                      
                      
                           break;	
             	
                  case 13:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie14 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie14.class);
             			startActivity(IntentSerie14); 	
                      
                     
                      
                      
                           break;	
                           
                           
                           
                  case 14:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie15= new Intent(ActivityTestSerieConduitList.this,ActivitySerie15.class);
             		 	startActivity(IntentSerie15); 
                     
                      
                      
                           break;	
                           
                           
                  case 15:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie16 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie16.class);
             		 	startActivity(IntentSerie16); 	
                      
                     
                      
                      
                           break;	
                           
                           
                  case 16:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie17 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie17.class);
             		 	startActivity(IntentSerie17); 
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 17:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie18 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie18.class);
             		 	startActivity(IntentSerie18); 	
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                  case 18:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie19 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie19.class);
             			startActivity(IntentSerie19); 	
                   	
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 19:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	Intent IntentSerie20 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie20.class);
             		 	startActivity(IntentSerie20); 	
                   
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 20:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie21 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie21.class);
             		 startActivity(IntentSerie21); 	
                   
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                  case 21:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie22 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie22.class);
             		 startActivity(IntentSerie22); 	
                   
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                           
                  case 22:
                  	 // Show Alert 
                    // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
                      
                     
              		        
                 	 Intent IntentSerie23 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie23.class);
             		 startActivity(IntentSerie23); 
              		   	
              		   
                  break;
                  case 23:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie24 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie24.class);
             		 startActivity(IntentSerie24); 
              		   		
                      
                     
                      
                      
                           break;	
             	
                  case 24:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie25 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie25.class);
             		 startActivity(IntentSerie25); 	
                      
                     
                      
                      
                           break;	
                           
                           
                           
                  case 25:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie26 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie26.class);
             		 startActivity(IntentSerie26); 	
                      
                     
                      
                      
                           break;	
                           
                           
                  case 26:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie27 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie27.class);
             		 startActivity(IntentSerie27); 
                     
                      
                      
                           break;	
                           
                           
                  case 27:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie28 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie28.class);
             		 startActivity(IntentSerie28); 
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 28:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie29 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie29.class);
             		 startActivity(IntentSerie29); 	
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                  case 29:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie30 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie30.class);
             		 startActivity(IntentSerie30); 	
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 30:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie31 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie31.class);
             		 startActivity(IntentSerie31); 		
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 31:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie32 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie32.class);
             		 startActivity(IntentSerie32); 		
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                  case 32:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();


                 	 
                 	 
                 	 Intent IntentSerie33 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie33.class);
             		 startActivity(IntentSerie33); 		
                      
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                           
                           
                           
                           
                  case 33:
                  	 // Show Alert 
                    // Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG).show();
                      
                     
              		        
                 	 Intent IntentSerie34 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie34.class);
             		 startActivity(IntentSerie34); 	
              		   	
              		   
                  break;
                  case 34:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie35 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie35.class);
             		 startActivity(IntentSerie35); 	
                      
                     
                      
                      
                           break;	
             	
                  case 35:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie36 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie36.class);
             		 startActivity(IntentSerie36); 	         
                     
                      
                      
                           break;	
                           
                           
                           
                  case 36:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie37 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie37.class);
             		 startActivity(IntentSerie37); 	
                      
                     
                      
                      
                           break;	
                           
                           
                  case 37:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie38 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie38.class);
             		 startActivity(IntentSerie38); 		
                      
                     
                      
                      
                           break;	
                           
                           
                  case 38:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie39 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie39.class);
             		 startActivity(IntentSerie39); 	
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 39:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie40 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie40.class);
             		 startActivity(IntentSerie40); 		
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                  case 40:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie41 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie41.class);
             		 startActivity(IntentSerie41); 		
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 41:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie42 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie42.class);
             		 startActivity(IntentSerie42); 		
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                  case 42:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie43 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie43.class);
             		 startActivity(IntentSerie43); 		
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                  case 43:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie44 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie44.class);
             		 startActivity(IntentSerie44); 		
                      
                     
                      
                      
                           break;	
                           
                           
                           
                           
                           
                  case 44:  
                  	 // Show Alert 
                      //Toast.makeText(this,"Position de l'element "+values[position]+" "+position , Toast.LENGTH_LONG)
                       // .show();
                 	 Intent IntentSerie45 = new Intent(ActivityTestSerieConduitList.this,ActivitySerie45.class);
             		 startActivity(IntentSerie45); 		
                      
                     
                      
                      
                           break;	           
                           
}
                
                
          		
          	}

        		
        		
        		
        		
        		
        		
        	
         });
	     		  	
            		  	
            		  	
	}

}

               