package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Design.RoundedButton;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;

public class CoffeeMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoffeeMain frame = new CoffeeMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoffeeMain() {
		Image img=null;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(242,238,229));///배경색///235,235,235는 너무 기본색 같나요? 신문지같은 느낌 주고싶었는데, 너무 기본색같기도 해서요.
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel label = new JLabel("\uC5BC\uC8FD\uC544");
		label.setBounds(161, 61, 321, 70);
		Font bold_ac = new Font("맑은 고딕",Font.BOLD,60);
		label.setForeground(new Color(79,79,79));///제목 폰트색
		label.setFont(bold_ac);
	
		label.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(label);
		
		RoundedButton btnNewButton = new RoundedButton("\uB0B4 \uC8FC\uBCC0\uC73C\uB85C \uC2DC\uC791");
		btnNewButton.setBounds(161, 185, 314, 156);
		btnNewButton.setFont(bold_ac);
		contentPane.add(btnNewButton);
	}
}
