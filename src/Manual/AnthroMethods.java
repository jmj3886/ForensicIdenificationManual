package Manual;

import java.util.ArrayList;

public class AnthroMethods{
    
        public AnthroMethods(){
            
        }
        
        public static String findCurrent(int current){
            if(current == 0){
                return "None";
            }else if(current < 5){       
                return "I.D. of Long bones";
            }else if(current < 8){    
                return "Identification of Skull";
            }else if(current < 16){
                return "I.D. of Important Bones";
            }else if(current < 20){    
                return "Identification of Age";
            }else if(current < 27){
                return "Identification of Race";
            }else if(current < 34){
                return "Identification of Sex";
            }else if(current < 37){
                return "Identification of Stature";
            }else if(current < 40){
                return "Time Since Death";
            }else if(current < 46){
                return "Proc., Catalog., and Org.";
            }else if(current == 46){
                return "Finished";
            }
            return "None";
        }
        
        public static String findNext(int current){
            if(current == 0){
                return "Identification of Long bones";
            }else if(current < 5){                       
                return "Identification of Skull";
            }else if(current < 8){                    
                return "Identification of Important bones";
            }else if(current < 16){                
                return "Identification of Age";
            }else if(current < 20){    
                return "Identification of Race";
            }else if(current < 27){
                return "Identification of Sex";
            }else if(current < 34){
                return "Identification of Stature";
            }else if(current < 37){
                return "Time Since Death";
            }else if(current < 40){
                return "Processing, Cataloging, and Organizing";
            }else if(current < 46){
                return "Finished";
            }
            return "Finished";
        }
         
        public static int identifyLesson(String current){
            switch(current){
                case "Getting to know the bones": return 0;
                case "Recognizing Left from Right": return 1;
                case "Recognizing Proximal Vs. Distal": return 2;
                case "Recognizing Posterier Vs. Anterior": return 3;
            }
            return -1;
        }
        
        public static String progress(int current){
            if(current == 0){
                AnthroLogin.ProggressBar.setValue(0);
                return "Not Started";
            }else if(current < 5){
                AnthroLogin.ProggressBar.setValue(1);
                return "10%";
            }else if(current < 8){
                AnthroLogin.ProggressBar.setValue(2);
                return "20%";
            }else if(current < 16){
                AnthroLogin.ProggressBar.setValue(3);
                return "30%";
            }else if(current < 20){
                AnthroLogin.ProggressBar.setValue(4);
                return "40%";
            }else if(current < 27){    
                AnthroLogin.ProggressBar.setValue(5);
                return "50%";
            }else if(current < 34){      
                AnthroLogin.ProggressBar.setValue(6);          
                return "60%";
            }else if(current < 36){            
                AnthroLogin.ProggressBar.setValue(7);        
                return "70%";
            }else if(current < 40){        
                AnthroLogin.ProggressBar.setValue(8);
                return "80%";
            }else if(current < 46){   
                AnthroLogin.ProggressBar.setValue(9);                
                return "90%";
            }            
            AnthroLogin.ProggressBar.setValue(10);
            return "Finished";
        }
        
        public static String[] displayLessons(int current){
            String[] Lessons = {"Getting to know the bones", "Recognizing Left from Right", "Recognizing Proximal Vs. Distal", "Recognizing Posterier Vs. Anterior"};
            return Lessons;
        }
        
        public static boolean quizCompleted(int current, int section){
            if(current > section){
                return true;
            }
            return false;
        }
}