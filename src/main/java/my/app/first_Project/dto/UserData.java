package my.app.first_Project.dto;

import lombok.*;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;
//
//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }

    //    getter, setter,toString
//    기본 생성자, 전체 생성자,일부생성자
//@AllArgsConstructor
//    public UserData(String userName, int userAge, String userAddress) {
//        this.userName = userName;
//        this.userAge = userAge;
//        this.userAddress = userAddress;
//    }
//    @NoArgsConstructor
//    public UserData() {
//    }
//    @RequiredArgsConstructor
//
//    public UserData(String userName, int userAge) {
//        this.userName = userName;
//        this.userAge = userAge;
//    }
//    @Getter
//    public String getUserName() {
//        return userName;
//    }
//
//    public int getUserAge() {
//        return userAge;
//    }
//
//    public String getUserAddress() {
//        return userAddress;
//    }
//    @Setter
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setUserAge(int userAge) {
//        this.userAge = userAge;
//    }
//
//    public void setUserAddress(String userAddress) {
//        this.userAddress = userAddress;
//    }
//    @AllArgsConstructor
//    @NoArgsConstructor
//    @RequiredArgsConstructor
//    @Getter
//    @Setter
//    @Data
//    @ToString
//    @EqualsAndHashCode

    //    기본생성자 만들기
//    public UserData(){};
//    //        모든 멤버를 갖는 생성자 만들기
//    public UserData(String userName, int userAge, String userAddress) {
//        this.userName = userName;
//        this.userAge = userAge;
//        this.userAddress = userAddress;
//    }
//
//    //   Setter 만들기
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public void setUserAge(int userAge) {
//        this.userAge = userAge;
//    }
//
//    public void setUserAddress(String userAddress) {
//        this.userAddress = userAddress;
//    }
//
//    //    Getter 만들기
//    public String getUserName() {
//        return userName;
//    }
//
//    public int getUserAge() {
//        return userAge;
//    }
//
//    public String getUserAddress() {
//        return userAddress;
//    }
//
//    @Override
//    public String toString() {
//        return "UserData{" +
//                "userName='" + userName + '\'' +
//                ", userAge=" + userAge +
//                ", userAddress='" + userAddress + '\'' +
//                '}';
//    }
}
