package package1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuHandler implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        switch(e.getActionCommand())
		{
		
		case "Registration_form":
			new RegistrationForm().setVisible(true);
			break;
		case "Admission_form":
			new AdmissionForm().setVisible(true);
			break;
			
		}
		
	}

}
