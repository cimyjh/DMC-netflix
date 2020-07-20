package dmc.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Event {

    @JsonProperty("eventNum")
    private Long eventNum;

    @JsonProperty("name")
    private String name;

    @JsonProperty("price")
    private int price;

    @JsonProperty("evt")
    private String evt;

    @JsonProperty("product1")
    private String product1;

    @JsonProperty("store")
    private String store;

    @JsonProperty("product2")
    private String product2;

    @JsonProperty("img")
    private String img;

    @JsonProperty("registerDate")
    private Date registerDate;

    @JsonProperty("expireDate")
    private Date expireDate;

}