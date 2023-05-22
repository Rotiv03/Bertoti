public class App {
  public static void main(String[] args) throws Exception {
    DBConnetion database = DBConnetion.getInstance();
    database.query("SELECT * FROM clientes");

    // impossível usar função construtora, pois ela está privada
    // DBConnetion database2 = new DBConnetion();
  }
}
