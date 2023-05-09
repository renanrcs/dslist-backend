package io.renanrcs.dslist.repositories;

import io.renanrcs.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
