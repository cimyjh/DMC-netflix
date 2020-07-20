package dmc.domain.koreaFunds;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QKoreaFunds is a Querydsl query type for KoreaFunds
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QKoreaFunds extends EntityPathBase<KoreaFunds> {

    private static final long serialVersionUID = 956862232L;

    public static final QKoreaFunds koreaFunds = new QKoreaFunds("koreaFunds");

    public final NumberPath<Float> fund_3y = createNumber("fund_3y", Float.class);

    public final NumberPath<Long> fund_assets = createNumber("fund_assets", Long.class);

    public final StringPath fund_name = createString("fund_name");

    public final NumberPath<Long> fund_num = createNumber("fund_num", Long.class);

    public final NumberPath<Long> fund_scale_operation = createNumber("fund_scale_operation", Long.class);

    public final StringPath fund_start_date = createString("fund_start_date");

    public final StringPath fund_type = createString("fund_type");

    public QKoreaFunds(String variable) {
        super(KoreaFunds.class, forVariable(variable));
    }

    public QKoreaFunds(Path<? extends KoreaFunds> path) {
        super(path.getType(), path.getMetadata());
    }

    public QKoreaFunds(PathMetadata metadata) {
        super(KoreaFunds.class, metadata);
    }

}

