package dmc.domain.news;



import dmc.domain.news.dto.NewsCategorySearchCondition;
import dmc.domain.news.dto.NewsListResponseDto;
import dmc.domain.news.dto.NewsNameSearchCondition;

import java.util.List;

public interface NewsRepositoryCustom {
    List<NewsListResponseDto> searchByName(NewsNameSearchCondition condition);

    List<NewsListResponseDto> searchByCategory(NewsCategorySearchCondition condition);

    List<NewsListResponseDto> findAllDto();

}
