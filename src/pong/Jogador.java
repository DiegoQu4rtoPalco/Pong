package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Jogador {

	private int posX, posY, tamX, tamY, velo;

	public Jogador() {
		posX = 370;
		posY = 300;
		tamX = 80;
		tamY = 20;
		velo = 5;
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
		
		if( posX +  tamX >= 800) {
			posX = 800 - tamX;
		}
		if(posX <= 0) {
			posX = 0;
		}
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getTamX() {
		return tamX;
	}

	public int getTamY() {
		return tamY;
	}
	
	

}
