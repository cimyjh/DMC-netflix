package dmc.domain.koreaFunds;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "korea_funds")
public class KoreaFunds {

    @Id
    @Column(name = "fund_num")
    private Long fund_num;

    private String fund_name;

    private String fund_type;
    private String fund_start_date;

    @Column(name = "fund_3y")
    private Float fund_3y;

    private Long fund_assets;
    private Long fund_scale_operation;


}
