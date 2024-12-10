package MyPackage;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamExample {
	 public static void main(String[] args) {  
	        List<Employee> employeesList = new ArrayList<>();  
	        //Adding Products  
	        employeesList.add(new Employee("01255","HP Laptop",27));  
	        employeesList.add(new Employee("01256","Dell Laptop",23));  
	        employeesList.add(new Employee("01257","Lenevo Laptop",24));  
	        employeesList.add(new Employee("01235","Sony Laptop",25));  
	        employeesList.add(new Employee("01259","Apple Laptop",26));  
	        // This is more compact approach for filtering data  
	        employeesList.stream()  
	                             .filter(employee -> employee.id.endsWith("55") && (employee.age >= 25 && employee.age <= 35)) 
	                             .forEach(employee -> System.out.println(employee.name));    
	    }  
}

class Employee{  
    String id;  
    String name;  
    int age;  
    public Employee(String id, String name, int age) {  
        this.id = id;  
        this.name = name;  
        this.age = age;  
    }  
} 