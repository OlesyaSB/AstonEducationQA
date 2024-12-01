package Base;

import Tests.BaseSeleniumPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.support.PageFactory.initElements;

public class NameBlock extends BaseSeleniumPage {

    @FindBy(xpath = "//button[@class='button button__default ']")
    private WebElement paywrapperContinue;
    @FindBy(xpath = "//html/body/div[6]/main/div/div[2]/div")
    private WebElement paywrapperCooki;
    @FindBy(xpath = "//*[@id='cookie-agree']")
    private WebElement paywrapperCookBut;
    @FindBy(xpath = "//*[@id='pay-section']/div/div/div[2]/section/div/div[1]/div[1]")
    private WebElement paywrapperSelectList;
    @FindBy(xpath = "//p[@class='select__option'][1]")
    private WebElement paywrapperOption;
    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement paywrapperPhone;
    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement paywrapperSum;


    public NameBlock() {
        driver.get("http://mts.by/");
        initElements(driver, this);
    }

    public NameBlock fillFields(String numberValue, String sumValue) {
        //paywrapperCookBut.click();
        paywrapperSelectList.click();
        paywrapperOption.click();
        paywrapperPhone.sendKeys(numberValue);
        paywrapperSum.sendKeys(sumValue);
        paywrapperContinue.click();

        return this;
    }


}


