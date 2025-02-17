package RealWorldProblems.LibraryManagementSystem.Enum;

import java.util.Objects;

public enum BookStatus {

    AVAILABLE("AVAILABLE"),
    BORROWED("BORROWED"),
    LOST("LOST"),
    RESERVED("RESERVED"),
    NOTAVAILABLE("NOTAVAILABLE");

    private final String value;

    BookStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
