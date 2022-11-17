public class Main {
    public static void main(String[] args) {


        Customer customer = new Customer();
        Employee employee = new Employee();

        // Class lar attributes veya operasyonlar tutar.

        System.out.println("TEMEL İNHERİTANCE YAPISI");

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();

        employeeManager.bestEmployee();
        customerManager.add();




    }
}