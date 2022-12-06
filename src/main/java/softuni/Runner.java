package softuni;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import softuni.Demo.dto.EmployeeDTO;
import softuni.entities.Employee;
import softuni.entities.dto.CustomEmplDTO;
import softuni.entities.dto.EmployeeSpringDTO;
import softuni.services.EmployeeService;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Component
public class Runner implements CommandLineRunner {

    private EmployeeService employeeService;
    private ModelMapper mapper = new ModelMapper();

    @Autowired
    public Runner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @Override
    public void run(String... args) throws Exception {

        this.persist();

        List<Employee> list = this.employeeService.findEmployeesBefore(1990);
        //Employee manager = managerOp.get();


//        list
//            .stream()
//            .map(e -> mapper.map(e, EmployeeSpringDTO.class))
//            .forEach(System.out::println);

        //System.out.println(dto);

        TypeMap<Employee, CustomEmplDTO> employeeToCustom =
                mapper.createTypeMap(Employee.class, CustomEmplDTO.class);
        employeeToCustom.<Integer>addMapping(source -> source.getManager() == null ? 0 : source.getLastName().length(),
                CustomEmplDTO::setManagerLastNameLength);


        list
                .stream()
                .map(employeeToCustom::map)
                .forEach(System.out::println);




    }

    private void persist() {
        Employee manager = new Employee(
                "Mr."
                , "Manager"
                , BigDecimal.TEN
                , LocalDate.now()
                , null
        );

        Employee firstEmployee = new Employee(
                "Mr."
                , "Manager"
                , BigDecimal.TEN
                , LocalDate.now()
                , manager);

        Employee secondEmployee = new Employee(
                "Mr."
                , "Manager"
                , BigDecimal.TEN
                , LocalDate.now()
                , manager);


        this.employeeService.save(secondEmployee);
    }
}
