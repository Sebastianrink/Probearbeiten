package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Teams")
public class Team {

    @Id
    private int Id;
    private String TeamName;
    private int Punkte;

    public int getPunkte() {
        return Punkte;
    }

    public void setPunkte(int punkte) {
        Punkte = punkte;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }




}
