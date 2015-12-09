package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

public class GameTitle extends JFrame {
	private JPanel north, center, south;
	private JButton start, option, credit, exit;
	private JLabel name;
	private GridBagConstraints gcb = new GridBagConstraints();

	public GameTitle() {
		setTitle("Zombie Survivor");
		setPreferredSize(new Dimension(1280, 720));
		setLayout(new BorderLayout());
		
		north = new JPanel();
		center = new JPanel();
		south = new JPanel();
		start = new JButton("Start");
		option = new JButton("Option");
		credit = new JButton("Credit");
		exit = new JButton("Exit");
		
		name = new JLabel("Zombie Survivor");
		name.setFont(new Font("Tahoma", Font.BOLD, 60));
		
		center.setLayout(new GridBagLayout());
		gcb.insets = new Insets(30, 0, 70, 0);
		gcb.gridx = 0;
		gcb.gridy = 0;
		gcb.gridwidth = 5;
		gcb.fill = GridBagConstraints.HORIZONTAL;
		center.add(start,gcb);
		
		gcb.gridx = 0;
		gcb.gridy = 1;
		gcb.gridwidth = 5;
		center.add(option,gcb);
		
		gcb.gridx = 0;
		gcb.gridy = 2;
		gcb.gridwidth = 5;
		center.add(credit,gcb);
		
		north.add(name);
		
		south.setLayout(new FlowLayout(FlowLayout.RIGHT,80,40));
		south.add(exit,BorderLayout.EAST);
		
		add(north, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		pack();
	}

	public static void main(String[] ko) {
		GameTitle game = new GameTitle();
	}
}
