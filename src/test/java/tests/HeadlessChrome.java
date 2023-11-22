package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BooztPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.io.IOException;

public class HeadlessChrome {

    BooztPage booztPage = new BooztPage();

        @Test
        public void testHeadlessSetup() throws IOException
        {
            String myBooztText = "My Boozt";

            Driver.getDriver().get(ConfigReader.getProperty("url"));

            Driver.quitDriver();
        }




                }
