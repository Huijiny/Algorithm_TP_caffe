package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Design.RoundedButton;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Complete extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Complete frame = new Complete();
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
	public Complete() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255,215,1));///¹è°æ»ö
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon comple = new ImageIcon("C:\\Alg_TP\\Coffee\\ordercomple.png");
		JLabel lblNewLabel = new JLabel(comple);
		lblNewLabel.setBounds(108, 106, 615, 118);
		contentPane.add(lblNewLabel);
		

		ImageIcon kakaof = new ImageIcon("C:\\Alg_TP\\Coffee\\Kakaofriends.png");
		JLabel kakao = new JLabel(kakaof);
		kakao.setBounds(246, 265, 327, 125);
		contentPane.add(kakao);
		
		ImageIcon gobacknor = new ImageIcon("C:\\Alg_TP\\Coffee\\gobacknor.png");
		ImageIcon gobackroll = new ImageIcon("C:\\Alg_TP\\Coffee\\gobackroll.png");
		ImageIcon gobackpre = new ImageIcon("C:\\Alg_TP\\Coffee\\gobackpre.png");
		JButton btnNewButton = new JButton(gobacknor);
		btnNewButton.setRolloverIcon(gobackroll);
		btnNewButton.setPressedIcon(gobackpre);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(209, 403, 400, 80);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CoffeeMain cm = new CoffeeMain();
				cm.setVisible(true);
				setVisible(false);
				
			}
			
		});
		contentPane.add(btnNewButton);
	}

}
