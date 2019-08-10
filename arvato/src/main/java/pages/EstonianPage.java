package pages;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EstonianPage {


    private SelenideElement avaleht = $("#menu-item-223"); //element with Estonian language


    public void checkEstonian() {
        avaleht.shouldHave(text("Avaleht"))
                .shouldNotHave(text("Home"));
    }
}
