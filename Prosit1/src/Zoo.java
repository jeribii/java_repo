public class Zoo {
    Animal[] animal;
    String name;
    String city;
    final int nbrCages=25;

    Zoo(String name,String city, int nbrCages){
        this.animal=new Animal[nbrCages];
        this.name=name;
        this.city=city;
        //this.nbrCages=nbrCages;
    }
    public void displayZoo(){
        for(int i=0;i<nbrCages;i++){
            this.animal[i].dispayAnimal();
        }
        System.out.println("le nom du Zoo est "+ name +" la ville est "+ city
        +" le nombre des animaux est "+ nbrCages);
    }
    public void ajouterAnimal(Animal animal){
        int i=0;
        if(i<nbrCages){
            this.animal[nbrCages]=animal;
            i++;
        }
        else{
            System.out.println("impossible d'ajouter un animal limite atteinte");
        }
    }
    public boolean addAniaml(Animal animal){
        int i=0;
        while(i<nbrCages){
            if(this.animal[i]==null){
                this.animal[i]=animal;
                return true;
            }
            else {
                i++;
            }
        }
        return false;
    }
    public int searchAniaml(Animal animal1){
        int i=0;
        while(i <nbrCages){
            if(animal[i].name.equals(animal1.name)){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal1){
        int i=0;
        while(i <nbrCages){
            if(this.animal[i].name.equals(animal1.name)){
                this.animal[i]=null;
                for(;i<nbrCages-1;i++)
                {
                    this.animal[i]=this.animal[i+1];
                }
                return true;
            }
            else {
                i++;
            }
        }
        return false;
    }
    public boolean isZoofull(){
        if(nbrCages==25)
            return true;
        else
            return false;
    }
}
