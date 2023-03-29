package OldWatchedAndCoded.services;

import softuni.OldWatchedAndCoded.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> findOneById(int id);

    void save(Employee employee);

    List<Employee> findEmployeesBefore(int year);
}
