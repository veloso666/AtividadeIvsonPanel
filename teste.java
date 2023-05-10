package aula7465;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class teste implements ActionListener{

	private JButton botao;
	public void janela() {
		JFrame frame = new JFrame();
		botao = new JButton();
		
		//registra o evento
		botao.addActionListener(this);
		frame.getContentPane().add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		botao.setText("Botao foi clidado!!");
		
		//alternar fonte
		botao.setFont(new Font("SansSerif", Font.BOLD, 20));
		
	}
	public static void main(String[] args) {
		teste captura = new teste();
		captura.janela();
	}	
}
