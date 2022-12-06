package softuni.Demo.dto;

import java.util.Set;
import java.util.stream.Collectors;

public class ManagerDTO {
    private String firstName;
    private String lastName;
    private Set<EmployeeDTO> employees;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployees(Set<EmployeeDTO> employees) {
        this.employees = employees;
    }


    @Override
    public String toString() {

        String publicEmpl = employees
                .stream()
                .map(EmployeeDTO::toString)
                .map(s -> "    - " + s)
                .collect(Collectors.joining("\n"));

        return String.format("%s %s | Employees: %d%n%s%n",
                this.firstName, this.lastName, this.employees.size()
        ,publicEmpl);
    }
}
