package business.Concrete;

import business.Abstract.CustomerService;
import dataAccess.Concrete.HibernateCustomerDao;
import entities.concrete.Customer;

public class CustomerManager implements CustomerService{

	public CustomerManager(CheckManeger checkManeger, VerificationMail verificationMail,
			HibernateCustomerDao hibernateCustomerDao) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void signUp(Customer customer) {
		System.out.println("Giri� Ba�ar�l�");
		
	}

	@Override
	public void signIn(Customer customer) {
		System.out.println("��k�� Ba�ar�l�");
		
	}

}
