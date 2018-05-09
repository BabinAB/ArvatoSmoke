package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class ITDevelopmentCentrePage {

    private SelenideElement openPositionsButton = $(".text-center button"); // Open Positions button
    private SelenideElement itDevelopmentPicture = $(".it-dev-center"); // element of Picture in the Content part of the page


    public void checkItDevelopmentCentreButton() {
        openPositionsButton.shouldBe(Condition.visible);
    }

    public void checkItDevelopmentCentrePicture() {
        itDevelopmentPicture.shouldBe(Condition.visible);
    }

//clicking on Open Positions button
    public void clickOpenPositionsButton() {
        openPositionsButton.click();
    }
}
