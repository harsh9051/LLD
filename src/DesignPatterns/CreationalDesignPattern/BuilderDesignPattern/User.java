package DesignPatterns.CreationalDesignPattern.BuilderDesignPattern;

public class User {
    private final String userId;
    private final String emaiId;
    private final String userName;

    private User(Builder builder) {
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.emaiId = builder.emaiId;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmaiId() {
        return emaiId;
    }

    public String getUserName() {
        return userName;
    }

    static class Builder{
        private String userId;
        private String emaiId;
        private String userName;

        public Builder() {
        }

        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setEmaiId(String emaiId) {
            this.emaiId = emaiId;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
