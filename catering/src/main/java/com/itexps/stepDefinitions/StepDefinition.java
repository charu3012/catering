/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.stepDefinitions;

import com.itexps.pages.CateringPage;
import com.itexps.util.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 *
 * @author ashut
 */
public class StepDefinition extends BaseClass{
    CateringPage cateringpage;
//declareing variualbes
   @Given("^user is on catering homepage$")
public void user_is_on_catering_homepage() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //initialization of bulletin class
   BaseClass.initialization();
   cateringpage = new CateringPage ();
   //calls catering methods
   cateringpage.catering();
}

@Then("^user enter name and email$")
public void user_enter_name_and_email() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // calling info methods from the catering page
    cateringpage.info();
}

@Then("^user enter phone no\\. and comment$")
public void user_enter_phone_no_and_comment() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user click location$")
public void user_click_location() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^user enter captcha and submit$")
public void user_enter_captcha_and_submit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user closes web app$")
public void user_closes_web_app() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
} 
    
}
