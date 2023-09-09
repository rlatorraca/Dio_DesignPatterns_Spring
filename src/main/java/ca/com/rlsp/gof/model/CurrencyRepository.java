package ca.com.rlsp.gof.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyBase, Long> {

    public Optional<CurrencyBase> findByTimestamp(Long timestamp);
}
