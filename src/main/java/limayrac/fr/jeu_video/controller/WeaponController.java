package limayrac.fr.jeu_video.controller;

import limayrac.fr.jeu_video.entities.Weapon;
import limayrac.fr.jeu_video.repository.WeaponRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class WeaponController {

    @Autowired
    private WeaponRepository weaponRepository;

    @GetMapping(value = "/weapons", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Weapon> weapons() {
        return weaponRepository.findAll();
    }
}
