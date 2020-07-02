/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pages;

import com.itexps.util.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author ashut
 */
public class CateringPage extends BaseClass {
    
     @FindBy(id="Name")
    private WebElement fullname;
    @FindBy(css = "[title='Catering']")
    private WebElement title;
    
    @FindBy(id="Email")
    private WebElement email;
    
    @FindBy(id="Phone")
    private WebElement phoneno;
    
    @FindBy(id="Comment")
    private WebElement comment;
    
   @FindBy(xpath= "(//select[@id='Location'])[2]")
    private WebElement location;
   
    @FindBy(name="Captcha")
    private WebElement Captcha;
    
   @FindBy(xpath="//input[@value='Submit Form']")
    private WebElement submit; 
   
   // initializing pageobject here
    public CateringPage(){PageFactory.initElements(driver,this);
    }
    // action or the process
    public void catering (){
        title.click();
    }
     public void info(){
      //  title.click();
      fullname.sendKeys(prop.getProperty("name"));
      email.sendKeys(prop.getProperty("email"));
      phoneno.sendKeys(prop.getProperty("phone"));
      phoneno.sendKeys(Keys.TAB);
      location.sendKeys("c");
      location.sendKeys("c");
      comment.sendKeys(prop.getProperty("comment"));
      Captcha.sendKeys(prop.getProperty("captcha"));
      submit.click();
      driver.quit();
     }
     
     
    }   

