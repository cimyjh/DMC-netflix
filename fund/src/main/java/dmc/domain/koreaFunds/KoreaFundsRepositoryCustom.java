package dmc.domain.koreaFunds;


import dmc.domain.koreaFunds.dto.KoreaFundsListResponseDto;
import dmc.domain.koreaFunds.dto.KoreaFundsNameDto;
import dmc.domain.koreaFunds.dto.KoreaFundsTypeDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface KoreaFundsRepositoryCustom {
    List<KoreaFundsListResponseDto> findAllDto();

    List<KoreaFundsListResponseDto> QfindTop10ByFund_3y();

    List<KoreaFundsListResponseDto> QfindTop10ByFund_assets();

    List<KoreaFundsListResponseDto> QfindSearchName(KoreaFundsNameDto condition);

    List<KoreaFundsListResponseDto> QfindSearchType(KoreaFundsTypeDto condition);

    Page<KoreaFundsListResponseDto> PfindSearchName(KoreaFundsNameDto condition, Pageable pageable);

    Page<KoreaFundsListResponseDto> PfindSearchType(KoreaFundsTypeDto condition, Pageable pageable);


}
