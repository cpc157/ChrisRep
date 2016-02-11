package Rubbish;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;

public class DecoratingCoGui extends JFrame{
	JPanel PR = new JPanel();
	JPanel PL = new JPanel();
	JPanel PT = new JPanel();
	JPanel PB = new JPanel();
	JPanel PC = new JPanel();
	static JLabel Title = new JLabel("John's Decorating Company");
public DecoratingCoGui(){
	initFrame();
}
private void initFrame(){
	setTitle("John's Decorating Company");
	setSize(500,500);
	setLocation(100,100);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	addPanels();

	pack();
}
private void addPanels() {
	setupPT();
	setupPL();
	setupPR();
	setupPB();
	setupPC();
	addPanel(PR, Color.WHITE, BorderLayout.EAST);
	addPanel(PL, Color.WHITE, BorderLayout.WEST);
	addPanel(PT, Color.LIGHT_GRAY, BorderLayout.NORTH);
	addPanel(PB, Color.LIGHT_GRAY, BorderLayout.SOUTH);
	addPanel(PC, Color.YELLOW, BorderLayout.CENTER);
}
private void setupPB() {
PB.setLayout(new BorderLayout());

}
private void setupPR() {
}
private void setupPC() {
}
private void setupPL() {
}
private void setupPT() {
	Title.setFont(new Font("", 0, 30));
	PT.add(Title);
}
private void addPanel(JPanel p, Color c, Object b){
	p.setBackground(c);
	p.setOpaque(true);
	add(p , b);
}

public static void main(String[] args){
	DecoratingCoGui gui = new DecoratingCoGui();
	gui.setVisible(true);
	
	
}
}
