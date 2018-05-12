package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CRMOpenPositionsPage {

    private SelenideElement openPositionsPicture = $(".open-positions"); // element with picture
    private SelenideElement mandarinVacancy = $("[href*=\"mandarin\"]"); // Mandarin vacancy
    private SelenideElement norweiganVacancy = $("[href*=\"norwegian\"]"); // Norweigan vacancy
    private SelenideElement frenchVacancy = $("[href*=\"french\"]"); // French vacancy


//This methods also for future
    public void clickNorwegianVacancy() {
        norweiganVacancy.click();
    }

    public void clickMandarinVacancy() {
        mandarinVacancy.click();
    }

    public void clickVacancy() {
        frenchVacancy.click();
    }

    public void checkCRMOpenPositionPage() {
        openPositionsPicture.shouldBe(Condition.visible);
        mandarinVacancy.shouldBe(Condition.visible);
        norweiganVacancy.shouldBe(Condition.visible);
        frenchVacancy.shouldBe(Condition.visible);
    }
}

