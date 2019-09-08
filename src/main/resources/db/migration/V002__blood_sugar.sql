CREATE TABLE blood_sugar_measurement (
    reading_ts          TIMESTAMP   NOT NULL,
    blood_sugar         DOUBLE      NOT NULL,
    blood_sugar_unit    TINYINT     NOT NULL,
    reading_type        VARCHAR(10),
    PRIMARY KEY (reading_type, reading_ts)
);