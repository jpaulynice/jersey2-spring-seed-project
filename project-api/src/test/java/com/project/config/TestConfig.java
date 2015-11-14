package com.project.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.mock.jndi.SimpleNamingContextBuilder;

/**
 * Test configuration with dataSource overidden to use the in-memory hsqldb
 *
 * @author Jay Paulynice (jay.paulynice@gmail.com)
 */
@Configuration
@Import({ SpringConfig.class })
public class TestConfig {
    /**
     * @return the datasource
     */
    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.HSQL)
                .addScript("classpath:data/sql/drop_all.sql").addScript(
                        "classpath:data/sql/schema.sql").addScript(
                        "classpath:data/sql/test-data.sql").build();
    }

    @Bean
    JndiObjectFactoryBean jndiDataSource() throws IllegalStateException,
            NamingException {
        final String jndiName = "java:com/env/foo";
        final SimpleNamingContextBuilder builder = new SimpleNamingContextBuilder();
        builder.bind(jndiName, dataSource());
        builder.activate();

        final JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
        bean.setJndiName(jndiName);
        bean.setResourceRef(true);

        return bean;
    }
}