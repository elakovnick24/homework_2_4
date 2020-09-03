package test;

import data.DataHelper;
import lombok.val;
import org.junit.jupiter.api.Test;
import page.DashboardPage;
import page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class ShoudTransfer {

    @Test
    void shouldTransferMoneyBetweenOwnCards() {

        val loginPage = open("http://localhost:9999", LoginPage.class);
// можно заменить на val loginPage = open("http://localhost:9999", LoginPageV2.class);
        val authInfo = DataHelper.getAuthInfo();
        val verificationPage = loginPage.validLogin(authInfo);
        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        val dashboardPage = DashboardPage.transaction1();
        val transaction = DataHelper.getDashboardPage1();
        dashboardPage.amountFromCard1(transaction);

    }

    @Test
    void shouldTransferMoneyBetweenOwnCards1(){
        val loginPage = open("http://localhost:9999", LoginPage.class);
// можно заменить на val loginPage = open("http://localhost:9999", LoginPageV2.class);
        val authInfo = DataHelper.getAuthInfo();
        val verificationPage = loginPage.validLogin(authInfo);
        val verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
        val dashboardPage = DashboardPage.transaction2();
        val transaction = DataHelper.getDashboardPage2();
        dashboardPage.amountFromCard2(transaction);
    }
}
