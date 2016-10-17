package com.haih.model;


public class UserOld {
    private int id;  
    private String userName;
    private String password;
    private int age;
    
    public static class Builder {
        private final int id;
        private final String userName;
        private final String password;
        private final int age;
        public Builder(int id,String userName,String password,int age){
            this.id = id;
            this.userName = userName;
            this.password = password;
            this.age = age;
        }
        public UserOld build(){
            return new UserOld(this);
        }
    }
    private UserOld(Builder builder){
        id = builder.id;
        userName = builder.userName;
        password = builder.password;
        age = builder.age;
    }
    public UserOld(){}
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }
    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }
    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}
