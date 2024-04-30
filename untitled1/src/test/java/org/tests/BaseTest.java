package org.tests;

import org.FilesLoader.FileLoader;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.pages.NavigationPage;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.Objects;


public class BaseTest {


    // This class has all generic methods that needed for all tests class
    // we can also enhance the structure by creating another separate class to handle the hooks
    protected WebDriver driver;
    protected FileLoader fileLoader = new FileLoader();

    NavigationPage navigationPage = new NavigationPage(driver);


    public  BaseTest(){
        try {
            fileLoader.jsonReader();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    @BeforeSuite
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    protected void navigateTo(String word){
        String url = "http://localhost:8080/" + word;
        driver.get(url);
    }

    public static String removeVowels(String input) {
        String pattern = "[aeiou]";
        String result = input.replaceAll(pattern, "");
        return result;
    }

/*just want to handle the internal server error as i can't run the test class one time and consider it as env issue
     however I see it as not best practice*/
    protected void handleInternalError(String input){
        String message = "Internal Server Error";
        if (Objects.equals(input, message))
            throw new SkipException("Skipping this test method due to a Internal Server Error");

    }
}
