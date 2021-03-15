

import java.awt.EventQueue;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import java.awt.Color;

public class Interfaz_NewProfesor extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -308388154996027869L;
	private JFrame frame_newProfesor;
	private JTextField txtProf_id;
	private JTextField txtProf_pw;
	private JTextField txtProf_materias;
	private JTextField txtProf_nombre;
	private JTextField txtProf_edad;
	private JTextField txtProf_genero;
	private JTextField txtProf_sueldo;
	private JTextField txtProf_faltas;
	private JTextField txtProf_estudios;

	public JFrame getFrame_newProfesor() {
		return frame_newProfesor;
	}

	public void setFrame_newProfesor(JFrame frame_newProfesor) {
		this.frame_newProfesor = frame_newProfesor;
	}
	
	
	public static void crearFicheroObjetoProfesor(Profesor[] p)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("src/Universidad_prueba/Usuarios/"+"Profesores"+".obj");
			ObjectOutputStream profesor = new ObjectOutputStream(fichero);
			profesor.writeObject(p);
			fichero.close();

		} catch (Exception e) {

		}


	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_NewProfesor window = new Interfaz_NewProfesor();
					window.frame_newProfesor.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz_NewProfesor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_newProfesor = new JFrame();
		frame_newProfesor.setResizable(false);
		frame_newProfesor.setBounds(100, 100, 380, 446); //-, - , ancho, alto
		frame_newProfesor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_newProfesor.getContentPane().setLayout(null);

		JLabel lblProf_titulo = new JLabel("NUEVO PROFESOR");
		lblProf_titulo.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblProf_titulo.setBounds(106, 6, 209, 25);
		frame_newProfesor.getContentPane().add(lblProf_titulo);

		JLabel lblProf_id = new JLabel(" Id");
		lblProf_id.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblProf_id.setBounds(88, 56, 33, 15);
		frame_newProfesor.getContentPane().add(lblProf_id);

		txtProf_id = new JTextField();
		txtProf_id.setBounds(133, 53, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_id);
		txtProf_id.setColumns(10);

		txtProf_pw = new JPasswordField();
		txtProf_pw.setColumns(10);
		txtProf_pw.setBounds(133, 83, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_pw);





		JLabel lblProf_pw = new JLabel("Contraseña");
		lblProf_pw.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblProf_pw.setBounds(19, 87, 102, 15);
		frame_newProfesor.getContentPane().add(lblProf_pw);

		txtProf_materias = new JTextField();
		txtProf_materias.setColumns(10);
		txtProf_materias.setBounds(133, 114, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_materias);

		JLabel lblProf_materias = new JLabel("materias");
		lblProf_materias.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblProf_materias.setBounds(29, 117, 92, 15);
		frame_newProfesor.getContentPane().add(lblProf_materias);

		txtProf_nombre = new JTextField();
		txtProf_nombre.setColumns(10);
		txtProf_nombre.setBounds(133, 144, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_nombre);

		JLabel lblProf_nombre = new JLabel("Nombre");
		lblProf_nombre.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblProf_nombre.setBounds(39, 147, 82, 15);
		frame_newProfesor.getContentPane().add(lblProf_nombre);

		JLabel lblProf_genero = new JLabel("Género");
		lblProf_genero.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblProf_genero.setBounds(48, 210, 73, 15);
		frame_newProfesor.getContentPane().add(lblProf_genero);

		JLabel lblProf_edad = new JLabel("Edad");
		lblProf_edad.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblProf_edad.setBounds(65, 177, 56, 15);
		frame_newProfesor.getContentPane().add(lblProf_edad);

		txtProf_edad = new JTextField();
		txtProf_edad.setColumns(10);
		txtProf_edad.setBounds(133, 174, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_edad);

		txtProf_genero = new JTextField();
		txtProf_genero.setColumns(10);
		txtProf_genero.setBounds(133, 207, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_genero);

		JLabel lblProf_faltas = new JLabel("Faltas");
		lblProf_faltas.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblProf_faltas.setBounds(58, 240, 63, 15);
		frame_newProfesor.getContentPane().add(lblProf_faltas);

		JLabel lblProf_sueldo = new JLabel("Sueldo");
		lblProf_sueldo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblProf_sueldo.setBounds(48, 270, 73, 15);
		frame_newProfesor.getContentPane().add(lblProf_sueldo);

		txtProf_sueldo = new JTextField();
		txtProf_sueldo.setColumns(10);
		txtProf_sueldo.setBounds(133, 267, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_sueldo);

		txtProf_faltas = new JTextField();
		txtProf_faltas.setColumns(10);
		txtProf_faltas.setBounds(133, 237, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_faltas);


		txtProf_estudios = new JTextField();
		txtProf_estudios.setColumns(10);
		txtProf_estudios.setBounds(133, 297, 228, 25);
		frame_newProfesor.getContentPane().add(txtProf_estudios);


		JLabel lblProf_estudios = new JLabel("Estudios");
		lblProf_estudios.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblProf_estudios.setBounds(46, 298, 73, 15);
		frame_newProfesor.getContentPane().add(lblProf_estudios);




		JButton btnProf_aceptar = new JButton("Aceptar");
		btnProf_aceptar.setBounds(48, 354, 117, 29);
		frame_newProfesor.getContentPane().add(btnProf_aceptar);
		btnProf_aceptar.addActionListener(new ActionListener() {

			int cont=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				/*if(txtProf_id.getText().equals("") || txtProf_pw.getText().equals("") || txtProf_materias.getText().equals("") 
						|| txtProf_nombre.getText().equals("") || txtProf_edad.getText().equals("") ||
						txtProf_genero.getText().equals("") || txtProf_sueldo.getText().equals("") || txtProf_faltas.getText().equals("")
						|| txtProf_estudios.getText().equals("")) 
					
					JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
								
				else {

					double[] notas= {3,2,5,3,5};
					Materia m1 = new Materia(txtProf_materias.getText(),numCreditos(txtProf_materias.getText()), 
							verificarMateriaAnual(txtProf_materias.getText()), 
							faltasAleatorio(txtProf_materias.getText()),false, notas);
					
				}*/
				if(txtProf_id.getText().equals("") || txtProf_pw.getText().equals("") || txtProf_materias.getText().equals("") 
						|| txtProf_nombre.getText().equals("") || txtProf_edad.getText().equals("") ||
						txtProf_genero.getText().equals("") || txtProf_sueldo.getText().equals("") || txtProf_faltas.getText().equals("")
						|| txtProf_estudios.getText().equals("")) 
					
					JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
								
				else {
					String fich = "src/Practica1/usuarios/profesor"+cont + ".txt";
					FileWriter fw = null;
					BufferedWriter b = null;

					try {
						fw = new FileWriter(fich);
						b = new BufferedWriter(fw);
						b.write(txtProf_id.getText() +"\n"+txtProf_pw.getText()+"\n"+
								txtProf_materias.getText()+"\n"+txtProf_nombre.getText()+"\n"+txtProf_edad.getText()+"\n"+
								txtProf_genero.getText()+"\n"+txtProf_sueldo.getText()+"\n"+txtProf_faltas.getText()+"\n"+
								txtProf_estudios.getText());
						cont++;
						JOptionPane.showMessageDialog(null, "El profesor ha sido agregado con éxito");

					} catch (IOException e1) {
						e1.printStackTrace();
					}
					txtProf_id.setText("");
					txtProf_pw.setText("");
					txtProf_materias.setText("");
					txtProf_nombre.setText("");
					txtProf_edad.setText("");
					txtProf_genero.setText("");
					txtProf_sueldo.setText("");
					txtProf_faltas.setText("");
					txtProf_estudios.setText("");


					if ( fw != null) {
						try {
							b.close();
							fw.close();
						} catch (IOException i1) {
							System.out.println("No se pudo cerrar el fichero");
						}
					}
				}
					

			}
		});

		JButton btnProf_atras = new JButton("Atrás");
		btnProf_atras.setBounds(131, 383, 117, 29); //x, y, alto, ancho
		frame_newProfesor.getContentPane().add(btnProf_atras);
		btnProf_atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_Login AtrasLogin= new Interfaz_Login();
				AtrasLogin.getFrame_Login().setVisible(true);
				Interfaz_NewProfesor.this.frame_newProfesor.dispose();

			}
		});

		JButton btnProf_cancelar = new JButton("Cancelar");
		btnProf_cancelar.setForeground(Color.RED);
		btnProf_cancelar.setBounds(190, 354, 117, 29);
		frame_newProfesor.getContentPane().add(btnProf_cancelar);
		btnProf_cancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});


	}

}
