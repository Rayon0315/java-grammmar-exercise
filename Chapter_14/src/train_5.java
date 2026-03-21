import java.util.List;
import java.util.stream.Stream;

public class train_5 {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmpList();
        Stream<Employee> employeeStream = employees.stream();
        employeeStream = employeeStream.filter(person -> (person.getSex().equals("女") && person.getSalary() > 5000));
        List<Employee> result = employeeStream.toList();
        for (Employee emp : result) {
            System.out.println(emp);
        }
    }
}
