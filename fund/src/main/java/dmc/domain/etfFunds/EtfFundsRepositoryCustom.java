package dmc.domain.etfFunds;



import dmc.domain.etfFunds.dto.EtfFundsListResponseDto;
import dmc.domain.etfFunds.dto.EtfFundsNameDto;
import dmc.domain.etfFunds.dto.EtfFundsbasicIndexDto;

import java.util.List;

public interface EtfFundsRepositoryCustom {
    List<EtfFundsListResponseDto> findAllDto();

    List<EtfFundsListResponseDto> QfindTop10ByEtf_1wY();

    List<EtfFundsListResponseDto> QfindTop10ByEtf_1mY();

    List<EtfFundsListResponseDto> QfindTop10ByEtf_3mY();

    List<EtfFundsListResponseDto> QfindTop10ByEtf_1dV();

    List<EtfFundsListResponseDto> QfindTop10ByEtf_assets();

    List<EtfFundsListResponseDto> QfindSearchName(EtfFundsNameDto condition);

    List<EtfFundsListResponseDto> QfindSearchBasic_Index(EtfFundsbasicIndexDto condition);
}
