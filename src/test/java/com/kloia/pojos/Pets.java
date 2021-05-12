package com.kloia.pojos;

import java.util.List;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "category",
        "name",
        "photoUrls",
        "tags",
        "status"
})

@Generated("jsonschema2pojo")
public class Pets {

    @JsonProperty("category")
    private Category category;

    @JsonProperty("name")
    private String name;

    @JsonProperty("photoUrls")
    private List<String> photoUrls;

    @JsonProperty("tags")
    private List<Tag> tags;

    @JsonProperty("status")
    private String status;

    public Pets(){

    }
    public Pets(Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(Category category) {
        this.category = category;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("photoUrls")
    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    @JsonProperty("photoUrls")
    public void addPhotoUrls(String photoUrls) {
        this.photoUrls.add(photoUrls);
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void addTags(Tag tags) {
        this.tags.add(tags);
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this).
                append("category", ((this.category == null)?"<null>":this.category)).
                append("name", ((this.name == null)?"<null>":this.name)).
                append("photoUrls", ((this.getPhotoUrls() == null)?"<null>":this.getPhotoUrls())).
                append("tags", ((this.getTags() == null)?"<null>":this.getTags())).
                append("status", ((this.status == null)?"<null>":this.status)).
                toString();
    }

}