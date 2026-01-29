package com.io.github.pedroolivsz.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDatabase {

    private final Logger log;

    public LogDatabase(Class<?> clazz) {
        this.log = LoggerFactory.getLogger(clazz);
    }

    public void logDatabaseError(String acao, String sql, Object paramentros, Exception exception) {
        log.error("Erro ao realizar ação '{}'. SQL: {} | Parãmetros: {}", acao, sql, paramentros, exception);
    }

    public void logDatabaseError(String acao, String sql, Exception exception) {
        log.error("Erro ao realizar ação '{}'. SQL: {}", acao, sql, exception);
    }

    public void info(String acao) {
        log.info(acao);
    }
}
