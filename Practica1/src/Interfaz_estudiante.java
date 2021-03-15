

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import javax.swing.JButton;

public class Interfaz_estudiante extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5911693782544364189L;
	private JFrame Frame_Estudiante;
	
	

	public JFrame getFrame_Aula() {
		return Frame_Estudiante;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz_estudiante window = new Interfaz_estudiante();
					window.Frame_Estudiante.setVisible(true);
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
		Frame_Estudiante = new JFrame();
		Frame_Estudiante.setResizable(false);
		Frame_Estudiante.setBounds(100, 100, 380, 446); //-, - , ancho, alto
		Frame_Estudiante.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame_Estudiante.getContentPane().setLayout(null);
		
		
	

		
	}
}
