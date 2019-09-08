package de.meandmymac.diabetesanalytics.domain.repository;

import de.meandmymac.diabetesanalytics.domain.model.SensorMeasurement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

/**
 * The repository for SensorMeasurements.
 */
@Repository
public interface SensorMeasurementRepository extends JpaRepository<SensorMeasurement, Timestamp> {
}
