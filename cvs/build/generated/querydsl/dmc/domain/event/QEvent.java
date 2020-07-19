package dmc.domain.event;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEvent is a Querydsl query type for Event
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEvent extends EntityPathBase<Event> {

    private static final long serialVersionUID = -1840352912L;

    public static final QEvent event = new QEvent("event");

    public final NumberPath<Long> eventNum = createNumber("eventNum", Long.class);

    public final StringPath evt = createString("evt");

    public final DateTimePath<java.util.Date> expireDate = createDateTime("expireDate", java.util.Date.class);

    public final StringPath img = createString("img");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> price = createNumber("price", Integer.class);

    public final StringPath product1 = createString("product1");

    public final StringPath product2 = createString("product2");

    public final DateTimePath<java.util.Date> registerDate = createDateTime("registerDate", java.util.Date.class);

    public final StringPath store = createString("store");

    public QEvent(String variable) {
        super(Event.class, forVariable(variable));
    }

    public QEvent(Path<? extends Event> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEvent(PathMetadata metadata) {
        super(Event.class, metadata);
    }

}

