package dmc.domain.etfFunds.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * dmc.domain.etfFunds.dto.QEtfFundsListResponseDto is a Querydsl Projection type for EtfFundsListResponseDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QEtfFundsListResponseDto extends ConstructorExpression<EtfFundsListResponseDto> {

    private static final long serialVersionUID = -569869127L;

    public QEtfFundsListResponseDto(com.querydsl.core.types.Expression<Long> etf_num, com.querydsl.core.types.Expression<String> etf_name, com.querydsl.core.types.Expression<String> etf_basic_index, com.querydsl.core.types.Expression<Long> etf_close, com.querydsl.core.types.Expression<Long> etf_assets, com.querydsl.core.types.Expression<Float> etf_1dY, com.querydsl.core.types.Expression<Float> etf_1wY, com.querydsl.core.types.Expression<Float> etf_1mY, com.querydsl.core.types.Expression<Float> etf_3mY, com.querydsl.core.types.Expression<Long> etf_1d_volume) {
        super(EtfFundsListResponseDto.class, new Class<?>[]{long.class, String.class, String.class, long.class, long.class, float.class, float.class, float.class, float.class, long.class}, etf_num, etf_name, etf_basic_index, etf_close, etf_assets, etf_1dY, etf_1wY, etf_1mY, etf_3mY, etf_1d_volume);
    }

}

