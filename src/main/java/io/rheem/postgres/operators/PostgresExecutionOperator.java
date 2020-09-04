package io.rheem.postgres.operators;

import io.rheem.jdbc.operators.JdbcExecutionOperator;
import io.rheem.postgres.platform.PostgresPlatform;

public interface PostgresExecutionOperator extends JdbcExecutionOperator {

    @Override
    default PostgresPlatform getPlatform() {
        return PostgresPlatform.getInstance();
    }

}
