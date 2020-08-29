package data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static AuthInfo getOtherAuthInfo(AuthInfo original) {
        return new AuthInfo("petya", "123qwerty");
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }
    public static DashboardPage getDashboardPage1() {
        return new DashboardPage("5559000000000002","1500");
    }

    public static DashboardPage getDashboardPage2() {
        return new DashboardPage("5559000000000001","9999");
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class VerificationCode {
        private String code;
    }

    @Value
    public static class DashboardPage {
        private String card;
        private String summaTransact;
    }
}
