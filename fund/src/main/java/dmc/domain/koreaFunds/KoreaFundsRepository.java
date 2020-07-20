package dmc.domain.koreaFunds;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KoreaFundsRepository extends JpaRepository<KoreaFunds, Long>, KoreaFundsRepositoryCustom {
//    List<KoreaFunds> findTop10ByOrderByFund3yDesc();

}
