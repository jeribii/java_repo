import java.util.Scanner;
public class ZooManagement{

    public static void main(String[] args) {

        Animal lion=new Animal("lion","RAUL",4,false);
        Animal tigre=new Animal("tigre", "Mohsen", 3, false);
        Zoo myZoo=new Zoo("belveder","tunis",3);
        //lion.dispayAnimal();
        //int nbrCages=20;
        //String zooName="my zoo";
        //System.out.println(zooName + " comporte "+ nbrCages);

        //Scanner sc=new Scanner(System.in);

        /*System.out.println("Veuillez enter le nom du zoo");
        //zooName=sc.nextLine();

        System.out.println("Veuillez enter le nombre des cages");
        //nbrCages=sc.nextInt();

        System.out.println(zooName + " comporte "+ nbrCages);*/

        //myZoo.displayZoo();
        //System.out.println(myZoo.nbrCages);
        myZoo.addAniaml(lion);
        myZoo.addAniaml(tigre);
        myZoo.addAniaml(tigre);
        myZoo.ajouterAnimal(lion);
        myZoo.displayZoo();

    }
}