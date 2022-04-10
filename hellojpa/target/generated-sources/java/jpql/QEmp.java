package jpql;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmp is a Querydsl query type for Emp
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmp extends EntityPathBase<Emp> {

    private static final long serialVersionUID = -288226533L;

    public static final QEmp emp = new QEmp("emp");

    public final NumberPath<Integer> departmentId = createNumber("departmentId", Integer.class);

    public final NumberPath<Integer> employeeId = createNumber("employeeId", Integer.class);

    public final StringPath firstName = createString("firstName");

    public final StringPath lastName = createString("lastName");

    public QEmp(String variable) {
        super(Emp.class, forVariable(variable));
    }

    public QEmp(Path<? extends Emp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmp(PathMetadata metadata) {
        super(Emp.class, metadata);
    }

}

