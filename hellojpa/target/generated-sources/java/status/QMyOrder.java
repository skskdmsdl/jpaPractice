package status;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QMyOrder is a Querydsl query type for MyOrder
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMyOrder extends EntityPathBase<MyOrder> {

    private static final long serialVersionUID = -1828807962L;

    public static final QMyOrder myOrder = new QMyOrder("myOrder");

    public final DatePath<java.sql.Date> orderDate = createDate("orderDate", java.sql.Date.class);

    public final NumberPath<Long> orderId = createNumber("orderId", Long.class);

    public QMyOrder(String variable) {
        super(MyOrder.class, forVariable(variable));
    }

    public QMyOrder(Path<? extends MyOrder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMyOrder(PathMetadata metadata) {
        super(MyOrder.class, metadata);
    }

}

