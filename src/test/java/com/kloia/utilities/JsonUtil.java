package com.kloia.utilities;


import io.restassured.mapper.ObjectMapperDeserializationContext;
import io.restassured.mapper.ObjectMapperSerializationContext;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class JsonUtil
{

    /*
     <dependency>
            <groupId>org.codehaus.jackson</groupId>
            <artifactId>jackson-mapper-asl</artifactId>
            <version>1.9.13</version>
        </dependency>
     */

    //public interface ObjectMapper
    private static ObjectMapper mapper;

    static
    {
        mapper=new ObjectMapper();
    }

    public static String convertJavaToJson(Object object)
    {
        String jsonResult="";

        try {
            jsonResult = mapper.writeValueAsString(object);
        }
        catch (JsonGenerationException | JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonResult;
    }


    public static <T> T convertJsonToJava(String json,Class<T> cls)
    {
        T javaResult = null;

        try {
            javaResult= mapper.readValue(json,cls);//return an object
        }
        catch (JsonGenerationException e) {
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return javaResult;
    }


}
