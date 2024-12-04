//package net.enjoy.springboot.registrationlogin.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//public class TournamentMatch {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    private Tournament tournament;
//
//    private String playerOne;
//    private String playerTwo;
//    private String result;
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
//    public Tournament getTournament() {
//        return tournament;
//    }
//
//    public void setTournament(Tournament tournament) {
//        this.tournament = tournament;
//    }
//
//    public String getPlayerOne() {
//        return playerOne;
//    }
//
//    public void setPlayerOne(String playerOne) {
//        this.playerOne = playerOne;
//    }
//
//    public String getPlayerTwo() {
//        return playerTwo;
//    }
//
//    public void setPlayerTwo(String playerTwo) {
//        this.playerTwo = playerTwo;
//    }
//
//    public String getResult() {
//        return result;
//    }
//
//    public void setResult(String result) {
//        this.result = result;
//    }
//}
//
