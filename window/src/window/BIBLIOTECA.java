package window;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;

public class BIBLIOTECA {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_7;
	private JTextField textField_4;
	private JLabel lblNewLabel_8;
	private JTextField textField_5;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BIBLIOTECA window = new BIBLIOTECA();
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
	public BIBLIOTECA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1083, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(96, 196, 171, 43);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("AUTOR : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(441, 70, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(510, 68, 259, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_2 = new JLabel("PUBLICACI\u00D3N :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(405, 209, 145, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(510, 207, 233, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_3 = new JLabel("PRECIO :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(441, 279, 71, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(510, 277, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(510, 134, 259, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_4 = new JLabel("DESCRIPCI\u00D3N :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(405, 327, 94, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(720, 277, 37, 20);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(510, 323, 374, 88);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("INGRESE  C\u00D3DIGO DEL LIBRO");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Franklin Gothic Demi", Font.BOLD, 20));
		lblNewLabel_1.setBounds(43, 97, 315, 88);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("BUSCAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int id = Integer.parseInt(textField.getText());
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					java.sql.Connection  conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/sistema de ventas de libros","root","");
					java.sql.Statement statement = conexion.createStatement();
					java.sql.Statement statement1 = conexion.createStatement();
					java.sql.Statement statement2 = conexion.createStatement();
					java.sql.Statement statement3 = conexion.createStatement();
					java.sql.Statement statement4 = conexion.createStatement();
					java.sql.Statement statement5 = conexion.createStatement();
					ResultSet resultSet = statement.executeQuery("select Autor from biblio2 where Codigo="+id);
					ResultSet resultSet1 = statement1.executeQuery("select Descripción from biblio2 where Codigo="+id);
					ResultSet resultSet2 = statement2.executeQuery("select Publicación from biblio2 where Codigo="+id);
					ResultSet resultSet3 = statement3.executeQuery("select Precio from biblio2 where Codigo="+id);
					ResultSet resultSet4 = statement4.executeQuery("select Título from biblio2 where Codigo="+id);
					ResultSet resultSet5 = statement5.executeQuery("select Stock from biblio2 where Codigo="+id);
					
					
						dispose();
						JOptionPane.showMessageDialog(null,"Buena Eleccion","INGRESASTE",JOptionPane.INFORMATION_MESSAGE);
						
						
					
					if(resultSet.next()==true) {
						textField_1.setText(resultSet.getString("Autor"));
					}
					
					if(resultSet1.next()==true) {
						textArea.setText(resultSet1.getString("Descripción"));
					}
					if(resultSet2.next()==true) {
						textField_2.setText(resultSet2.getString("Publicación"));
					}
					if(resultSet3.next()==true) {
						textField_3.setText(resultSet3.getString("Precio"));
					}
					if(resultSet4.next()==true) {
						textField_4.setText(resultSet4.getString("Título"));
					}
					if(resultSet5.next()==true) {
						textField_5.setText(resultSet5.getString("Stock"));
					}
					
						
				} catch (Exception e) {
					
					
				}
			}
		});
		btnNewButton.setBounds(141, 277, 89, 43);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel_7 = new JLabel("T\u00CDTULO :");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(441, 136, 81, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(510, 134, 259, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		lblNewLabel_8 = new JLabel("STOCK :");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setBounds(653, 279, 71, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("998325694");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setBounds(257, 397, 129, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_5 = new JLabel("PARA MAYOR INFORMACI\u00D3N :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(48, 397, 199, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Jorge Corimanya\\Pictures\\957960794afefb5cd4aa39d3fdd0a0c8.jpg"));
		lblNewLabel_10.setBounds(10, 11, 374, 414);
		frame.getContentPane().add(lblNewLabel_10);
		
		JButton btnNewButton_1 = new JButton("COMPRAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pago p = new pago();
				p.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(931, 388, 115, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Jorge Corimanya\\Pictures\\XUYWTFS7QREOFFTYRKBVZWUGNQ.jpg"));
		lblNewLabel_6.setBounds(394, 11, 663, 414);
		frame.getContentPane().add(lblNewLabel_6);
			
	}

	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}
