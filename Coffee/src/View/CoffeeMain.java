package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255,215,1));///배경색///235,235,235는 너무 기본색 같나요? 신문지같은 느낌 주고싶었는데, 너무 기본색같기도 해서요.
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon title = new ImageIcon("C:\\Alg_TP\\Coffee\\title.png");
		JLabel label = new JLabel(title);
		label.setBounds(210, 66, 428, 304);
		Font bold_ac = new Font("맑은 고딕",Font.BOLD,60);
		label.setForeground(new Color(79,79,79));///제목 폰트색
		label.setFont(bold_ac);
		label.setHorizontalAlignment(JLabel.CENTER);
		
		ImageIcon image = new ImageIcon("C:\\Alg_TP\\Coffee\\1.png");
		contentPane.add(label);
		
		ImageIcon startBtn = new ImageIcon("C:\\Alg_TP\\Coffee\\startBtn.png");
		ImageIcon rolloverIcon = new ImageIcon("C:\\Alg_TP\\Coffee\\pressedBtnTitle.png");
		ImageIcon pressedIcon = new ImageIcon("C:\\Alg_TP\\Coffee\\rolloverBtnTitle.png");
		JButton btnNewButton = new JButton(startBtn);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new RoundedBorder(10));
		btnNewButton.setBounds(196, 377, 454, 86);
		btnNewButton.setPressedIcon(pressedIcon);
		btnNewButton.setRolloverIcon(rolloverIcon);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SetDrinks sd = new SetDrinks();
				
				sd.setVisible(true);
				setVisible(false);
			}
			
		});
		contentPane.add(btnNewButton);
		
		ImageIcon image2 = new ImageIcon("C:\\Alg_TP\\Coffee\\cafe.png");
		JLabel lblNewLabel = new JLabel(image2);
		lblNewLabel.setBounds(397, 181,100, 70);
		contentPane.add(lblNewLabel);
		setVisible(true);
		setResizable(true);
	}
	}

