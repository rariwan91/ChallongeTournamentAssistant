package CTAModels.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match {

    @SerializedName("match")
    @Expose
    private Match_ match;

    public Match_ getMatch() {
        return match;
    }

    public void setMatch(Match_ match) {
        this.match = match;
    }

}