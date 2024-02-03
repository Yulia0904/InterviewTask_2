package com.interview.pages;
import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearchPage {

    public BingSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@id=\"sb_form_q\"]")
    public WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"sb_form_go\"]/svg")
    public WebElement searchButton;
}

