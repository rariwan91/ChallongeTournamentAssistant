package CTAModels.Matches;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Match_ {

    @SerializedName("attachment_count")
    @Expose
    private Object attachmentCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("group_id")
    @Expose
    private Object groupId;
    @SerializedName("has_attachment")
    @Expose
    private Boolean hasAttachment;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("identifier")
    @Expose
    private String identifier;
    @SerializedName("location")
    @Expose
    private Object location;
    @SerializedName("loser_id")
    @Expose
    private Object loserId;
    @SerializedName("player1_id")
    @Expose
    private Object player1Id;
    @SerializedName("player1_is_prereq_match_loser")
    @Expose
    private Boolean player1IsPrereqMatchLoser;
    @SerializedName("player1_prereq_match_id")
    @Expose
    private Integer player1PrereqMatchId;
    @SerializedName("player1_votes")
    @Expose
    private Object player1Votes;
    @SerializedName("player2_id")
    @Expose
    private Object player2Id;
    @SerializedName("player2_is_prereq_match_loser")
    @Expose
    private Boolean player2IsPrereqMatchLoser;
    @SerializedName("player2_prereq_match_id")
    @Expose
    private Integer player2PrereqMatchId;
    @SerializedName("player2_votes")
    @Expose
    private Object player2Votes;
    @SerializedName("round")
    @Expose
    private Integer round;
    @SerializedName("scheduled_time")
    @Expose
    private Object scheduledTime;
    @SerializedName("started_at")
    @Expose
    private Object startedAt;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("tournament_id")
    @Expose
    private Integer tournamentId;
    @SerializedName("underway_at")
    @Expose
    private Object underwayAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("winner_id")
    @Expose
    private Object winnerId;
    @SerializedName("prerequisite_match_ids_csv")
    @Expose
    private String prerequisiteMatchIdsCsv;
    @SerializedName("scores_csv")
    @Expose
    private String scoresCsv;

    public Object getAttachmentCount() {
        return attachmentCount;
    }

    public void setAttachmentCount(Object attachmentCount) {
        this.attachmentCount = attachmentCount;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Boolean getHasAttachment() {
        return hasAttachment;
    }

    public void setHasAttachment(Boolean hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Object getLoserId() {
        return loserId;
    }

    public void setLoserId(Object loserId) {
        this.loserId = loserId;
    }

    public Object getPlayer1Id() {
        return player1Id;
    }

    public void setPlayer1Id(Object player1Id) {
        this.player1Id = player1Id;
    }

    public Boolean getPlayer1IsPrereqMatchLoser() {
        return player1IsPrereqMatchLoser;
    }

    public void setPlayer1IsPrereqMatchLoser(Boolean player1IsPrereqMatchLoser) {
        this.player1IsPrereqMatchLoser = player1IsPrereqMatchLoser;
    }

    public Integer getPlayer1PrereqMatchId() {
        return player1PrereqMatchId;
    }

    public void setPlayer1PrereqMatchId(Integer player1PrereqMatchId) {
        this.player1PrereqMatchId = player1PrereqMatchId;
    }

    public Object getPlayer1Votes() {
        return player1Votes;
    }

    public void setPlayer1Votes(Object player1Votes) {
        this.player1Votes = player1Votes;
    }

    public Object getPlayer2Id() {
        return player2Id;
    }

    public void setPlayer2Id(Object player2Id) {
        this.player2Id = player2Id;
    }

    public Boolean getPlayer2IsPrereqMatchLoser() {
        return player2IsPrereqMatchLoser;
    }

    public void setPlayer2IsPrereqMatchLoser(Boolean player2IsPrereqMatchLoser) {
        this.player2IsPrereqMatchLoser = player2IsPrereqMatchLoser;
    }

    public Integer getPlayer2PrereqMatchId() {
        return player2PrereqMatchId;
    }

    public void setPlayer2PrereqMatchId(Integer player2PrereqMatchId) {
        this.player2PrereqMatchId = player2PrereqMatchId;
    }

    public Object getPlayer2Votes() {
        return player2Votes;
    }

    public void setPlayer2Votes(Object player2Votes) {
        this.player2Votes = player2Votes;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Object getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Object scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Object getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Object startedAt) {
        this.startedAt = startedAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Object getUnderwayAt() {
        return underwayAt;
    }

    public void setUnderwayAt(Object underwayAt) {
        this.underwayAt = underwayAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getWinnerId() {
        return winnerId;
    }

    public void setWinnerId(Object winnerId) {
        this.winnerId = winnerId;
    }

    public String getPrerequisiteMatchIdsCsv() {
        return prerequisiteMatchIdsCsv;
    }

    public void setPrerequisiteMatchIdsCsv(String prerequisiteMatchIdsCsv) {
        this.prerequisiteMatchIdsCsv = prerequisiteMatchIdsCsv;
    }

    public String getScoresCsv() {
        return scoresCsv;
    }

    public void setScoresCsv(String scoresCsv) {
        this.scoresCsv = scoresCsv;
    }

}