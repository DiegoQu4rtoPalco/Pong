package pong;

import java.awt.Graphics;

import javax.swing.JPanel;



public class Loop extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	
	private Jogador jogador;


	public Loop() {
		
		jogador = new Jogador();
		
		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {
		while (true) {
			update();
			repaint();
			sleep();
		}

	}
	
	private void update() {
		// TODO Auto-generated method stub
		
	}

	public void paintComponent(Graphics g) {
		jogador.pintar(g);
	}

	private void sleep() {
		try {
			Thread.sleep(1000 / 60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
