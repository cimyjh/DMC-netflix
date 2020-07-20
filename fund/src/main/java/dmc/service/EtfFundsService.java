package dmc.service;


import dmc.domain.etfFunds.EtfFunds;
import dmc.domain.etfFunds.EtfFundsRepository;
import dmc.domain.etfFunds.EtfFundsRepositoryImpl;
import dmc.domain.etfFunds.dto.EtfFundsListResponseDto;
import dmc.domain.etfFunds.dto.EtfFundsNameDto;
import dmc.domain.etfFunds.dto.EtfFundsbasicIndexDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtfFundsService {

    @Autowired
    private EtfFundsRepository etfFundsRepository;

    @Autowired
    private EtfFundsRepositoryImpl etfFundsRepositoryImpl;


    public Page<EtfFunds> getEtfFundsList(Pageable pageable){
        int page = (pageable.getPageNumber() == 0) ? 0 : (pageable.getPageNumber() - 1);
        pageable = PageRequest.of(page,20);
        return etfFundsRepository.findAll(pageable);
    }


    public List<EtfFundsListResponseDto> etfFunds1wyTop10(){
        return etfFundsRepository.QfindTop10ByEtf_1wY();
    }


    public List<EtfFundsListResponseDto> etfFunds1myTop10(){
        return etfFundsRepository.QfindTop10ByEtf_1mY();
    }

    public List<EtfFundsListResponseDto> etfFunds3myTop10(){
        return etfFundsRepository.QfindTop10ByEtf_3mY();
    }

    public List<EtfFundsListResponseDto> etfFundsAssetTop10(){
        return etfFundsRepository.QfindTop10ByEtf_assets();
    }


    public List<EtfFundsListResponseDto> findSearchName(String etf_name){

        EtfFundsNameDto condition = new EtfFundsNameDto();
        condition.setEtf_name(etf_name);

        return etfFundsRepository.QfindSearchName(condition);
    }


    public List<EtfFundsListResponseDto> findSearchType(String etf_basic_index){

        EtfFundsbasicIndexDto condition = new EtfFundsbasicIndexDto();
        condition.setEtf_basic_index(etf_basic_index);

        return etfFundsRepository.QfindSearchBasic_Index(condition);
    }



//    public Page<KoreaFundsListResponseDto> PfindSearchName(String fund_name, Pageable pageable){
//
//        KoreaFundsNameDto condition = new KoreaFundsNameDto();
//        condition.setFund_name(fund_name);
//
//        return koreaFundsRepository.PfindSearchName(condition, pageable);
//    }
//
//
//    public Page<KoreaFundsListResponseDto> PfindSearchType(String fund_type, Pageable pageable){
//        KoreaFundsTypeDto condition = new KoreaFundsTypeDto();
//        condition.setFund_type(fund_type);
//
//        return koreaFundsRepository.PfindSearchType(condition, pageable);
//    }

}
