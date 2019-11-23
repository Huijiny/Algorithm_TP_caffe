
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JButton;

public class RoundedButton extends JButton { 
	public RoundedButton() {
		super(); 
		decorate();
		} 
	public RoundedButton(String text) {
		super(text);
		 decorate();
		}
	public RoundedButton(Action action) {
		super(action);
		 decorate();
		}
	public RoundedButton(Icon icon) {
		super(icon);
		 decorate();
		}
	public RoundedButton(String text, Icon icon) {
		super(text, icon); 
		 decorate();
		}
	protected void decorate() {
		setBorderPainted(false);
		setOpaque(false); 
		}
	
	@Override protected void paintComponent(Graphics g) {
		Font bold_ac = new Font("¸¼Àº °íµñ",Font.BOLD,25);
				
		int width = getWidth();
		int height = getHeight();
		
		g.setFont(bold_ac);
		
		g.setColor(new Color(224,184,192));
		Graphics2D graphics = (Graphics2D) g;
		graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
		if (getModel().isArmed()) {
			graphics.setColor(graphics.getColor().darker());
			} else if (getModel().isRollover()) {
				graphics.setColor(new Color(210,123,157));
				} else {
					graphics.setColor(graphics.getColor());
					}
					
		graphics.fillRoundRect(0, 0, width, height, 10, 10);
		FontMetrics fontMetrics = graphics.getFontMetrics();
		Rectangle stringBounds = fontMetrics.getStringBounds(this.getText(), graphics).getBounds();
		
		int textX = (width - stringBounds.width) / 2;
		int textY = (height - stringBounds.height) / 2 + fontMetrics.getAscent();
		
		graphics.setColor(getForeground());
		//graphics.setFont(getFont());
		graphics.drawString(getText(), textX, textY);
		graphics.dispose();
		g.dispose();
		
		super.paintComponent(g);
		}


	}

