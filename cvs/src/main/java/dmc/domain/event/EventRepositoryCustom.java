package dmc.domain.event;



import dmc.domain.event.dto.EventCategorySearchCondition;
import dmc.domain.event.dto.EventListResponseDto;
import dmc.domain.event.dto.EventNameSearchCondition;

import java.util.List;

public interface EventRepositoryCustom {
    List<EventListResponseDto> searchByName(EventNameSearchCondition condition);

    List<EventListResponseDto> searchByCategory(EventCategorySearchCondition condition);

    List<EventListResponseDto> findAllDto();

}
