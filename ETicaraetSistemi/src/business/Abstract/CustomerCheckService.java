package business.Abstract;

import entities.concrete.Customer;

public interface CustomerCheckService {
	boolean checkFirstName(Customer customer);
	boolean checkLastName(Customer customer);
	boolean checkMail(Customer customer);
	boolean checkPassword(Customer customer);
	boolean uniqueEmail(Customer customer);
	boolean isValid(Customer customer);
	boolean checkEmail(Customer customer);
}
