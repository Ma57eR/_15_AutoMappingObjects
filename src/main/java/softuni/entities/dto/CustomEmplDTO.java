package softuni.entities.dto;

public class CustomEmplDTO {
    private String firstName;
    private String lastName;
    private int managerLastNameLength;

    public CustomEmplDTO(String firstName, String lastName, int managerLastNameLength) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.managerLastNameLength = managerLastNameLength;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getManagerLastNameLength() {
        return managerLastNameLength;
    }

    public void setManagerLastNameLength(int managerLastNameLength) {
        this.managerLastNameLength = managerLastNameLength;
    }
}
