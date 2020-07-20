package dmc.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EtfFunds {

    @JsonProperty("etf_num")
    private Long etf_num;

    @JsonProperty("etf_name")
    private String etf_name;

    @JsonProperty("etf_basic_index")
    private String etf_basic_index;

    @JsonProperty("etf_close")
    private Long etf_close;

    @JsonProperty("etf_assets")
    private Long etf_assets;

    @JsonProperty("etf_1dY")
    private Float etf_1dY;

    @JsonProperty("etf_1wY")
    private Float etf_1wY;

    @JsonProperty("etf_1mY")
    private Float etf_1mY;

    @JsonProperty("etf_3mY")
    private Float etf_3mY;

    @JsonProperty("etf_1d_volume")
    private Long etf_1d_volume;

}
