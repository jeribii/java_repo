import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Societe c=new Societe();
        Employe e=new Employe(1,"AZiz","jeribi","it",4);
        Employe e1=new Employe(2,"ali","jeribi","it",3);
        Employe e2=new Employe(3,"mohsen","rebhii","it",2);
        Employe e3=new Employe(4,"mohamed","benaissa","it",1);


        c.ajouterEmploye(e1);
        c.ajouterEmploye(e);
        c.ajouterEmploye(e2);
        c.ajouterEmploye(e3);

        c.displayEmploye();
        System.out.println(c.rechercherEmploye(e2));
        c.trierEmployeParId();


    }
}