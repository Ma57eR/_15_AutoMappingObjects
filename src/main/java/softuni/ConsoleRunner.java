package softuni;

import org.springframework.boot.CommandLineRunner;
import softuni.entities.Employee;
import softuni.services.EmployeeService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ConsoleRunner implements CommandLineRunner {

    private EmployeeService employeeService;

    public ConsoleRunner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) throws Exception {
        Employee manager = new Employee(
                "Mr",
                "Manager",
                BigDecimal.TEN,
                LocalDate.now()
                , null
        );

        Employee first = new Employee(
                "Mr",
                "First",
                BigDecimal.TEN,
                LocalDate.now()
                , null
        );

        Employee second = new Employee(
                "Mr",
                "Second",
                BigDecimal.TEN,
                LocalDate.now()
                , null
        );

this.employeeService.save(first);
    }
}
