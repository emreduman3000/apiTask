package com.kloia.utilities;

import com.kloia.pojos.Category;
import com.kloia.pojos.Pets;
import com.kloia.pojos.Tag;

import java.util.ArrayList;
import java.util.List;

public class ObjectUtil {

    public static Pets  createJavaFormatDataByPojos()
    {
        Category category = new Category(10,"pets");
        Tag tag = new Tag(10,"pet-cat");

        List<Tag> tagList=new ArrayList<>();
        tagList.add(tag);

        List<String> photoUrls=new ArrayList<>();
        photoUrls.add("petito.png");




        /**
         * Created javaFormatData by pojos to be converted into jsonFormat
         */
        Pets pet = new Pets(category,"petito",photoUrls,tagList,"available");

        return pet;
    }

}
