package com.seed.cucumber.pages;

import com.seed.cucumber.TestRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

    public WebElement query;

    public GoogleSearchPage() {
//        query = TestRunner.webDriver.findElement(By.id("lst-ib"));
        query = TestRunner.webDriver.findElement(By.name("q"));
    }
}
