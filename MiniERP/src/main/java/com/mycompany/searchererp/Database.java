
package com.mycompany.searchererp;
public class Database {
    private static final String userName = "root";
    private static final String pass = "searcher";
    private static final String dbName = "searchererp";
    private static final String  host = "localhost"; 
    private static final int port = 3306; 

    public static String getUserName() {
        return userName;
    }

    public static String getPass() {
        return pass;
    }

    public static String getDbName() {
        return dbName;
    }

    public static String getHost() {
        return host;
    }

    public static int getPort() {
        return port;
    }
    
}
