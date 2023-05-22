public class DBConnetion {
  private static DBConnetion instance;
  private String databaseUrl;

  private DBConnetion() {
    this.databaseUrl = "http://localhost:3001/";
  }

  public static DBConnetion getInstance() {
    if (instance == null) {
      instance = new DBConnetion();
    }
    return instance;
  }

  public void query(String query) {
    System.out.println("Executando a query: " + query);
    System.out.println(databaseUrl);
  }
}