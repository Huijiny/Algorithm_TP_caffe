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
import Design.RoundedButton_plain;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
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
		setBounds(300, 300, 950, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255,215,1));///배경색
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon title = new ImageIcon("C:\\Alg_TP\\Coffee\\setDrinkTitle.png");
		JLabel lblNewLabel = new JLabel(title);
		lblNewLabel.setBounds(338, 75, 408, 129);
		contentPane.add(lblNewLabel);
		
		
		ImageIcon choosenor = new ImageIcon("C:\\Alg_TP\\Coffee\\choosenor.png");
		ImageIcon chooseroll = new ImageIcon("C:\\Alg_TP\\Coffee\\chooseroll.png");
		ImageIcon choosepre = new ImageIcon("C:\\Alg_TP\\Coffee\\choosepre.png");
		JButton btnNewButton = new JButton(choosenor);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setRolloverIcon(chooseroll);
		btnNewButton.setPressedIcon(choosepre);
		btnNewButton.setBounds(690, 536, 189, 60);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ExpectiedTime et = new ExpectiedTime();
				et.setVisible(true);
				setVisible(false);
			}
			
		});
		contentPane.add(btnNewButton);
		
		//ImageIcon ame = new ImageIcon("C:\\Alg_TP\\Coffee\\ame.png");
		JLabel ame = new JLabel( new ImageIcon("C:\\Alg_TP\\Coffee\\menu.png"));
		ame.setBounds(271, 220, 181, 252);
		contentPane.add(ame);
		
		RoundedButton ameHot = new RoundedButton("HOT");
		ameHot.setBounds(466, 257, 100, 35);
		ameHot.setBorderPainted(false);
		ameHot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add(ameHot);
		
		RoundedButton ameice = new RoundedButton("ICE");
		ameice.setBorderPainted(false);
		ameice.setBounds(586, 257, 100, 35);
		ameice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add(ameice);
		
		RoundedButton latteHot = new RoundedButton("HOT");
		latteHot.setBorderPainted(false);
		latteHot.setBounds(466, 310, 100, 35);
		latteHot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add(latteHot);
		
		RoundedButton latteice =  new RoundedButton("ICE");
		latteice.setBorderPainted(false);
		latteice.setBounds(586, 310, 100, 35);
		latteice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add(latteice);
		
		RoundedButton mocaHot = new RoundedButton("HOT");
		mocaHot.setBorderPainted(false);
		mocaHot.setBounds(466, 360, 100, 35);
		mocaHot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add(mocaHot);
		
		RoundedButton mocaice= new RoundedButton("ICE");
		mocaice.setBorderPainted(false);
		mocaice.setBounds(586, 360, 100, 35);
		mocaice.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add( mocaice);
		
		RoundedButton vanilHot = new RoundedButton("HOT");
		vanilHot.setBorderPainted(false);
		vanilHot.setBounds(466, 410, 100, 35);
		vanilHot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add(vanilHot);
		
		RoundedButton vanilIce = new RoundedButton("ICE");
		vanilIce.setBorderPainted(false);
		vanilIce.setBounds(586, 410, 100, 35);
		vanilIce.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//여기서 setText(아메리카노Hot 해주세요)
			}
			
		});
		contentPane.add(vanilIce);
		
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(110,201,740,4);
		ImageIcon image = new ImageIcon("C:\\Alg_TP\\Coffee\\line.png");
		lblNewLabel_4 .setIcon(image);
		contentPane.add(lblNewLabel_4);
		
		ImageIcon kakaof = new ImageIcon("C:\\Alg_TP\\Coffee\\kakaofriends.png");
		JLabel lblNewLabel_5 = new JLabel(kakaof);
		lblNewLabel_5.setBounds(0, 536, 299, 129);
		contentPane.add(lblNewLabel_5);
		
		ImageIcon back = new ImageIcon("C:\\Alg_TP\\Coffee\\backBtn.png");
		JButton btnNewButton_1 = new JButton(back);
		btnNewButton_1.setBounds(14, 12, 80, 75);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CoffeeMain cm = new CoffeeMain();
				cm.setVisible(true);
				setVisible(false);
			}
			
		});
		contentPane.add(btnNewButton_1);
		
		setVisible(true);
		setResizable(false);
	}
}
