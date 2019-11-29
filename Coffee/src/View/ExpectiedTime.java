package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Design.RoundedButton;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.ImageIcon;

public class ExpectiedTime extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpectiedTime frame = new ExpectiedTime();
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
	public ExpectiedTime() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font_plain = new Font("맑은 고딕",Font.PLAIN,20);////기본폰트 바꾸고싶은데 일단 기본으로 설정했음.
		Font font_middle = new Font("맑은 고딕",Font.BOLD,22);
		Font font_bold = new Font("맑은 고딕",Font.BOLD,25);
		
		setBounds(300, 300, 850, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255,215,1));///배경색
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(306, 12, 217, 70);
		lblNewLabel.setFont(font_bold);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(201, 377, 209, 30);
		lblNewLabel_4.setFont(font_plain);
		lblNewLabel_4.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(424, 377, 209, 30);
		lblNewLabel_5.setFont(font_plain);
		lblNewLabel_5.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_5);
		
		ImageIcon back = new ImageIcon("C:\\Alg_TP\\Coffee\\backBtn.png");
		JButton btnNewButton_1 = new JButton(back);
		btnNewButton_1.setBounds(14, 12, 80, 75);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				SetDrinks sd = new SetDrinks();
				sd.setVisible(true);
				setVisible(false);
			}
			
		});
		contentPane.add(btnNewButton_1);
		
		RoundedButton btnNewButton = new RoundedButton("주문");
		btnNewButton.setBounds(410, 474, 209, 55);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Complete com = new Complete();
				com.setVisible(true);
				setVisible(false);
			}
			
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(272, 482, 111, 30);
		lblNewLabel_6.setFont(font_middle);
		lblNewLabel_6.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_6);
		
		ImageIcon cafeA = new ImageIcon("C:\\Alg_TP\\Coffee\\cafes.png");
		JLabel lblNewLabel_7 = new JLabel(cafeA);
		lblNewLabel_7.setBounds(191, 94, 479, 300);
		contentPane.add(lblNewLabel_7);
		
		ImageIcon cafeB = new ImageIcon("C:\\Alg_TP\\Coffee\\cafeB.png");
		setVisible(true);
		setResizable(true);
	
	}
}
