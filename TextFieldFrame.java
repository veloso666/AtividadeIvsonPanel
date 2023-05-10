package aula7465;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField;
	public TextFieldFrame() {
		super("Testando JTextField e JPasswordField");
		setLayout(new FlowLayout());
		textField1 = new JTextField(10);
		add(textField1);
		
		textField2 = new JTextField("Entre com o texto aqui");
		add(textField2);
		
		textField3 = new JTextField("Campo não editavel", 21);
		textField3.setEditable(false);
		add(textField3);
		
		passwordField = new JPasswordField("Texto escondido");
		add(passwordField);
		
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField2.addActionListener(handler);
		textField3.addActionListener(handler);
		passwordField.addActionListener(handler);
		
	}
	
	private class TextFieldHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			String string = "";
			
			if(event.getSource() == textField1) {
				string = String.format("textField1: %s", event.getActionCommand());
			}
			else if(event.getSource() == textField2) {
				string = String.format("textField2: %s", event.getActionCommand());
			}
			else if(event.getSource() == textField3) {
				string = String.format("textField3: %s", event.getActionCommand());
			}
			else if(event.getSource() == passwordField) {
				string = String.format("PasswordField: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
			
		}
		
	}
	
	public static void main(String[] args) {

		TextFieldFrame textFieldFrame = new TextFieldFrame();
		textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFieldFrame.setSize(350, 200);
		textFieldFrame.setVisible(true);
	}

}
