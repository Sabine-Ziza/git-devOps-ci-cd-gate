package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SortFilter {

    private WebDriver driver;
    private By dropdown = By.className("form-select");

    public SortFilter(WebDriver driver){
        this.driver = driver;
    }
    public void sortProduct(String optionText){

        WebElement dropdownElement = driver.findElement(dropdown);
        dropdownElement.click();
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(optionText);

    }


}
