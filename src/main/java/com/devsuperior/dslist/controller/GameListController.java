package com.devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameListService;
import com.devsuperior.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gls;

    @Autowired
    GameService gs;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gls.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findAll(@PathVariable Long listId){
        return gs.findByList(listId);
    }
}