
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Mash {

  private List <Categories> categories= new ArrayList<Categories>();
  private String [] mashList= {"Mansion", "Apartment", "House", "Shack"};
  public Mash ()
  {
    categories = new ArrayList<Categories>();
    Categories mash=new Categories();
    mash.setName("MASH");
    mash.setCategories(mashList);

    categories.add(mash);

  }
  public void setUpCategories()
  {
      Scanner scanner=new Scanner (System.in);

      System.out.println("You're playing MASH!");
      System.out.println("Enter the names of the categories you'd like to use. the MASH category is already implemented.");
      System.out.println();
      System.out.println("Enter (separated by commas):");

      String input= scanner.nextLine();
      String [] theInput= input.split(",");

      for (int i= 0; i < theInput.length; i++)
      {
        Categories category= new Categories();
        category.setName(theInput[i]);
        categories.add(category);
      }

  }

public void createLifeCategories()
{
  Scanner scanner=new Scanner(System.in);

  for (int i=1; i<categories.size(); i++)
  {
    System.out.println("Enter objects or names to go into your category" + categories.get(i).getName());
    System.out.println();
    System.out.println("Enter (separated by commas):");

    String input=scanner.nextLine();
    String[] theInput= input.split(",");

    categories.get(i).setCategories(theInput);
  }
  }

public void getLife()
{
    setUpCategories();
    createLifeCategories();

    Random random=new Random();
    System.out.println("Welcome to your life!");
    System.out.println("------------------");

    for(int i=0; i<categories.size(); i++)
    {
      System.out.println(categories.get(i).getName()+": ");
      System.out.println(categories.get(i).getCategories()[random.nextInt(categories.get(i).getCategories().length)]);
    }



}

public static void main(String...args)
{
  Mash instance= new Mash();
  instance.getLife();
}
}
