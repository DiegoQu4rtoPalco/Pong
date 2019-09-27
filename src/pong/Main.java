package pong;

import javax.swing.JFrame;

public class Main {
	
	private static final int LARGURA = 800, ALTURA = 400;
	
	public static void main (String [] args ) {

		JFrame janela = new JFrame("Pong");
		Loop loop = new Loop();
		
		janela.setSize(LARGURA, ALTURA);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		
		janela.add(loop);
		janela.setVisible(true);
		
		
	}

}
