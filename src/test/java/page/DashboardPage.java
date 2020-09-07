package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {

    private static SelenideElement heading = $("[data-test-id='dashboard']");
    private SelenideElement transact1 = $("[data-test-id='92df3f1c-a033-48e6-8390-206f6b1f56c0']");
    private SelenideElement transact2 = $("[data-test-id='0f3f5c2a-249e-4c3d-8287-09f7a039391d']");
    private static SelenideElement card1 = $("[data-test-id='92df3f1c-a033-48e6-8390-206f6b1f56c0'] button");
    private static SelenideElement card2 = $("[data-test-id='0f3f5c2a-249e-4c3d-8287-09f7a039391d'] button");
    private SelenideElement reload = $("[data-test-id=action-reload]");

    public DashboardPage(){
        heading.shouldBe(Condition.visible);

    }

    public static TransactionPage transaction1() {
        card1.click();
        return new TransactionPage();
    }

    public static TransactionPage transaction2 () {
        card2.click();
        return new TransactionPage();
    }

    public static void page () {
        heading.shouldBe(Condition.visible);
    }
}

