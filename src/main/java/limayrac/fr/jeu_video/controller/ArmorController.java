package limayrac.fr.jeu_video.controller;

import limayrac.fr.jeu_video.entities.Armor;
import limayrac.fr.jeu_video.repository.ArmorRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ArmorController {

    @Autowired
    private ArmorRepository armorRepository;

    @GetMapping(value = "/armors", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Armor> armor() {
        return armorRepository.findAll();
    }
}
