package DesignPatterns.BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {

        User user1 = new User.Builder()
                .setUserId("1")
                .setUserName("Harsh")
                .setEmaiId("h.harsh.jain")
                .build();

    }
}
