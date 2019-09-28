package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Jogador {

	private int posX, posY, tamX, tamY, velo;

	public Jogador() {
		posX = 370;
		posY = 350;
		tamX = 80;
		tamY = 20;
		velo = 3;
	}

	public void pintar(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(posX, posY, tamX, tamY);
	}

	public void movimentar(int valor) {
		if(valor == 1) {
			posX +=velo;			
		}
		else if(valor == -1) {
			posX-=velo;
		}
	}

}
