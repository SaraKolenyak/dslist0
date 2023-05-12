package com.sarak.dslist.services;

import com.sarak.dslist.dto.GameListDTO;
import com.sarak.dslist.dto.GameMinDTO;
import com.sarak.dslist.entities.Game;
import com.sarak.dslist.entities.GameList;
import com.sarak.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }
}
