package aula7465;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame2 extends JFrame{
	private static final long serialVersionUID = 1L;

	private JButton botaoPrata;
	private JButton botaoOuro;
	public ButtonFrame2() {
		super("Testando botões");
		setLayout(new FlowLayout());
		
		botaoPrata = new JButton("Prata");
		add(botaoPrata);
		
		botaoOuro = new JButton("Ouro");
		add(botaoOuro);
		
		ButtonHandler handler = new ButtonHandler();
		botaoOuro.addActionListener(handler);
		botaoPrata.addActionListener(handler);
		
		
	}
	public class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(ButtonFrame2.this, String.format("Voce pressionou: %s", event.getActionCommand()));
		}
		
	}
	
	public static void main(String[] args) {
		ButtonFrame2 buttonFrame = new ButtonFrame2();
		buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonFrame.setSize(275, 210);
		buttonFrame.setVisible(true);
	}

}
