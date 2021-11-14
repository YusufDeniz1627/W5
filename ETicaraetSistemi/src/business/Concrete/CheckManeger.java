package business.Concrete;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import business.Abstract.CustomerCheckService;
import business.Abstract.VerificationService;
import dataAccess.Abstract.CustomerDao;
import entities.concrete.Customer;

public class CheckManeger implements CustomerCheckService{
	List<String> listOfEmail = new ArrayList<String>();

	@Override
	public boolean checkFirstName(Customer customer) {
		if (customer.getFirstName().isEmpty()) {
			System.out.println("İsim alanı boş bırakılamaz.");
			return false;
		} else {
			if (customer.getFirstName().length() < 3) {
				System.out.println("İsim 2 karakterden daha küçük olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkLastName(Customer customer) {
		if (customer.getLastName().isEmpty()) {
			System.out.println("Soyisim alanı boş bırakılamaz.");
			return false;
		} else {
			if (customer.getLastName().length() < 3) {
				System.out.println("Soyisim 2 karakterden daha küçük olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (customer.getEmail().isEmpty()) {
			System.out.println("Email alanı boş bırakılamaz.");
			return false;
		} else {
			if (pattern.matcher(customer.getEmail()).find() == false) {
				System.out.println("Girilen email adresi formata uygun değil. Örnek: ornek@ornek.com");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkPassword(Customer customer) {
		if (customer.getPassword().isEmpty()) {
			System.out.println("Parola alanı boş bırakılamaz.");
			return false;
		} else {
			if (customer.getPassword().length() < 6) {
				System.out.println("Parola 6 karakterden daha küçük olamaz.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(Customer customer) {
		boolean result=true;
		if (listOfEmail.contains(customer.getEmail())) {
			System.out.println("Bu mail adresi ile sisteme daha önce kayıt olunmuş, farklı bir mail adresi deneyiniz.");
			result=false;
		}else{
			result=true;
			listOfEmail.add(customer.getEmail());
		}		
		return result;
	}

	@Override
	public boolean isValid(Customer customer) {
		if (checkFirstName(customer) && checkLastName(customer) && checkEmail(customer) && checkPassword(customer)
				&& uniqueEmail(customer) == true) {
			return true;
		}
		return false;
	}

	@Override
	public boolean checkMail(Customer customer) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (customer.getEmail().isEmpty()) {
			System.out.println("Email alanı boş bırakılamaz.");
			return false;
		} else {
			if (pattern.matcher(customer.getEmail()).find() == false) {
				System.out.println("Girilen email adresi formata uygun değil. Örnek: ornek@ornek.com");
				return false;
			}
		}
		return true;
	}

	

}
