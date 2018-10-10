package uml.exo1;

// CTRL+MAJ+o et selection de java.util.List et non java.awt.List
import java.util.ArrayList;
import java.util.List;

// Par défaut la classe Personne étend Objet
public class Personne /* extends Object */{
  // ///////////////////////////////////////////
  // Declaration des attributs de la classe
  // ///////////////////////////////////////////

  /**
   * Age de la personne en année. Une personne qui vient de naitre a 0 ans.
   */
  private int age; // val par défaut 0

  /**
   * Nom de la personne : Un nom ne contient pas de nombres.
   */
  private String nom; // val par défaut null
  // ///////////////////////////////////////////
  // Declaration des associations :
  // ///////////////////////////////////////////

  /**
   * La liste des enfants de la personne
   */
  private List<Personne> enfants; // defaut = null
  /**
   * La liste des parents de la personne
   */
  private List<Personne> parents; // defaut = null

  // ///////////////////////////////////////////
  // Declaration des constructeurs
  // ///////////////////////////////////////////

  public Personne(int age, String nom, List<Personne> enfants,
      List<Personne> parents) {

    // AFFECTATION DES ATTRIBUTS DE LA CLASSE PARENT :

    // Appel d'un constructeur de la classe parent
    // Si vous ne le mettez pas, java appelle le constructeur vide de la classe
    // parent si il existe, sinon il vous oblige à le mettre.

    // Ici la classe parent est Object donc on appel le constructeur vide de la
    // classe objet
    super(/* parametres du constructeur de la classe parent */);

    // AFFECTATION DES ATTRIBUTS DE L'INSTANCE PERSONNE :

    // On donne une valeur aux attributs
    // On pense à mettre this pour indiquer qu'on veux l'attribut age.
    // this.age = age;

    // Ou alternativement, vous pouvez appelez le setter qui correspond à l'age:
    // En general c'est ce qu'on fait car on veux s'appuyer sur les controles
    // qui sont faits dans le mutateur (ici la vérification que l'age est
    // positif)
    this.setAge(age);

    // Au lieu de this.nom = nom, on préfére utiliser le setter pour bénéficier
    // des controles effectués dans setNom :
    this.setNom(nom);

    // AFFECTATION DES ASSOCIATIONS :

    this.enfants = enfants;
    this.parents = parents;
  }

  public Personne(String nom, List<Personne> enfants, List<Personne> parents) {
    // On appelle le constructeur Personne et on passe la valeur de l'age par
    // défaut.

    // Quand on utilise this(), on appelle un constructeur de la classe
    // courante
    this(0, nom, enfants, parents);

    // plutot que de réécrire tout le code :
    // super();
    // this.setAge(0);
    // this.setNom(nom);
    // this.enfants = enfants;
    // this.parents = parents;
  }

  public Personne(String nom) {
    // On appelle le constructeur Personne et on passe la valeur de l'age par
    // et on donne une liste vide pour Parent et vide pour enfants :
    this(0, nom, new ArrayList<Personne>(), new ArrayList<Personne>());
  }

  // ///////////////////////////////////////////
  // Declaration des accesseurs et mutateurs
  // ///////////////////////////////////////////
  public int getAge() {
    return age;
  }

  /**
   * Change l'age
   * 
   * @param age
   *          la nouvelle valeur de l'age qui doit etre positive.
   */
  public void setAge(int age) {
    // Si l'age est positif alors je prend l'age en compte :
    if (age >= 0) {
      // On modifie l'attribut age
      this.age = age;
    } else {
      // Mauvaise façon :
      // System.err.println("L'utilisateur est un idiot");
      // System.exit(0);

      // On prefere utiliser des exceptions :
      throw new IllegalArgumentException("L'age doit être positif");
    }

  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {

    // Le nom ne dois pas être null et ne dois pas être vide
    if ((nom != null) && (!nom.isEmpty())) {
      // On vérifie que le nom ne contient pas de nombre avec une expression
      // réguliere.
      if (!nom.matches(".*\\d+.*")) {
        this.nom = nom;
      } else {
        throw new IllegalArgumentException(
            "Le nom ne dois pas contenir de chiffre");
      }
    } else {
      throw new IllegalArgumentException("Le nom ne dois pas être null ou vide");
    }
  }

  public void vieillir() {
    this.age++;
  }

  @Override
  public String toString() {
    return "Personne [age=" + age + ", nom=" + nom + ", enfants=" + enfants
        + ", parents=" + parents + "]";
  }

}
