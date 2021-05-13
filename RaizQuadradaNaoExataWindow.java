package aula_while;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RaizQuadradaNaoExataWindow {

	private JFrame frame;
	private JTextField txtnum;
	private JTextField txtrq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RaizQuadradaNaoExataWindow window = new RaizQuadradaNaoExataWindow();
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
	public RaizQuadradaNaoExataWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtnum = new JTextField();
		txtnum.setBounds(181, 35, 86, 20);
		frame.getContentPane().add(txtnum);
		txtnum.setColumns(10);
		
		txtrq = new JTextField();
		txtrq.setBounds(181, 77, 86, 20);
		frame.getContentPane().add(txtrq);
		txtrq.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RaizQuadradaNaoExata rq = new RaizQuadradaNaoExata();
				rq.num = Integer.parseInt(txtnum.getText());
				rq.CalcularRQ();
				txtrq.setText(rq.raizq);
			}
		});
		btnNewButton.setBounds(181, 133, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
