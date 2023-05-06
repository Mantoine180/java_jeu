package limayrac.fr.jeu_video.controller;

import limayrac.fr.jeu_video.entities.Player;
import limayrac.fr.jeu_video.repository.ArmorRepository;
import limayrac.fr.jeu_video.repository.PlayerRepository;
import limayrac.fr.jeu_video.repository.WeaponRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private ArmorRepository armorRepository;

    @Autowired
    private WeaponRepository weaponRepository;

    @GetMapping(value = "/players", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Player> players() {
        return playerRepository.findAll();
    }

    @GetMapping(value = "/players/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Player getOnePlayer(@PathVariable Long id) {
        Optional<Player> user = playerRepository.findById(id);
        return user.orElse(null);
    }

    @PostMapping(value = "/players", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Player addPlayer(@RequestBody Player player) {
        return playerRepository.save(player);
    }

    @PutMapping(value = "/players/{id}")
    @ResponseBody
    public Player updatePlayer(@PathVariable("id") Long id, @RequestBody Player player) {
        player.setId(id);
        return playerRepository.save(player);
    }
}
