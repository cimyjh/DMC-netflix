package dmc.service;


import dmc.domain.koreaFunds.KoreaFunds;
import dmc.domain.koreaFunds.KoreaFundsRepository;
import dmc.domain.koreaFunds.KoreaFundsRepositoryImpl;
import dmc.domain.koreaFunds.dto.KoreaFundsListResponseDto;
import dmc.domain.koreaFunds.dto.KoreaFundsNameDto;
import dmc.domain.koreaFunds.dto.KoreaFundsTypeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class KoreaFundsService {

    @Autowired
    private KoreaFundsRepository koreaFundsRepository;

    @Autowired
    private KoreaFundsRepositoryImpl koreaFundsRepositoryImpl;


    public Page<KoreaFunds> getKoreaFundsList(Pageable pageable){
        int page = (pageable.getPageNumber() == 0) ? 0 : (pageable.getPageNumber() - 1);
        pageable = PageRequest.of(page,20);
        return koreaFundsRepository.findAll(pageable);
    }


    public List<KoreaFundsListResponseDto> KoreaFundsTop10(){
        return koreaFundsRepository.QfindTop10ByFund_3y();
    }


    public List<KoreaFundsListResponseDto> findTop10ByFund_assets(){
        return koreaFundsRepository.QfindTop10ByFund_assets();
    }


    public List<KoreaFundsListResponseDto> findSearchName(String fund_name){

        KoreaFundsNameDto condition = new KoreaFundsNameDto();
        condition.setFund_name(fund_name);

        return koreaFundsRepository.QfindSearchName(condition);
    }


    public List<KoreaFundsListResponseDto> findSearchType(String fund_type){

        KoreaFundsTypeDto condition = new KoreaFundsTypeDto();
        condition.setFund_type(fund_type);

        return koreaFundsRepository.QfindSearchType(condition);
    }



    public Page<KoreaFundsListResponseDto> PfindSearchName(String fund_name, Pageable pageable){

        KoreaFundsNameDto condition = new KoreaFundsNameDto();
        condition.setFund_name(fund_name);

        return koreaFundsRepository.PfindSearchName(condition, pageable);
    }


    public Page<KoreaFundsListResponseDto> PfindSearchType(String fund_type, Pageable pageable){
        KoreaFundsTypeDto condition = new KoreaFundsTypeDto();
        condition.setFund_type(fund_type);

        return koreaFundsRepository.PfindSearchType(condition, pageable);
    }


}
