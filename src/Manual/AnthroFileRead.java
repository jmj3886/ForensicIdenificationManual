package Manual;

import java.io.*;
import java.util.Scanner;
class AnthroFileRead 
{
 
    
 public static void main()
  {
  try{

      FileInputStream fstream = new FileInputStream("C:\\Anthro\\Log.txt");;
      
  if(AnthroLog.Read == 1){
      fstream = new FileInputStream("C:\\Anthro\\Log.txt");
  }
  
  if(AnthroLog.Read == 2){
      fstream = new FileInputStream("C:\\Anthro\\" + AnthroLog.Username + ".txt");
  }
  
  DataInputStream in2 = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in2));
  
  if(AnthroLog.Read == 1){
      String UserDigits;
      UserDigits = br.readLine();
      AnthroLog.UserDigits = Integer.parseInt(UserDigits);
  }
  
  if(AnthroLog.Read == 2){
      AnthroLog.SavedUsername = br.readLine();
      AnthroLog.Password = br.readLine();
      AnthroLog.FirstName = br.readLine();
      AnthroLog.MiddleName = br.readLine();
      AnthroLog.LastName = br.readLine();
      AnthroLog.Grade = br.readLine();
      AnthroLog.ClassCode = br.readLine();
      AnthroLog.current = Integer.parseInt(br.readLine());
  }
  
    
  in2.close();
  }catch (FileNotFoundException ex){
        AnthroButtons.fileNotFound();
  }catch(Exception e){
      
  }
  }
}