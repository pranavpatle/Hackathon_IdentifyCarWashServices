###IDENTIFY CAR WASHING SERVICES <br>
###Detailed Description:<br> 

-open the url, select service type as "car" and select subcategory as "SUV" and click "Go for it", capture all service name and amount.<br> 
-click on register and capture the error message by providing invalid input for email field. <br>
-navigate to home page and click on "Our Centers". <br>
select state with city and click on search to capture the center name.[use 3 combinations of state and city]<br> 
(Suggested Site: https://www.doorstepwash.com/ )<br> 

###Key Automation Scope:<br>

-Handling Alert, search option.<br> 
-Multiple navigation path for one page.<br> 
-Filling form (in different objects in web page). <br>
-Capture warning message. <br>
-Extract menu items & store in collections.<br>
-Navigating back to home page. <br>

###Tools with its version <br>

-maven : 4.0.0 <br>
-selenium : 4.17.0 <br>
-testng : 7.9.0 <br>
-apache.poi: 5.2.5<br>
-Cucumber:7.14.1<br> 

###JAR FILES:<br> 

	`        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java --> 
org.seleniumhq.selenium 
selenium-java 
4.15.0
   <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>7.14.1</version>
        <scope>test</scope>
</dependency>
        io.cucumber		    cucumber-java		    7.14.1 
    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core -->
<dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-core</artifactId>
        <version>2.20.0</version>
</dependency>
    
    
    <!-- https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api -->
<dependency>
        <groupId>org.apache.logging.log4j</groupId>
        <artifactId>log4j-api</artifactId>
        <version>2.20.0</version>
</dependency>
    <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi</artifactId>
        <version>5.2.3</version>
</dependency>
    
    
    <!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
        <groupId>org.apache.poi</groupId>
        <artifactId>poi-ooxml</artifactId>
        <version>5.2.3</version>
</dependency>
    <!-- https://mvnrepository.com/artifact/com.aventstack/extentreports-cucumber4-adapter -->
<dependency>
    <groupId>tech.grasshopper</groupId>
    <artifactId>extentreports-cucumber7-adapter</artifactId>
    <version>1.14.0</version>
</dependency>`

###Output:(Chrome/edge)<br>

@smoke<br>
Scenario: Check whether the application can be accessed # featurefiles/1Home.feature:4<br>
Searching for Navbar<br>
  Given the user navigates to the Application           # Stepdefinatons.NavBar.the_user_navigates_to_the_application()<br>

    Embedding Check whether the application can be accessed [image/png 1573203 bytes]<br>

  Then the page NavaBar has to be displayed             # Stepdefinatons.NavBar.the_page_title_has_to_be_displayed()<br>

    Embedding Check whether the application can be accessed [image/png 1573203 bytes]<br>


@regression<br>
Scenario: Display All service type and Subcategory # featurefiles/1Home.feature:9<br>
  Given the user is on the Doorstepwash home page  # Stepdefinatons.HomePage.the_user_is_on_the_doorstepwash_home_page()<br>

    Embedding Display All service type and Subcategory [image/png 1573203 bytes]<br>

  When the User select Service type as Car         # Stepdefinatons.HomePage.the_user_select_service_type_as_car()<br>

    Embedding Display All service type and Subcategory [image/png 1569938 bytes]<br>

  And the User select SubCategory as SUV           # Stepdefinatons.HomePage.the_user_select_sub_category_as_suv()<br>

    Embedding Display All service type and Subcategory [image/png 1568372 bytes]<br>

  And User should click on 'Go for it'             # Stepdefinatons.HomePage.user_should_click_on(java.lang.String)<br>

    Embedding Display All service type and Subcategory [image/png 676482 bytes]<br>

Snow Wash<br>
399.00<br>
Snow Wash + Polish<br>
599.00<br>
Detailing<br>
1699.00<br>
Headlight Restoration<br>
199.00<br>
Wiper Fluid Refill<br>
149.00<br>
  Then User should see all service name and amount # Stepdefinatons.HomePage.user_should_see_all_service_name_and_amount()<br>

    Embedding Display All service type and Subcategory [image/png 676482 bytes]<br>


@regression @functional<br>
Scenario: Capture the error message           # featurefiles/2Register.feature:4<br>
  Given the user should click on the Register # Stepdefinatons.Register.the_user_should_click_on_the_register()<br>

    Embedding Capture the error message [image/png 56265 bytes]<br>

  When the User  should enter their Firstname # Stepdefinatons.Register.the_user_should_enter_their_firstname()<br>

    Embedding Capture the error message [image/png 55309 bytes]<br>

  And the User should enter the invalid Email # Stepdefinatons.Register.the_user_should_enter_the_invalid_email()<br>

    Embedding Capture the error message [image/png 56421 bytes]<br>

  And User should enter the password          # Stepdefinatons.Register.user_should_enter_the_password()<br>

    Embedding Capture the error message [image/png 52604 bytes]<br>

  And User should click on SignUp             # Stepdefinatons.Register.user_should_click_on_sign_up()<br>

    Embedding Capture the error message [image/png 49036 bytes]<br>

------------Please enter a valid Email Address.<br>
  Then User should capture Error message      # Stepdefinatons.Register.user_should_capture_error_message()<br>

    Embedding Capture the error message [image/png 49060 bytes]<br>


@regression @functional<br>
Scenario: Center names                                                               # featurefiles/3Centers.feature:4<br>
  Given the user should click on the Our Center                                      # Stepdefinatons.OurCenters.the_user_should_click_on_the_our_center()<br>

    Embedding Center names [image/png 589651 bytes]<br>

size : 5<br>
--------------------shop names are: Karnataka - Bangalore - 2nd Cross BTM Layout<br>
--------------------shop names are: Karnataka - Bangalore - 5th Cross<br>
--------------------shop names are: Karnataka - Bangalore - Frazer Town<br>
--------------------shop names are: Assam - Silchar - Triniyonee Lane<br>
--------------------shop names are: Arunachal Pradesh - Itanagar - Rwd Colony<br>
  Then Select the state and city and capture the center name for any three locations # Stepdefinatons.OurCenters.select_the_state_and_city_and_capture_the_center_name_for_any_three_locations()<br>

    Embedding Center names [image/png 56701 bytes]<br>

┌──────────────────────────────────────────────────────────────────────────┐<br>
│ View your Cucumber Report at:                                            │<br>
│ https://reports.cucumber.io/reports/02445a76-20ed-4a35-95a5-7433df299148 │<br>
│                                                                          │<br>
│ This report will self-destruct in 24h.                                   │<br>
│ Keep reports forever: https://reports.cucumber.io/profile                │<br>
└──────────────────────────────────────────────────────────────────────────┘<br>
