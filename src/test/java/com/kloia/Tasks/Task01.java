package com.kloia.Tasks;

import com.kloia.pojos.Pets;
import static org.hamcrest.Matchers.*;
import com.kloia.utilities.JsonUtil;
import com.kloia.utilities.ObjectUtil;
import com.kloia.utilities.TestBase;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 * Task1
 * Posting Json data and validating by getting response body
 */
public class Task01 extends TestBase {

    Pets pet;

    /**
     * Creating post request
     */
    @Test
    public void postRequest() {

        /**
         * Creating java format data by pojos
         */
         pet= ObjectUtil.createJavaFormatDataByPojos();

        /**
         * Converting java object to json format String
         */
        String jsonFormatString=JsonUtil.convertJavaToJson(pet);


        /**
         * Creating Post Request to "https://petstore.swagger.io/v2/pet"
         */
         response= given().
                        contentType(ContentType.JSON).
                        spec(requestSpecification01).
                        body(jsonFormatString).
                    when().
                        post("/pet");

    }



    /**
     * Verify the below requested in the response
     * -Status code should be 200
     * -Response should has an id
     * -Created name should be equal to the posted name
     * -Content-type should be application/json
     * -Response header should has a date value
     */
    @Test
    public void getRequest()
    {
        /**
         * setting up queryParam with unique value to get specific json data
         */
        jsonPath=response.jsonPath();
        requestSpecification01.queryParam("id",jsonPath.getString("id"));

        /**
         * creating get request
         */
        Response response=given().
                            spec(requestSpecification01).
                        when().
                            get("/pet");

        /**
         * assertions
         */
        response.
            then().
                assertThat().
                statusCode(200).
                contentType(ContentType.JSON).
                body("name", equalTo(pet.getName()));



        softAssert.assertNotEquals(response.getHeader("Date"),null);

    }
}
