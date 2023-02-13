package package1;

import javax.swing.*;

import java.awt.*;

public class MenuDemo1 {

	JFrame frm;
	JMenuBar bar;
	JMenu formsmenu;
	
	
	JMenuItem form1;
	JMenuItem form2;
	
	
	
	
	
	public MenuDemo1()
	{
		frm = new JFrame("Admission System for PrestigeInstitute");
		
		bar = new JMenuBar();
		
		formsmenu= new JMenu("Forms");	
	
		
		form1 = new JMenuItem("Registration");//
		formsmenu.add(form1);		
		form1.setActionCommand("Registration_form");// give another name in string
		form1.addActionListener(new MenuHandler());//handler name
		
		form2 = new JMenuItem("Admission");//
		formsmenu.add(form2);
		form2.setActionCommand("Admission_form");// give another name in string
		form2.addActionListener(new MenuHandler());// handler name
		

		
		bar.add(formsmenu);
	
		
		frm.add(bar);
		
		frm.setJMenuBar(bar);
		
		frm.setSize(500,300);
		
		frm.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MenuDemo1 md = new MenuDemo1();
	}

}
