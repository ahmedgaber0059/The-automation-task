package org.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {


    @Test
    public void enterInputWithVowels() {
        navigateTo(fileLoader.InputWithVowels);
        System.out.println(fileLoader.InputWithVowels);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }

    @Test
    public void enterInputWithoutVowels(){
        navigateTo(fileLoader.InputWithoutVowels);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }
    @Test
    public void enterInputWithAllVowels(){
        navigateTo(fileLoader.InputWithAllVowels);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }

    @Test
    public void enterEmptyInput(){
        navigateTo(fileLoader.EmptyInput);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);


        Assert.assertEquals(input , "Send GET to /:input");
    }

    //This is failed TC
    @Test
    public void enterInputWithCapitalVowels(){
        navigateTo(fileLoader.InputWithCapitalVowels);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }

    @Test
    public void enterIntegers(){
        navigateTo(fileLoader.Integers);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }

    @Test
    public void enterInputWithSpaces(){
        navigateTo(fileLoader.InputWithSpaces);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }

    @Test
    public void enterInputWithSpecialCharacters(){
        navigateTo(fileLoader.InputWithSpecialCharacters);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }

    @Test
    public void trySqlInjection(){
        navigateTo(fileLoader.SqlInjection);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , "Not Found");
    }

    @Test
    public void enterInputWithAnotherLanguage(){
        navigateTo(fileLoader.InputWithAnotherLanguage);
        String input = driver.findElement(navigationPage.inputLocator).getText();
        handleInternalError(input);

        Assert.assertEquals(input , removeVowels(input));
    }
}
