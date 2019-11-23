package View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Design.RoundedButton;
import Design.RoundedButton_plain;

import javax.swing.JLabel;
import javax.swing.JButton;

public class SetDrinks extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetDrinks frame = new SetDrinks();
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
	public SetDrinks() {
		Font font_plain = new Font("맑은 고딕",Font.PLAIN,20);////기본폰트 바꾸고싶은데 일단 기본으로 설정했음.
		Font font_middle = new Font("맑은 고딕",Font.BOLD,22);
		Font font_bold = new Font("맑은 고딕",Font.BOLD,25);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 650, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(242,238,229));///배경색
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("음료 정하기");
		lblNewLabel.setBounds(161, 61, 321, 70);
		lblNewLabel.setFont(font_bold);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel);
		
		RoundedButton btnNewButton = new RoundedButton("선택");
		btnNewButton.setBounds(475, 383, 119, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("아메리카노");
		lblNewLabel_1.setBounds(144, 148, 120, 34);
		lblNewLabel_1.setFont(font_plain);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("카페라떼");
		lblNewLabel_2.setBounds(144, 198, 120, 34);
		lblNewLabel_2.setFont(font_plain);
		lblNewLabel_2.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("카푸치노");
		lblNewLabel_3.setBounds(144, 248, 120, 34);
		lblNewLabel_3.setFont(font_plain);
		lblNewLabel_3.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblNewLabel_3);
		
		RoundedButton_plain btnNewButton_1 = new RoundedButton_plain("HOT");
		btnNewButton_1.setBounds(284, 148, 100, 30);
		contentPane.add(btnNewButton_1);
		
		RoundedButton_plain btnNewButton_2 = new RoundedButton_plain("ICE");
		btnNewButton_2.setBounds(388, 148, 100, 30);
		contentPane.add(btnNewButton_2);
		
		RoundedButton_plain btnNewButton_3 = new RoundedButton_plain("HOT");
		btnNewButton_3.setBounds(284, 198, 100, 30);
		contentPane.add(btnNewButton_3);
		
		RoundedButton_plain btnNewButton_4 = new RoundedButton_plain("ICE");
		btnNewButton_4.setBounds(388, 198, 100, 30);
		contentPane.add(btnNewButton_4);
		
		RoundedButton_plain btnNewButton_5 = new RoundedButton_plain("HOT");
		btnNewButton_5.setBounds(284, 248, 100, 30);
		contentPane.add(btnNewButton_5);
		
		RoundedButton_plain btnNewButton_6 = new RoundedButton_plain("ICE");
		btnNewButton_6.setBounds(388, 248, 100, 30);
		contentPane.add(btnNewButton_6);
	}
}
