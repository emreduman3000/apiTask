package com.kloia.utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;


public class TestBase {

    protected RequestSpecification requestSpecification01;

    protected Response response;
    protected JsonPath jsonPath;
    protected SoftAssert softAssert;



     /**
     * Setting up BaseURI for the Task1
     */
    @BeforeTest
    public void setUp01(){
        requestSpecification01=new RequestSpecBuilder().
                setBaseUri("https://petstore.swagger.io/v2").
                build();
    }
}
