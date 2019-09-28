package pong;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;



public class Loop extends JPanel implements Runnable, KeyListener {

	private static final long serialVersionUID = 1L;
	
	private int largura, altura;
	private Jogador jogador;
	private Bola bola;
	private int direcao;


	public Loop() {
		bola = new Bola();
		direcao = 0;
		jogador = new Jogador();
		
		largura = 800; altura = 400;
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
		if(jogador != null) {
			jogador.movimentar(direcao);
		}
		
		bola.movimentar();
		bola.colisao();
		
	}

	public void paintComponent(Graphics g) {
		g.clearRect(0, 0, largura, altura);
		
		for(int i = 0; i < largura/20; i++) {
			g.drawLine(i * 20, 0,  i * 20 , altura);
			for(int j = 0; j < altura/20; j++) {
				g.drawLine(0, i * 20, largura, i * 20 );
			}
		}
		jogador.pintar(g);
		bola.pintar(g);
	}

	private void sleep() {
		try {
			Thread.sleep(1000 / 60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			direcao = 1;
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			direcao = -1;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT) {
			direcao = 0;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
