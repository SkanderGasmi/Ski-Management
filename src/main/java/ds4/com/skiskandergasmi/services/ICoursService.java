package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Cours;
 import java.util.List;
public interface ICoursService  {
    List<Cours> retrieveAllCourses();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Cours retrieveCours (Long numCours);
    void removeCours (Long numCours);
}
