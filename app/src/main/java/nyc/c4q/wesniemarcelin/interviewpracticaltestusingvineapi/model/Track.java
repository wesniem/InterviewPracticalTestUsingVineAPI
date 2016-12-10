package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class Track {

    @SerializedName("albumTrackCount")
    @Expose
    public int albumTrackCount;
    @SerializedName("hasAudioTrackTimeline")
    @Expose
    public int hasAudioTrackTimeline;
    @SerializedName("trackName")
    @Expose
    public String trackName;
    @SerializedName("beatsPerMinute")
    @Expose
    public int beatsPerMinute;
    @SerializedName("albumTrackNumber")
    @Expose
    public int albumTrackNumber;
    @SerializedName("albumName")
    @Expose
    public String albumName;
    @SerializedName("releaseDate")
    @Expose
    public String releaseDate;
    @SerializedName("artistName")
    @Expose
    public String artistName;
    @SerializedName("albumArtist")
    @Expose
    public String albumArtist;
    @SerializedName("composer")
    @Expose
    public String composer;
    @SerializedName("genre")
    @Expose
    public String genre;
    @SerializedName("discNumber")
    @Expose
    public int discNumber;
    @SerializedName("discCount")
    @Expose
    public int discCount;
}
