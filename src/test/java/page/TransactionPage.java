package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import data.DataHelper;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TransactionPage {
    private SelenideElement heading = $("[data-test-id='dashboard']");

    public TransactionPage(){
        heading.shouldBe(Condition.visible);
    }

    private SelenideElement amount = $("[data-test-id='amount'] input");
    private SelenideElement from = $("[data-test-id='from'] input");
    private SelenideElement button = $(".button__text");

    public DashboardPage amountFromCard1 (DataHelper.DashboardPage cardToCard1) {
        amount.setValue(cardToCard1.getSummaTransact());
        from.setValue(cardToCard1.getCard());
        button.click();
        return new DashboardPage();
    }

    public DashboardPage amountFromCard2 (DataHelper.DashboardPage cardToCard2) {
        amount.setValue(cardToCard2.getSummaTransact());
        from.setValue(cardToCard2.getCard());
        button.click();
        return new DashboardPage();
    }
}
