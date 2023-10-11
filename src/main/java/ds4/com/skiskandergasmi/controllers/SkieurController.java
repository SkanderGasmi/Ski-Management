package ds4.com.skiskandergasmi.controllers;

import ds4.com.skiskandergasmi.entities.TypeAbonnement;
import ds4.com.skiskandergasmi.entities.Skieur;
import ds4.com.skiskandergasmi.services.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("skieur")
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;
    //localhost:9090/retrieveAllSkieurs
    @GetMapping
    public List<Skieur> getAll(){
        return iSkieurService.retrieveAllSkieurs();

    }
    @GetMapping("{numSkieur}")

    public Optional<Skieur> retrieveSkieur(@PathVariable Long numSkieur) {

        return  iSkieurService.retrieveSkieur(numSkieur);

    }
    @PostMapping

    public Skieur addSkieur(@RequestBody Skieur skieur){

        return iSkieurService.addSkieur(skieur);
    }
    @DeleteMapping("{numSkieur}")
    public void removeSkieur(@PathVariable Long numSkieur){

        iSkieurService.removeSkieur(numSkieur);
    }

    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur Skieur) {

        return  iSkieurService.updateSkieur(Skieur);

    }
    @PutMapping("p/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){
        return iSkieurService.assignSkierToPiste(numSkieur, numPiste);
    }

    @PutMapping("s/{numSkieur}/{numAbon}")
    public Skieur AssignSkierToSubscription(@PathVariable Long numSkieur, @PathVariable Long numAbon) {
        return iSkieurService.AssignSkierToSubscription(numSkieur, numAbon);
    }
    @GetMapping("getSkieurParTypeAbon/{tp}")
    public List<Skieur> getSkieurParTypeAbon(@PathVariable TypeAbonnement tp){
        return  iSkieurService.getSkieurByAbonnementTypeAbonnement(tp);
    }
}
