package io.renanrcs.dslist.services;

import io.renanrcs.dslist.dto.GameDTO;
import io.renanrcs.dslist.dto.GameMinDTO;
import io.renanrcs.dslist.entities.Game;
import io.renanrcs.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).orElse(null);
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
        return result.stream().map(dto -> new GameMinDTO(dto)).toList();
    }
}
