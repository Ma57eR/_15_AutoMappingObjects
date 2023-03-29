package softuni.Demo;

import org.modelmapper.ModelMapper;
import softuni.Demo.dto.ManagerDTO;
import softuni.Demo.entities.Address;
import softuni.Demo.entities.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MapperMain {
    public static void main(String[] args) {
        ModelMapper mapper = new ModelMapper();

        Address address = new Address("Rakovski", 22, "Sofia", "Bulgaria");
        Employee manager = new Employee("Mr", "Manager", BigDecimal.ONE, LocalDate.of(2022, 3, 5), address);
        Employee first = new Employee("Ivan1", "Petkov", BigDecimal.ONE, LocalDate.of(2022, 3, 5), address);
        Employee second = new Employee("Ivan2", "Petkov", BigDecimal.TEN, LocalDate.of(2022, 3, 5), address);

        manager.addEmployee(first);
        manager.addEmployee(second);

        System.out.println(manager + " <- full Employee");

        ManagerDTO dto = mapper.map(manager, ManagerDTO.class);

        System.out.println(dto + " <- dto Employee");
    }
}
