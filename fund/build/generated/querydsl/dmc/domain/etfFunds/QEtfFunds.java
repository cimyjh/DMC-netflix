package dmc.domain.etfFunds;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEtfFunds is a Querydsl query type for EtfFunds
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEtfFunds extends EntityPathBase<EtfFunds> {

    private static final long serialVersionUID = 1792870392L;

    public static final QEtfFunds etfFunds = new QEtfFunds("etfFunds");

    public final NumberPath<Long> etf_1d_volume = createNumber("etf_1d_volume", Long.class);

    public final NumberPath<Float> etf_1dY = createNumber("etf_1dY", Float.class);

    public final NumberPath<Float> etf_1mY = createNumber("etf_1mY", Float.class);

    public final NumberPath<Float> etf_1wY = createNumber("etf_1wY", Float.class);

    public final NumberPath<Float> etf_3mY = createNumber("etf_3mY", Float.class);

    public final NumberPath<Long> etf_assets = createNumber("etf_assets", Long.class);

    public final StringPath etf_basic_index = createString("etf_basic_index");

    public final NumberPath<Long> etf_close = createNumber("etf_close", Long.class);

    public final StringPath etf_name = createString("etf_name");

    public final NumberPath<Long> etf_num = createNumber("etf_num", Long.class);

    public QEtfFunds(String variable) {
        super(EtfFunds.class, forVariable(variable));
    }

    public QEtfFunds(Path<? extends EtfFunds> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEtfFunds(PathMetadata metadata) {
        super(EtfFunds.class, metadata);
    }

}

