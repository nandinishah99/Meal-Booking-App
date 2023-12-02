package com.project.MealBooking.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "log")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id")
    private Long logId;

//    @ManyToOne
//    @JoinColumn(name = "booking_id")
//    private MealBooking mealBooking;

    @Column(name = "status", length = 20)
    private String status;

    @Column(name = "timestamp")
    private Timestamp timestamp;

}
