package dmc.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class News {

	@JsonProperty("newsNum")
	private Long newsNum;

	@JsonProperty("name")
	private String name;

	@JsonProperty("price")
	private int price;

	@JsonProperty("product1")
	private String product1;

	@JsonProperty("product2")
	private String product2;

	@JsonProperty("thumbnail")
	private String thumbnail;

	@JsonProperty("img")
	private String img;

	@JsonProperty("store")
	private String store;

	@JsonProperty("detail")
	private String detail;

	@JsonProperty("registerDate")
	private Date registerDate;


}
