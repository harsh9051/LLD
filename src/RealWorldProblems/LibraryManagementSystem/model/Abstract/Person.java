package RealWorldProblems.LibraryManagementSystem.model.Abstract;

public abstract class Person {

    private String name;
    private String email;
    //We can make an Address class also
    private String address;
    private String phoneNo;

    public Person(String name, String email, String address, String phoneNo) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
    }
}
