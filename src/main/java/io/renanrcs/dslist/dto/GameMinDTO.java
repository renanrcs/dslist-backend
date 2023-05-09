package io.renanrcs.dslist.dto;

import io.renanrcs.dslist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game dto) {
        id = dto.getId();
        title = dto.getTitle();
        year = dto.getYear();
        imgUrl = dto.getImgUrl();
        shortDescription = dto.getShortDescription();
    }
}
