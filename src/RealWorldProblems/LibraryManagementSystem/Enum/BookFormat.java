package RealWorldProblems.LibraryManagementSystem.Enum;

public enum BookFormat {
    HARDCOPY("HARDCOPY"),
    SOFTCOPY("SOFTCOPY"),
    PDF("PDF");

    private final String value;

    BookFormat(String hardcopy) {
        this.value = hardcopy;
    }

    public String getValue() {
        return this.value;
    }
}
