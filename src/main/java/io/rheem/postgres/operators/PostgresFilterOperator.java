package io.rheem.postgres.operators;

import io.rheem.basic.data.Record;
import io.rheem.basic.operators.FilterOperator;
import io.rheem.core.function.PredicateDescriptor;
import io.rheem.jdbc.operators.JdbcFilterOperator;


/**
 * PostgreSQL implementation of the {@link FilterOperator}.
 */
public class PostgresFilterOperator extends JdbcFilterOperator implements PostgresExecutionOperator {

    /**
     * Creates a new instance.
     */
    public PostgresFilterOperator(PredicateDescriptor<Record> predicateDescriptor) {
        super(predicateDescriptor);
    }

    /**
     * Copies an instance (exclusive of broadcasts).
     *
     * @param that that should be copied
     */
    public PostgresFilterOperator(FilterOperator<Record> that) {
        super(that);
    }

    @Override
    protected PostgresFilterOperator createCopy() {
        return new PostgresFilterOperator(this);
    }
}
