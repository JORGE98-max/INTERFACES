package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Ventana2 {

	private JFrame frame;
	private JPasswordField passwordField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 606, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(217, 191, 167, 20);
		frame.getContentPane().add(passwordField_1);
		
		textField = new JTextField();
		textField.setBounds(217, 135, 167, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("USUARIO");
		lblNewLabel.setBounds(276, 110, 72, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("CONTRASE\u00D1A");
		lblNewLabel_1.setBounds(262, 166, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(76, 304, 192, 14);
		frame.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(336, 304, 220, 14);
		frame.getContentPane().add(lblNewLabel_3);

		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dato1 = textField.getText();
				String dato2 = passwordField_1.getText();

				if (dato1.equals("jorge_ccg@hotmail.com")) {

					lblNewLabel_2.setText("USUARIO CORRECTO");

				}
				else {
					lblNewLabel_2.setText("USUARIO INCORRECTO");
				}
				if (dato2.equals("europa20")) {

					lblNewLabel_3.setText(" CONTRASEÑA CORRECTA");

				}
				else {
					lblNewLabel_3.setText("CONTRASEÑA INCORRECTO");
				}
			}
		});
		btnNewButton.setBounds(259, 236, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
