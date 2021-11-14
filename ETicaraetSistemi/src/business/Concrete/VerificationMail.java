package business.Concrete;

import java.util.ArrayList;
import java.util.List;

import business.Abstract.VerificationService;

public class VerificationMail implements VerificationService{
	
	CheckManeger checkManager;
	List<String> verificatedEmails = new ArrayList<String>();
	
	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email+" dogrumala adresi g�nderildi");
		
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email+" ba�ar�yla dogruland�");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}
