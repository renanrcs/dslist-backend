package io.renanrcs.dslist.services;

import io.renanrcs.dslist.dto.GameListDTO;
import io.renanrcs.dslist.entities.GameList;
import io.renanrcs.dslist.repositories.GameListRepository;
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
        return result.stream().map(dto -> new GameListDTO(dto)).toList();
    }
}
