package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class EuProjectPage {

    private SelenideElement labelEU = $(".alignnone.wp-image-493"); // logo of EU


    public void checkingEuPage() {
        labelEU.shouldBe(Condition.exist);
    }
}
