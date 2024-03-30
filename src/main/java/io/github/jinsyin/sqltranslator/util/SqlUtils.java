package io.github.jinsyin.sqltranslator.util;

import com.google.common.base.Preconditions;

public class SqlUtils {
    /**
     * Compress a SQL into one line
     *
     * @param sql regular SQL
     * @return compressed SQL
     */
    public static String compress(String sql) {
        Preconditions.checkNotNull(sql,"SQL is null");
        return sql.replaceAll("\\n", "")
                .replaceAll("\\(\\s*", "(")
                .replaceAll("\\s*\\)", ")")
                .replaceAll("\\s{2,}", " ")
                .replaceAll("\\s*;", ";")
                .trim();
    }
}
