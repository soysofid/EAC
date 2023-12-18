package Grafica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JDesktopPane;

public class ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public ventana() {
		inicioComponente();
		inicioEvento();
		
	}

	public void inicioComponente () {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane);
	}
	public void inicioEvento() {
		
	}
}
