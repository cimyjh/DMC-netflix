package dmc.domain.koreaFunds.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * dmc.domain.koreaFunds.dto.QKoreaFundsListResponseDto is a Querydsl Projection type for KoreaFundsListResponseDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QKoreaFundsListResponseDto extends ConstructorExpression<KoreaFundsListResponseDto> {

    private static final long serialVersionUID = 1025698521L;

    public QKoreaFundsListResponseDto(com.querydsl.core.types.Expression<Long> fund_num, com.querydsl.core.types.Expression<String> fund_name, com.querydsl.core.types.Expression<String> fund_type, com.querydsl.core.types.Expression<String> fund_start_date, com.querydsl.core.types.Expression<Float> fund_3y, com.querydsl.core.types.Expression<Long> fund_assets, com.querydsl.core.types.Expression<Long> fund_scale_operation) {
        super(KoreaFundsListResponseDto.class, new Class<?>[]{long.class, String.class, String.class, String.class, float.class, long.class, long.class}, fund_num, fund_name, fund_type, fund_start_date, fund_3y, fund_assets, fund_scale_operation);
    }

}

