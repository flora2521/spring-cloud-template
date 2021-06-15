package org.yi.user.config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

/**
 * @author Mao xiaolin
 * @version 1.0
 * @date 2021/6/15 17:05
 */
@Configuration
public class H2Config {

    public Server inMemoryH2DatabaseServer() throws SQLException {
        return Server.createTcpServer("-tcp","-tcpAllowOthers","-tcpPort","9090");
    }
}
