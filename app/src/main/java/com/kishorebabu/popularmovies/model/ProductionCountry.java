
package com.kishorebabu.popularmovies.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "iso_3166_1",
    "name"
})
public class ProductionCountry {

    @JsonProperty("iso_3166_1")
    private String iso31661;
    @JsonProperty("name")
    private String name;

    /**
     * 
     * @return
     *     The iso31661
     */
    @JsonProperty("iso_3166_1")
    public String getIso31661() {
        return iso31661;
    }

    /**
     * 
     * @param iso31661
     *     The iso_3166_1
     */
    @JsonProperty("iso_3166_1")
    public void setIso31661(String iso31661) {
        this.iso31661 = iso31661;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
