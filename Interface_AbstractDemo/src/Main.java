import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,
				"Berkan",
				"Senger",
				1998,
				"15520652196"));
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setFirstName("Seren");
		customer2.setLastName("Senger");
		customer2.setDateOfBirth(1993);
		customer2.setNationalityId("1253554670");
		
		//customerManager.save(customer2);
	}

}
