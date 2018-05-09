package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class ItCentreOpenPositionsPage {

    private SelenideElement teamManagerVacancy = $("[href*=\"team-manager\"]"); // Team-manager vacancy
    private SelenideElement netDeveloperInternVacancy = $("[href*=\"net-developer-intern\"]"); // Net developer intern vacancy
    private SelenideElement cyberSecuritySpecialistVacancy = $("[href*=\"cyber-security-specialist-intern\"]"); // Cyber Security specialist vacancy
    private SelenideElement tester = $("[href*=\"qa-engineer\"]"); // QA Automation vacancy
    private SelenideElement netWebDeveloper = $("[href*=\"net-developer-intern\"]"); // Net web developer vacancy
    private SelenideElement fullStackDeveloper = $("[href*=\"full-stack-javascript\"]"); // Full-stack JavaScript Developer vacancy
    private SelenideElement germanJavaDeveloper = $("[href*=\"german-speaking-java\"]"); // German Speaking Java developer vacancy
    private SelenideElement textIt = $(".text-center"); // Element with text before positions




//This methods for future
    public void clickTeamManagerVacancy() {
        teamManagerVacancy.click();
    }

    public void clickNetDeveloper() {
        netDeveloperInternVacancy.click();
    }
    public void clickCyberSecurity() {
        cyberSecuritySpecialistVacancy.click();
    }

    public void clickQA() {
        tester.click();
    }

    public void clickNetWebDeveloper() {
        netWebDeveloper.click();
    }
    public void clickFullStackDeveloper() {
        fullStackDeveloper.click();
    }
    public void clickGermanJavaDeveloper() {
        germanJavaDeveloper.click();
    }



    public void checkItCentreOpenPositionPage() {
        textIt.shouldBe(Condition.visible);
        teamManagerVacancy.shouldBe(Condition.visible);
        netDeveloperInternVacancy.shouldBe(Condition.visible);
        netWebDeveloper.shouldBe(Condition.visible);
    }
}
