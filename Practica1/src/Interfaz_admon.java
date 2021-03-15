
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class Interfaz_admon {

	private JFrame frame;



	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_admon window = new Interfaz_admon();
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
	public Interfaz_admon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 380, 446);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin_addProf = new JButton("<html><center>Nuevo Profesor");
		btnLogin_addProf.setBounds(132, 136, 117, 40);
		frame.getContentPane().add(btnLogin_addProf);
		btnLogin_addProf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_NewProfesor addprofe= new Interfaz_NewProfesor();
				addprofe.getFrame_newProfesor().setVisible(true);
				Interfaz_admon.this.frame.dispose();

			}
		});

		JButton btnLogin_ingresar = new JButton("<html><center>Nuevo estudiante");
		btnLogin_ingresar.setBounds(132, 244, 117, 40);
		frame.getContentPane().add(btnLogin_ingresar);
		
		JLabel lblAdmon_Titulo = new JLabel("User: Administrador");
		lblAdmon_Titulo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblAdmon_Titulo.setBounds(79, 52, 199, 25);
		frame.getContentPane().add(lblAdmon_Titulo);
		
		JButton btnAdmon_CerrarSesion = new JButton("<html><center>Nuevo estudiante");
		btnAdmon_CerrarSesion.setBounds(132, 329, 117, 40);
		frame.getContentPane().add(btnAdmon_CerrarSesion);
		btnLogin_ingresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Interfaz_NewEstudiante addEstudiante= new Interfaz_NewEstudiante();
				addEstudiante.getFrame_newEstudiante().setVisible(true);
				Interfaz_admon.this.frame.dispose();

			}
		});

	}
}
