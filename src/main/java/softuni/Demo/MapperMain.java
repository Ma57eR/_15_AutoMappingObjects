package softuni.Demo;

import org.modelmapper.ModelMapper;
import softuni.Demo.dto.EmployeeDTO;
import softuni.Demo.dto.ManagerDTO;
import softuni.Demo.entities.Address;
import softuni.Demo.entities.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;

public class MapperMain {

    public static void main(String[] args) {

        ModelMapper mapper = new ModelMapper();
        Address address = new Address("ShitStreet", 20, "Sofia", "Bulgaria");

        Employee manager = new Employee(
                "Mr."
                , "Manager"
                , BigDecimal.valueOf(1300)
                , LocalDate.of(2022,01,01)
                , address
                , false);

        Employee employee1 = new Employee(
                "Petko"
                , "Todorov"
                , BigDecimal.valueOf(1000)
                , LocalDate.of(2022,01,01)
                , address
                , false);

        Employee employee2 = new Employee(
                "Todor"
                , "Petkov"
                , BigDecimal.valueOf(2500)
                , LocalDate.of(2020,01,01)
                , address
                , false);


        manager.addEmployee(employee1);
        manager.addEmployee(employee2);

        ManagerDTO dto = mapper.map(manager, ManagerDTO.class);

        System.out.println(dto);

    }
}
