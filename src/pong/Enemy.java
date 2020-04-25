package pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Enemy {
	/*Double porque como é uma IA pode alterar a velocida do inimigo*/
	public double x,y;
	public int width, height;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y =y;
		this.width = 40;
		this.height = 5;
	}
	
	/*No Tick fica toda a lógica do game*/
	public void tick() {
		
		x+= (Game.ball.x - x - 6) * 0.07;
		
		
	}
	/*No render fica toda a renderização do nosso game*/
	public void render(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect((int)x,(int)y, width, height);
		
	}

}
