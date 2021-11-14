package business.Abstract;


import entities.concrete.Customer;

public interface CustomerService {
	
	void signUp(Customer customer);
	void signIn(Customer customer);
}
