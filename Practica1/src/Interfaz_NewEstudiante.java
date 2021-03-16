

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



import java.awt.Color;

public class Interfaz_NewEstudiante extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1462530441540294228L;
	private JFrame frame_newEstudiante;
	private JTextField txtEst_Pw;
	private JTextField txtEst_materias;
	private JTextField txtEst_Nombre;
	private JTextField txtEst_edad;
	private JTextField txtEst_genero;
	private Estudiante estudiantes[]=new Estudiante[1];
	
	public static int numCreditos(String materia) throws Excepciones{
		switch (materia) {
		case "Calculo":
			return 4;
		case "Fisica":
			return 3;
		case "Probabilidad":
			return 4;
		case "Estructuras de datos":
			return 4;
		case "Sistemas discretos":
			return 4;
			default:
				throw new Excepciones("La materia no está disponible");
		}
	}
	
	public static boolean verificarMateriaAnual(String materia) throws Excepciones{
		switch (materia) {
		case "Calculo":
			return false;
		case "Fisica":
			return false;
		case "Probabilidad":
			return false;
		case "Estructuras de datos":
			return true;
		case "Sistemas discretos":
			return true;
			default:
				throw new Excepciones("La materia no está disponible");
		}
	}
	
	public static int faltasAleatorio(String materia) throws Excepciones{
		switch (materia) {
		case "Calculo":
			return 4;
		case "Fisica":
			return 3;
		case "Probabilidad":
			return 4;
		case "Estructuras de datos":
			return 4;
		case "Sistemas discretos":
			return 4;
			default:
				throw new Excepciones("La materia no está disponible");
		}
	}
	
	

	public JFrame getFrame_newEstudiante() {
		return frame_newEstudiante;
	}

	public void setFrame_newEstudiante(JFrame frame_newEstudiante) {
		this.frame_newEstudiante = frame_newEstudiante;
	}

	public static void crearFicheroObjetoEstudiante(Estudiante[] e11)  {
		FileOutputStream fichero = null;
		try {
			fichero = new FileOutputStream("src/Universidad_prueba/Usuarios/"+"Estudiantes"+".obj");
			ObjectOutputStream estudiante = new ObjectOutputStream(fichero);
			estudiante.writeObject(e11);
			fichero.close();

		} catch (Exception e) {

		}


	}




	
	public void limpiarTxt() {

		txtEst_Pw.setText("");
		txtEst_materias.setText("");
		txtEst_Nombre.setText("");
		txtEst_edad.setText("");
		txtEst_genero.setText("");

	}



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_NewEstudiante window = new Interfaz_NewEstudiante();
					window.frame_newEstudiante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz_NewEstudiante() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_newEstudiante = new JFrame();
		frame_newEstudiante.setResizable(false);
		frame_newEstudiante.setBounds(100, 100, 380, 446); //-, - , ancho, alto
		frame_newEstudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_newEstudiante.getContentPane().setLayout(null);

		JLabel lblEst_titulo = new JLabel("NUEVO ESTUDIANTE");
		lblEst_titulo.setFont(new Font("Lucida Grande", Font.BOLD, 18));
		lblEst_titulo.setBounds(95, 6, 209, 25);
		frame_newEstudiante.getContentPane().add(lblEst_titulo);

		txtEst_Pw = new JPasswordField();
		txtEst_Pw.setColumns(10);
		txtEst_Pw.setBounds(133, 83, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_Pw);
		
		JLabel lblEst_Pw = new JLabel("Contraseña");
		lblEst_Pw.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblEst_Pw.setBounds(19, 87, 102, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Pw);

		txtEst_materias = new JTextField();
		txtEst_materias.setColumns(10);
		txtEst_materias.setBounds(133, 114, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_materias);

		JLabel lblEst_Materias = new JLabel("materias");
		lblEst_Materias.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_Materias.setBounds(29, 117, 92, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Materias);

		txtEst_Nombre = new JTextField();
		txtEst_Nombre.setColumns(10);
		txtEst_Nombre.setBounds(133, 144, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_Nombre);

		JLabel lblEst_Nombre = new JLabel("nombre");
		lblEst_Nombre.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_Nombre.setBounds(39, 147, 82, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Nombre);

		JLabel lblEst_Genero = new JLabel("Género");
		lblEst_Genero.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_Genero.setBounds(48, 210, 73, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Genero);

		JLabel lblEst_edad = new JLabel("Edad");
		lblEst_edad.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_edad.setBounds(66, 177, 55, 15);
		frame_newEstudiante.getContentPane().add(lblEst_edad);

		txtEst_edad = new JTextField();
		txtEst_edad.setColumns(10);
		txtEst_edad.setBounds(133, 174, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_edad);

		txtEst_genero = new JTextField();
		txtEst_genero.setColumns(10);
		txtEst_genero.setBounds(133, 207, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_genero);



		JButton btnEst_aceptar = new JButton("Aceptar");
		btnEst_aceptar.setBounds(48, 354, 117, 29);
		frame_newEstudiante.getContentPane().add(btnEst_aceptar);
		btnEst_aceptar.addActionListener(new ActionListener() {

			int cont=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtEst_id.getText().equals("") || txtEst_Pw.getText().equals("") || txtEst_materias.getText().equals("") 
						|| txtEst_Nombre.getText().equals("") || txtEst_edad.getText().equals("") ||
						txtEst_genero.getText().equals("") || txtEst_promedio.getText().equals("") || txtEst_faltas.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

				}else {
					
					//profesor: Materia[] materias, String nombre, char sexo, int edad, int faltas,String cedula
					//Estudiante: Materia[] materias, String nombre, char sexo,  int edad, int faltas,String TarjetaDeIdentidad
		
					try {
						double[] notas= {3,2,5,3,5};
						Materia m1 = new Materia(txtEst_materias.getText(),numCreditos(txtEst_materias.getText()), 
								verificarMateriaAnual(txtEst_materias.getText()), 
								faltasAleatorio(txtEst_materias.getText()),false, notas);
						
						Estudiante est= new Estudiante(new Materia[] {m1},txtEst_Nombre.getText(), txtEst_genero.getText().charAt(0),
								Integer.parseInt(txtEst_edad.getText()),
								Integer.parseInt(txtEst_faltas.getText()), txtEst_id.getText());
						
						if(estudiantes[0]==null) {
							estudiantes[0]=est;
							JOptionPane.showMessageDialog(null, "El estudiante ha sido creado con éxito");
							limpiarTxt();
						}else {
							estudiantes=Arrays.copyOf(estudiantes, estudiantes.length+1);
							estudiantes[estudiantes.length-1]=est;
							crearFicheroObjetoEstudiante(estudiantes);
							JOptionPane.showMessageDialog(null, "El estudiante ha sido creado con éxito");
							limpiarTxt();
						}
						
						
					} catch (Excepciones e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
				}
				
					/*if(txtEst_id.getText().equals("") || txtEst_Pw.getText().equals("") || txtEst_materias.getText().equals("") 
						|| txtEst_Nombre.getText().equals("") || txtEst_edad.getText().equals("") ||
						txtEst_genero.getText().equals("") || txtEst_promedio.getText().equals("") || txtEst_faltas.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

				}else {
					String fich = "src/Practica1/usuarios/estudiante"+cont + ".txt";
					FileWriter fw = null;
					BufferedWriter b = null;

					try {
						fw = new FileWriter(fich);
						b = new BufferedWriter(fw);
						b.write(txtEst_id.getText()+ "\n"+txtEst_Pw.getText()+ "\n"+txtEst_materias.getText()
						+"\n"+ txtEst_Nombre.getText()+ "\n"+txtEst_edad.getText()+ "\n"+ txtEst_genero.getText()
						+ "\n"+ txtEst_promedio.getText()+ "\n"+txtEst_faltas.getText());

						cont++;
						JOptionPane.showMessageDialog(null, "El estudiante ha sido agregado con éxito");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					txtEst_id.setText("");
					txtEst_Pw.setText("");
					txtEst_materias.setText("");
					txtEst_Nombre.setText("");
					txtEst_edad.setText("");
					txtEst_genero.setText("");
					txtEst_promedio.setText("");
					txtEst_faltas.setText("");

					if ( fw != null) {
						try {
							b.close();
							fw.close();
						} catch (IOException i1) {
							System.out.println("No se pudo cerrar el fichero");
						}
					}
				}*/
				}
			});

		JButton btnEst_cancelar = new JButton("Cancelar");
		btnEst_cancelar.setForeground(Color.RED);
		btnEst_cancelar.setBounds(190, 354, 117, 29);
		frame_newEstudiante.getContentPane().add(btnEst_cancelar);
		btnEst_cancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		JButton btnEst_atras = new JButton("Atrás");
		btnEst_atras.setBounds(131, 383, 117, 29); //x, y, alto, ancho
		frame_newEstudiante.getContentPane().add(btnEst_atras);
		btnEst_atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_Login AtrasLogin= new Interfaz_Login();
				AtrasLogin.getFrame_Login().setVisible(true);
				Interfaz_NewEstudiante.this.frame_newEstudiante.dispose();

			}
		});


		}
	}