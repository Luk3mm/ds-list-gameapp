package com.game.dslist.repositories;

import com.game.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
