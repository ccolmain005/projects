import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame implements ActionListener {
	JPanel panel;
	JButton[] button;
	int count = 0;
	int sign = 0;
	public Game(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,3));
		this.add(panel);
		button = new JButton[9];
		for(int i = 0; i <= 8; i++){
			button[i] = new JButton();
			panel.add(button[i]);
			button[i].setEnabled(true);
			button[i].addActionListener(this);
		}
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		count++;
		for(int i = 0; i <= 8; i++){
			if(button[i] == e.getSource()){
				if(sign%2 == 0){
					button [i].setText("X");
					button[i].setEnabled(false);
				}
				else{
					button[i].setText("O");
					button[i].setEnabled(false);
				}
			}
		}
		checkWinner();
		if(count >= 9){
			JOptionPane.showMessageDialog(null, "Cat's Game!");
			for(int j = 0; j <= 8; j++){
				button[j].setText("");
				button[j].setEnabled(true);
			}
			count = 0;
			sign = 0;
			return;
		}
		sign ++;
	}
	public boolean checkWinner(){
		
		
	}
	public static void main(String[] args){
		new Game();
		
	}
}
