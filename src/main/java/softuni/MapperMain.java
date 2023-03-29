package softuni;

import org.modelmapper.ModelMapper;
import softuni.dto.EmployeeDTO;
import softuni.entities.Address;
import softuni.entities.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MapperMain {
    public static void main(String[] args) {
        ModelMapper mapper = new ModelMapper();

        Address address = new Address("Rakovski", 22, "Sofia", "Bulgaria");
        Employee employee = new Employee("Ivan", "Petkov", BigDecimal.ONE, LocalDate.of(2022, 3, 5), address);

        System.out.println(employee + " <- full Employee");

        EmployeeDTO dto = mapper.map(employee, EmployeeDTO.class);

        System.out.println(dto + " <- dto Employee");
    }
}
