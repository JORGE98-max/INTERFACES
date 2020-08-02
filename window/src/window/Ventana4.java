package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Ventana4 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana4 window = new Ventana4();
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
	public Ventana4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 704, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CODIGO");
		lblNewLabel.setBounds(111, 119, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(164, 116, 133, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(385, 119, 113, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id = Integer.parseInt(textField.getText());
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection  conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/universidad","root","");
					java.sql.Statement statement = conexion.createStatement();
					ResultSet resultSet = statement.executeQuery("select nombre from estudiantes where clave="+id);
					
					if(resultSet.next()==true) {
						lblNewLabel_1.setText(resultSet.getString("nombre"));
					}

					
					
				} catch (Exception e) {
					
					
				}
			}
		});
		btnNewButton.setBounds(164, 159, 168, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
