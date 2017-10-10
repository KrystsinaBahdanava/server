package by.kr.business_logic.person;

public class Stuff extends Job{
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int managerId;
    //private int salaryId;
    Salary salary; // если ассоциация или нечто подобное
    Login login;
    Department department;
}
