

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
import javax.swing.JCheckBox;

public class Interfaz_NewEstudiante extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1462530441540294228L;
	private JFrame frame_newEstudiante;
	private JTextField txtEst_Pw;
	private JTextField txtEst_Nombre;
	private JTextField txtEst_edad;
	private JTextField txtEst_genero;
	private Estudiante estudiantes[]=new Estudiante[1];
	private Materia materias[]=new Materia[1];
	private JTextField txtNewEstudiante_identificacion;

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
		txtEst_Pw.setBounds(133, 104, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_Pw);

		JLabel lblEst_Pw = new JLabel("Contraseña");
		lblEst_Pw.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblEst_Pw.setBounds(19, 108, 102, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Pw);

		JLabel lblEst_Materias = new JLabel("materias");
		lblEst_Materias.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_Materias.setBounds(39, 209, 92, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Materias);

		txtEst_Nombre = new JTextField();
		txtEst_Nombre.setColumns(10);
		txtEst_Nombre.setBounds(133, 43, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_Nombre);

		JLabel lblEst_Nombre = new JLabel("nombre");
		lblEst_Nombre.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_Nombre.setBounds(39, 46, 82, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Nombre);

		JLabel lblEst_Genero = new JLabel("Género");
		lblEst_Genero.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_Genero.setBounds(48, 171, 73, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Genero);

		JLabel lblEst_edad = new JLabel("Edad");
		lblEst_edad.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblEst_edad.setBounds(66, 138, 55, 15);
		frame_newEstudiante.getContentPane().add(lblEst_edad);

		txtEst_edad = new JTextField();
		txtEst_edad.setColumns(10);
		txtEst_edad.setBounds(133, 135, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_edad);

		txtEst_genero = new JTextField();
		txtEst_genero.setColumns(10);
		txtEst_genero.setBounds(133, 168, 228, 25);
		frame_newEstudiante.getContentPane().add(txtEst_genero);




		JButton btnEst_cancelar = new JButton("Cancelar");
		btnEst_cancelar.setForeground(Color.RED);
		btnEst_cancelar.setBounds(204, 342, 117, 29);
		frame_newEstudiante.getContentPane().add(btnEst_cancelar);
		btnEst_cancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

		JButton btnEst_atras = new JButton("Atrás");
		btnEst_atras.setBounds(134, 371, 117, 29); //x, y, alto, ancho
		frame_newEstudiante.getContentPane().add(btnEst_atras);

		JCheckBox chckEstudiante_Calculo = new JCheckBox("Cálculo");
		chckEstudiante_Calculo.setBounds(133, 209, 128, 23);
		frame_newEstudiante.getContentPane().add(chckEstudiante_Calculo);

		JCheckBox chckEstudiante_Fisica = new JCheckBox("Física");
		chckEstudiante_Fisica.setBounds(133, 233, 128, 23);
		frame_newEstudiante.getContentPane().add(chckEstudiante_Fisica);

		JCheckBox chckEstudiante_Proba = new JCheckBox("Probabilidad");
		chckEstudiante_Proba.setBounds(133, 257, 128, 23);
		frame_newEstudiante.getContentPane().add(chckEstudiante_Proba);

		JCheckBox chckEstudiante_Discretas = new JCheckBox("Sistemas discretos");
		chckEstudiante_Discretas.setBounds(133, 304, 161, 23);
		frame_newEstudiante.getContentPane().add(chckEstudiante_Discretas);

		JCheckBox chckEstudiante_Edas = new JCheckBox("Estructuras de datos");
		chckEstudiante_Edas.setBounds(133, 280, 161, 23);
		frame_newEstudiante.getContentPane().add(chckEstudiante_Edas);
		btnEst_atras.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_Login AtrasLogin= new Interfaz_Login();
				AtrasLogin.getFrame_Login().setVisible(true);
				Interfaz_NewEstudiante.this.frame_newEstudiante.dispose();

			}
		});

		JButton btnEst_aceptar = new JButton("Aceptar");
		btnEst_aceptar.setBounds(62, 342, 117, 29);
		frame_newEstudiante.getContentPane().add(btnEst_aceptar);

		JLabel lblEst_Identificacion = new JLabel("Identificación");
		lblEst_Identificacion.setFont(new Font("Lucida Grande", Font.PLAIN, 17));
		lblEst_Identificacion.setBounds(6, 76, 115, 15);
		frame_newEstudiante.getContentPane().add(lblEst_Identificacion);

		txtNewEstudiante_identificacion = new JTextField();
		txtNewEstudiante_identificacion.setColumns(10);
		txtNewEstudiante_identificacion.setBounds(133, 73, 228, 25);
		frame_newEstudiante.getContentPane().add(txtNewEstudiante_identificacion);
		btnEst_aceptar.addActionListener(new ActionListener() {

			int cont=1;
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtEst_Pw.getText().equals("")|| !chckEstudiante_Calculo.isSelected() 
						|| !chckEstudiante_Fisica.isSelected() && !chckEstudiante_Proba.isSelected() &&
						!chckEstudiante_Discretas.isSelected() &&
						!chckEstudiante_Edas.isSelected() || txtEst_Nombre.getText().equals("") || txtEst_edad.getText().equals("") ||
						txtEst_genero.getText().equals("")) {

					JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

				}else {
					//String nombre, int creditos, boolean anual, int faltas, boolean aprobado, double[] nota
					//profesor: Materia[] materias, String nombre, char sexo, int edad, int faltas,String cedula
					//Estudiante: Materia[] materias, String nombre, char sexo,  int edad, int faltas,String TarjetaDeIdentidad


					double[] notas= {};
					Materia Calculo = new Materia("Calculo",4,false,0,false,notas); 
					Materia Fisica = new Materia("Fisica",3,false,0,false,notas);
					Materia Probabilidad = new Materia("Probabilidad",4,false,0,false,notas);
					Materia EDAS = new Materia("Estructuras de datos",4,false,0,false,notas);
					Materia SistemasDiscretas = new Materia("SistemasDiscretas",4,false,0,false,notas);

					if(chckEstudiante_Calculo.isSelected()) {
						if(materias[0]==null) {
							materias[0]=Calculo;
						}
					}

					if(chckEstudiante_Fisica.isSelected()) {
						if(materias[0]==null) {
							materias[0]=Fisica;
						}else {
							materias=Arrays.copyOf(materias, materias.length-1);
							materias[materias.length-1]=Fisica;
						}
					}

					if(chckEstudiante_Proba.isSelected()) {
						if(materias[0]==null) {
							materias[0]=Probabilidad;
						}else {
							materias=Arrays.copyOf(materias, materias.length-1);
							materias[materias.length-1]=Probabilidad;
						}
					}

					if(chckEstudiante_Discretas.isSelected()) {
						if(materias[0]==null) {
							materias[0]=SistemasDiscretas;
						}else {
							materias=Arrays.copyOf(materias, materias.length-1);
							materias[materias.length-1]=SistemasDiscretas;
						}
					}
					if(chckEstudiante_Edas.isSelected()) {
						if(materias[0]==null) {
							materias[0]=EDAS;
						}else {
							materias=Arrays.copyOf(materias, materias.length-1);
							materias[materias.length-1]=EDAS;
						}
					}

					//String contraseña, Materia[] materias, String nombre, char sexo, int edad, int faltas,String TarjetaDeIdentidad
					Estudiante est= new Estudiante("ma", materias, "juan", 'm', 20, 0, "10349");

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
				}
			}
		});



	}
}
