package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Bola {
	
	private int posX, posY, tamX, tamY, direX, direY, velo;
	private Jogador jogador;
	
	public Bola() {
		
		jogador = new Jogador();
		posX = 400;
		posY = 200;
		tamX = 20;
		tamY = 20;
		direX = 1;
		direY = 1;
		velo = 3;
	}
	
	public void pintar(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(posX, posY, tamX, tamY);
	}
	
	public void movimentar() {
		posX += direX * velo;
		if(posX >= 800 - 20 || posX <= 0) {
			direX *= -1;
		}
		posY += direY * velo;
		if(posY >= 400 - 50 || posY <= 0) {
			direY *= -1;
		}
	}
	
	public void colisao() {
		if(posX <= jogador.getPosX()) {
			direX *=-1;
		}
	}

}
