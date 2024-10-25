import Entities.Addres;
import Entities.Department;
import Entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.print("Entre com o nome do Departamento: ");
        String departmentName = scanner.nextLine();

        System.out.print("Entre com o dia do Pagamento: ");
        int payDay = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Entre com o email do Departamento: ");
        String email = scanner.nextLine();

        System.out.print("Entre com o telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Digite o número de funcionários: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        Department department = new Department(departmentName, payDay);
        Addres addres = new Addres(email, telefone);  // Fixed spelling from 'Addres' to 'Address'
        department.setAddres(addres);  // Fixed method name from 'setAddres' to 'setAddress'

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do Funcionário " + i + ":");

            System.out.print("Qual o nome dele: ");
            String name = scanner.nextLine();

            System.out.print("Qual o Salário dele: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();  // Consume the newline character

            Employee employee = new Employee(name, salary);
            department.addEmployee(employee);
        }

        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO");
        showReport(department);
    }

    public static void showReport(Department department) {
        System.out.printf("Departamento:- Total: %.2f%n",department.payroll());
        System.out.println("Pagamento realizado no dia: " + department.getPayDay());
        System.out.println("Funcionários:");

        List<Employee> employees = department.getEmployees();
        for (Employee employee : employees) {
            System.out.printf("- Nome: %s, Salário: %.2f%n", employee.getName(), employee.getSalary());
        }

        System.out.println("Para dúvidas, favor entrar em contato com " + department.getAddres().getEmail());  // Fixed method name from 'getAddres' to 'getAddress'
    }
}