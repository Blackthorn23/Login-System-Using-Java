import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    private JLabel lblUser, lblPwd, lblStatus;
    private JTextField txtUser;
    private JPasswordField txtPwd;
    private JButton btnEnter;

    public Login() {
        // Set up frame
        setTitle("Login System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Username components
        JPanel userPanel = new JPanel();
        lblUser = new JLabel("Username:");
        txtUser = new JTextField(15);
        userPanel.add(lblUser);
        userPanel.add(txtUser);

        // Password components
        JPanel pwdPanel = new JPanel();
        lblPwd = new JLabel("Password:");
        txtPwd = new JPasswordField(15);
        pwdPanel.add(lblPwd);
        pwdPanel.add(txtPwd);

        // Button
        btnEnter = new JButton("Login");
        btnEnter.addActionListener(this);

        // Status label
        lblStatus = new JLabel("Please enter login details", SwingConstants.CENTER);
        lblStatus.setFont(new Font("Arial", Font.BOLD, 16));

        // Adding components
        add(userPanel);
        add(pwdPanel);
        add(btnEnter);
        add(lblStatus);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String username = txtUser.getText();
        String password = new String(txtPwd.getPassword());

        if (username.equals("multimedia") && password.equals("multimedia123")) {
            lblStatus.setText("Access Granted");
            lblStatus.setForeground(Color.GREEN);
        } else {
            lblStatus.setText("Access Denied");
            lblStatus.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
