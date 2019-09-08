package de.meandmymac.diabetesanalytics.domain.repository;

import de.meandmymac.diabetesanalytics.domain.model.CgmMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

/**
 * Repository for CgmMeasurements.
 */
@Repository
public interface CgmMeasurementRepository extends JpaRepository<CgmMeasurement, Timestamp> {
}
