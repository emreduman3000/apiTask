package com.kloia.pojos;


import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name"
})

@Generated("jsonschema2pojo")
public class Category {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    public Category(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("id", this.id).
                append("name", ((this.name == null)?"<null>":this.name)).
                toString();
    }
}