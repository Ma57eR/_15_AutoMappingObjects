package softuni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softuni.entities.Employee;
import softuni.services.EmployeeService;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
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
                , manager
        );

        Employee second = new Employee(
                "Mr",
                "Second",
                BigDecimal.TEN,
                LocalDate.now()
                , null
        );

        employeeService.save(first);
    }
}
