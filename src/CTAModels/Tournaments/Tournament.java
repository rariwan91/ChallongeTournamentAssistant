package CTAModels.Tournaments;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tournament {

    @SerializedName("tournament")
    @Expose
    private Tournament_ tournament;

    public Tournament_ getTournament() {
        return tournament;
    }

    public void setTournament(Tournament_ tournament) {
        this.tournament = tournament;
    }

}