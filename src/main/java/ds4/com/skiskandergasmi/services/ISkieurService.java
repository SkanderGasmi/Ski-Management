package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Piste;
import ds4.com.skiskandergasmi.entities.Skieur;
import ds4.com.skiskandergasmi.entities.TypeAbonnement;

import java.util.List;
import java.util.Optional;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);


    void removeSkieur (Long numSkieur);
    Optional<Skieur> retrieveSkieur (Long numSkieur);
    Skieur updateSkieur (Skieur Skieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(Long numSkieur, Long numAbon);

    List<Skieur> getSkieurByAbonnementTypeAbonnement(TypeAbonnement typeAbonnement);
}
