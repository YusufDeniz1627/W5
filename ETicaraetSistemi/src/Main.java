import business.Abstract.VerificationService;
import business.Concrete.CheckManeger;
import business.Concrete.CustomerManager;
import business.Concrete.VerificationMail;
import core.GoogelLoginAdapter;
import dataAccess.Concrete.HibernateCustomerDao;
import entities.concrete.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1= new Customer(1,"Muhammed Yusuf","Deniz","myusufd@gmail.com","123");
		Customer customer2=new Customer(2,"Ahmed","Deniz","","96859685");
		Customer customer3=new Customer(3,"Furkan","Akçalý","myusufdeniz8@gmail.com","96859685");
		CustomerManager customerManager = new CustomerManager(new CheckManeger(),new VerificationMail(),new HibernateCustomerDao());
		//Çýkýþ-Giriþ Ýþlemi
		customerManager.signIn(customer3);
		customerManager.signUp(customer3);
		//Google ile giriþ
		GoogelLoginAdapter adapter=new GoogelLoginAdapter();
		adapter.verifyMail(customer1.getEmail());
		//Email ve password Kontrol
		CheckManeger check=new CheckManeger();
		check.checkEmail(customer2);
		check.checkPassword(customer1);
		
		
	}

}
