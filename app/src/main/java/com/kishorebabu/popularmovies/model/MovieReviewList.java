package com.kishorebabu.popularmovies.model;import com.fasterxml.jackson.annotation.JsonInclude;import com.fasterxml.jackson.annotation.JsonProperty;import com.fasterxml.jackson.annotation.JsonPropertyOrder;import java.util.ArrayList;import java.util.List;import javax.annotation.Generated;@JsonInclude(JsonInclude.Include.NON_NULL)@Generated("org.jsonschema2pojo")@JsonPropertyOrder({        "id",        "page",        "results",        "total_pages",        "total_results"})public class MovieReviewList {    @JsonProperty("id")    private Integer id;    @JsonProperty("page")    private Integer page;    @JsonProperty("results")    private List<MovieReview> results = new ArrayList<MovieReview>();    @JsonProperty("total_pages")    private Integer totalPages;    @JsonProperty("total_results")    private Integer totalResults;    /**     * @return The id     */    @JsonProperty("id")    public Integer getId() {        return id;    }    /**     * @param id The id     */    @JsonProperty("id")    public void setId(Integer id) {        this.id = id;    }    /**     * @return The page     */    @JsonProperty("page")    public Integer getPage() {        return page;    }    /**     * @param page The page     */    @JsonProperty("page")    public void setPage(Integer page) {        this.page = page;    }    /**     * @return The results     */    @JsonProperty("results")    public List<MovieReview> getResults() {        return results;    }    /**     * @param results The results     */    @JsonProperty("results")    public void setResults(List<MovieReview> results) {        this.results = results;    }    /**     * @return The totalPages     */    @JsonProperty("total_pages")    public Integer getTotalPages() {        return totalPages;    }    /**     * @param totalPages The total_pages     */    @JsonProperty("total_pages")    public void setTotalPages(Integer totalPages) {        this.totalPages = totalPages;    }    /**     * @return The totalResults     */    @JsonProperty("total_results")    public Integer getTotalResults() {        return totalResults;    }    /**     * @param totalResults The total_results     */    @JsonProperty("total_results")    public void setTotalResults(Integer totalResults) {        this.totalResults = totalResults;    }}