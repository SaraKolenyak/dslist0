package com.sarak.dslist.controllers;

import com.sarak.dslist.dto.GameListDTO;
import com.sarak.dslist.dto.GameMinDTO;
import com.sarak.dslist.services.GameListService;
import com.sarak.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List <GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }
}
