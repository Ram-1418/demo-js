
1. Write a java program to design a following GUI. Use appropriate Layout and 
Components. 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginForm extends JFrame {
 
 private Container c;
 private JLabel lblUser;
 private JTextField txtUser;
 private JLabel lblPass;
 private JPasswordField txtPass;
 private JButton btnLogin;
 private JButton btnReset;
 public LoginForm() {
 
 setTitle("Login");
 setBounds(300, 90, 400, 200); 
 setDefaultCloseOperation(EXIT_ON_CLOSE);
 setResizable(false);
 c = getContentPane();
 c.setLayout(null);
 
 lblUser = new JLabel("Username:");
 lblUser.setFont(new Font("Arial", Font.PLAIN, 14));
 lblUser.setBounds(50, 30, 100, 30);
 c.add(lblUser);
 
 txtUser = new JTextField();
 txtUser.setFont(new Font("Arial", Font.PLAIN, 14));
 txtUser.setBounds(150, 30, 150, 30);
 c.add(txtUser);
 
 lblPass = new JLabel("Password:");
 lblPass.setFont(new Font("Arial", Font.PLAIN, 14));
 lblPass.setBounds(50, 70, 100, 30);
 c.add(lblPass);
 
 txtPass = new JPasswordField();
 txtPass.setFont(new Font("Arial", Font.PLAIN, 14));
 txtPass.setBounds(150, 70, 150, 30);
 c.add(txtPass);
 
 btnLogin = new JButton("Login");
 btnLogin.setFont(new Font("Arial", Font.PLAIN, 14));
 btnLogin.setBounds(70, 120, 100, 30);
 
 c.add(btnLogin);
 
 btnReset = new JButton("Reset");
 btnReset.setFont(new Font("Arial", Font.PLAIN, 14));
 btnReset.setBounds(200, 120, 100, 30);
 
 c.add(btnReset);
 
 setVisible(true);
 }
 
 
 public static void main(String[] args) {
 new LoginForm();
 }
}
2. Write a java program to design a following GUI. Use appropriate Layout and 
Components.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VForm extends JFrame{
 
 JTextField tName;
 JCheckBox cDose1, cDose2;
 JRadioButton rCovishield, rCovaxin, rSputnik;
 JButton bSubmit;
 JTextArea taOutput;
 public VForm() {
 
 setTitle("Vaccination Details");
 setSize(500, 400);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(null); 
 
 JLabel lName = new JLabel("Name:");
 lName.setBounds(50, 30, 100, 30);
 add(lName);
 tName = new JTextField();
 tName.setBounds(150, 30, 200, 30);
 add(tName);
 
 JLabel lDose = new JLabel("Dose:");
 lDose.setBounds(50, 80, 100, 30);
 add(lDose);
 cDose1 = new JCheckBox("1st Dose");
 cDose1.setBounds(150, 80, 100, 30);
 add(cDose1);
 cDose2 = new JCheckBox("2nd Dose");
 cDose2.setBounds(250, 80, 100, 30);
 add(cDose2);
 
 JLabel lVaccine = new JLabel("Vaccine:");
 lVaccine.setBounds(50, 130, 100, 30);
 add(lVaccine);
 rCovishield = new JRadioButton("Covishield");
 rCovishield.setBounds(150, 130, 100, 30);
 add(rCovishield);
 rCovaxin = new JRadioButton("Covaxin");
 rCovaxin.setBounds(250, 130, 100, 30);
 add(rCovaxin);
 rSputnik = new JRadioButton("Sputnik V");
 rSputnik.setBounds(350, 130, 100, 30);
 add(rSputnik);
 ButtonGroup bg = new ButtonGroup();
 bg.add(rCovishield);
 bg.add(rCovaxin);
 bg.add(rSputnik);
 
 bSubmit = new JButton("Submit");
 bSubmit.setBounds(150, 180, 100, 30);
 
 add(bSubmit);
 
 taOutput = new JTextArea();
 taOutput.setBounds(50, 230, 400, 100);
 taOutput.setEditable(false);
 add(taOutput);
 setVisible(true);
 }
 public static void main(String[] args) {
 new VForm();
 }
}
3. Write a program to design following GUI using JTextArea. Write a code to display 
number of words and characters of text in JLabel. Use JScrollPane to get scrollbars for 
JTextArea.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class WordCharCount extends JFrame implements ActionListener{
 
 JTextArea ta;
 JLabel lWordCount, lCharCount;
 JButton bCount;
 public WordCharCount() {
 
 setTitle("Count words and characters");
 setSize(400, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setLayout(null); 
 
 lWordCount = new JLabel("Words: 0");
 lWordCount.setBounds(50, 20, 100, 30);
 add(lWordCount);
 lCharCount = new JLabel("Characters: 0");
 lCharCount.setBounds(200, 20, 150, 30);
 add(lCharCount);
 
 ta = new JTextArea();
 JScrollPane sp = new JScrollPane(ta); 
 sp.setBounds(50, 60, 300, 120);
 add(sp);
 
 bCount = new JButton("Count Words");
 bCount.setBounds(140, 200, 120, 30);
 bCount.addActionListener(this);
 add(bCount);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
 
 String text = ta.getText();
 int charCount = text.length();
 String[] words = text.trim().split("\\s+"); 
 int wordCount = (text.trim().isEmpty()) ? 0 : words.length;
 
 lWordCount.setText("Words: " + wordCount);
 lCharCount.setText("Characters: " + charCount);
 }
 public static void main(String[] args) {
 new WordCharCount();
 }
}
4. Write a Program to design following GUI by using swing component JComboBox. On 
click of show button display the selected language on JLabel.
import javax.swing.*;
import java.awt.event.*;
public class ComboBoxExample {
 public static void main(String[] args) {
 
 JFrame f = new JFrame("ComboBox Example");
 
 JLabel label = new JLabel("Programming language Selected: ");
 label.setBounds(50, 50, 300, 20);
 
 String[] languages = { "C", "C++", "C#", "Java", "PHP" };
 JComboBox<String> comboBox = new JComboBox<>(languages);
 comboBox.setBounds(50, 100, 90, 20);
 
 JButton showButton = new JButton("Show");
 showButton.setBounds(150, 100, 90, 20);
 
 showButton.addActionListener(new ActionListener() {
 public void actionPerformed(ActionEvent e) {
 
 String selectedLang = (String) comboBox.getSelectedItem();
 
 label.setText("Programming language Selected: " + selectedLang);
 }
 });
 
 f.add(label);
 f.add(comboBox);
 f.add(showButton);
 
 f.setSize(400, 200);
 f.setLayout(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
5. Write a java program to create the following GUI using Swing components.
import javax.swing.*;
import java.awt.*;
public class CalculatorGUI {
 public static void main(String[] args) {
 
 JFrame f = new JFrame("Calculator");
 
 JTextField display = new JTextField();
 display.setBounds(30, 30, 240, 30);
 display.setHorizontalAlignment(JTextField.RIGHT);
 JPanel panel = new JPanel();
 panel.setBounds(30, 80, 240, 200);
 panel.setLayout(new GridLayout(4, 4, 10, 10));
 
 String[] buttonLabels = {
 "7", "8", "9", "/", 
 "4", "5", "6", "*", 
 "1", "2", "3", "-", 
 "0", ".", "=", "+"
 };
 JButton[] buttons = new JButton[16];
 for (int i = 0; i < 16; i++) {
 buttons[i] = new JButton(buttonLabels[i]);
 panel.add(buttons[i]);
 }
 JButton clearButton = new JButton("Clear");
 clearButton.setBounds(30, 300, 240, 40);
 f.add(display);
 f.add(panel);
 f.add(clearButton);
 f.setSize(320, 400);
 f.setLayout(null);
 f.setVisible(true);
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }
}
6. Implement event handling for SET A 1. Verify username and password in 3 attempts. 
Display dialog box "Login successful" on success or display "Username or Password is in 
correct". After 3 attempts display "Login Failed". On reset button clear the fields of text 
box.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LoginForm1 extends JFrame implements ActionListener {
 
 private JTextField userField;
 private JPasswordField passField;
 private JButton loginBtn, resetBtn;
 
 private final String user = "admin";
 private final String pass = "123";
 public LoginForm1() {
 setTitle("Login");
 setLayout(new GridLayout(3, 2));
 JLabel userLabel = new JLabel("Username:");
 userField = new JTextField(15);
 JLabel passLabel = new JLabel("Password:");
 passField = new JPasswordField(15);
 
 loginBtn = new JButton("Login");
 resetBtn = new JButton("Reset");
 
 loginBtn.addActionListener(this);
 resetBtn.addActionListener(this);
 
 add(userLabel);
 add(userField);
 add(passLabel);
 add(passField);
 add(loginBtn);
 add(resetBtn);
 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(300, 150);
 setVisible(true);
 }
 
 public void actionPerformed(ActionEvent e) {
 
 if (e.getSource() == loginBtn) {
 String username = userField.getText();
 String password = String.valueOf(passField.getPassword());
 
 if (username.equals(user) && password.equals(pass)) {
 JOptionPane.showMessageDialog(this, "Login Successful");
 } else {
 
 JOptionPane.showMessageDialog(this, "Login Failed");
 
 
 }
 }
 
 if (e.getSource() == resetBtn) {
 userField.setText("");
 passField.setText("");
 }
 }
 public static void main(String[] args) {
 
 new LoginForm1();
 }
}
7. Implement event handling for SET A 2. Display selected Name, Vaccine. If 1st Dose is 
taken then write Yes otherwise write No.
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class VaccinationForm1 extends JFrame implements ActionListener {
 
 private JTextField nameField;
 private JCheckBox firstDoseCheckBox, secondDoseCheckBox;
 private JRadioButton covishieldRadio, covaxinRadio, sputnikRadio;
 private JButton submitButton;
 private JTextArea resultArea;
 
 public VaccinationForm1() {
 setTitle("Vaccination Details");
 setLayout(new GridLayout(6, 2));
 
 JLabel nameLabel = new JLabel("Name:");
 nameField = new JTextField(15);
 
 firstDoseCheckBox = new JCheckBox("1st Dose");
 secondDoseCheckBox = new JCheckBox("2nd Dose");
 
 covishieldRadio = new JRadioButton("Covishield");
 covaxinRadio = new JRadioButton("Covaxin");
 sputnikRadio = new JRadioButton("Sputnik V");
 
 ButtonGroup vaccineGroup = new ButtonGroup();
 vaccineGroup.add(covishieldRadio);
 vaccineGroup.add(covaxinRadio);
 vaccineGroup.add(sputnikRadio);
 
 submitButton = new JButton("Submit");
 submitButton.addActionListener(this);
 
 resultArea = new JTextArea(3, 30);
 resultArea.setEditable(false);
 
 add(nameLabel);
 add(nameField);
 add(firstDoseCheckBox);
 add(secondDoseCheckBox);
 add(covishieldRadio);
 add(covaxinRadio);
 add(sputnikRadio);
 add(submitButton);
 add(new JLabel("")); 
 add(resultArea);
 
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400, 300);
 setVisible(true);
 }
 
 public void actionPerformed(ActionEvent e) {
 if (e.getSource() == submitButton) {
 String name = nameField.getText();
 String vaccine = "";
 String firstDose = firstDoseCheckBox.isSelected() ? "Yes" : "No";
 String secondDose = secondDoseCheckBox.isSelected() ? "Yes" : "No";
 if (covishieldRadio.isSelected()) {
 vaccine = "Covishield";
 } else if (covaxinRadio.isSelected()) {
 vaccine = "Covaxin";
 } else if (sputnikRadio.isSelected()) {
 vaccine = "Sputnik V";
 }
 
 resultArea.setText("Name: " + name + "\n" +
 "1st Dose: " + firstDose + "\n" +
 "2nd Dose: " + secondDose + "\n" +
 "Vaccine: " + vaccine);
 }
 }
 public static void main(String[] args) {
 new VaccinationForm1();
 }
}
8. Write a program to implement MouseListener.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerExample extends JFrame implements MouseListener {
 private JPanel panel;
 private JLabel label;
.
 public MouseListenerExample() {
 .
 setTitle("MouseListener Example");
 setSize(400, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 .
 panel = new JPanel();
 label = new JLabel("Perform mouse actions on the panel");
 .
 panel.addMouseListener(this);
 
 .
 panel.add(label);
 .
 add(panel);
 setVisible(true);
 }
 
 public void mouseClicked(MouseEvent e) {
 label.setText("Mouse Clicked at X: " + e.getX() + " Y: " + e.getY());
 }
 public void mousePressed(MouseEvent e) {
 label.setText("Mouse Pressed at X: " + e.getX() + " Y: " + e.getY());
 }
 public void mouseReleased(MouseEvent e) {
 label.setText("Mouse Released at X: " + e.getX() + " Y: " + e.getY());
 }
 public void mouseEntered(MouseEvent e) {
 label.setText("Mouse Entered the Panel");
 }
 public void mouseExited(MouseEvent e) {
 label.setText("Mouse Exited the Panel");
 }
 public static void main(String[] args) {
 new MouseListenerExample();
 }
}
9. Write a program to implement KeyListener.
import javax.swing.*;
import java.awt.event.*;
public class KeyListenerExample extends JFrame implements KeyListener {
 private JTextArea textArea;
 private JLabel label;
 public KeyListenerExample() {
 setTitle("KeyListener Example");
 setSize(400, 300);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 textArea = new JTextArea();
 label = new JLabel("Type something...");
 
 textArea.addKeyListener(this);
 
 add(textArea, "Center");
 add(label, "South");
 setVisible(true);
 }
 public void keyTyped(KeyEvent e) {
 label.setText("Key Typed: " + e.getKeyChar());
 }
 public void keyPressed(KeyEvent e) {
 label.setText("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
 }
 public void keyReleased(KeyEvent e) {
 label.setText("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
 }
 public static void main(String[] args) {
 new KeyListenerExample();
 }
}
