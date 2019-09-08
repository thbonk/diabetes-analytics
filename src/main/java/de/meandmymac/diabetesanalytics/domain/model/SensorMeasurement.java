package de.meandmymac.diabetesanalytics.domain.model;

import lombok.Builder;
import lombok.NonNull;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * The class that represents a SensorMeasurement.
 */
@Entity
@DiscriminatorValue("SENSOR")
public class SensorMeasurement extends BloodSugarMeasurement {
    /**
     * Instantiates a new SensorMeasurement.
     *
     * @param timestamp      the timestamp
     * @param bloodSugar     the blood sugar
     * @param bloodSugarUnit the blood sugar unit
     */
    @Builder
    public SensorMeasurement(@NonNull Timestamp timestamp, @NonNull Double bloodSugar, @NonNull Byte bloodSugarUnit) {
        super(timestamp, bloodSugar, bloodSugarUnit);
    }

    public SensorMeasurement() {
        // required for JPA
    }
}
