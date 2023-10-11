package ds4.com.skiskandergasmi.repositories;

import ds4.com.skiskandergasmi.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import ds4.com.skiskandergasmi.entities.Abonnement;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {

    List<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement);

    List<Abonnement> findAbonnementByDateDebutAndDateFin(LocalDate startDate, LocalDate endDate);
}
