package ds4.com.skiskandergasmi.repositories;

import ds4.com.skiskandergasmi.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long > {


    @Query("select s from Skieur s where s.abonnement.typeAbonnement = ?1")
    List<Skieur> findSkieurByAbonnementTypeAbonnementJPQL1(TypeAbonnement typeAbonnement);

    @Query("select s from Skieur s where s.abonnement.typeAbonnement = :typeAbonnement")
    List<Skieur> findSkieurByAbonnementTypeAbonnementJPQL2(@Param("typeAbonnement") TypeAbonnement typeAbonnement);

    @Query(value = "SELECT * " +
            "FROM skieur s " +
            "JOIN abonnement a" +
            "ON s.abonnement_num_abon = a.num_abon " +
            "WHERE a.type_abonnement = :typeAbonnement" +
            "AND s.ville = :ville", nativeQuery = true)
    List<Skieur> getByAbonnementTypeAbonnementAndVilleSQL(@Param("typeAbonnement") TypeAbonnement typeAbonnement, @Param("ville") String ville);


    List<Skieur> findByInscriptionsCoursTypeCoursAndInscriptionsCoursSupportAndCouleur(TypeCours typeCours, Support support, Couleur couleur);

}
