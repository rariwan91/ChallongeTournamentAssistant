package CTAModels.Participants;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Participant_ {

    @SerializedName("active")
    @Expose
    private Boolean active;
    @SerializedName("checked_in_at")
    @Expose
    private Object checkedInAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("final_rank")
    @Expose
    private Object finalRank;
    @SerializedName("group_id")
    @Expose
    private Object groupId;
    @SerializedName("icon")
    @Expose
    private Object icon;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("invitation_id")
    @Expose
    private Object invitationId;
    @SerializedName("invite_email")
    @Expose
    private Object inviteEmail;
    @SerializedName("misc")
    @Expose
    private Object misc;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("on_waiting_list")
    @Expose
    private Boolean onWaitingList;
    @SerializedName("seed")
    @Expose
    private Integer seed;
    @SerializedName("tournament_id")
    @Expose
    private Integer tournamentId;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("challonge_username")
    @Expose
    private Object challongeUsername;
    @SerializedName("challonge_email_address_verified")
    @Expose
    private Object challongeEmailAddressVerified;
    @SerializedName("removable")
    @Expose
    private Boolean removable;
    @SerializedName("participatable_or_invitation_attached")
    @Expose
    private Boolean participatableOrInvitationAttached;
    @SerializedName("confirm_remove")
    @Expose
    private Boolean confirmRemove;
    @SerializedName("invitation_pending")
    @Expose
    private Boolean invitationPending;
    @SerializedName("display_name_with_invitation_email_address")
    @Expose
    private String displayNameWithInvitationEmailAddress;
    @SerializedName("email_hash")
    @Expose
    private Object emailHash;
    @SerializedName("username")
    @Expose
    private Object username;
    @SerializedName("attached_participatable_portrait_url")
    @Expose
    private Object attachedParticipatablePortraitUrl;
    @SerializedName("can_check_in")
    @Expose
    private Boolean canCheckIn;
    @SerializedName("checked_in")
    @Expose
    private Boolean checkedIn;
    @SerializedName("reactivatable")
    @Expose
    private Boolean reactivatable;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getCheckedInAt() {
        return checkedInAt;
    }

    public void setCheckedInAt(Object checkedInAt) {
        this.checkedInAt = checkedInAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getFinalRank() {
        return finalRank;
    }

    public void setFinalRank(Object finalRank) {
        this.finalRank = finalRank;
    }

    public Object getGroupId() {
        return groupId;
    }

    public void setGroupId(Object groupId) {
        this.groupId = groupId;
    }

    public Object getIcon() {
        return icon;
    }

    public void setIcon(Object icon) {
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getInvitationId() {
        return invitationId;
    }

    public void setInvitationId(Object invitationId) {
        this.invitationId = invitationId;
    }

    public Object getInviteEmail() {
        return inviteEmail;
    }

    public void setInviteEmail(Object inviteEmail) {
        this.inviteEmail = inviteEmail;
    }

    public Object getMisc() {
        return misc;
    }

    public void setMisc(Object misc) {
        this.misc = misc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOnWaitingList() {
        return onWaitingList;
    }

    public void setOnWaitingList(Boolean onWaitingList) {
        this.onWaitingList = onWaitingList;
    }

    public Integer getSeed() {
        return seed;
    }

    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public Integer getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(Integer tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getChallongeUsername() {
        return challongeUsername;
    }

    public void setChallongeUsername(Object challongeUsername) {
        this.challongeUsername = challongeUsername;
    }

    public Object getChallongeEmailAddressVerified() {
        return challongeEmailAddressVerified;
    }

    public void setChallongeEmailAddressVerified(Object challongeEmailAddressVerified) {
        this.challongeEmailAddressVerified = challongeEmailAddressVerified;
    }

    public Boolean getRemovable() {
        return removable;
    }

    public void setRemovable(Boolean removable) {
        this.removable = removable;
    }

    public Boolean getParticipatableOrInvitationAttached() {
        return participatableOrInvitationAttached;
    }

    public void setParticipatableOrInvitationAttached(Boolean participatableOrInvitationAttached) {
        this.participatableOrInvitationAttached = participatableOrInvitationAttached;
    }

    public Boolean getConfirmRemove() {
        return confirmRemove;
    }

    public void setConfirmRemove(Boolean confirmRemove) {
        this.confirmRemove = confirmRemove;
    }

    public Boolean getInvitationPending() {
        return invitationPending;
    }

    public void setInvitationPending(Boolean invitationPending) {
        this.invitationPending = invitationPending;
    }

    public String getDisplayNameWithInvitationEmailAddress() {
        return displayNameWithInvitationEmailAddress;
    }

    public void setDisplayNameWithInvitationEmailAddress(String displayNameWithInvitationEmailAddress) {
        this.displayNameWithInvitationEmailAddress = displayNameWithInvitationEmailAddress;
    }

    public Object getEmailHash() {
        return emailHash;
    }

    public void setEmailHash(Object emailHash) {
        this.emailHash = emailHash;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public Object getAttachedParticipatablePortraitUrl() {
        return attachedParticipatablePortraitUrl;
    }

    public void setAttachedParticipatablePortraitUrl(Object attachedParticipatablePortraitUrl) {
        this.attachedParticipatablePortraitUrl = attachedParticipatablePortraitUrl;
    }

    public Boolean getCanCheckIn() {
        return canCheckIn;
    }

    public void setCanCheckIn(Boolean canCheckIn) {
        this.canCheckIn = canCheckIn;
    }

    public Boolean getCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(Boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Boolean getReactivatable() {
        return reactivatable;
    }

    public void setReactivatable(Boolean reactivatable) {
        this.reactivatable = reactivatable;
    }

}