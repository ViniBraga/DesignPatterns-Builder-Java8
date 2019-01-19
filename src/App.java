

public class App {

  public static void main(String[] args) {
	  
    Person p = new PersonBuilder().with((personBuilder) -> {
      personBuilder.firstName = "Vinicius";
      personBuilder.lastName = "Braga";
    }).build();
    
    System.out.println(p);
  }
  
}