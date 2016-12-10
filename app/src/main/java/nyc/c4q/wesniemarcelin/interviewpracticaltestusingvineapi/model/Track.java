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

    public int getAlbumTrackCount() {
        return albumTrackCount;
    }

    public void setAlbumTrackCount(int albumTrackCount) {
        this.albumTrackCount = albumTrackCount;
    }

    public int getHasAudioTrackTimeline() {
        return hasAudioTrackTimeline;
    }

    public void setHasAudioTrackTimeline(int hasAudioTrackTimeline) {
        this.hasAudioTrackTimeline = hasAudioTrackTimeline;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    public int getAlbumTrackNumber() {
        return albumTrackNumber;
    }

    public void setAlbumTrackNumber(int albumTrackNumber) {
        this.albumTrackNumber = albumTrackNumber;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public void setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    public int getDiscCount() {
        return discCount;
    }

    public void setDiscCount(int discCount) {
        this.discCount = discCount;
    }
}
