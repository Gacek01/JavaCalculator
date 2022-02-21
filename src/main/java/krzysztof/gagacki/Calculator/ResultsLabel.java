package krzysztof.gagacki.Calculator;

import java.awt.Color;

import javax.swing.JLabel;

public class ResultsLabel extends JLabel {

	ResultsLabel() {

		this.setBounds(20, 20, 300, 50);
		this.setBackground(Color.WHITE);
		this.setFont(MainFrame.mainFont);
		this.setHorizontalAlignment(JLabel.RIGHT);
		this.setOpaque(true);
		this.setVisible(true);
	}
	
}
