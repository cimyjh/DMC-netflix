package dmc.service;

import dmc.domain.EtfFunds;
import dmc.domain.KoreaFunds;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "fund", url="http://localhost:8081")
public interface FeignFundRemoteService {

    @RequestMapping(path= "/v1/fund/etffunds")
    List<EtfFunds> getEtfs();

    @RequestMapping(path = "/v1/fund/etffunds/1dvtop10")
    List<EtfFunds> get1dvtop10();

    @RequestMapping(path = "/v1/fund/etffunds/1mytop10")
    List<EtfFunds> get1mytop10();

    @RequestMapping(path = "/v1/fund/etffunds/1wytop10")
    List<EtfFunds> get1wytop10();

    @RequestMapping(path = "/v1/fund/etffunds/3mytop10")
    List<EtfFunds> get3mytop10();

    @RequestMapping(path = "/v1/fund/etffunds/asset_top10")
    List<EtfFunds> getAsset_top10();

    @RequestMapping(path = "/v1/fund/etffunds/findSearchBasic_Index?etf_basic_index={basicIndex")
    List<EtfFunds> getBasicIndex(
            @PathVariable("basicIndex") String basicIndex
    );

    @RequestMapping(path = "/v1/fund/etffunds/findSearchName?etf_name={etfName")
    List<EtfFunds> getEtfName(
            @PathVariable("etfName") String etfName
    );


    @RequestMapping(path = "/v1/fund/koreafunds")
    List<KoreaFunds> getKoreafunds();

    @RequestMapping(path = "/v1/fund/koreafunds/asset_top10")
    List<KoreaFunds> getKoreaAsset_top10();

    @RequestMapping(path = "/v1/fund/koreafunds/top10")
    List<KoreaFunds> getKoreaRevenueTop10();


    @RequestMapping(path = "/v1/fund/koreafunds/findSearchName?fund_name={fundName}")
    List<KoreaFunds> getFundName(
            @PathVariable("fundName") String fundName
    );

    @RequestMapping(path = "/v1/fund/koreafunds/findSearchType?fund_type={fundType}")
    List<KoreaFunds> getKoreaFundType(
            @PathVariable("fundType") String fundType
    );

}
