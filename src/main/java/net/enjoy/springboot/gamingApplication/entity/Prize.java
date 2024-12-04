//package net.enjoy.springboot.registrationlogin.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Prize {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String description;
//    private Double value;
//
//    @ManyToOne
//    private Tournament tournament;
//
//    // Getters and Setters
//
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Double getValue() {
//        return value;
//    }
//
//    public void setValue(Double value) {
//        this.value = value;
//    }
//
//    public Tournament getTournament() {
//        return tournament;
//    }
//
//    public void setTournament(Tournament tournament) {
//        this.tournament = tournament;
//    }
//}
//
