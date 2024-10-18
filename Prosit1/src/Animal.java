public class Animal {
    public String family;
    public String name;
    private int age;
    public boolean isMammal;

    public void Setage(int age){
        if(age<0)
            System.out.println("Age cannot be negative");
        else
            this.age=age;
    }
    public int GetAge(){
        return age;
    }
    
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
