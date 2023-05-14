package cout.sngtech.test.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import cout.sngtech.test.controller.MainFrame;
import cout.sngtech.test.controller.services.account.LoginManager;
import cout.sngtech.test.controller.services.account.StaffLoginService;
import cout.sngtech.test.controller.users.Staff;
import cout.sngtech.test.data.events.Account;

public class StaffLoginPage extends JPanel {

	private static final long serialVersionUID = -8491961504452424864L;
	
	private JTextField emailInputField;
	private JTextField passwordInputField;
	
	public StaffLoginPage(MainFrame main) {
		this.setSize(new Dimension(MainFrame.WIDTH, MainFrame.HEIGHT));
		setLayout(null);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(285, 274, 61, 16);
		add(lblPassword);
		
		emailInputField = new JTextField();
		emailInputField.setBounds(358, 229, 213, 22);
		add(emailInputField);
		emailInputField.setColumns(10);
		
		passwordInputField = new JTextField();
		passwordInputField.setBounds(358, 272, 213, 22);
		add(passwordInputField);
		passwordInputField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(313, 231, 33, 16);
		add(lblEmail);
		
		
		JLabel lblNewLabel_1 = new JLabel("Login Page");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(409, 164, 120, 22);
		add(lblNewLabel_1);
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorMessage.setForeground(Color.RED);
		lblErrorMessage.setBounds(342, 313, 235, 16);
		lblErrorMessage.setVisible(false);
		add(lblErrorMessage);

		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Account account = new Account("", emailInputField.getText(), passwordInputField.getText());
				Staff student = new Staff(main.getEventController(), account);
				LoginManager loginSrv = new LoginManager(student);
				boolean loginStatus = loginSrv.login(new StaffLoginService());
				if(loginStatus) {
					loginSrv.sendUserToController(main.getEventController());
					lblErrorMessage.setVisible(false);
					main.getPageManager().showPage(PagesList.STAFF_PAGE);
				}
				else  {
					lblErrorMessage.setText("Wrong staff email or password!");
					lblErrorMessage.setVisible(true);
					emailInputField.setText("");
					passwordInputField.setText("");
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLogin.setBounds(412, 343, 97, 25);
		add(btnLogin);
	}
}
