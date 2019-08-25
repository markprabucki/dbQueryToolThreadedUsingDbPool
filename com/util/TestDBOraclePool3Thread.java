import java.sql.*;
 
public class TestDBOraclePool3Thread implements Runnable {
 
    private int noThread = 0;
   
    TestDBOraclePool3Thread(int n) {
        noThread = n;
    }
   
    public void run() {
        System.out.println("Starting Thread " + noThread);
        while (true) {
            try {
                Connection conn = 
                   JDBCUtils.getConnection("env " + noThread);
       
                conn.setAutoCommit(false);
                Statement stmt = conn.createStatement();
                ResultSet rset = 
                   stmt.executeQuery("select BANNER from SYS.V_$VERSION");
                while (rset.next())
                   System.out.println (rset.getString(1));  
                stmt.close();
                System.out.println ("Ok."); 
                JDBCUtils.listCacheInfos();
                conn.close();
               
            }
            catch (SQLException e) {
                e.printStatckTrace()
            }
            finally {
                System.out.println ("Sleep... " + noThread);
                try {
                    Thread.sleep(1000);
                }
                catch(Exception e) { }
            }
        }
    }
 
}

