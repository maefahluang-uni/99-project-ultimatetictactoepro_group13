package th.mfu.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gameId; 
    
    //constructor 
    public Game(){
    }
    public Game(Long gameId) {
        this.gameId = gameId;
    }

    //getter and setter 
    public Long getGameId() {
        return gameId;
    }

    public void setGameId(Long gameId) {
        this.gameId = gameId;
    }

}