package dmc.domain.news;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QNews is a Querydsl query type for News
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QNews extends EntityPathBase<News> {

    private static final long serialVersionUID = 1147678456L;

    public static final QNews news = new QNews("news");

    public final StringPath detail = createString("detail");

    public final StringPath img = createString("img");

    public final StringPath name = createString("name");

    public final NumberPath<Long> newsNum = createNumber("newsNum", Long.class);

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath product1 = createString("product1");

    public final StringPath product2 = createString("product2");

    public final DateTimePath<java.util.Date> registerDate = createDateTime("registerDate", java.util.Date.class);

    public final StringPath store = createString("store");

    public final StringPath thumbnail = createString("thumbnail");

    public QNews(String variable) {
        super(News.class, forVariable(variable));
    }

    public QNews(Path<? extends News> path) {
        super(path.getType(), path.getMetadata());
    }

    public QNews(PathMetadata metadata) {
        super(News.class, metadata);
    }

}

