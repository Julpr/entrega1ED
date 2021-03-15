
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


			@Override
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, txtLogin_id.getText().substring(0, 3));

				if(txtLogin_id.getText().equals("") || txtLogin_pw.getText().equals("")) 

					JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

				else {

					switch(txtLogin_id.getText().substring(0, 3)) {
					case "est":
						int i=1, aux=1;
						FileReader fr=null;
						BufferedReader b=null;


						while(i>=0 && aux!=0) {
							File f=new File("src/Practica1/usuarios/estudiante"+i+".txt");
							try {
								fr= new FileReader(f);
								b= new BufferedReader(fr);

								String linea;

								if((linea=b.readLine()).compareTo(txtLogin_id.getText())==0 && 
										(linea=b.readLine()).compareTo(txtLogin_pw.getText())==0) {

									aux=0;
									Interfaz_estudiante c= new Interfaz_estudiante();
									c.getFrame_Aula().setVisible(true);
									Interfaz_Login.this.frame_Login.dispose();

								}else 
									i++;

							}catch(FileNotFoundException e1) {
								JOptionPane.showMessageDialog(null, "Contraseña o id incorrectos");
								i++;
								aux=0;

							}catch(IOException e1) {
								System.out.println("No se pudo leer el fichero");
								i++;
								aux=0;

							}finally {
								try {
									if(fr!=null) {
										b.close();
										fr.close();
									}
								}catch(IOException e1){
									System.out.println("No se pudo cerrar el fichero");
								}
							}

						}

						break;
						
					case "pro":
						int i1=1, aux1=1;
						FileReader fr1=null;
						BufferedReader b1=null;

						while(i1>=0 && aux1!=0) {
							File f=new File("src/Practica1/usuarios/profesor"+i1+".txt");
							try {
								fr1= new FileReader(f);
								b1= new BufferedReader(fr1);

								String linea;

								if((linea=b1.readLine()).compareTo(txtLogin_id.getText())==0 && 
										(linea=b1.readLine()).compareTo(txtLogin_pw.getText())==0) {

									aux1=0;
									Interfaz_profesor c= new Interfaz_profesor();
									c.getFrame().setVisible(true);
									Interfaz_Login.this.frame_Login.dispose();

								}else 
									i1++;

							}catch(FileNotFoundException e1) {
								JOptionPane.showMessageDialog(null, "Contraseña o id incorrectos");
								i1++;
								aux1=0;

							}catch(IOException e1) {
								System.out.println("No se pudo leer el fichero");
								i1++;
								aux1=0;

							}finally {
								try {
									if(fr1!=null) {
										b1.close();
										fr1.close();
									}
								}catch(IOException e1){
									System.out.println("No se pudo cerrar el fichero");
								}
							}

						}

						break;
					case "adm":
						int i11=1, aux11=1;
						FileReader fr11=null;
						BufferedReader b11=null;


						while(i11>=0 && aux11!=0) {
							File f=new File("src/Practica1/usuarios/admon"+i11+".txt");
							try {
								fr11= new FileReader(f);
								b11= new BufferedReader(fr11);

								String linea;

								if((linea=b11.readLine()).compareTo(txtLogin_id.getText())==0 
										&& (linea=b11.readLine()).compareTo(txtLogin_pw.getText())==0) {

									aux11=0;
									Interfaz_admon c= new Interfaz_admon();
									c.getFrame().setVisible(true);
									Interfaz_Login.this.frame_Login.dispose();

								}else 
									i11++;

							}catch(FileNotFoundException e1) {
								JOptionPane.showMessageDialog(null, "Contraseña o id incorrectos");
								i11++;
								aux11=0;

							}catch(IOException e1) {
								System.out.println("No se pudo leer el fichero");
								i11++;
								aux11=0;

							}finally {
								try {
									if(fr11!=null) {
										b11.close();
										fr11.close();
									}
								}catch(IOException e1){
									System.out.println("No se pudo cerrar el fichero");
								}
							}
							break;
							

						}
					}
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

		/*btnLogin_addEst.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				NewEstudiante addEstudiante= new NewEstudiante();
				addEstudiante.setVisible(true);
				dispose();
			}

		});*/



	}
}
