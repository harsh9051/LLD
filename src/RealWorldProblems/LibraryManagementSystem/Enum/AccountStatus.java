package RealWorldProblems.LibraryManagementSystem.Enum;

public enum AccountStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE");
    public final String value;

    AccountStatus(String value) {
        this.value = value;
    }

}
