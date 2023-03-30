package softuni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.entities.Employee;
import softuni.services.EmployeeService;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
