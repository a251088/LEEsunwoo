package home.lsw.prj.caculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JFrame {

	private JTextField inputSpace;
	private ArrayList<String> equation = new ArrayList<String>();
	private String num = "";
	private String prev_operation = "";

	public Calculator() {
		setLayout(null);

		inputSpace = new JTextField();
		inputSpace.setEditable(false);
		inputSpace.setBackground(Color.WHITE);
		inputSpace.setHorizontalAlignment(JTextField.RIGHT);
		inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
		inputSpace.setBounds(8, 10, 290, 90);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5, 4, 10, 10));
		buttonPanel.setBounds(8, 120, 290, 270);

		String button_names[] = { "C", "←", "÷", "×", "7", "8", "9", "-", "4", "5", "6", "+", "1", "2", "3", "=", "0",
				"." };
		JButton buttons[] = new JButton[button_names.length];

		for (int i = 0; i < button_names.length; i++) {
			buttons[i] = new JButton(button_names[i]);
			buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
			if (button_names[i] == "C")
				buttons[i].setBackground(Color.RED);
			else if ((i >= 4 && i <= 6) || (i >= 8 && i <= 10) || (i >= 12 && i <= 14) || (i == 16))
				buttons[i].setBackground(Color.BLACK);
			else
				buttons[i].setBackground(Color.GRAY);
			buttons[i].setForeground(Color.WHITE);
			buttons[i].setBorderPainted(false);
			buttons[i].addActionListener(new PadActionListener());
			buttonPanel.add(buttons[i]);

		}

		add(inputSpace);
		add(buttonPanel);

		setTitle("계산기");
		setVisible(true);
		setSize(330, 440);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	class PadActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String operation = e.getActionCommand();
			if (operation.equals("C")) {
				inputSpace.setText("");
			} else if (operation.equals("=")) {
				String result = Double.toString(calculate(inputSpace.getText()));
				inputSpace.setText("" + result);
				num = "";
			} else if (operation.equals("+") || operation.equals("-") || operation.equals("×")
					|| operation.equals("÷")) {
				if (!inputSpace.getText().equals("") && !prev_operation.equals("+") && !prev_operation.equals("-")
						&& !prev_operation.equals("×") && !prev_operation.equals("÷")) {
					inputSpace.setText(inputSpace.getText() + e.getActionCommand());
					
				}

			}else if(operation.equals("←")){	
							
			}
			
			else {
				inputSpace.setText(inputSpace.getText() + e.getActionCommand());

			}
			prev_operation = e.getActionCommand();
		}

	}

	private void fullTextParsing(String inputText) {
		equation.clear();
		for (int i = 0; i < inputText.length(); i++) {
			char ch = inputText.charAt(i);

			if (ch == '-' | ch == '+' | ch == '÷' | ch == '×') {
				equation.add(num);
				num = "";
				equation.add(ch + "");
			} else {
				num = num + ch;
			}
		}
		equation.add(num);
	}

	public double calculate(String inpuText) {
		fullTextParsing(inpuText);

		double prev = 0;
		double current = 0;
		String mode = "";

		for (String s : equation) {
			if (s.equals("+")) {
				mode = "sum";
			} else if (s.equals("-")) {
				mode = "sub";
			} else if (s.equals("×")) {
				mode = "mul";
			} else if (s.equals("÷")) {
				mode = "div";
			} else {
				current = Double.parseDouble(s);
				if (mode == "sum") {
					prev = prev + current;
				} else if (mode == "sub") {
					prev = prev - current;
				} else if (mode == "mul") {
					prev = prev * current;
				} else if (mode == "div") {
					prev = prev / current;
				} else {
					prev = current;
				}
			}

		}
		return prev;
	}

} // class end