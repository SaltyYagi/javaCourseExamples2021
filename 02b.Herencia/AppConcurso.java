public class AppConcurso
{
  public static void main (String argv[])
  {
    Concursante c1 = new Concursante("Lola", 29, "femenino");
    Concursante c2 = new Concursante("Diego", 30, "masculino");
    c1.setParejaActual(c2);
    c2.setParejaActual(c1);
    
    System.out.println(c1);
    System.out.println(c2);
  
  }

}
