
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Interfaz_Login extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1906907987390631878L;
	private JFrame frame_Login;
	private JTextField txtLogin_id;
	private JTextField txtLogin_pw;
	private Fichero usuarios;

	public JFrame getFrame_Login() {
		return frame_Login;
	}

	public void setFrame_Login(JFrame frame_Login) {
		this.frame_Login = frame_Login;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_Login window = new Interfaz_Login();
					window.frame_Login.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_Login = new JFrame();
		frame_Login.setResizable(false);
		frame_Login.setBounds(100, 100, 380, 446); //-, - , ancho, alto
		frame_Login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_Login.getContentPane().setLayout(null);

		JLabel lblLogin_titulo = new JLabel("LOGIN");
		lblLogin_titulo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblLogin_titulo.setBounds(155, 38, 62, 25);
		frame_Login.getContentPane().add(lblLogin_titulo);

		JLabel lblLogin_id = new JLabel(" Id");
		lblLogin_id.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblLogin_id.setBounds(68, 159, 41, 25);
		frame_Login.getContentPane().add(lblLogin_id);

		JLabel lblLogin_pw = new JLabel("Pasword");
		lblLogin_pw.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblLogin_pw.setBounds(29, 211, 80, 25);
		frame_Login.getContentPane().add(lblLogin_pw);

		txtLogin_id = new JTextField();
		txtLogin_id.setBounds(121, 159, 228, 35);
		frame_Login.getContentPane().add(txtLogin_id);
		txtLogin_id.setColumns(10);

		txtLogin_pw = new JPasswordField();
		txtLogin_pw.setColumns(10);
		txtLogin_pw.setBounds(121, 206, 228, 35);
		frame_Login.getContentPane().add(txtLogin_pw);

		JButton btnLogin_ingresar = new JButton("Ingresar");
		btnLogin_ingresar.setBounds(132, 309, 117, 29);
		frame_Login.getContentPane().add(btnLogin_ingresar);
		btnLogin_ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, txtLogin_id.getText().substring(0, 3));

				if(txtLogin_id.getText().equals("") || txtLogin_pw.getText().equals("")) 

					JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

				else {
					System.out.println("Hola");
							
					/*Interfaz_estudiante IE= new Interfaz_estudiante();
						IE.getFrame_Interfaz_estudiante().setVisible(true);
						frame_Login.dispose();
						*/
					

					
				}
			}
		});

		JButton btnLogin_cancelar = new JButton("Cancelar");
		btnLogin_cancelar.setForeground(Color.RED);
		btnLogin_cancelar.setBounds(132, 338, 117, 29); //x, y, alto, ancho
		frame_Login.getContentPane().add(btnLogin_cancelar);
		btnLogin_cancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		JButton btnLogin_addProf = new JButton("<html><center>Nuevo Profesor");
		btnLogin_addProf.setBounds(215, 368, 95, 44);
		frame_Login.getContentPane().add(btnLogin_addProf);
		btnLogin_addProf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_NewProfesor addprofe= new Interfaz_NewProfesor();
				addprofe.getFrame_newProfesor().setVisible(true);
				Interfaz_Login.this.frame_Login.dispose();

			}
		});

		JButton btnLogin_addEst = new JButton("<html><center>Nuevo estudiante");
		btnLogin_addEst.setBounds(81, 368, 95, 44);
		frame_Login.getContentPane().add(btnLogin_addEst);
		ActionListener newEstudiante= new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_NewEstudiante addEstudiante= new Interfaz_NewEstudiante();
				addEstudiante.getFrame_newEstudiante().setVisible(true);
				Interfaz_Login.this.frame_Login.dispose();
			}

		};
		btnLogin_addEst.addActionListener(newEstudiante);

	}
}
