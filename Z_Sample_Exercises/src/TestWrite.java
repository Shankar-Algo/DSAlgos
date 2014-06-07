public class TestWrite {

  public static void main(String[] args) {
    StaxWriter configFile = new StaxWriter();
    configFile.setFile("config_Test.xml");
    try {
      configFile.saveConfig();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
} 