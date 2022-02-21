package krzysztof.gagacki.Calculator;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button extends JButton {

	Button(String text) {
		this.setText(text);
		this.setBackground(Color.DARK_GRAY);
		this.setForeground(Color.WHITE);
		this.setFocusable(false);
		this.setFont(MainFrame.mainFont);
		this.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
	}
}
