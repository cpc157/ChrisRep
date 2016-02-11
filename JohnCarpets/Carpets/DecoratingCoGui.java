package Carpets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class DecoratingCoGui extends JFrame{
	JPanel PR = new JPanel();
	JPanel PL = new JPanel();
	JPanel PT = new JPanel();
	JPanel PB = new JPanel();
	JPanel PC = new JPanel();
	DefaultTableModel CustomerModel = new DefaultTableModel(){
		
		  @Override
		   public boolean isCellEditable(int row, int column) {
		       return false;
		   }
	};
	JTable CustomersTable;
	DefaultTableModel OrdersModel = new DefaultTableModel();
	JTable QuoteTable;
	static JLabel Title = new JLabel("John's Decorating Company");
	static JLabel CustomerLabel = new JLabel("Customers");
	String CustomerColumns[] = {"First Name","Surname", "Town", "Telephone"};
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
}
private void setupPR() {
}
private void setupPC() {
}
private void setupPL() {
	PL.setLayout(new BorderLayout());
	
	CustomerLabel.setFont(new Font("",0,20));
	PL.add(CustomerLabel, BorderLayout.NORTH);
	
	CustomerModel.addColumn(CustomerColumns[0]); 
	CustomerModel.addColumn(CustomerColumns[1]); 
	CustomerModel.addColumn(CustomerColumns[2]); 
	CustomerModel.addColumn(CustomerColumns[3]); 
	CustomersTable = new JTable(CustomerModel);
	CustomerModel.addRow(new Object[]{CustomerColumns[0], CustomerColumns[1], CustomerColumns[2], CustomerColumns[3] });
	CustomerModel.addRow(new Object[]{"Steve", "Allen", "Reading","0118 462908"});
	PL.add(CustomersTable, BorderLayout.CENTER);
	CustomersTable.getColumn(CustomerColumns[0]).setPreferredWidth(100);
	CustomersTable.getColumn(CustomerColumns[1]).setPreferredWidth(100);
	CustomersTable.getColumn(CustomerColumns[2]).setPreferredWidth(100);
	CustomersTable.getColumn(CustomerColumns[3]).setPreferredWidth(100);

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
