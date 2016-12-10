package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class AudioTrack {
    @SerializedName("origin")
    @Expose
    public String origin;
    @SerializedName("created")
    @Expose
    public String created;
    @SerializedName("deleted")
    @Expose
    public Object deleted;
    @SerializedName("trackId")
    @Expose
    public String trackId;
    @SerializedName("modified")
    @Expose
    public Object modified;
    @SerializedName("numberOfMeasures")
    @Expose
    public int numberOfMeasures;
    @SerializedName("track")
    @Expose
    public Track track;
    @SerializedName("audioOffset")
    @Expose
    public float audioOffset;
    @SerializedName("snapToBeat")
    @Expose
    public int snapToBeat;
    @SerializedName("linkId")
    @Expose
    public String linkId;
    @SerializedName("duration")
    @Expose
    public float duration;
    @SerializedName("averageBpm")
    @Expose
    public int averageBpm;
    @SerializedName("videoOffset")
    @Expose
    public float videoOffset;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Object getDeleted() {
        return deleted;
    }

    public void setDeleted(Object deleted) {
        this.deleted = deleted;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public Object getModified() {
        return modified;
    }

    public void setModified(Object modified) {
        this.modified = modified;
    }

    public int getNumberOfMeasures() {
        return numberOfMeasures;
    }

    public void setNumberOfMeasures(int numberOfMeasures) {
        this.numberOfMeasures = numberOfMeasures;
    }

    public Track getTrack() {
        return track;
    }

    public void setTrack(Track track) {
        this.track = track;
    }

    public float getAudioOffset() {
        return audioOffset;
    }

    public void setAudioOffset(float audioOffset) {
        this.audioOffset = audioOffset;
    }

    public int getSnapToBeat() {
        return snapToBeat;
    }

    public void setSnapToBeat(int snapToBeat) {
        this.snapToBeat = snapToBeat;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public int getAverageBpm() {
        return averageBpm;
    }

    public void setAverageBpm(int averageBpm) {
        this.averageBpm = averageBpm;
    }

    public float getVideoOffset() {
        return videoOffset;
    }

    public void setVideoOffset(float videoOffset) {
        this.videoOffset = videoOffset;
    }
}
