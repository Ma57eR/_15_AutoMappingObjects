package softuni.services;

import softuni.entities.Employee;

import java.util.Optional;

public interface EmployeeService {

    Optional<Employee> findOneById(int id);

    void save(Employee employee);
}
