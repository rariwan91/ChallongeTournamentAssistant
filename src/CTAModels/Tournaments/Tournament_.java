package CTAModels.Tournaments;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tournament_ {

    @SerializedName("accept_attachments")
    @Expose
    private Boolean acceptAttachments;
    @SerializedName("allow_participant_match_reporting")
    @Expose
    private Boolean allowParticipantMatchReporting;
    @SerializedName("anonymous_voting")
    @Expose
    private Boolean anonymousVoting;
    @SerializedName("category")
    @Expose
    private Object category;
    @SerializedName("check_in_duration")
    @Expose
    private Object checkInDuration;
    @SerializedName("completed_at")
    @Expose
    private Object completedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("created_by_api")
    @Expose
    private Boolean createdByApi;
    @SerializedName("credit_capped")
    @Expose
    private Boolean creditCapped;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("game_id")
    @Expose
    private Integer gameId;
    @SerializedName("group_stages_enabled")
    @Expose
    private Boolean groupStagesEnabled;
    @SerializedName("hide_forum")
    @Expose
    private Boolean hideForum;
    @SerializedName("hide_seeds")
    @Expose
    private Boolean hideSeeds;
    @SerializedName("hold_third_place_match")
    @Expose
    private Boolean holdThirdPlaceMatch;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("max_predictions_per_user")
    @Expose
    private Integer maxPredictionsPerUser;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("notify_users_when_matches_open")
    @Expose
    private Boolean notifyUsersWhenMatchesOpen;
    @SerializedName("notify_users_when_the_tournament_ends")
    @Expose
    private Boolean notifyUsersWhenTheTournamentEnds;
    @SerializedName("open_signup")
    @Expose
    private Boolean openSignup;
    @SerializedName("participants_count")
    @Expose
    private Integer participantsCount;
    @SerializedName("prediction_method")
    @Expose
    private Integer predictionMethod;
    @SerializedName("predictions_opened_at")
    @Expose
    private Object predictionsOpenedAt;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("progress_meter")
    @Expose
    private Integer progressMeter;
    @SerializedName("pts_for_bye")
    @Expose
    private String ptsForBye;
    @SerializedName("pts_for_game_tie")
    @Expose
    private String ptsForGameTie;
    @SerializedName("pts_for_game_win")
    @Expose
    private String ptsForGameWin;
    @SerializedName("pts_for_match_tie")
    @Expose
    private String ptsForMatchTie;
    @SerializedName("pts_for_match_win")
    @Expose
    private String ptsForMatchWin;
    @SerializedName("quick_advance")
    @Expose
    private Boolean quickAdvance;
    @SerializedName("ranked_by")
    @Expose
    private String rankedBy;
    @SerializedName("require_score_agreement")
    @Expose
    private Boolean requireScoreAgreement;
    @SerializedName("rr_pts_for_game_tie")
    @Expose
    private String rrPtsForGameTie;
    @SerializedName("rr_pts_for_game_win")
    @Expose
    private String rrPtsForGameWin;
    @SerializedName("rr_pts_for_match_tie")
    @Expose
    private String rrPtsForMatchTie;
    @SerializedName("rr_pts_for_match_win")
    @Expose
    private String rrPtsForMatchWin;
    @SerializedName("sequential_pairings")
    @Expose
    private Boolean sequentialPairings;
    @SerializedName("show_rounds")
    @Expose
    private Boolean showRounds;
    @SerializedName("signup_cap")
    @Expose
    private Object signupCap;
    @SerializedName("start_at")
    @Expose
    private Object startAt;
    @SerializedName("started_at")
    @Expose
    private Object startedAt;
    @SerializedName("started_checking_in_at")
    @Expose
    private Object startedCheckingInAt;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("swiss_rounds")
    @Expose
    private Integer swissRounds;
    @SerializedName("teams")
    @Expose
    private Boolean teams;
    @SerializedName("tie_breaks")
    @Expose
    private List<String> tieBreaks = null;
    @SerializedName("tournament_type")
    @Expose
    private String tournamentType;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("description_source")
    @Expose
    private String descriptionSource;
    @SerializedName("subdomain")
    @Expose
    private Object subdomain;
    @SerializedName("full_challonge_url")
    @Expose
    private String fullChallongeUrl;
    @SerializedName("live_image_url")
    @Expose
    private String liveImageUrl;
    @SerializedName("sign_up_url")
    @Expose
    private Object signUpUrl;
    @SerializedName("review_before_finalizing")
    @Expose
    private Boolean reviewBeforeFinalizing;
    @SerializedName("accepting_predictions")
    @Expose
    private Boolean acceptingPredictions;
    @SerializedName("participants_locked")
    @Expose
    private Boolean participantsLocked;
    @SerializedName("game_name")
    @Expose
    private String gameName;
    @SerializedName("participants_swappable")
    @Expose
    private Boolean participantsSwappable;
    @SerializedName("team_convertable")
    @Expose
    private Boolean teamConvertable;
    @SerializedName("group_stages_were_started")
    @Expose
    private Boolean groupStagesWereStarted;

    public Boolean getAcceptAttachments() {
        return acceptAttachments;
    }

    public void setAcceptAttachments(Boolean acceptAttachments) {
        this.acceptAttachments = acceptAttachments;
    }

    public Boolean getAllowParticipantMatchReporting() {
        return allowParticipantMatchReporting;
    }

    public void setAllowParticipantMatchReporting(Boolean allowParticipantMatchReporting) {
        this.allowParticipantMatchReporting = allowParticipantMatchReporting;
    }

    public Boolean getAnonymousVoting() {
        return anonymousVoting;
    }

    public void setAnonymousVoting(Boolean anonymousVoting) {
        this.anonymousVoting = anonymousVoting;
    }

    public Object getCategory() {
        return category;
    }

    public void setCategory(Object category) {
        this.category = category;
    }

    public Object getCheckInDuration() {
        return checkInDuration;
    }

    public void setCheckInDuration(Object checkInDuration) {
        this.checkInDuration = checkInDuration;
    }

    public Object getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(Object completedAt) {
        this.completedAt = completedAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getCreatedByApi() {
        return createdByApi;
    }

    public void setCreatedByApi(Boolean createdByApi) {
        this.createdByApi = createdByApi;
    }

    public Boolean getCreditCapped() {
        return creditCapped;
    }

    public void setCreditCapped(Boolean creditCapped) {
        this.creditCapped = creditCapped;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Boolean getGroupStagesEnabled() {
        return groupStagesEnabled;
    }

    public void setGroupStagesEnabled(Boolean groupStagesEnabled) {
        this.groupStagesEnabled = groupStagesEnabled;
    }

    public Boolean getHideForum() {
        return hideForum;
    }

    public void setHideForum(Boolean hideForum) {
        this.hideForum = hideForum;
    }

    public Boolean getHideSeeds() {
        return hideSeeds;
    }

    public void setHideSeeds(Boolean hideSeeds) {
        this.hideSeeds = hideSeeds;
    }

    public Boolean getHoldThirdPlaceMatch() {
        return holdThirdPlaceMatch;
    }

    public void setHoldThirdPlaceMatch(Boolean holdThirdPlaceMatch) {
        this.holdThirdPlaceMatch = holdThirdPlaceMatch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMaxPredictionsPerUser() {
        return maxPredictionsPerUser;
    }

    public void setMaxPredictionsPerUser(Integer maxPredictionsPerUser) {
        this.maxPredictionsPerUser = maxPredictionsPerUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNotifyUsersWhenMatchesOpen() {
        return notifyUsersWhenMatchesOpen;
    }

    public void setNotifyUsersWhenMatchesOpen(Boolean notifyUsersWhenMatchesOpen) {
        this.notifyUsersWhenMatchesOpen = notifyUsersWhenMatchesOpen;
    }

    public Boolean getNotifyUsersWhenTheTournamentEnds() {
        return notifyUsersWhenTheTournamentEnds;
    }

    public void setNotifyUsersWhenTheTournamentEnds(Boolean notifyUsersWhenTheTournamentEnds) {
        this.notifyUsersWhenTheTournamentEnds = notifyUsersWhenTheTournamentEnds;
    }

    public Boolean getOpenSignup() {
        return openSignup;
    }

    public void setOpenSignup(Boolean openSignup) {
        this.openSignup = openSignup;
    }

    public Integer getParticipantsCount() {
        return participantsCount;
    }

    public void setParticipantsCount(Integer participantsCount) {
        this.participantsCount = participantsCount;
    }

    public Integer getPredictionMethod() {
        return predictionMethod;
    }

    public void setPredictionMethod(Integer predictionMethod) {
        this.predictionMethod = predictionMethod;
    }

    public Object getPredictionsOpenedAt() {
        return predictionsOpenedAt;
    }

    public void setPredictionsOpenedAt(Object predictionsOpenedAt) {
        this.predictionsOpenedAt = predictionsOpenedAt;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Integer getProgressMeter() {
        return progressMeter;
    }

    public void setProgressMeter(Integer progressMeter) {
        this.progressMeter = progressMeter;
    }

    public String getPtsForBye() {
        return ptsForBye;
    }

    public void setPtsForBye(String ptsForBye) {
        this.ptsForBye = ptsForBye;
    }

    public String getPtsForGameTie() {
        return ptsForGameTie;
    }

    public void setPtsForGameTie(String ptsForGameTie) {
        this.ptsForGameTie = ptsForGameTie;
    }

    public String getPtsForGameWin() {
        return ptsForGameWin;
    }

    public void setPtsForGameWin(String ptsForGameWin) {
        this.ptsForGameWin = ptsForGameWin;
    }

    public String getPtsForMatchTie() {
        return ptsForMatchTie;
    }

    public void setPtsForMatchTie(String ptsForMatchTie) {
        this.ptsForMatchTie = ptsForMatchTie;
    }

    public String getPtsForMatchWin() {
        return ptsForMatchWin;
    }

    public void setPtsForMatchWin(String ptsForMatchWin) {
        this.ptsForMatchWin = ptsForMatchWin;
    }

    public Boolean getQuickAdvance() {
        return quickAdvance;
    }

    public void setQuickAdvance(Boolean quickAdvance) {
        this.quickAdvance = quickAdvance;
    }

    public String getRankedBy() {
        return rankedBy;
    }

    public void setRankedBy(String rankedBy) {
        this.rankedBy = rankedBy;
    }

    public Boolean getRequireScoreAgreement() {
        return requireScoreAgreement;
    }

    public void setRequireScoreAgreement(Boolean requireScoreAgreement) {
        this.requireScoreAgreement = requireScoreAgreement;
    }

    public String getRrPtsForGameTie() {
        return rrPtsForGameTie;
    }

    public void setRrPtsForGameTie(String rrPtsForGameTie) {
        this.rrPtsForGameTie = rrPtsForGameTie;
    }

    public String getRrPtsForGameWin() {
        return rrPtsForGameWin;
    }

    public void setRrPtsForGameWin(String rrPtsForGameWin) {
        this.rrPtsForGameWin = rrPtsForGameWin;
    }

    public String getRrPtsForMatchTie() {
        return rrPtsForMatchTie;
    }

    public void setRrPtsForMatchTie(String rrPtsForMatchTie) {
        this.rrPtsForMatchTie = rrPtsForMatchTie;
    }

    public String getRrPtsForMatchWin() {
        return rrPtsForMatchWin;
    }

    public void setRrPtsForMatchWin(String rrPtsForMatchWin) {
        this.rrPtsForMatchWin = rrPtsForMatchWin;
    }

    public Boolean getSequentialPairings() {
        return sequentialPairings;
    }

    public void setSequentialPairings(Boolean sequentialPairings) {
        this.sequentialPairings = sequentialPairings;
    }

    public Boolean getShowRounds() {
        return showRounds;
    }

    public void setShowRounds(Boolean showRounds) {
        this.showRounds = showRounds;
    }

    public Object getSignupCap() {
        return signupCap;
    }

    public void setSignupCap(Object signupCap) {
        this.signupCap = signupCap;
    }

    public Object getStartAt() {
        return startAt;
    }

    public void setStartAt(Object startAt) {
        this.startAt = startAt;
    }

    public Object getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Object startedAt) {
        this.startedAt = startedAt;
    }

    public Object getStartedCheckingInAt() {
        return startedCheckingInAt;
    }

    public void setStartedCheckingInAt(Object startedCheckingInAt) {
        this.startedCheckingInAt = startedCheckingInAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getSwissRounds() {
        return swissRounds;
    }

    public void setSwissRounds(Integer swissRounds) {
        this.swissRounds = swissRounds;
    }

    public Boolean getTeams() {
        return teams;
    }

    public void setTeams(Boolean teams) {
        this.teams = teams;
    }

    public List<String> getTieBreaks() {
        return tieBreaks;
    }

    public void setTieBreaks(List<String> tieBreaks) {
        this.tieBreaks = tieBreaks;
    }

    public String getTournamentType() {
        return tournamentType;
    }

    public void setTournamentType(String tournamentType) {
        this.tournamentType = tournamentType;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescriptionSource() {
        return descriptionSource;
    }

    public void setDescriptionSource(String descriptionSource) {
        this.descriptionSource = descriptionSource;
    }

    public Object getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(Object subdomain) {
        this.subdomain = subdomain;
    }

    public String getFullChallongeUrl() {
        return fullChallongeUrl;
    }

    public void setFullChallongeUrl(String fullChallongeUrl) {
        this.fullChallongeUrl = fullChallongeUrl;
    }

    public String getLiveImageUrl() {
        return liveImageUrl;
    }

    public void setLiveImageUrl(String liveImageUrl) {
        this.liveImageUrl = liveImageUrl;
    }

    public Object getSignUpUrl() {
        return signUpUrl;
    }

    public void setSignUpUrl(Object signUpUrl) {
        this.signUpUrl = signUpUrl;
    }

    public Boolean getReviewBeforeFinalizing() {
        return reviewBeforeFinalizing;
    }

    public void setReviewBeforeFinalizing(Boolean reviewBeforeFinalizing) {
        this.reviewBeforeFinalizing = reviewBeforeFinalizing;
    }

    public Boolean getAcceptingPredictions() {
        return acceptingPredictions;
    }

    public void setAcceptingPredictions(Boolean acceptingPredictions) {
        this.acceptingPredictions = acceptingPredictions;
    }

    public Boolean getParticipantsLocked() {
        return participantsLocked;
    }

    public void setParticipantsLocked(Boolean participantsLocked) {
        this.participantsLocked = participantsLocked;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Boolean getParticipantsSwappable() {
        return participantsSwappable;
    }

    public void setParticipantsSwappable(Boolean participantsSwappable) {
        this.participantsSwappable = participantsSwappable;
    }

    public Boolean getTeamConvertable() {
        return teamConvertable;
    }

    public void setTeamConvertable(Boolean teamConvertable) {
        this.teamConvertable = teamConvertable;
    }

    public Boolean getGroupStagesWereStarted() {
        return groupStagesWereStarted;
    }

    public void setGroupStagesWereStarted(Boolean groupStagesWereStarted) {
        this.groupStagesWereStarted = groupStagesWereStarted;
    }

}