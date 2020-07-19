package dmc.domain.news.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * dmc.domain.news.dto.QNewsListResponseDto is a Querydsl Projection type for NewsListResponseDto
 */
@Generated("com.querydsl.codegen.ProjectionSerializer")
public class QNewsListResponseDto extends ConstructorExpression<NewsListResponseDto> {

    private static final long serialVersionUID = 160106553L;

    public QNewsListResponseDto(com.querydsl.core.types.Expression<Long> newsNum, com.querydsl.core.types.Expression<String> name, com.querydsl.core.types.Expression<Integer> price, com.querydsl.core.types.Expression<String> product1, com.querydsl.core.types.Expression<String> product2, com.querydsl.core.types.Expression<String> thumbnail, com.querydsl.core.types.Expression<String> img, com.querydsl.core.types.Expression<String> store, com.querydsl.core.types.Expression<String> detail, com.querydsl.core.types.Expression<? extends java.util.Date> registerDate) {
        super(NewsListResponseDto.class, new Class<?>[]{long.class, String.class, int.class, String.class, String.class, String.class, String.class, String.class, String.class, java.util.Date.class}, newsNum, name, price, product1, product2, thumbnail, img, store, detail, registerDate);
    }

}

