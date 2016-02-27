package Manual;

import java.io.*;

class AnthroSave {
    
      
        public static void writeToFile(String text) {
                try {
                     
                        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Anthro\\" + AnthroLog.Username + ".txt"), true));
                        bw.write(text);
                        bw.newLine();
                        bw.close();
                } catch (Exception e) {
                }
        }

           public static void rewriteToFile(String text) {
                try {
                     
                         Writer output = null;
                        File file = new File("C:\\Anthro\\" + AnthroLog.Username + ".txt");
                        output = new BufferedWriter(new FileWriter(file));
                        output.write(text);
                        output.close();    
                    
                } catch (Exception e) {
                }
        }
           
           public static void rewriteNumToFile(String text) {
                try {
                     
                         Writer output = null;
                        File file = new File("C:\\Anthro\\Log.txt");
                        output = new BufferedWriter(new FileWriter(file));
                        output.write(text);
                        output.close();    
                    
                } catch (Exception e) {
                }
        }
                              
        public static void Save() throws Exception { 
            
            rewriteNumToFile(Integer.toString(AnthroLog.UserDigits));
        
            rewriteToFile("");
                
            writeToFile(AnthroLog.Username);
            writeToFile(AnthroLog.Password);
            writeToFile(AnthroLog.FirstName);
            writeToFile(AnthroLog.MiddleName);
            writeToFile(AnthroLog.LastName);
            writeToFile(AnthroLog.Grade);
            writeToFile(AnthroLog.ClassCode);
            writeToFile(Integer.toString(AnthroLog.current));
            
        }
}