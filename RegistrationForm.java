package package1;


import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame{
	
    JLabel lblRegistrationNo;
	JTextField txtRegistrationNo;
	
	JLabel lblStudentName;
	JTextField txtStudentName;
	
	JLabel lblFatherName;
	JTextField txtFatherName;
	
	JLabel lblDateOfBirth;
	JTextField txtDateOfBirth;
	
	JRadioButton b1,b2;
	
	JLabel lblEmailId;
	JTextField txtEmailId;
	
	JLabel lblAadharNo;
	JTextField txtAadharNo;
	
	JLabel lblContactNo;
	JTextField txtContactNo;
	
	JLabel lblAddressDetails;
	JTextField txtAddressDetails;
	
	JLabel lblCity;
	JTextField txtCity;
	
	JLabel lblInitialAmount;
	JTextField txtInitialAmount;
	
	JComboBox cmbCourseName;
	
	JLabel lblCourseId;
	JTextField txtCourseId;
	
	JLabel lblRegistrationDate;
	JTextField txtRegistrationDate;
	JPanel panel;
	
	public  RegistrationForm()
	{
		super("Registration Form");
		  panel = new JPanel();
		  
		  lblRegistrationNo=new JLabel("RegistrationNo");
		  txtRegistrationNo=new JTextField(10);
		  
		  lblStudentName=new JLabel("StudentName");
		  txtStudentName=new JTextField(50);
		  
		  lblFatherName=new JLabel("FatherName");
		  txtFatherName=new JTextField(50);
		  
		  lblDateOfBirth=new JLabel("DateOfBirth");
		  txtDateOfBirth=new JTextField(50);
		  
		  b1=new JRadioButton("A) Male");
		  b2=new JRadioButton ("B) Female");
		  JButton button= new JButton();
			button.add(b1);
			button.add(b2);
		  
		  lblEmailId=new JLabel("EmailId");
		  txtEmailId=new JTextField(50);
		  
		  lblAadharNo=new JLabel("AadharNo");
		  txtAadharNo=new JTextField(12);
		  
		  lblContactNo=new JLabel("ContactNo");
		  txtContactNo=new JTextField(10);
		  
		  lblAddressDetails=new JLabel("AddressDetails");
		  txtAddressDetails=new JTextField(250);
		  
		  lblCity=new JLabel("City");
		  txtCity=new JTextField(50);
		  
		  lblInitialAmount=new JLabel("InitialAmount");
		  txtInitialAmount=new JTextField(50);
		  
		  cmbCourseName = new JComboBox();
			cmbCourseName.addItem("Computer Science And Engineering ");
			cmbCourseName.addItem("Civil Engineering");		
			cmbCourseName.addItem("Electrical Engineering");
			cmbCourseName.addItem("Electronics And Communication Engineering");
			cmbCourseName.addItem("Mechanical Engineering");
			cmbCourseName.addItem("Electrical and Electronics Engineering");
			cmbCourseName.addItem("Automobile Engineering");
			cmbCourseName.addItem("Information Technology");
		  
		  lblCourseId=new JLabel("CourseId");
		  txtCourseId=new JTextField(10);
		  
		  lblRegistrationDate=new JLabel("RegistrationDate");
		  txtRegistrationDate=new JTextField(50);
		  
		  lblRegistrationNo=new JLabel("RegistrationNo");
		  txtRegistrationNo=new JTextField(10);
		  
		 
		  
		  
		  
		  
		  
		  
		  panel.add(lblRegistrationNo);
		  panel.add(txtRegistrationNo);
		  
		  panel.add(lblStudentName);
		  panel.add(txtStudentName);
		  
		  panel.add(lblFatherName);
		  panel.add(txtFatherName);
		  
		  panel.add(lblEmailId);
		  panel.add(txtEmailId);
		  
		  panel.add(lblAadharNo);
		  panel.add(txtAadharNo);
		  
		  panel.add(lblDateOfBirth);
		  panel.add(txtDateOfBirth);
		  
		  panel.add(b1);
		  panel.add(b2);
		  
		  panel.add(lblContactNo);
		  panel.add(txtContactNo);
		  
		  panel.add(lblAddressDetails);
		  panel.add(txtAddressDetails);
		  
		  panel.add(lblCity);
		  panel.add(txtCity);
		  
		  panel.add(lblInitialAmount);
		  panel.add(txtInitialAmount);
		  
		  panel.add(cmbCourseName);
		  
		  panel.add(lblCourseId);
		  panel.add(txtCourseId);
		  
		  panel.add(lblRegistrationDate);
		  panel.add(txtRegistrationDate);
		  
		  panel.add(lblRegistrationNo);
		  panel.add(txtRegistrationNo);
		  
		  this.add(panel);
		  
		  this.setSize(300,200);
	}
	

}