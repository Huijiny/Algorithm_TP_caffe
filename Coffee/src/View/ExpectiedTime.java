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
		
		setBounds(300, 300, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(242,238,229));///배경색
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(93, 61, 217, 70);
		lblNewLabel.setFont(font_bold);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("로 결정!");
		lblNewLabel_1.setBounds(311, 61, 248, 70);
		lblNewLabel_1.setFont(font_bold);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("카페 A");
		lblNewLabel_2.setBounds(161, 242, 80, 30);
		lblNewLabel_2.setFont(font_middle);
		lblNewLabel_2.setOpaque(true);//라벨 색 변경하겠음
		lblNewLabel_2.setForeground(new Color(79,79,79));//라벨 폰트색
		lblNewLabel_2.setBackground(new Color(180,143,193));//라벨 배경색
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("카페 B");
		lblNewLabel_3.setBounds(384, 242, 80, 30);
		lblNewLabel_3.setFont(font_middle);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setForeground(new Color(79,79,79));
		lblNewLabel_3.setBackground(new Color(180,143,193));
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(93, 284, 209, 30);
		lblNewLabel_4.setFont(font_plain);
		lblNewLabel_4.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(318, 284, 209, 30);
		lblNewLabel_5.setFont(font_plain);
		lblNewLabel_5.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_5);
		
		RoundedButton btnNewButton = new RoundedButton("주문");
		btnNewButton.setBounds(339, 363, 151, 40);
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
		lblNewLabel_6.setBounds(146, 364, 111, 30);
		lblNewLabel_6.setFont(font_middle);
		lblNewLabel_6.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_6);
		
		ImageIcon cafeA = new ImageIcon("C:\\Alg_TP\\Coffee\\cafeA.png");
		JLabel lblNewLabel_7 = new JLabel(cafeA);
		lblNewLabel_7.setBounds(166, 178, 62, 52);
		contentPane.add(lblNewLabel_7);
		
		ImageIcon cafeB = new ImageIcon("C:\\Alg_TP\\Coffee\\cafeB.png");
		JLabel lblNewLabel_8 = new JLabel(cafeB);
		lblNewLabel_8.setBounds(395, 166, 62, 64);
		contentPane.add(lblNewLabel_8);
		setVisible(true);
		setResizable(true);
	
	}
}
