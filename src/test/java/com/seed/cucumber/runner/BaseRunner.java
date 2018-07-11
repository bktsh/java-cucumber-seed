package com.seed.cucumber.runner;

import com.seed.cucumber.TestRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

public abstract class BaseRunner extends TestRunner {

// In your app, you'lll need a defualt login page to ghandle authentication
//    private static LoginPage loginPage;

    @BeforeClass
    public static void setUpSuite() {
        TestRunner.setUpSuite();
//        login();
    }

    @AfterClass
    public static void tearDownSuite() {
        TestRunner.tearDownSuite();
    }

    private static void login() {
        webDriver.findElement(By.name("username")).sendKeys("<<username>>");
        webDriver.findElement(By.name("password")).sendKeys("<<password>>");
        webDriver.findElement(By.name("login")).click();
    }

//    public static LoginPage getLoginPage() {
//        if (loginPage == null) {
//            loginPage = new LoginPage();
//        }
//        return loginPage;
//    }

}
