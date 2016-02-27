
package com.kishorebabu.popularmovies.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "page",
    "results",
    "total_results",
    "total_pages"
})
public class MoviesList {

    @JsonProperty("page")
    private Integer page;
    @JsonProperty("results")
    private List<Movie> results = new ArrayList<>();
    @JsonProperty("total_results")
    private Integer totalResults;
    @JsonProperty("total_pages")
    private Integer totalPages;

    /**
     * 
     * @return
     *     The page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * 
     * @param page
     *     The page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 
     * @return
     *     The results
     */
    @JsonProperty("results")
    public List<Movie> getResults() {
        return results;
    }

    /**
     * 
     * @param results
     *     The results
     */
    @JsonProperty("results")
    public void setResults(List<Movie> results) {
        this.results = results;
    }

    /**
     * 
     * @return
     *     The totalResults
     */
    @JsonProperty("total_results")
    public Integer getTotalResults() {
        return totalResults;
    }

    /**
     * 
     * @param totalResults
     *     The total_results
     */
    @JsonProperty("total_results")
    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * 
     * @return
     *     The totalPages
     */
    @JsonProperty("total_pages")
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * 
     * @param totalPages
     *     The total_pages
     */
    @JsonProperty("total_pages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

}
