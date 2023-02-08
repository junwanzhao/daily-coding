package top.zhy.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static top.zhy.jdbc.common.Const.*;

/**
 * @version 1.0.0
 * @Author zhy
 * @Date 2023/2/8 17:10
 * @Description
 */
public class JdbcUtil {
    public static Connection getConnection(){
        Connection connection =null;
        try{
            //注册驱动
            Class.forName(DRIVER_CLASS);
            DriverManager.getConnection(DB_URL,DB_PASSWORD,DB_USERNAME);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        if(connection == null){
            System.err.println("连接失败");
        }
        return connection;
    }

}
