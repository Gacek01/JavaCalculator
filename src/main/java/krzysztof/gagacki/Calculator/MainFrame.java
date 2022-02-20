package krzysztof.gagacki.Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame implements ActionListener {

	MainFrame() {

		JLabel resultsLabel = new JLabel();

		JPanel numbersPanel = new JPanel();

		JPanel operatorsPanel = new JPanel();

		/* Calculator Frame Setup */
		this.setSize(300, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null);
		this.setTitle("Calculator");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.add(resultsLabel);
		this.add(numbersPanel);
		this.add(operatorsPanel);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
