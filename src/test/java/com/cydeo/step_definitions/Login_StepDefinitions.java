package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {


    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters librarian username");
    }
    @When("user enter librarian username")
    public void user_enter_librarian_username() {
        System.out.println("User enters librarian password");
    }
    @Then("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("User should see the dashboard");
    }




    @When("user enter student username")
    public void user_enter_student_username() {
        System.out.println("User enters librarian username");

    }
    @When("user enter student password")
    public void user_enter_student_password() {
        System.out.println("User enters librarian password");

    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("User should see the dashboard");
    }

    @When("user enter admin username")
    public void userEnterAdminUsername() {
        System.out.println("User enters librarian username");


    }

    @And("user enter admin password")
    public void userEnterAdminPassword() {
        System.out.println("User enters librarian password");
    }




}
