package limayrac.fr.jeu_video.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import limayrac.fr.jeu_video.entities.Armor;

@Repository
public interface ArmorRepository extends JpaRepository<Armor, Long> {
}
