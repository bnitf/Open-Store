package bnitf.store;

import java.awt.Toolkit;
import javax.swing.*;

public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6808970785149474020L;
	int xSize, ySize;
	Config config;
	
	/*
	 * This is method
	 */
	public Main() {
		Toolkit tk = Toolkit.getDefaultToolkit();
		xSize = ((int) tk.getScreenSize().getWidth());
		ySize = ((int) tk.getScreenSize().getHeight());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(xSize, ySize);
		setVisible(true);
	}

	public void connectDATABASE() {
		config = new Config(this);
		
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.connectDATABASE();
	}

}
