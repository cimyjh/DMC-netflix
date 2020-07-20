package dmc.api;

import dmc.domain.EtfFunds;
import dmc.domain.KoreaFunds;
import dmc.service.FeignFundRemoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/fund")
public class FundController {

    private final FeignFundRemoteService feignFundRemoteService;

    @GetMapping(path = "/etf")
    public List<EtfFunds> getEtfs(){
        return feignFundRemoteService.getEtfs();
    }

    @GetMapping(path ="/etf/1dvtop10")
    public List<EtfFunds> get1dvtop10(){
        return feignFundRemoteService.get1dvtop10();
    }

    @GetMapping(path ="/etf/1mytop10")
    public List<EtfFunds> get1mytop10(){
        return feignFundRemoteService.get1mytop10();
    }

    @GetMapping(path ="/etf/1wytop10")
    public List<EtfFunds> get1wytop10(){
        return feignFundRemoteService.get1wytop10();
    }


    @GetMapping(path ="/etf/3mytop10")
    public List<EtfFunds> get3mytop10(){
        return feignFundRemoteService.get3mytop10();
    }


    @GetMapping(path ="/etf/asset_top10")
    public List<EtfFunds> getAsset_top10(){
        return feignFundRemoteService.getAsset_top10();
    }

    @GetMapping(path="/etf/basicIndex/{basicIndex}")
    public List<EtfFunds> getBasicIndex(
            @PathVariable String basicIndex){
        return feignFundRemoteService.getBasicIndex(basicIndex);
    }

    @GetMapping(path="/etf/etfName/{etfName}")
    public List<EtfFunds> getEtfName(
            @PathVariable String etfName){
        return feignFundRemoteService.getEtfName(etfName);
    }

    @GetMapping(path = "/koreafund")
    public List<KoreaFunds> getKoreafunds(){
        return feignFundRemoteService.getKoreafunds();
    }

    @GetMapping(path = "/koreafund/asset10")
    public List<KoreaFunds> getKoreaAsset_top10(){
        return feignFundRemoteService.getKoreaAsset_top10();
    }

    @GetMapping(path = "/koreafund/Revenuetop10")
    public List<KoreaFunds> getKoreaRevenueTop10(){
        return feignFundRemoteService.getKoreaRevenueTop10();
    }

    @GetMapping(path="/koreafund/fund_name/{getFundName}")
    public List<KoreaFunds> getFundName(
            @PathVariable String getFundName){
        return feignFundRemoteService.getFundName(getFundName);
    }

    @GetMapping(path="/koreafund/fund_type/{fundType}")
    public List<KoreaFunds> getKoreaFundType(
            @PathVariable String fundType){
        return feignFundRemoteService.getKoreaFundType(fundType);
    }



}
