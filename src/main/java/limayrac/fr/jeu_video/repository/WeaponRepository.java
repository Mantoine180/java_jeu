package limayrac.fr.jeu_video.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import limayrac.fr.jeu_video.entities.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
}