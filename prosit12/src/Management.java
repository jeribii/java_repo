import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public interface Management {
    void displayStudents(List<Etudiant> etudaint, Consumer<Etudiant> etudiant);
    void displayStudentsByFilter(List<Etudiant> Etudiants,
                                 Predicate<Etudiant> pre, Consumer<Etudiant> con);
    String returnEtudiantsNames(List<Etudiant> Etudiants,
                               Function<Etudiant, String> fun);
    Etudiant createEtudiant(Supplier<Etudiant> sup);
    List<Etudiant> sortEtudiantsById(List<Etudiant> Etudiants,
                                   Comparator<Etudiant> com);
    Stream<Etudiant> convertToStream(List<Etudiant> students);
}
