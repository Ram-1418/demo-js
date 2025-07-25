import javax.swing.*;

public class RegistrationForm extends JFrame {

    RegistrationForm() {
        setLayout(null);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(30, 30, 80, 25);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 30, 150, 25);
        add(nameField);

        // Email
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 70, 80, 25);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(120, 70, 150, 25);
        add(emailField);

        // Contact Number
        JLabel contactLabel = new JLabel("Contact:");
        contactLabel.setBounds(30, 110, 80, 25);
        add(contactLabel);

        JTextField contactField = new JTextField();
        contactField.setBounds(120, 110, 150, 25);
        add(contactField);

        // Password
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 150, 80, 25);
        add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 150, 150, 25);
        add(passField);

        // Year (Radio Buttons)
        JLabel yearLabel = new JLabel("Year:");
        yearLabel.setBounds(30, 190, 80, 25);
        add(yearLabel);

        JRadioButton fy = new JRadioButton("FY");
        fy.setBounds(120, 190, 50, 25);
        add(fy);

        JRadioButton sy = new JRadioButton("SY");
        sy.setBounds(180, 190, 50, 25);
        add(sy);

        JRadioButton ty = new JRadioButton("TY");
        ty.setBounds(240, 190, 50, 25);
        add(ty);

        // Group radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(fy);
        group.add(sy);
        group.add(ty);

        // Checkbox
        JCheckBox agreeBox = new JCheckBox("I agree to the Terms & Conditions");
        agreeBox.setBounds(30, 230, 250, 25);
        add(agreeBox);

        // Submit Button
        JButton submitButton = new JButton("Register");
        submitButton.setBounds(100, 270, 100, 30);
        add(submitButton);

        // Frame settings
        setTitle("Student Registration");
        setSize(350, 370);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
