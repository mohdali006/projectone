package package1;
import javax.swing.*;
import java.awt.*;


public class AdmissionForm extends JFrame{
	
	JLabel lblEnrolmentNo,lblRegistrationNo,lblEnrolmentDate,lblEnrolmentCourseId,lblEnrolmentFees;
	JTextField txtEnrolmentNo,txtRegistrationNo,txtEnrolmentDate,txtEnrolmentCourseId,txtEnrolmentFees;;
    JPanel panel;
	public AdmissionForm() {
		
		panel = new JPanel();
		lblEnrolmentNo = new JLabel("Enter Enrolment No.");
		txtEnrolmentNo = new JTextField(15);
		lblRegistrationNo = new JLabel("Enter Registration No.");
		txtRegistrationNo = new JTextField(15);
		lblEnrolmentDate = new JLabel("Enter Enrolment Date");
		txtEnrolmentDate = new JTextField(15);
		lblEnrolmentCourseId = new JLabel("Enter Course Id");
		txtEnrolmentCourseId = new JTextField(15);
		lblEnrolmentFees = new JLabel("Total Fees");
		txtEnrolmentFees = new JTextField(20);
		
		
		
		panel.add(lblEnrolmentNo);
		panel.add(txtEnrolmentNo);
		panel.add(lblRegistrationNo);
		panel.add(txtRegistrationNo);
		panel.add(lblEnrolmentDate);
		panel.add(txtEnrolmentDate);
		panel.add(lblEnrolmentCourseId);
		panel.add(txtEnrolmentCourseId);
		panel.add(lblEnrolmentFees);
		panel.add(txtEnrolmentFees);	
		
		this.add(panel);	
		this.setSize(300,200);
		
		
	}
	
}
