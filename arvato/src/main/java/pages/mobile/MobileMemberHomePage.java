package pages.mobile;

import com.codeborne.selenide.SelenideElement;
import pages.AbstractPage;

import static com.codeborne.selenide.Selenide.$;

public class MobileMemberHomePage extends AbstractPage {
    private SelenideElement avatarTag = $(".avatar-tag.user");


    public void checkPage() {
        checkVisibleElements(avatarTag);
    }
}
