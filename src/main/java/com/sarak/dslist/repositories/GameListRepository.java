package com.sarak.dslist.repositories;

import com.sarak.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository <GameList, Long> {


}
