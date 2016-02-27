package Manual;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnthroButtons{
        
        private static AnthroLogin objects = new AnthroLogin();
    
        public AnthroButtons(){
            
        }
        
        public static void LongIDButton(){
            
            objects.SectionsLabel.setVisible(true);
            objects.SectionsSpinner.setVisible(true);
            objects.CompletedLabel.setVisible(true);
            objects.QuizGradeLabel.setVisible(true);
            objects.QuizAttemptsLabel.setVisible(true);
            objects.LengthSpentLabel.setVisible(true);
            objects.ViewQuizButton.setVisible(true);
            objects.EnterButton.setVisible(true);
            objects.Completed.setVisible(true);
            objects.QuizGrade.setVisible(true);
            objects.QuizAttempts.setVisible(true);
            objects.LengthSpent.setVisible(true);
            
        }
        
        public static void Login(){
            AnthroLog.Read = 2;
               objects.PasswordFieldCorrect.setVisible(false);
               objects.UserNameFieldCorrect.setVisible(false);
               AnthroLog.Username = objects.UserNameField.getText();
               
               AnthroFileRead.main();
               
               if(AnthroLog.Username.equalsIgnoreCase(AnthroLog.SavedUsername) && AnthroLog.Password.equals(objects.PasswordField.getText())){               
                   objects.Description.setVisible(false);
                   objects.Description2.setVisible(false);
                   objects.UserNameLabel.setVisible(false);
                   objects.UserNameField.setVisible(false);
                   objects.PasswordLabel.setVisible(false);
                   objects.PasswordField.setVisible(false);
                   objects.Register.setVisible(false);
                   objects.Start.setVisible(false);
                   objects.LogoLabel.setVisible(false);
                   objects.LogoLabel2.setVisible(false);
                   String holder;
                   if(AnthroLog.FirstName.length() + AnthroLog.MiddleName.length() + AnthroLog.LastName.length() <= 22){
                   holder = "<html><p align=\"center\"><b>" + AnthroLog.FirstName + " " + AnthroLog.MiddleName + " " + AnthroLog.LastName + "</p></html>";
                   }else{
                   holder = "<html><p align=\"center\"><b>" + AnthroLog.FirstName + " " + AnthroLog.LastName + "</p></html>";    
                   }
                   objects.NameLabel.setText(holder);
                   objects.NameLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 15));
                   objects.AccountBoxLabel.setVisible(true);
                   objects.AccountGradeLabel.setVisible(true);
                   objects.AccountNextLabel.setText("Next: " + AnthroMethods.findNext(AnthroLog.current));        
                   objects.AccountCurrentLabel.setText("Current: " + AnthroMethods.findCurrent(AnthroLog.current));
                   objects.AccountGradeLabel.setText("Grade: " + AnthroLog.Grade);                   
                   objects.ProggressBar.setToolTipText(AnthroMethods.progress(AnthroLog.current));
                   objects.AccountCurrentLabel.setVisible(true);
                   objects.AccountNextLabel.setVisible(true);
                   objects.NameLabel.setVisible(true);
                   objects.ProggressBar.setVisible(true);
                   objects.TeacherNameLabel.setVisible(true);
                   objects.ProggressLabel.setVisible(true);
                   objects.LongIDButton.setVisible(true);
                   objects.SkullIDButton.setVisible(true);
                   objects.ImpIDButton.setVisible(true);
                   objects.AgeIDButton.setVisible(true);
                   objects.RaceIDButton.setVisible(true);
                   objects.SexIDButton.setVisible(true);
                   objects.StatIDButton.setVisible(true);
                   objects.TSDButton.setVisible(true);
                   objects.LessonsLabel.setVisible(true);
                   objects.PCOButton.setVisible(true);
                   objects.SettingsLabel.setVisible(true);
                   objects.SettingsList.setVisible(true);
                   objects.SettingsList.clearSelection();
                   objects.SettingsButton.setVisible(true);
               }else{
                   objects.PasswordFieldCorrect.setVisible(true);
               }
        }
        
        public static void Register(){
               
            if(objects.register == 2 && objects.UsernameUsernameLabel.getText().equals(objects.ConfirmUsernameField.getText())){
                   AnthroLog.Username = objects.UsernameUsernameLabel.getText();
                   AnthroLog.Password = objects.RegisterPasswordField.getText();
                   AnthroLog.FirstName = objects.FirstNameField.getText();
                   AnthroLog.MiddleName = objects.MiddleNameField.getText();
                   AnthroLog.LastName = objects.LastNameField.getText();
                   AnthroLog.Grade = (String) objects.Grade.getSelectedItem();
                   AnthroLog.ClassCode = objects.TeacherCodeField.getText();
                   if(AnthroLog.ClassCode.equals("EIEIO")){
                       AnthroLog.current = 46;
                   }else{
                        AnthroLog.current = 0;
                   }
                   AnthroLog.UserDigits++;
                   try {
                        AnthroSave.Save();
                    } catch (Exception ex) {
                        Logger.getLogger(AnthroLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                   objects.FirstNameField.setText("Student First Name");
                   objects.MiddleNameField.setText("Student Middle Name");
                   objects.LastNameField.setText("Student Last Name");
                   objects.Grade.setSelectedIndex(0);
                   objects.RegisterPasswordField.setText("Password");
                   objects.ConfirmPasswordField.setText("Password");
                   objects.TeacherCodeField.setText("Valid Class Code");
                   objects.ConfirmUsernameField.setText("Re-Enter Username");

                   objects.FirstNameField.setVisible(false);
                   objects.MiddleNameField.setVisible(false);
                   objects.LastNameField.setVisible(false);
                   objects.RegisterPasswordField.setVisible(false);
                   objects.ConfirmPasswordField.setVisible(false);
                   objects.TeacherCodeField.setVisible(false);
                   objects.Grade.setVisible(false);
                   objects.FirstNameLabel.setVisible(false);
                   objects.LastNameLabel.setVisible(false);
                   objects.RegisterPasswordLabel.setVisible(false);
                   objects.ConfirmPasswordLabel.setVisible(false);
                   objects.TeacherCodeLabel.setVisible(false);
                   objects.GradeLabel.setVisible(false);  
                   objects.RegisterLabel.setVisible(false);
                   objects.RegisterButton.setVisible(false);
                   objects.RegisterCancelButton.setVisible(false);               
                   objects.UsernameLabel.setVisible(false);
                   objects.ConfirmUsernameLabel.setVisible(false);
                   objects.MiddleNameLabel.setVisible(false);
                   objects.UsernameUsernameLabel.setVisible(false);
                   objects.ConfirmUsernameField.setVisible(false);

                   objects.FirstNameField.setEnabled(true);
                   objects.MiddleNameField.setEnabled(true);
                   objects.LastNameField.setEnabled(true);
                   objects.RegisterPasswordField.setEnabled(true);
                   objects.ConfirmPasswordField.setEnabled(true);
                   objects.TeacherCodeField.setEnabled(true);
                   objects.Grade.setEnabled(true);

                   objects.Description.setVisible(true);
                   objects.Description2.setVisible(true);
                   objects.UserNameLabel.setVisible(true);
                   objects.UserNameField.setVisible(true);
                   objects.UserNameField.setText(null);
                   objects.PasswordLabel.setVisible(true);
                   objects.PasswordField.setVisible(true);
                   objects.PasswordField.setText(null);
                   objects.Register.setVisible(true);
                   objects.Start.setVisible(true);
                   objects.register = 1;

                   objects.RegisterButton.setText("Submit");
               }
               if(objects.register == 1 &&!(objects.FirstNameField.getText().equals("Student First Name")) && !(objects.MiddleNameField.getText().equals("Student Middle Name")) && !(objects.LastNameField.getText().equals("Student Last Name")) && !(objects.TeacherCodeField.getText().equals("Valid Class Code")) && objects.RegisterPasswordField.getText().equals(objects.ConfirmPasswordField.getText())){
                   objects.FirstNameField.setEnabled(false);
                   objects.MiddleNameField.setEnabled(false);
                   objects.LastNameField.setEnabled(false);
                   objects.RegisterPasswordField.setEnabled(false);
                   objects.ConfirmPasswordField.setEnabled(false);
                   objects.TeacherCodeField.setEnabled(false);
                   objects.Grade.setEnabled(false);
                   objects.UsernameLabel.setVisible(true);
                   objects.ConfirmUsernameLabel.setVisible(true);
                   objects.UsernameUsernameLabel.setVisible(true);
                   objects.ConfirmUsernameField.setVisible(true);
                   objects.UsernameUsernameLabel.setText(objects.LastNameField.getText().substring(0, 1) + objects.FirstNameField.getText().substring(0, 1) + objects.MiddleNameField.getText().substring(0, 1) + (AnthroLog.UserDigits + 1));
                   objects.RegisterButton.setText("Finish");
                   objects.register = 2;
               }
        }
        
        public static void fileNotFound(){
                   objects.UserNameFieldCorrect.setVisible(true);                   
        }
        
        public static void settings(){
                    if(objects.SettingsList.getSelectedIndex() == 0){
                       
                       objects.AccountInfoFirstNameField.setText(AnthroLog.FirstName);
                       objects.AccountInfoMiddleNameField.setText(AnthroLog.MiddleName);
                       objects.AccountInfoLastNameField.setText(AnthroLog.LastName);
                       objects.AccountInfoRegisterPasswordField.setText(null);
                       objects.AccountInfoConfirmPasswordField.setText(null);        
                       objects.AccountInfoRegisterOldPasswordField.setText(null);
                       objects.AccountInfoConfirmOldPasswordField.setText(null);
                       objects.AccountInfoChangePassword.setSelected(false);
                       objects.AccountInfoGrade.setSelectedItem(AnthroLog.Grade);
                       objects.AccountInfoTeacherCodeField.setText(AnthroLog.ClassCode);
                       objects.AccountInfoTeacherCodeField.setEditable(false);
                       
                       objects.AccountInfoRegisterLabel.setVisible(true);
                       objects.AccountInfoFirstNameField.setVisible(true);
                       objects.AccountInfoLastNameField.setVisible(true);
                       objects.AccountInfoRegisterPasswordField.setVisible(true);
                       objects.AccountInfoConfirmPasswordField.setVisible(true);
                       objects.AccountInfoRegisterOldPasswordField.setVisible(true);
                       objects.AccountInfoConfirmOldPasswordField.setVisible(true);
                       objects.AccountInfoTeacherCodeField.setVisible(true);
                       objects.AccountInfoGrade.setVisible(true);
                       objects.AccountInfoFirstNameLabel.setVisible(true);
                       objects.AccountInfoLastNameLabel.setVisible(true);
                       objects.AccountInfoRegisterPasswordLabel.setVisible(true);
                       objects.AccountInfoConfirmPasswordLabel.setVisible(true);
                       objects.AccountInfoRegisterOldPasswordLabel.setVisible(true);
                       objects.AccountInfoConfirmOldPasswordLabel.setVisible(true);
                       objects.AccountInfoTeacherCodeLabel.setVisible(true);
                       objects.AccountInfoGradeLabel.setVisible(true);
                       objects.AccountInfoRegisterButton.setVisible(true);
                       objects.AccountInfoMiddleNameLabel.setVisible(true);
                       objects.AccountInfoMiddleNameField.setVisible(true);
                       objects.AccountInfoRegisterCancelButton.setVisible(true);
                       objects.AccountInfoChangePassword.setVisible(true);
                       
                       objects.SectionsLabel.setVisible(false);
                       objects.SectionsSpinner.setVisible(false);
                       objects.CompletedLabel.setVisible(false);
                       objects.QuizGradeLabel.setVisible(false);
                       objects.QuizAttemptsLabel.setVisible(false);
                       objects.LengthSpentLabel.setVisible(false);
                       objects.ViewQuizButton.setVisible(false);
                       objects.EnterButton.setVisible(false);
                       objects.Completed.setVisible(false);
                       objects.QuizGrade.setVisible(false);
                       objects.QuizAttempts.setVisible(false);
                       objects.LengthSpent.setVisible(false);
                       objects.LongIDButton.setVisible(false);
                       objects.SkullIDButton.setVisible(false);
                       objects.ImpIDButton.setVisible(false);
                       objects.AgeIDButton.setVisible(false);
                       objects.RaceIDButton.setVisible(false);
                       objects.SexIDButton.setVisible(false);
                       objects.StatIDButton.setVisible(false);
                       objects.TSDButton.setVisible(false);
                       objects.LessonsLabel.setVisible(false);
                       objects.PCOButton.setVisible(false);
                    }
                    if(objects.SettingsList.getSelectedIndex() == 1){
                       objects.Description.setVisible(true);
                       objects.Description2.setVisible(true);
                       objects.UserNameLabel.setVisible(true);
                       objects.UserNameField.setVisible(true);
                       objects.UserNameField.setText(null);
                       objects.PasswordLabel.setVisible(true);
                       objects.PasswordField.setVisible(true);
                       objects.PasswordField.setText(null);
                       objects.Register.setVisible(true);
                       objects.Start.setVisible(true);
                       objects.LogoLabel.setVisible(true);
                       objects.LogoLabel2.setVisible(true);
                       
                      
                       objects.AccountBoxLabel.setVisible(false);
                       objects.AccountGradeLabel.setVisible(false);
                       objects.AccountCurrentLabel.setVisible(false);
                       objects.AccountNextLabel.setVisible(false);
                       objects.NameLabel.setVisible(false);
                       objects.ProggressBar.setVisible(false);
                       objects.TeacherNameLabel.setVisible(false);
                       objects.ProggressLabel.setVisible(false);
                       objects.LongIDButton.setVisible(false);
                       objects.SkullIDButton.setVisible(false);
                       objects.ImpIDButton.setVisible(false);
                       objects.AgeIDButton.setVisible(false);
                       objects.RaceIDButton.setVisible(false);
                       objects.SexIDButton.setVisible(false);
                       objects.StatIDButton.setVisible(false);
                       objects.TSDButton.setVisible(false);
                       objects.LessonsLabel.setVisible(false);
                       objects.PCOButton.setVisible(false);
                       objects.SettingsLabel.setVisible(false);
                       objects.SettingsList.setVisible(false);
                       objects.SettingsButton.setVisible(false);
                       objects.AccountInfoRegisterLabel.setVisible(false);
                       objects.AccountInfoFirstNameField.setVisible(false);
                       objects.AccountInfoLastNameField.setVisible(false);
                       objects.AccountInfoRegisterPasswordField.setVisible(false);
                       objects.AccountInfoConfirmPasswordField.setVisible(false);
                       objects.AccountInfoRegisterOldPasswordField.setVisible(false);
                       objects.AccountInfoConfirmOldPasswordField.setVisible(false);
                       objects.AccountInfoTeacherCodeField.setVisible(false);
                       objects.AccountInfoGrade.setVisible(false);
                       objects.AccountInfoFirstNameLabel.setVisible(false);
                       objects.AccountInfoLastNameLabel.setVisible(false);
                       objects.AccountInfoRegisterPasswordLabel.setVisible(false);
                       objects.AccountInfoConfirmPasswordLabel.setVisible(false);
                       objects.AccountInfoRegisterOldPasswordLabel.setVisible(false);
                       objects.AccountInfoConfirmOldPasswordLabel.setVisible(false);
                       objects.AccountInfoTeacherCodeLabel.setVisible(false);
                       objects.AccountInfoGradeLabel.setVisible(false);
                       objects.AccountInfoRegisterButton.setVisible(false);
                       objects.AccountInfoMiddleNameLabel.setVisible(false);
                       objects.AccountInfoMiddleNameField.setVisible(false);
                       objects.AccountInfoRegisterCancelButton.setVisible(false);
                       objects.AccountInfoChangePassword.setVisible(false);
                       
                       objects.SectionsLabel.setVisible(false);
                       objects.SectionsSpinner.setVisible(false);
                       objects.CompletedLabel.setVisible(false);
                       objects.QuizGradeLabel.setVisible(false);
                       objects.QuizAttemptsLabel.setVisible(false);
                       objects.LengthSpentLabel.setVisible(false);
                       objects.ViewQuizButton.setVisible(false);
                       objects.EnterButton.setVisible(false);
                       objects.Completed.setVisible(false);
                       objects.QuizGrade.setVisible(false);
                       objects.QuizAttempts.setVisible(false);
                       objects.LengthSpent.setVisible(false);
                    }
                    if(objects.SettingsList.getSelectedIndex() == 2){
                        //TODO: Resources
                    }
                    if(objects.SettingsList.getSelectedIndex() == 3){
                        //TODO: Help
                    }
            
        }
        
        public static void accountInfoSave(){
                   objects.OldPasswordFieldCorrect.setVisible(false);
                   objects.ConfirmOldPasswordFieldCorrect.setVisible(false);
                   objects.NewPasswordFieldCorrect.setVisible(false);
                   objects.ConfirmNewPasswordFieldCorrect.setVisible(false);
                   AnthroLog.FirstName = objects.AccountInfoFirstNameField.getText();
                   AnthroLog.MiddleName = objects.AccountInfoMiddleNameField.getText();
                   AnthroLog.LastName = objects.AccountInfoLastNameField.getText();
                   AnthroLog.Grade = (String) objects.AccountInfoGrade.getSelectedItem();
                   if(objects.AccountInfoChangePassword.isSelected() && objects.AccountInfoRegisterOldPasswordField.getText().equals(AnthroLog.Password) && objects.AccountInfoRegisterOldPasswordField.getText().equals(objects.AccountInfoConfirmOldPasswordField.getText()) && objects.AccountInfoRegisterPasswordField.getText().equals(objects.AccountInfoConfirmPasswordField.getText())){
                       AnthroLog.Password = objects.AccountInfoRegisterPasswordField.getText();
                       try {
                            AnthroSave.Save();
                        } catch (Exception ex) {
                            Logger.getLogger(AnthroLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }


                       objects.AccountGradeLabel.setText("Grade: " + AnthroLog.Grade);                   
                       String holder;
                       if(AnthroLog.FirstName.length() + AnthroLog.MiddleName.length() + AnthroLog.LastName.length() <= 22){
                       holder = "<html><p align=\"center\"><b>" + AnthroLog.FirstName + " " + AnthroLog.MiddleName + " " + AnthroLog.LastName + "</p></html>";
                       }else{
                       holder = "<html><p align=\"center\"><b>" + AnthroLog.FirstName + " " + AnthroLog.LastName + "</p></html>";    
                       }
                       objects.NameLabel.setText(holder);
                       accountInfoCancel();
                   }else if(!objects.AccountInfoChangePassword.isSelected()){
                       try {
                            AnthroSave.Save();
                        } catch (Exception ex) {
                            Logger.getLogger(AnthroLogin.class.getName()).log(Level.SEVERE, null, ex);
                        }


                       objects.AccountGradeLabel.setText("Grade: " + AnthroLog.Grade);                   
                       String holder;
                       if(AnthroLog.FirstName.length() + AnthroLog.MiddleName.length() + AnthroLog.LastName.length() <= 22){
                       holder = "<html><p align=\"center\"><b>" + AnthroLog.FirstName + " " + AnthroLog.MiddleName + " " + AnthroLog.LastName + "</p></html>";
                       }else{
                       holder = "<html><p align=\"center\"><b>" + AnthroLog.FirstName + " " + AnthroLog.LastName + "</p></html>";    
                       }
                       objects.NameLabel.setText(holder);
                       accountInfoCancel();
                   }else{
                       if(!objects.AccountInfoRegisterOldPasswordField.getText().equals(AnthroLog.Password)){
                                objects.OldPasswordFieldCorrect.setVisible(true);
                                objects.ConfirmOldPasswordFieldCorrect.setVisible(true);
                       }else if(!objects.AccountInfoRegisterOldPasswordField.getText().equals(objects.AccountInfoConfirmOldPasswordField.getText())){
                                objects.ConfirmOldPasswordFieldCorrect.setVisible(true);
                       }
                       if(!objects.AccountInfoRegisterPasswordField.getText().equals(objects.AccountInfoConfirmPasswordField.getText()) || objects.AccountInfoRegisterPasswordField.getText().equals("")){
                                objects.NewPasswordFieldCorrect.setVisible(true);
                                objects.ConfirmNewPasswordFieldCorrect.setVisible(true);
                       }
                       
                   }
        }
        
        public static void accountInfoCancel(){
            
               objects.AccountInfoFirstNameField.setText(AnthroLog.FirstName);
               objects.AccountInfoMiddleNameField.setText(AnthroLog.MiddleName);
               objects.AccountInfoLastNameField.setText(AnthroLog.LastName);
               objects.AccountInfoRegisterPasswordField.setText(null);
               objects.AccountInfoConfirmPasswordField.setText(null);
               objects.AccountInfoRegisterOldPasswordField.setText(null);
               objects.AccountInfoConfirmOldPasswordField.setText(null);
               objects.AccountInfoTeacherCodeField.setText(AnthroLog.ClassCode);
               objects.AccountInfoGrade.setSelectedItem(AnthroLog.Grade);
               objects.AccountInfoChangePassword.setSelected(false);
               objects.AccountInfoRegisterPasswordField.setEnabled(false);
               objects.AccountInfoConfirmPasswordField.setEnabled(false);
               objects.AccountInfoRegisterOldPasswordField.setEnabled(false);
               objects.AccountInfoConfirmOldPasswordField.setEnabled(false);

               objects.OldPasswordFieldCorrect.setVisible(false);
               objects.ConfirmOldPasswordFieldCorrect.setVisible(false);
               objects.NewPasswordFieldCorrect.setVisible(false);
               objects.ConfirmNewPasswordFieldCorrect.setVisible(false);
               
               objects.AccountInfoRegisterLabel.setVisible(false);
               objects.AccountInfoFirstNameField.setVisible(false);
               objects.AccountInfoLastNameField.setVisible(false);
               objects.AccountInfoRegisterPasswordField.setVisible(false);
               objects.AccountInfoConfirmPasswordField.setVisible(false);
               objects.AccountInfoRegisterOldPasswordField.setVisible(false);
               objects.AccountInfoConfirmOldPasswordField.setVisible(false);
               objects.AccountInfoTeacherCodeField.setVisible(false);
               objects.AccountInfoGrade.setVisible(false);
               objects.AccountInfoFirstNameLabel.setVisible(false);
               objects.AccountInfoLastNameLabel.setVisible(false);
               objects.AccountInfoRegisterPasswordLabel.setVisible(false);
               objects.AccountInfoConfirmPasswordLabel.setVisible(false);
               objects.AccountInfoRegisterOldPasswordLabel.setVisible(false);
               objects.AccountInfoConfirmOldPasswordLabel.setVisible(false);
               objects.AccountInfoTeacherCodeLabel.setVisible(false);
               objects.AccountInfoGradeLabel.setVisible(false);
               objects.AccountInfoRegisterButton.setVisible(false);
               objects.AccountInfoMiddleNameLabel.setVisible(false);
               objects.AccountInfoMiddleNameField.setVisible(false);
               objects.AccountInfoRegisterCancelButton.setVisible(false);
               objects.AccountInfoChangePassword.setVisible(false);


               objects.LongIDButton.setVisible(true);
               objects.SkullIDButton.setVisible(true);
               objects.ImpIDButton.setVisible(true);
               objects.AgeIDButton.setVisible(true);
               objects.RaceIDButton.setVisible(true);
               objects.SexIDButton.setVisible(true);
               objects.StatIDButton.setVisible(true);
               objects.TSDButton.setVisible(true);
               objects.LessonsLabel.setVisible(true);
               objects.PCOButton.setVisible(true);
        }
        
}