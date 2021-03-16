import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Interfaz_estudiante extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5911693782544364189L;
	private JFrame frame_interfaz_estudiante;



	public JFrame getFrame_Interfaz_estudiante() {
		return frame_interfaz_estudiante;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_estudiante window = new Interfaz_estudiante();
					window.frame_interfaz_estudiante.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz_estudiante() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_interfaz_estudiante = new JFrame();
		frame_interfaz_estudiante.setResizable(false);
		frame_interfaz_estudiante.setBounds(100, 100, 380, 446); //-, - , ancho, alto
		frame_interfaz_estudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_interfaz_estudiante.getContentPane().setLayout(null);

		//##LOS COMPONENTES QUE TERMINEN EN _TEXT SON LOS QUE SE EDITAN (ESOS SON LOS QUE 
		//CAMBIARAN, MOSTRANDO LOS DATOS
		final JLabel lblEstudiante_titulo = new JLabel("Nombre: ");
		lblEstudiante_titulo.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblEstudiante_titulo.setBounds(56, 30, 100, 21);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_titulo);

		JButton btnEstudiante_cerrar_Sesión = new JButton("Cerrar sesión");
		btnEstudiante_cerrar_Sesión.setForeground(Color.RED);
		btnEstudiante_cerrar_Sesión.setBounds(132, 309, 117, 29);
		frame_interfaz_estudiante.getContentPane().add(btnEstudiante_cerrar_Sesión);
		btnEstudiante_cerrar_Sesión.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_Login AtrasLogin= new Interfaz_Login();
				AtrasLogin.getFrame_Login().setVisible(true);
				Interfaz_estudiante.this.frame_interfaz_estudiante.dispose();

			}
		});

		JLabel lblEstudiante_titulo_Nombre_text = new JLabel("-");
		lblEstudiante_titulo_Nombre_text.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblEstudiante_titulo_Nombre_text.setBounds(157, 30, 92, 21);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_titulo_Nombre_text);

		JLabel lblEstudiante_nombre = new JLabel("Género:");
		lblEstudiante_nombre.setBounds(88, 90, 48, 16);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_nombre);

		JLabel lblEstudiante_nombre_text = new JLabel("-");
		lblEstudiante_nombre_text.setBounds(148, 90, 129, 16);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_nombre_text);

		JLabel lblEstudiante_nombre_1 = new JLabel("Edad:");
		lblEstudiante_nombre_1.setBounds(98, 122, 34, 16);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_nombre_1);

		JLabel lblEstudiante_nombre_2 = new JLabel("Promedio: ");
		lblEstudiante_nombre_2.setBounds(69, 220, 67, 16);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_nombre_2);

		JLabel lblEstudiante_nombre_text_1 = new JLabel("-");
		lblEstudiante_nombre_text_1.setBounds(148, 118, 129, 16);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_nombre_text_1);

		JLabel lblEstudiante_nombre_2_1 = new JLabel("Materia: ");
		lblEstudiante_nombre_2_1.setBounds(82, 150, 54, 16);
		frame_interfaz_estudiante.getContentPane().add(lblEstudiante_nombre_2_1);


	}
}