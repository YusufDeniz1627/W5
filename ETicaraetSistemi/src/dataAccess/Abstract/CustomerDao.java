package dataAccess.Abstract;

import java.util.List;

import entities.concrete.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	boolean getEmail(String email);
	boolean getPassword(String password);
	List<Customer> getAll();
}
