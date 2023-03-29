package OldWatchedAndCoded.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.OldWatchedAndCoded.entities.Employee;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findByBirthdateBeforeOrderBySalaryDesc(LocalDate beforeYear);
}
