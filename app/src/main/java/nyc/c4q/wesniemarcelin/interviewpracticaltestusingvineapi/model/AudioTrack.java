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
    public int trackId;
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
    public int linkId;
    @SerializedName("duration")
    @Expose
    public float duration;
    @SerializedName("averageBpm")
    @Expose
    public int averageBpm;
    @SerializedName("videoOffset")
    @Expose
    public float videoOffset;
}
