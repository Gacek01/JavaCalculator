package krzysztof.gagacki.Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {

	final byte numberOfButtons = 21;
	Button[] buttons = new Button[numberOfButtons];
	double operand1;
	double operand2;
	String result = "";
	ResultsLabel resultsLabel;
	JPanel buttonsPanel;
	static final Font mainFont = new Font("Bookman Old Style", Font.BOLD, 20);

	MainFrame() {

		resultsLabel = new ResultsLabel();

		buttonsPanel = new JPanel();
		buttonsPanel.setBounds(20, 90, 300, 400);
		buttonsPanel.setVisible(true);
		buttonsPanel.setLayout(new GridLayout(7, 3));

		/* add buttons to the button panel */

		for (int i = 0; i < 9; i++) {
			buttons[i] = new Button(String.valueOf(i + 1));
		}
		buttons[9] = new Button("0");
		buttons[10] = new Button("000");
		buttons[11] = new Button(".");
		buttons[12] = new Button("+");
		buttons[13] = new Button("-");
		buttons[14] = new Button("*");
		buttons[15] = new Button("/");
		buttons[16] = new Button("=");
		buttons[17] = new Button("Clear");
		buttons[18] = new Button("%");
		buttons[19] = new Button("^2");
		buttons[20] = new Button("Undo");

		for (int i = 0; i < numberOfButtons; i++) {
			buttons[i].addActionListener(this);
			buttonsPanel.add(buttons[i]);
		}

		/* Calculator Frame Setup */
		this.setSize(360, 550);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setTitle("Calculator");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.add(resultsLabel);
		this.add(buttonsPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//action for number buttons
		for (int i = 0; i < 11; i++) {
			if (e.getSource() == buttons[i]) {
				result = result + buttons[i].getText();
				resultsLabel.setText(result);
				this.repaint();
			}
		}
	}

}
