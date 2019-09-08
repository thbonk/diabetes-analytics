package de.meandmymac.diabetesanalytics.domain.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * The base class for all blood sugar measurements.
 */
@Entity
@Table(name = "blood_sugar_measurement")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "reading_type")
public abstract class BloodSugarMeasurement {
    /**
     * Blood sugar unit mg/ml.
     */
    public final static Byte MG_DL  = 0;

    /**
     * Blood sugar unit mmol/l.
     */
    public final static Byte MMOL_L = 1;

    @Getter
    @Setter
    @NonNull
    @Id
    @Column(name = "reading_ts", updatable = false, nullable = false)
    private Timestamp timestamp;

    @Getter
    @Setter
    @NonNull
    @Column(name = "blood_sugar")
    private Double bloodSugar;

    @Getter
    @Setter
    @NonNull
    @Column(name = "blood_sugar_unit")
    private Byte bloodSugarUnit;

    @Column(name = "reading_type", insertable = false, updatable = false)
    private String readingType;

    /**
     * Instantiates a new BloodSugarMeasurement.
     *
     * @param timestamp      the timestamp
     * @param bloodSugar     the blood sugar
     * @param bloodSugarUnit the blood sugar unit
     */
    public BloodSugarMeasurement(
            @NonNull Timestamp timestamp, @NonNull Double bloodSugar, @NonNull Byte bloodSugarUnit) {

        this.timestamp = timestamp;
        this.bloodSugar = bloodSugar;
        this.bloodSugarUnit = bloodSugarUnit;
    }

    public BloodSugarMeasurement() {
        // required for JPA
    }
}
