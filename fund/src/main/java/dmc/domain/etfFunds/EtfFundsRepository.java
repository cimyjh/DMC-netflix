package dmc.domain.etfFunds;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EtfFundsRepository extends JpaRepository<EtfFunds, Long>, EtfFundsRepositoryCustom {


}
