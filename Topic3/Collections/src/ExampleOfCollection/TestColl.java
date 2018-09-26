package ExampleOfCollection;
 
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
public class TestColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Rol> roles = new HashSet<>();
		roles.add(new Rol("Design"));
		roles.add(new Rol("Gaming"));
		roles.add(new Rol("Gaming"));
		roles.add(new Rol("Infrastructure"));
		System.out.println(roles);
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee("Perez","Jefferson","Programmer",29));
		employees.add(new Employee("Espinola","Valen","Programmer", 27));
		employees.add(new Employee("Heredia","Emanuel","Programmer", 27));
		System.out.println(employees);
		
		
		
	}

}
