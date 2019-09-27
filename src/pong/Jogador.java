package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Jogador {
	
	private int posX, posY, tamX, tamY;
	
	public Jogador() {
		posX = 400; posY = 350; tamX= 20; tamY = 20;
	}
	
	public void pintar(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(posX, posY, tamX, tamY);
	}
	
	

}
