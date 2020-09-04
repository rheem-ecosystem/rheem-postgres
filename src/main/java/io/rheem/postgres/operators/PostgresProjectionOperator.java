package io.rheem.postgres.operators;

import io.rheem.basic.data.Record;
import io.rheem.basic.function.ProjectionDescriptor;
import io.rheem.basic.operators.FilterOperator;
import io.rheem.basic.operators.MapOperator;
import io.rheem.jdbc.operators.JdbcProjectionOperator;

/**
 * PostgreSQL implementation of the {@link FilterOperator}.
 */
public class PostgresProjectionOperator extends JdbcProjectionOperator implements PostgresExecutionOperator {

    public PostgresProjectionOperator(String... fieldNames) {
        super(fieldNames);
    }

    public PostgresProjectionOperator(ProjectionDescriptor<Record, Record> functionDescriptor) {
        super(functionDescriptor);
    }

    public PostgresProjectionOperator(MapOperator<Record, Record> that) {
        super(that);
    }

    @Override
    protected PostgresProjectionOperator createCopy() {
        return new PostgresProjectionOperator(this);
    }

}
