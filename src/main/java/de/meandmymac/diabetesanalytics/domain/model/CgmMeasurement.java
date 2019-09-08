package de.meandmymac.diabetesanalytics.domain.model;

import lombok.Builder;
import lombok.NonNull;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.sql.Timestamp;

/**
 * The class that represent a CgmMeasurement.
 */
@Entity
@DiscriminatorValue("CGM")
public class CgmMeasurement extends BloodSugarMeasurement {
    /**
     * Instantiates a new CgmMeasurement.
     *
     * @param timestamp      the timestamp
     * @param bloodSugar     the blood sugar
     * @param bloodSugarUnit the blood sugar unit
     */
    @Builder
    public CgmMeasurement(@NonNull Timestamp timestamp, @NonNull Double bloodSugar, @NonNull Byte bloodSugarUnit) {
        super(timestamp, bloodSugar, bloodSugarUnit);
    }

    public CgmMeasurement() {
        // required for JPA
    }
}
