package io.renanrcs.dslist.services;

import io.renanrcs.dslist.dto.GameMinDTO;
import io.renanrcs.dslist.entities.Game;
import io.renanrcs.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll(){
       List<Game> result = repository.findAll();
        return result.stream().map(dto -> new GameMinDTO(dto)).toList();
    }
}
