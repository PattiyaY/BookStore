package BookStoreApp_Fullversion;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldLastName;
	private JTextField textFieldEmail;
	private JTextField textFieldAddress;
	private JTextField textFieldPhoneNumber;
	private JPasswordField passwordField;
	private Customer login = new Customer();

	/**
	 * Create the frame.
	 */
	public Signup(BookStore customer) {
		
		// set Frame
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 750);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(232, 232, 255));
		
		JLabel labelHeader = new JLabel("Sign Up");
		labelHeader.setForeground(new Color(255, 255, 255));
		labelHeader.setFont(new Font("Avenir", Font.PLAIN, 24));
		
		// Name
		JLabel labelName = new JLabel("Name");
		labelName.setFont(new Font("Avenir", Font.PLAIN, 20));
		labelName.setForeground(new Color(192, 192, 192));
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("Avenir", Font.PLAIN, 20));
		textFieldName.setColumns(10);
		
		JLabel watermarkName = new JLabel("Type your name");
		watermarkName.setFont(new Font("Avenir", Font.PLAIN, 20));
		watermarkName.setForeground(Color.LIGHT_GRAY);
		textFieldName.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		textFieldName.add(watermarkName);
		textFieldName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            	watermarkName.setVisible(false);
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (textFieldName.getText().isEmpty()) {
                	watermarkName.setVisible(true);
                }
            }
        });
		
		// Last Name
		JLabel labelLastName = new JLabel("Last Name");
		labelLastName.setFont(new Font("Avenir", Font.PLAIN, 20));
		labelLastName.setForeground(new Color(192, 192, 192));
		textFieldLastName = new JTextField();
		textFieldLastName.setFont(new Font("Avenir", Font.PLAIN, 20));
		textFieldLastName.setColumns(10);
		
		JLabel watermarkLastName = new JLabel("Type your last name");
		watermarkLastName.setFont(new Font("Avenir", Font.PLAIN, 20));
		watermarkLastName.setForeground(Color.LIGHT_GRAY);
		textFieldLastName.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		textFieldLastName.add(watermarkLastName);
		textFieldLastName.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            	watermarkLastName.setVisible(false);
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (textFieldLastName.getText().isEmpty()) {
                	watermarkLastName.setVisible(true);
                }
            }
        });
		
		//Email
		JLabel labelEmail = new JLabel("Email");
		labelEmail.setFont(new Font("Avenir", Font.PLAIN, 20));
		labelEmail.setForeground(new Color(192, 192, 192));
		textFieldEmail = new JTextField();
		textFieldEmail.setFont(new Font("Avenir", Font.PLAIN, 20));
		textFieldEmail.setColumns(10);
		
		JLabel watermarkEmail = new JLabel("Type your email");
		watermarkEmail.setFont(new Font("Avenir", Font.PLAIN, 20));
        watermarkEmail.setForeground(Color.LIGHT_GRAY);
        textFieldEmail.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        textFieldEmail.add(watermarkEmail);
        textFieldEmail.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                watermarkEmail.setVisible(false);
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (textFieldEmail.getText().isEmpty()) {
                    watermarkEmail.setVisible(true);
                }
            }
        });
		
		//Password
		JLabel labelPassword = new JLabel("Password");
		labelPassword.setFont(new Font("Avenir", Font.PLAIN, 20));
		labelPassword.setForeground(new Color(192, 192, 192));
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Avenir", Font.PLAIN, 20));
		
		JLabel watermarkPassword = new JLabel("Type your password");
		watermarkPassword.setFont(new Font("Avenir", Font.PLAIN, 20));
		watermarkPassword.setForeground(Color.LIGHT_GRAY);
		passwordField.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		passwordField.add(watermarkPassword);
		passwordField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            	watermarkPassword.setVisible(false);
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (passwordField.getText().isEmpty()) {
                	watermarkPassword.setVisible(true);
                }
            }
        });
		
		//Phone Number
		JLabel labelPhoneNumber = new JLabel("Phone Number");
		labelPhoneNumber.setForeground(new Color(192, 192, 192));
		labelPhoneNumber.setFont(new Font("Avenir", Font.PLAIN, 20));
		textFieldPhoneNumber = new JTextField();
		textFieldPhoneNumber.setFont(new Font("Avenir", Font.PLAIN, 20));
		textFieldPhoneNumber.setColumns(10);
		
		JLabel watermarkPhoneNumber = new JLabel("Type your phone number");
		watermarkPhoneNumber.setFont(new Font("Avenir", Font.PLAIN, 20));
		watermarkPhoneNumber.setForeground(Color.LIGHT_GRAY);
		textFieldPhoneNumber.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		textFieldPhoneNumber.add(watermarkPhoneNumber);
		textFieldPhoneNumber.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            	watermarkPhoneNumber.setVisible(false);
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (textFieldPhoneNumber.getText().isEmpty()) {
                	watermarkPhoneNumber.setVisible(true);
                }
            }
        });
		
		//Address
		JLabel labelAddress = new JLabel("Address");
		labelAddress.setFont(new Font("Avenir", Font.PLAIN, 20));
		labelAddress.setForeground(new Color(192, 192, 192));
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("Avenir", Font.PLAIN, 20));
		textFieldAddress.setColumns(10);
		
		JLabel watermarkAddress = new JLabel("Type your address");
		watermarkAddress.setFont(new Font("Avenir", Font.PLAIN, 20));
		watermarkAddress.setForeground(Color.LIGHT_GRAY);
		textFieldAddress.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		textFieldAddress.add(watermarkAddress);
		textFieldAddress.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            	watermarkAddress.setVisible(false);
            }
            @Override
            public void focusLost(FocusEvent e) {
                if (textFieldAddress.getText().isEmpty()) {
                	watermarkPassword.setVisible(true);
                }
            }
        });
		
		// CreateAccount
		JButton buttonCreateAccount = new JButton("Create Account");
		buttonCreateAccount.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					customer.addCustomer(textFieldName.getText(), textFieldLastName.getText(), textFieldEmail.getText(), 
							passwordField.getText(), textFieldAddress.getText(), textFieldPhoneNumber.getText());
					JOptionPane.showMessageDialog(null, "Signup Successful!");
					dispose();
					new Login(login).setVisible(true);
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Signup unsuccessful!");
					e1.printStackTrace();
				}
			}
		});
		buttonCreateAccount.setForeground(new Color(47, 79, 79));
		buttonCreateAccount.setBackground(new Color(128, 128, 0));
		buttonCreateAccount.setFont(new Font("Avenir", Font.PLAIN, 16));
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 217, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(122)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldAddress, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelAddress, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(169)
									.addComponent(labelHeader, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(labelName, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addGap(167)
									.addComponent(labelLastName, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
									.addGap(30)
									.addComponent(textFieldLastName, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
								.addComponent(labelEmail, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelPassword, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)
								.addComponent(labelPhoneNumber)
								.addComponent(textFieldPhoneNumber, GroupLayout.PREFERRED_SIZE, 452, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(277)
							.addComponent(buttonCreateAccount))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 668, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(36)
							.addComponent(labelHeader)
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(labelName)
								.addComponent(labelLastName))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldLastName, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
							.addGap(22)
							.addComponent(labelEmail)
							.addGap(6)
							.addComponent(textFieldEmail, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(23)
							.addComponent(labelPassword)
							.addGap(6)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(29)
							.addComponent(labelPhoneNumber)
							.addGap(6)
							.addComponent(textFieldPhoneNumber, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addGap(27)
							.addComponent(labelAddress)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textFieldAddress, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(buttonCreateAccount)))
					.addGap(11))
		);
		contentPane.setLayout(gl_contentPane);
	}


	}
