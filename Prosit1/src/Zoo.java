public class Zoo {
    Animal[] animal;
    String name;
    String city;
    int nbrCages;

    Zoo(String name,String city, int nbrCages){
        this.animal=new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }
    public void displayZoo(){
        for(int i=0;i<nbrCages;i++){
            this.animal[i].dispayAnimal();
        }
        System.out.println("le nom du Zoo est "+ name +" la ville est "+ city
        +" le nombre des animaux est "+ nbrCages);
    }
    public void ajouterAnimal(Animal animal){
        if(nbrCages<26){
            this.animal[nbrCages]=animal;
            nbrCages++;
        }
        else{
            System.out.println("impossible d'ajouter un animal limite atteinte");
        }
    }

}
