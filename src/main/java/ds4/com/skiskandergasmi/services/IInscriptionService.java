package ds4.com.skiskandergasmi.services;

import ds4.com.skiskandergasmi.entities.Abonnement;
import ds4.com.skiskandergasmi.entities.Inscription;

import java.util.List;
import java.util.Optional;

public interface IInscriptionService {

    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Optional<Inscription> retrieveInscription(Long numInscription);

    void removeInscription(Long numInscription);
}
