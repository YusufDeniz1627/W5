package core;

import java.util.ArrayList;
import java.util.List;

import business.Abstract.VerificationService;

public class GoogelLoginAdapter implements VerificationService{
	List<String> verificationMail=new ArrayList<String>();
	


	@Override
	public void sendToVerifyMail(String email) {
	System.out.println("Dogrulama maili g�nderildi");
		
	}

	@Override
	public void verifyMail(String email) {
		verificationMail.add(email);
		System.out.println(email+" ba�ar�yla dogruland�");
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		
		if(verificationMail.contains(email)) {
			return true;
		}
		return false;
	}}
