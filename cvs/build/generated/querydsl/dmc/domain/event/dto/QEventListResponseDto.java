package dmc.domain.event.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * dmc.domain.event.dto.QEventListResponseDto is a Querydsl Projection type for EventListResponseDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QEventListResponseDto extends ConstructorExpression<EventListResponseDto> {

    private static final long serialVersionUID = -962700673L;

    public QEventListResponseDto(com.querydsl.core.types.Expression<Long> eventNum, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> evt, com.querydsl.core.types.Expression<String> product1, com.querydsl.core.types.Expression<String> store, com.querydsl.core.types.Expression<String> product2, com.querydsl.core.types.Expression<String> img, com.querydsl.core.types.Expression<? extends java.util.Date> registerDate, com.querydsl.core.types.Expression<? extends java.util.Date> expireDate) {
        super(EventListResponseDto.class, new Class<?>[]{long.class, String.class, int.class, String.class, String.class, String.class, String.class, String.class, java.util.Date.class, java.util.Date.class}, eventNum, name, price, evt, product1, store, product2, img, registerDate, expireDate);
    }

}

