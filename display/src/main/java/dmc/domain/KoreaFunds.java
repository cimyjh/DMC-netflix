package dmc.domain;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class KoreaFunds {


    @JsonProperty("fund_num")
    private Long fund_num;

    @JsonProperty("fund_name")
    private String fund_name;

    @JsonProperty("fund_type")
    private String fund_type;

    @JsonProperty("fund_start_date")
    private String fund_start_date;

    @JsonProperty("fund_3y")
    private Float fund_3y;

    @JsonProperty("fund_assets")
    private Long fund_assets;

    @JsonProperty("fund_scale_operation")
    private Long fund_scale_operation;


}
