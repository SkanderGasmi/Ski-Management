package ds4.com.skiskandergasmi.repositories;

import ds4.com.skiskandergasmi.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours,Long>{
    @Query(value = "SELECT * " +
            "FROM Cours c " +
            "ORDER BY SELECT COUNT(*) " +
            "FROM inscription i " +
            "WHERE i.cours_num_cours = c.num_cours ",nativeQuery = true)
    List<Cours> getAllOrdersByInscriptionNumberSQL();
    @Query(value = "SELECT c FROM Cours c ORDER BY c.inscriptions.size")
    List<Cours> getAllOrdersByInscriptionNumberJPQL();

}
