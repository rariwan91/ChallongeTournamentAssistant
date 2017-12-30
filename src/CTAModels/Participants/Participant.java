package CTAModels.Participants;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Participant {

    @SerializedName("participant")
    @Expose
    private Participant_ participant;

    public Participant_ getParticipant() {
        return participant;
    }

    public void setParticipant(Participant_ participant) {
        this.participant = participant;
    }

}