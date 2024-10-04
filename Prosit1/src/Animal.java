public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    Animal(String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;
    }
    public void dispayAnimal(){
       System.out.println("la famille est "+family+ " le nom est "+ name+ " l'age est "+age+" est mamifere ? "+isMammal);
    }
}
