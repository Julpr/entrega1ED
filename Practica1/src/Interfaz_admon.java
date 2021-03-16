import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Interfaz_admon {

	private JFrame frame_admon;
	private JButton btnAdmon_newProfesor;
	private JLabel lblNewLabel;
	
	

	public JFrame getFrame_admon() {
		return frame_admon;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_admon window = new Interfaz_admon();
					window.frame_admon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz_admon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame_admon = new JFrame();
		frame_admon.setBounds(100, 100, 380, 446); //-, - , ancho, alto
		frame_admon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_admon.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("User: Administrador");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel.setBounds(79, 52, 199, 25);
		frame_admon.getContentPane().add(lblNewLabel);
		
		JButton btnLogin_addProf;
		btnAdmon_newProfesor = new JButton("<html><center>Nuevo Profesor");
		btnAdmon_newProfesor.setBounds(129, 113, 95, 44);
		frame_admon.getContentPane().add(btnAdmon_newProfesor);
		btnAdmon_newProfesor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_NewProfesor addprofe= new Interfaz_NewProfesor();
				addprofe.getFrame_newProfesor().setVisible(true);
				Interfaz_admon.this.frame_admon.dispose();

			}
		});
		
		JButton btnAdmon_newEstudiante = new JButton("<html><center>Nuevo Estudiante");
		btnAdmon_newEstudiante.setBounds(129, 209, 95, 44);
		frame_admon.getContentPane().add(btnAdmon_newEstudiante);
		btnAdmon_newEstudiante.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_NewEstudiante addestudiante= new Interfaz_NewEstudiante();
				addestudiante.getFrame_newEstudiante().setVisible(true);
				Interfaz_admon.this.frame_admon.dispose();

			}
		});
		
		JButton btnLogin_Cerrar_Sesion = new JButton("Cerrar sesión");
		btnLogin_Cerrar_Sesion.setForeground(Color.RED);
		btnLogin_Cerrar_Sesion.setBounds(129, 338, 117, 29); //x, y, alto, ancho
		frame_admon.getContentPane().add(btnLogin_Cerrar_Sesion);
		
		
		btnLogin_Cerrar_Sesion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_Login addestudiante= new Interfaz_Login();
				addestudiante.getFrame_Login().setVisible(true);
				Interfaz_admon.this.frame_admon.dispose();
			}
		});
		
		
	}
}