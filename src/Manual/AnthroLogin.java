package Manual;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.SpinnerListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class AnthroLogin extends javax.swing.JFrame {
    
    private static javax.swing.JPanel Panel;
    public static javax.swing.JPanel Panel2;
    public static javax.swing.JLabel SkullLogo;
    public static javax.swing.JLabel SkullLogo2;
    public static javax.swing.JButton Start;
    public static javax.swing.JButton Register;
    public static javax.swing.JLabel TitleLabel;
    public static javax.swing.JTextField UserNameField;
    public static javax.swing.JLabel UserNameLabel;    
    public static javax.swing.JPasswordField PasswordField;
    public static javax.swing.JLabel PasswordLabel;
    public static javax.swing.JLabel Description;
    public static javax.swing.JLabel Description2;
    public static javax.swing.JLabel LogoLabel;
    public static javax.swing.JLabel LogoLabel2;
    public static javax.swing.JLabel RegisterLabel;
    public static javax.swing.JTextField FirstNameField;
    public static javax.swing.JTextField LastNameField;
    public static javax.swing.JTextField TeacherCodeField;
    public static javax.swing.JPasswordField RegisterPasswordField;
    public static javax.swing.JPasswordField ConfirmPasswordField; 
    public static javax.swing.JComboBox Grade;    
    public static javax.swing.JLabel FirstNameLabel;
    public static javax.swing.JLabel LastNameLabel;
    public static javax.swing.JLabel TeacherCodeLabel;
    public static javax.swing.JLabel RegisterPasswordLabel;
    public static javax.swing.JLabel ConfirmPasswordLabel;
    public static javax.swing.JLabel GradeLabel;
    public static javax.swing.JButton RegisterButton;
    public static javax.swing.JLabel UsernameLabel;
    public static javax.swing.JLabel ConfirmUsernameLabel;
    public static javax.swing.JTextField MiddleNameField;
    public static javax.swing.JLabel MiddleNameLabel;
    public static javax.swing.JButton RegisterCancelButton;
    public static javax.swing.JTextField ConfirmUsernameField;
    public static javax.swing.JLabel UsernameUsernameLabel;
    public static javax.swing.JLabel AccountInfoRegisterLabel;
    public static javax.swing.JTextField AccountInfoFirstNameField;
    public static javax.swing.JTextField AccountInfoLastNameField;
    public static javax.swing.JTextField AccountInfoTeacherCodeField;
    public static javax.swing.JPasswordField AccountInfoRegisterPasswordField;
    public static javax.swing.JPasswordField AccountInfoConfirmPasswordField;
    public static javax.swing.JPasswordField AccountInfoRegisterOldPasswordField;
    public static javax.swing.JPasswordField AccountInfoConfirmOldPasswordField; 
    public static javax.swing.JComboBox AccountInfoGrade;    
    public static javax.swing.JLabel AccountInfoFirstNameLabel;
    public static javax.swing.JLabel AccountInfoLastNameLabel;
    public static javax.swing.JLabel AccountInfoTeacherCodeLabel;
    public static javax.swing.JLabel AccountInfoRegisterPasswordLabel;
    public static javax.swing.JLabel AccountInfoConfirmPasswordLabel;
    public static javax.swing.JLabel AccountInfoRegisterOldPasswordLabel;
    public static javax.swing.JLabel AccountInfoConfirmOldPasswordLabel;
    public static javax.swing.JLabel AccountInfoGradeLabel;
    public static javax.swing.JButton AccountInfoRegisterButton;
    public static javax.swing.JTextField AccountInfoMiddleNameField;
    public static javax.swing.JLabel AccountInfoMiddleNameLabel;
    public static javax.swing.JButton AccountInfoRegisterCancelButton;
    public static javax.swing.JLabel NameLabel;
    public static javax.swing.JButton LongIDButton;
    public static javax.swing.JButton SkullIDButton;
    public static javax.swing.JButton ImpIDButton;
    public static javax.swing.JButton AgeIDButton;
    public static javax.swing.JButton RaceIDButton;
    public static javax.swing.JButton SexIDButton;
    public static javax.swing.JButton StatIDButton;
    public static javax.swing.JButton TSDButton;
    public static javax.swing.JButton PCOButton;
    public static javax.swing.JLabel AccountBoxLabel;
    public static javax.swing.JLabel TeacherNameLabel;
    public static javax.swing.JLabel AccountGradeLabel;
    public static javax.swing.JLabel AccountCurrentLabel;
    public static javax.swing.JLabel AccountNextLabel;
    public static javax.swing.JCheckBox AccountInfoChangePassword;
    public static javax.swing.JLabel ProggressLabel;
    public static javax.swing.JLabel LessonsLabel;
    public static javax.swing.JProgressBar ProggressBar;
    public static javax.swing.JLabel SectionsLabel;
    public static javax.swing.JSpinner SectionsSpinner;
    public static javax.swing.JLabel CompletedLabel;
    public static javax.swing.JLabel QuizGradeLabel;
    public static javax.swing.JLabel QuizAttemptsLabel;
    public static javax.swing.JLabel LengthSpentLabel;
    public static javax.swing.JLabel Completed;
    public static javax.swing.JLabel QuizGrade;
    public static javax.swing.JLabel QuizAttempts;
    public static javax.swing.JLabel LengthSpent;
    public static javax.swing.JButton ViewQuizButton;
    public static javax.swing.JButton EnterButton;
    public static javax.swing.JLabel SettingsLabel;
    public static javax.swing.JList SettingsList;
    public static javax.swing.JButton SettingsButton;
    public static javax.swing.JLabel UserNameFieldCorrect;
    public static javax.swing.JLabel PasswordFieldCorrect;
    public static javax.swing.JLabel NewPasswordFieldCorrect;
    public static javax.swing.JLabel OldPasswordFieldCorrect;
    public static javax.swing.JLabel ConfirmNewPasswordFieldCorrect;
    public static javax.swing.JLabel ConfirmOldPasswordFieldCorrect;
    private AnthroMethods methods;
    private AnthroButtons buttons;
    public static int register = 1;
    Toolkit tk = Toolkit.getDefaultToolkit();
    int xSize = ((int) tk.getScreenSize().getWidth());  
    int ySize = ((int) tk.getScreenSize().getHeight());
        
    public AnthroLogin() {
        setTitle("The Forensic Identification Manual");
        setResizable(false);        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Pics/SkullLogo2.png")));
        AnthroFileRead.main();
        initComponents();
        int xWindow = getWidth();
        int yWindow = getHeight();
        setLocation(((xSize/2) - xWindow/2),((ySize/2) - yWindow/2));
    }

    private void initComponents() {

        Panel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        SkullLogo = new javax.swing.JLabel();
        SkullLogo2 = new javax.swing.JLabel();
        Panel2 = new javax.swing.JPanel();
        Start = new javax.swing.JButton();
        Register = new javax.swing.JButton();
        UserNameField = new javax.swing.JTextField();
        UserNameLabel = new javax.swing.JLabel();        
        PasswordField = new javax.swing.JPasswordField();
        PasswordLabel = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();        
        Description2 = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();        
        LogoLabel2 = new javax.swing.JLabel();
        RegisterLabel = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        RegisterPasswordField = new javax.swing.JPasswordField();
        TeacherCodeField = new javax.swing.JTextField();
        ConfirmPasswordField = new javax.swing.JPasswordField();        
        Grade = new javax.swing.JComboBox<>(); 
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        RegisterPasswordLabel = new javax.swing.JLabel();
        ConfirmPasswordLabel = new javax.swing.JLabel();
        TeacherCodeLabel = new javax.swing.JLabel();
        GradeLabel = new javax.swing.JLabel();
        RegisterButton = new javax.swing.JButton();        
        UsernameLabel = new javax.swing.JLabel();
        ConfirmUsernameLabel = new javax.swing.JLabel();
        MiddleNameField = new javax.swing.JTextField();
        MiddleNameLabel = new javax.swing.JLabel();
        RegisterCancelButton = new javax.swing.JButton();
        UsernameUsernameLabel = new javax.swing.JLabel();
        ConfirmUsernameField = new javax.swing.JTextField();
        AccountInfoRegisterLabel = new javax.swing.JLabel();
        AccountInfoFirstNameField = new javax.swing.JTextField();
        AccountInfoLastNameField = new javax.swing.JTextField();
        AccountInfoRegisterPasswordField = new javax.swing.JPasswordField();
        AccountInfoRegisterOldPasswordField = new javax.swing.JPasswordField();
        AccountInfoTeacherCodeField = new javax.swing.JTextField();
        AccountInfoConfirmPasswordField = new javax.swing.JPasswordField();
        AccountInfoConfirmOldPasswordField = new javax.swing.JPasswordField();        
        AccountInfoGrade = new javax.swing.JComboBox<>(); 
        AccountInfoFirstNameLabel = new javax.swing.JLabel();
        AccountInfoChangePassword = new javax.swing.JCheckBox();
        AccountInfoLastNameLabel = new javax.swing.JLabel();
        AccountInfoRegisterPasswordLabel = new javax.swing.JLabel();
        AccountInfoConfirmPasswordLabel = new javax.swing.JLabel();
        AccountInfoRegisterOldPasswordLabel = new javax.swing.JLabel();
        AccountInfoConfirmOldPasswordLabel = new javax.swing.JLabel();
        AccountInfoTeacherCodeLabel = new javax.swing.JLabel();
        AccountInfoGradeLabel = new javax.swing.JLabel();
        AccountInfoRegisterButton = new javax.swing.JButton(); 
        AccountInfoMiddleNameField = new javax.swing.JTextField();
        AccountInfoMiddleNameLabel = new javax.swing.JLabel();
        AccountInfoRegisterCancelButton = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        LongIDButton = new javax.swing.JButton();
        SkullIDButton = new javax.swing.JButton();
        ImpIDButton = new javax.swing.JButton();
        AgeIDButton = new javax.swing.JButton();
        RaceIDButton = new javax.swing.JButton();
        SexIDButton = new javax.swing.JButton();
        StatIDButton = new javax.swing.JButton();
        TSDButton = new javax.swing.JButton();
        PCOButton = new javax.swing.JButton();
        AccountBoxLabel = new javax.swing.JLabel();
        TeacherNameLabel = new javax.swing.JLabel();
        AccountGradeLabel = new javax.swing.JLabel();
        AccountCurrentLabel = new javax.swing.JLabel();
        AccountNextLabel = new javax.swing.JLabel();
        ProggressLabel = new javax.swing.JLabel();
        LessonsLabel = new javax.swing.JLabel();
        ProggressBar = new javax.swing.JProgressBar();
        methods = new AnthroMethods();
        buttons = new AnthroButtons();
        SectionsLabel = new javax.swing.JLabel();
        SpinnerListModel model = new SpinnerListModel(methods.displayLessons(AnthroLog.current));
        SectionsSpinner = new javax.swing.JSpinner(model);
        CompletedLabel = new javax.swing.JLabel();
        QuizGradeLabel = new javax.swing.JLabel();
        QuizAttemptsLabel = new javax.swing.JLabel();
        LengthSpentLabel = new javax.swing.JLabel();
        Completed = new javax.swing.JLabel();
        QuizGrade = new javax.swing.JLabel();
        QuizAttempts = new javax.swing.JLabel();
        LengthSpent = new javax.swing.JLabel();
        ViewQuizButton = new javax.swing.JButton();
        EnterButton = new javax.swing.JButton();       
        SettingsLabel = new javax.swing.JLabel();
        SettingsButton = new javax.swing.JButton();
        String[] settingsList = {"Account Info", "Logout", "Rescource Material", "Help"};
        SettingsList = new javax.swing.JList<>(settingsList);
        UserNameFieldCorrect  = new javax.swing.JLabel();
        PasswordFieldCorrect = new javax.swing.JLabel();
        
        OldPasswordFieldCorrect = new javax.swing.JLabel();
        NewPasswordFieldCorrect = new javax.swing.JLabel();
        ConfirmOldPasswordFieldCorrect = new javax.swing.JLabel();
        ConfirmNewPasswordFieldCorrect = new javax.swing.JLabel();
        
                
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(102, 102, 102));
        Panel.setPreferredSize(new java.awt.Dimension(771, 154));

        TitleLabel.setFont(new java.awt.Font("Old English Text MT", 0, 55)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("<html><p align=\"center\">The Forensic Identification<br>Manual</p></html>");
        
        SkullLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkullLogo2.png"))); // NOI18N

        SkullLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkullLogo.png"))); // NOI18N

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(150, 150, 150)
                        .addGap(139, 139, 139)
                        .addGap(82, 82, 82))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addComponent(SkullLogo)
                        .addComponent(TitleLabel)
                        .addComponent(SkullLogo2))))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleLabel)
                    .addComponent(SkullLogo2)
                    .addComponent(SkullLogo))
                .addGap(18, 18, 18)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Panel2.setBackground(new java.awt.Color(153, 153, 153));
        Panel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        UserNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        UserNameLabel.setText("Username:");
        
        Description.setFont(new java.awt.Font("Parchment", 0, 80));
        Description.setText("Login");
        
        RegisterLabel.setFont(new java.awt.Font("Parchment", 0, 80));
        RegisterLabel.setText("Register");
        RegisterLabel.setVisible(false);
        
        Description2.setFont(new java.awt.Font("Old English Text MT", 0, 14));
        Description2.setText("<html><p align=\"center\"><font size=\"5\">Welcome</font>, <br>This interactive manual will provide you with the<br>basic knowledge to forensically identify human remains. You will<br>learn how to identify bones that are essential to the process, access<br>an approximate time since death, and any imperfection in the remains that<br>may be essential to the identification. To start simply register for<br>your account and begin on your way to becoming a forensic<br> expert. If you already have an account enter your username and<br>password to continue your journey as a forensic anthropologist.</p></html>");
        
        PasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        PasswordLabel.setText("Password:");
        
        UserNameField.setFont(new java.awt.Font("Times New Roman", 0, 12));
        
        PasswordField.setFont(new java.awt.Font("Times New Roman", 0, 12));
        
        LogoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkeletonLogo.png"))); // NOI18N
        LogoLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/SkeletonLogo.png"))); // NOI18N
        
        Grade.setFont(new java.awt.Font("Times New Roman", 0, 12));
        Grade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12"}));
        
        FirstNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        FirstNameLabel.setText("First Name:");
        
        LastNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        LastNameLabel.setText("Last Name:");
        
        RegisterPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        RegisterPasswordLabel.setText("Password:");
        
        ConfirmPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        ConfirmPasswordLabel.setText("Confirm Password:");
        
        TeacherCodeLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        TeacherCodeLabel.setText("Class Code:");
        
        GradeLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        GradeLabel.setText("Grade:");
               
        FirstNameField.setText("Student First Name");
        MiddleNameField.setText("Student Middle Name");
        LastNameField.setText("Student Last Name");
        RegisterPasswordField.setText("Password");
        ConfirmPasswordField.setText("Password");
        TeacherCodeField.setText("Valid Class Code");
        ConfirmUsernameField.setText("Re-Enter Username");
        
        FirstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                
                FirstNameField.selectAll();
                
            }
        });
        MiddleNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                MiddleNameField.selectAll();
            }
        });
        LastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastNameField.selectAll();
            }
        });
        RegisterPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                RegisterPasswordField.selectAll();
            }
        });
        ConfirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ConfirmPasswordField.selectAll();
            }
        });
        TeacherCodeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TeacherCodeField.selectAll();
            }
        });        
        
        FirstNameField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        MiddleNameField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        LastNameField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        RegisterPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        ConfirmPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        TeacherCodeField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        ConfirmUsernameField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        
        FirstNameField.setVisible(false);
        MiddleNameField.setVisible(false);
        LastNameField.setVisible(false);
        RegisterPasswordField.setVisible(false);
        ConfirmPasswordField.setVisible(false);
        TeacherCodeField.setVisible(false);
        Grade.setVisible(false);
        FirstNameLabel.setVisible(false);
        LastNameLabel.setVisible(false);
        RegisterPasswordLabel.setVisible(false);
        ConfirmPasswordLabel.setVisible(false);
        TeacherCodeLabel.setVisible(false);
        GradeLabel.setVisible(false);
        ConfirmUsernameField.setVisible(false);
        
        PasswordField.addKeyListener
        (new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    buttons.Login();
                }
            }
        });
        
        Start.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Start.setText("Login");
        Start.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   
               buttons.Login();
            }
        });
        
        AccountInfoRegisterCancelButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        AccountInfoRegisterCancelButton.setText("Login");
        AccountInfoRegisterCancelButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   
               buttons.accountInfoCancel();
            }
        });
        
        Register.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Register.setText("Register");
        Register.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   
                
            
               PasswordFieldCorrect.setVisible(false);
               UserNameFieldCorrect.setVisible(false);
                
               Description.setVisible(false);
               Description2.setVisible(false);
               UserNameLabel.setVisible(false);
               UserNameField.setVisible(false);
               PasswordLabel.setVisible(false);
               PasswordField.setVisible(false);
               Register.setVisible(false);
               Start.setVisible(false);
               RegisterLabel.setVisible(true);
               FirstNameField.setVisible(true);
               LastNameField.setVisible(true);
               RegisterPasswordField.setVisible(true);
               ConfirmPasswordField.setVisible(true);
               TeacherCodeField.setVisible(true);
               Grade.setVisible(true);
               FirstNameLabel.setVisible(true);
               LastNameLabel.setVisible(true);
               RegisterPasswordLabel.setVisible(true);
               ConfirmPasswordLabel.setVisible(true);
               TeacherCodeLabel.setVisible(true);
               GradeLabel.setVisible(true);
               RegisterButton.setVisible(true);
               MiddleNameLabel.setVisible(true);
               MiddleNameField.setVisible(true);
               RegisterCancelButton.setVisible(true);
            }
        });
                        
        RegisterButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        RegisterButton.setText("Submit");
        RegisterButton.setVisible(false);
        RegisterButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   
                buttons.Register();
            }
        });
        
        RegisterCancelButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        RegisterCancelButton.setText("Cancel");
        RegisterCancelButton.setVisible(false);
        RegisterCancelButton.addActionListener(new ActionListener() {
            
            
            public void actionPerformed(ActionEvent e)
            {   
               FirstNameField.setText("Student First Name");
               MiddleNameField.setText("Student Middle Name");
               LastNameField.setText("Student Last Name");
               RegisterPasswordField.setText("Password");
               ConfirmPasswordField.setText("Password");
               TeacherCodeField.setText("Valid Class Code");
               ConfirmUsernameField.setText("Re-Enter Username");

               FirstNameField.setVisible(false);
               MiddleNameField.setVisible(false);
               LastNameField.setVisible(false);
               RegisterPasswordField.setVisible(false);
               ConfirmPasswordField.setVisible(false);
               TeacherCodeField.setVisible(false);
               Grade.setVisible(false);
               FirstNameLabel.setVisible(false);
               LastNameLabel.setVisible(false);
               RegisterPasswordLabel.setVisible(false);
               ConfirmPasswordLabel.setVisible(false);
               TeacherCodeLabel.setVisible(false);
               GradeLabel.setVisible(false);  
               RegisterLabel.setVisible(false);
               RegisterButton.setVisible(false);
               RegisterCancelButton.setVisible(false);               
               UsernameLabel.setVisible(false);
               ConfirmUsernameLabel.setVisible(false);
               MiddleNameLabel.setVisible(false);
               UsernameUsernameLabel.setVisible(false);
               ConfirmUsernameField.setVisible(false);
               
               FirstNameField.setEnabled(true);
               MiddleNameField.setEnabled(true);
               LastNameField.setEnabled(true);
               RegisterPasswordField.setEnabled(true);
               ConfirmPasswordField.setEnabled(true);
               TeacherCodeField.setEnabled(true);
               Grade.setEnabled(true);
               
               Description.setVisible(true);
               Description2.setVisible(true);
               UserNameLabel.setVisible(true);
               UserNameField.setVisible(true);
               PasswordLabel.setVisible(true);
               PasswordField.setVisible(true);
               Register.setVisible(true);
               Start.setVisible(true);
               
               RegisterButton.setText("Submit");
            }
        });
        
        ConfirmUsernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        ConfirmUsernameLabel.setText("Confirm Username:");
        ConfirmUsernameLabel.setVisible(false);
        
        UsernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        UsernameLabel.setText("Username:");
        UsernameLabel.setVisible(false);
        
        UsernameUsernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        UsernameUsernameLabel.setForeground(java.awt.Color.DARK_GRAY);
        UsernameUsernameLabel.setVisible(false);
        
        MiddleNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        MiddleNameLabel.setText("Middle Name:");
        MiddleNameLabel.setVisible(false);
        
        AccountBoxLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Box.png")));
        AccountBoxLabel.setVisible(false);
        
        LongIDButton.setText("Identification of Long bones");
        LongIDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        LongIDButton.setVisible(false);
        LongIDButton.addActionListener(new ActionListener() {
                       
            public void actionPerformed(ActionEvent e)
            {   
               buttons.LongIDButton();
            }
        });
        
        SectionsSpinner.addChangeListener(new ChangeListener() {
            
            public void stateChanged(ChangeEvent e) 
            {  
               AnthroLog.section = methods.identifyLesson((String)SectionsSpinner.getValue());
               ViewQuizButton.setEnabled(methods.quizCompleted(AnthroLog.current, AnthroLog.section));
               if(AnthroLog.current >= AnthroLog.section){
                    EnterButton.setEnabled(true);
               }else{
                    EnterButton.setEnabled(false);
               }
            }
   
        });
        
        SkullIDButton.setText("Identification of Skull");
        SkullIDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        SkullIDButton.setVisible(false);
        SkullIDButton.setEnabled(false);
        
        ImpIDButton.setText("Identification of Important bones");
        ImpIDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        ImpIDButton.setVisible(false);
        ImpIDButton.setEnabled(false);
        
        AgeIDButton.setText("Identification of Age");
        AgeIDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AgeIDButton.setVisible(false);
        AgeIDButton.setEnabled(false);
        
        RaceIDButton.setText("Identification of Race");
        RaceIDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        RaceIDButton.setVisible(false);
        RaceIDButton.setEnabled(false);
        
        SexIDButton.setText("Identification of Sex");
        SexIDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        SexIDButton.setVisible(false);
        SexIDButton.setEnabled(false);
        
        TSDButton.setText("Time Since Death");
        TSDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        TSDButton.setVisible(false);
        TSDButton.setEnabled(false);
        
        PCOButton.setText("Processing, Cataloging, and Organizing");
        PCOButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        PCOButton.setVisible(false);
        PCOButton.setEnabled(false);
        
        StatIDButton.setText("Identification of Stature");
        StatIDButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        StatIDButton.setVisible(false);
        StatIDButton.setEnabled(false);     
                       
        TeacherNameLabel.setText("Teacher: Mark Popovich");
        TeacherNameLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 14));
        TeacherNameLabel.setVisible(false);
        
        AccountGradeLabel.setText("Grade: " + AnthroLog.Grade);
        AccountGradeLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 14));
        AccountGradeLabel.setVisible(false);
        
        AccountCurrentLabel.setText("Current: " + methods.findCurrent(AnthroLog.current));
        AccountCurrentLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 14));
        AccountCurrentLabel.setVisible(false);
        
        AccountNextLabel.setText("Next: " + methods.findNext(AnthroLog.current));
        AccountNextLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 14));
        AccountNextLabel.setVisible(false);
        
        LessonsLabel.setText("<html><p><b><u><font FACE=\"Old English Text MT\" size=\"7\">L</font>essons");
        LessonsLabel.setFont(new java.awt.Font("Parchment", 0, 52));
        LessonsLabel.setVisible(false);
        
        ProggressLabel.setText("<html><p><u>Progress");
        ProggressLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 14));
        ProggressLabel.setVisible(false);
        
        ProggressBar.setMaximum(10);
        ProggressBar.setVisible(false);
        ProggressBar.setToolTipText(methods.progress(AnthroLog.current));
        
        SectionsLabel.setText("<html><p><b><u><font FACE=\"Old English Text MT\" size=\"7\">S</font>ections");
        SectionsLabel.setFont(new java.awt.Font("Parchment", 0, 52));
        SectionsLabel.setVisible(false);
        
        SectionsSpinner.setVisible(false);
        SectionsSpinner.setFont(new java.awt.Font("Times New Roman", 0, 12));
        ((DefaultEditor) SectionsSpinner.getEditor()).getTextField().setEditable(false);
        
        CompletedLabel.setText("<html><b>Completed: ");
        CompletedLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        CompletedLabel.setVisible(false);
        
        QuizGradeLabel.setText("<html><b>Quiz Grade: ");
        QuizGradeLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        QuizGradeLabel.setVisible(false);
        
        QuizAttemptsLabel.setText("<html><b>Quiz Attempts: ");
        QuizAttemptsLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        QuizAttemptsLabel.setVisible(false);
        
        LengthSpentLabel.setText("<html><b>Length Spent: ");
        LengthSpentLabel.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        LengthSpentLabel.setVisible(false);
        
        ViewQuizButton.setText("View Quiz");
        ViewQuizButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        ViewQuizButton.setVisible(false);
        ViewQuizButton.setEnabled(methods.quizCompleted(AnthroLog.current, AnthroLog.section));
        
        EnterButton.setText("Enter");
        EnterButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        EnterButton.setVisible(false);
        
        EnterButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e)
            {   
                
            }
        });
        
        SettingsLabel.setText("<html><p><b><u><font FACE=\"Old English Text MT\" size=\"7\">S</font>ettings <font FACE=\"Old English Text MT\" size=\"5\">&</font> <font FACE=\"Old English Text MT\" size=\"7\">R</font>escources</p></html>");
        SettingsLabel.setFont(new java.awt.Font("Parchment", 0, 40));
        SettingsLabel.setVisible(false);
        
        SettingsList.setFont(new java.awt.Font("Times New Roman", 0, 12));
        SettingsList.setBackground(new java.awt.Color(102, 102, 102));
        SettingsList.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        SettingsList.setVisible(false);
        
        SettingsButton.setText("Go");
        SettingsButton.setBackground(new java.awt.Color(133,133,133));
        SettingsButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        SettingsButton.setVisible(false);
              
        QuizAttempts.setText("0");
        QuizAttempts.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        QuizAttempts.setVisible(false);
        
        Completed.setText("Not Started");
        Completed.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        Completed.setVisible(false);
        
        LengthSpent.setText("0 Hours 0 Minutes");
        LengthSpent.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        LengthSpent.setVisible(false);
        
        QuizGrade.setText("Not Accessible");
        QuizGrade.setFont(new java.awt.Font("Viner Hand ITC", 0, 12));
        QuizGrade.setVisible(false);
        
        UserNameFieldCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Invalid.png")));
        UserNameFieldCorrect.setForeground(Color.red);        
        UserNameFieldCorrect.setFont(new java.awt.Font("Times New Roman", 0, 12));
        UserNameFieldCorrect.setText("Invalid");
        UserNameFieldCorrect.setVisible(false);
        
        PasswordFieldCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Invalid.png"))); 
        PasswordFieldCorrect.setForeground(Color.red);        
        PasswordFieldCorrect.setFont(new java.awt.Font("Times New Roman", 0, 12));       
        PasswordFieldCorrect.setText("Invalid");
        PasswordFieldCorrect.setVisible(false);
        
        OldPasswordFieldCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Invalid.png")));
        OldPasswordFieldCorrect.setVisible(false);
        
        ConfirmOldPasswordFieldCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Invalid.png")));
        ConfirmOldPasswordFieldCorrect.setVisible(false);
        
        ConfirmNewPasswordFieldCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Invalid.png")));
        ConfirmNewPasswordFieldCorrect.setVisible(false);
        
        NewPasswordFieldCorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Invalid.png")));
        NewPasswordFieldCorrect.setVisible(false);
        
        SettingsButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e)
            {   
                buttons.settings();
            }
        });
        
        AccountInfoRegisterButton.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e)
            {   
                buttons.accountInfoSave();
            }
        });
        
        AccountInfoChangePassword.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e)
            {   
                if(AccountInfoChangePassword.isSelected()){
                    AccountInfoRegisterPasswordField.setEnabled(true);
                    AccountInfoConfirmPasswordField.setEnabled(true);
                    AccountInfoRegisterOldPasswordField.setEnabled(true);
                    AccountInfoConfirmOldPasswordField.setEnabled(true);
                }else{
                    AccountInfoRegisterPasswordField.setEnabled(false);
                    AccountInfoConfirmPasswordField.setEnabled(false);
                    AccountInfoRegisterOldPasswordField.setEnabled(false);
                    AccountInfoConfirmOldPasswordField.setEnabled(false);
                }
            }
        });
        
        AccountInfoRegisterPasswordField.setEnabled(false);
        AccountInfoConfirmPasswordField.setEnabled(false);
        AccountInfoRegisterOldPasswordField.setEnabled(false);
        AccountInfoConfirmOldPasswordField.setEnabled(false);
        
        AccountInfoRegisterLabel.setText("<html><p><font FACE=\"Old English Text MT\" size=\"7\">A</font>ccount <font FACE=\"Old English Text MT\" size=\"7\">I</font>nfo</p></html>");
        AccountInfoRegisterLabel.setFont(new java.awt.Font("Parchment", 0, 95));
        
        AccountInfoGrade.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "9", "10", "11", "12"}));
        
        AccountInfoFirstNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoFirstNameLabel.setText("First Name:");
        
        AccountInfoLastNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoLastNameLabel.setText("Last Name:");
        
        AccountInfoRegisterPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoRegisterPasswordLabel.setText("New Password:");
        
        AccountInfoConfirmPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoConfirmPasswordLabel.setText("Confirm New Password:");
        
        AccountInfoRegisterOldPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoRegisterOldPasswordLabel.setText("Old Password:");
        
        AccountInfoConfirmOldPasswordLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoConfirmOldPasswordLabel.setText("Confirm Old Password:");
        
        AccountInfoChangePassword.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoChangePassword.setText("Change Password");
        AccountInfoChangePassword.setSelected(false);
        
        AccountInfoTeacherCodeLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoTeacherCodeLabel.setText("Class Code:");
        
        AccountInfoGradeLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoGradeLabel.setText("Grade:");
        
        AccountInfoRegisterButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoRegisterButton.setText("Save");
        
        AccountInfoRegisterCancelButton.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoRegisterCancelButton.setText("Cancel");
               
        AccountInfoFirstNameField.setText("Student First Name");
        AccountInfoMiddleNameField.setText("Student Middle Name");
        AccountInfoLastNameField.setText("Student Last Name");
        AccountInfoRegisterPasswordField.setText(null);
        AccountInfoConfirmPasswordField.setText(null);        
        AccountInfoRegisterOldPasswordField.setText(null);
        AccountInfoConfirmOldPasswordField.setText(null);
        AccountInfoTeacherCodeField.setText("Valid Class Code");
        
        AccountInfoFirstNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                
                AccountInfoFirstNameField.selectAll();
                
            }
        });
        AccountInfoMiddleNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountInfoMiddleNameField.selectAll();
            }
        });
        AccountInfoLastNameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountInfoLastNameField.selectAll();
            }
        });
        AccountInfoRegisterPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountInfoRegisterPasswordField.selectAll();
            }
        });
        AccountInfoConfirmPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountInfoConfirmPasswordField.selectAll();
            }
        });
        
        AccountInfoRegisterOldPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountInfoRegisterOldPasswordField.selectAll();
            }
        });
        AccountInfoConfirmOldPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountInfoConfirmOldPasswordField.selectAll();
            }
        });
        AccountInfoTeacherCodeField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AccountInfoTeacherCodeField.selectAll();
            }
        });
        
        AccountInfoMiddleNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 12));
        AccountInfoMiddleNameLabel.setText("Middle Name:");
        AccountInfoMiddleNameLabel.setVisible(false);
        
        AccountInfoFirstNameField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        AccountInfoMiddleNameField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        AccountInfoLastNameField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        AccountInfoRegisterPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        AccountInfoConfirmPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        AccountInfoRegisterOldPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        AccountInfoConfirmOldPasswordField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        AccountInfoTeacherCodeField.setFont(new java.awt.Font("Times New Roman", 0, 11));
        
        AccountInfoRegisterLabel.setVisible(false);
        AccountInfoFirstNameField.setVisible(false);
        AccountInfoMiddleNameField.setVisible(false);
        AccountInfoLastNameField.setVisible(false);
        AccountInfoRegisterPasswordField.setVisible(false);
        AccountInfoConfirmOldPasswordField.setVisible(false);
        AccountInfoRegisterOldPasswordField.setVisible(false);
        AccountInfoConfirmPasswordField.setVisible(false);
        AccountInfoTeacherCodeField.setVisible(false);
        AccountInfoGrade.setVisible(false);
        AccountInfoFirstNameLabel.setVisible(false);
        AccountInfoLastNameLabel.setVisible(false);
        AccountInfoRegisterPasswordLabel.setVisible(false);
        AccountInfoConfirmPasswordLabel.setVisible(false);
        AccountInfoRegisterOldPasswordLabel.setVisible(false);
        AccountInfoConfirmOldPasswordLabel.setVisible(false);
        AccountInfoChangePassword.setVisible(false);
        AccountInfoTeacherCodeLabel.setVisible(false);
        AccountInfoGradeLabel.setVisible(false);
        AccountInfoRegisterButton.setVisible(false);
        AccountInfoRegisterCancelButton.setVisible(false);
                
        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
                Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(Start)
                .addContainerGap(0, Short.MAX_VALUE))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(400, 400, 400)
                    .addComponent(Register)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(480, 480, 480)
                    .addComponent(UserNameFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(305, 305, 305)
                    .addComponent(UserNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(480, 480, 480)
                    .addComponent(PasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(305, 305, 305)
                    .addComponent(PasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(330, 330, 330)
                    .addComponent(Description)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(Description2)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(LogoLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(600, 600, 600)
                    .addComponent(LogoLabel2)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(RegisterLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(MiddleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(Grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(RegisterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(TeacherCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(303, 303, 303)
                    .addComponent(FirstNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addComponent(MiddleNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(305, 305, 305)
                    .addComponent(LastNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(328, 328, 328)
                    .addComponent(GradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(RegisterPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(ConfirmPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(303, 303, 303)
                    .addComponent(TeacherCodeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(320, 320, 320)
                    .addComponent(RegisterButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(267, 267, 267)
                    .addComponent(ConfirmUsernameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(303, 303, 303)
                    .addComponent(UsernameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(400, 400, 400)
                    .addComponent(RegisterCancelButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(ConfirmUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(UsernameUsernameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))    
                
                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(425, 425, 425)
                    .addComponent(AccountInfoRegisterLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(AccountInfoFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(AccountInfoMiddleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(AccountInfoLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(AccountInfoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(580, 580, 580)
                    .addComponent(AccountInfoChangePassword)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(625, 625, 625)
                    .addComponent(AccountInfoRegisterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(625, 625, 625)
                    .addComponent(AccountInfoConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(740, 740, 740)
                    .addComponent(ConfirmNewPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(740, 740, 740)
                    .addComponent(ConfirmOldPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(740, 740, 740)
                    .addComponent(NewPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(740, 740, 740)
                    .addComponent(OldPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(625, 625, 625)
                    .addComponent(AccountInfoRegisterOldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(625, 625, 625)
                    .addComponent(AccountInfoConfirmOldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(365, 365, 365)
                    .addComponent(AccountInfoTeacherCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(303, 303, 303)
                    .addComponent(AccountInfoFirstNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addComponent(AccountInfoMiddleNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(305, 305, 305)
                    .addComponent(AccountInfoLastNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(328, 328, 328)
                    .addComponent(AccountInfoGradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(545, 545, 545)
                    .addComponent(AccountInfoRegisterPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(502, 502, 502)
                    .addComponent(AccountInfoConfirmPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(545, 545, 545)
                    .addComponent(AccountInfoRegisterOldPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(502, 502, 502)
                    .addComponent(AccountInfoConfirmOldPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(303, 303, 303)
                    .addComponent(AccountInfoTeacherCodeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(408, 408, 408)
                    .addComponent(AccountInfoRegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(577, 577, 577)
                    .addComponent(AccountInfoRegisterCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(NameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(LongIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(SkullIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(ImpIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(AgeIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(RaceIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(SexIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(StatIDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(TSDButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(PCOButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))   
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(570, 570, 570)
                    .addComponent(SectionsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))    
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(530, 530, 530)
                    .addComponent(SectionsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))   
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(TeacherNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(ProggressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(AccountGradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(ProggressLabel)
                    .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(AccountCurrentLabel)
                    .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(AccountNextLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))   
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(315, 315, 315)
                    .addComponent(LessonsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))   
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(530, 530, 530)
                    .addComponent(CompletedLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(530, 530, 530)
                    .addComponent(QuizGradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(530, 530, 530)
                    .addComponent(QuizAttemptsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(530, 530, 530)
                    .addComponent(LengthSpentLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))        
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(650, 650, 650)
                    .addComponent(Completed)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(650, 650, 650)
                    .addComponent(QuizGrade)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(650, 650, 650)
                    .addComponent(QuizAttempts)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(650, 650, 650)
                    .addComponent(LengthSpent)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(555, 555, 555)
                    .addComponent(ViewQuizButton)
                    .addContainerGap(0, Short.MAX_VALUE)))                     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(SettingsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(SettingsList)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(SettingsButton)
                    .addContainerGap(0, Short.MAX_VALUE)))         
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(645, 645, 645)
                    .addComponent(EnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                  
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AccountBoxLabel)))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(Start)
                .addContainerGap(0, Short.MAX_VALUE))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(Register)
                .addGap(200, 200, 200)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(128, 128, 128)
                    .addComponent(UserNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(UserNameFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(PasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(PasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(Description)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(Description2)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(LogoLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(LogoLabel2)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(RegisterLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(MiddleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(160, 160, 160)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(Grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(RegisterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(ConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(280, 280, 280)
                    .addComponent(TeacherCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(108, 108, 108)
                    .addComponent(FirstNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(MiddleNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(LastNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(198, 198, 198)
                    .addComponent(GradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(228, 228, 228)
                    .addComponent(RegisterPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(ConfirmPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(288, 288, 288)
                    .addComponent(TeacherCodeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(RegisterButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(390, 390, 390)
                    .addComponent(ConfirmUsernameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(350, 350, 350)
                    .addComponent(UsernameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(RegisterCancelButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(385, 385, 385)
                    .addComponent(ConfirmUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(350, 350, 350)
                    .addComponent(UsernameUsernameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))          
                
                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(AccountInfoRegisterLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(AccountInfoFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(AccountInfoMiddleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(AccountInfoLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(AccountInfoGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(AccountInfoChangePassword)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(AccountInfoRegisterPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(AccountInfoConfirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(ConfirmNewPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(ConfirmOldPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(200, 200, 200)
                    .addComponent(NewPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(OldPasswordFieldCorrect)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(AccountInfoRegisterOldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(AccountInfoConfirmOldPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(AccountInfoTeacherCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))                             
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(AccountInfoFirstNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(AccountInfoMiddleNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(178, 178, 178)
                    .addComponent(AccountInfoLastNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(AccountInfoGradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(208, 208, 208)
                    .addComponent(AccountInfoRegisterPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addComponent(AccountInfoConfirmPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(118, 118, 118)
                    .addComponent(AccountInfoRegisterOldPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(148, 148, 148)
                    .addComponent(AccountInfoConfirmOldPasswordLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(238, 238, 238)
                    .addComponent(AccountInfoTeacherCodeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(AccountInfoRegisterButton)
                    .addContainerGap(0, Short.MAX_VALUE)))    
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(310, 310, 310)
                    .addComponent(AccountInfoRegisterCancelButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(NameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(LongIDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(SkullIDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(ImpIDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(AgeIDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(210, 210, 210)
                    .addComponent(RaceIDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(250, 250, 250)
                    .addComponent(SexIDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(290, 290, 290)
                    .addComponent(StatIDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(330, 330, 330)
                    .addComponent(TSDButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(370, 370, 370)
                    .addComponent(PCOButton)
                    .addContainerGap(0, Short.MAX_VALUE)))   
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(SectionsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(SectionsSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))  
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(TeacherNameLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(ProggressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(AccountGradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(AccountCurrentLabel)
                    .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(ProggressLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))  
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(AccountNextLabel)
                    .addContainerGap(0, Short.MAX_VALUE))) 
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(LessonsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))   
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(CompletedLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(QuizGradeLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(QuizAttemptsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(260, 260, 260)
                    .addComponent(LengthSpentLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))      
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(Completed)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(QuizGrade)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(220, 220, 220)
                    .addComponent(QuizAttempts)
                    .addContainerGap(0, Short.MAX_VALUE)))       
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(260, 260, 260)
                    .addComponent(LengthSpent)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(ViewQuizButton)
                    .addContainerGap(0, Short.MAX_VALUE)))                     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(190, 190, 190)
                    .addComponent(SettingsLabel)
                    .addContainerGap(0, Short.MAX_VALUE)))     
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(240, 240, 240)
                    .addComponent(SettingsList)
                    .addContainerGap(0, Short.MAX_VALUE)))      
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(320, 320, 320)
                    .addComponent(SettingsButton)
                    .addContainerGap(0, Short.MAX_VALUE)))  
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(300, 300, 300)
                    .addComponent(EnterButton)
                    .addContainerGap(0, Short.MAX_VALUE)))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(AccountBoxLabel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnthroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnthroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnthroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnthroLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnthroLogin().setVisible(true);
            }
        });
    }
}