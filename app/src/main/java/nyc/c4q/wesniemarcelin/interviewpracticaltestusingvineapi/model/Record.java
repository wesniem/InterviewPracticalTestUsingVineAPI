package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class Record {
    @SerializedName("liked")
    @Expose
    public int liked;
    @SerializedName("videoDashUrl")
    @Expose
    public String videoDashUrl;
    @SerializedName("foursquareVenueId")
    @Expose
    public String foursquareVenueId;
    @SerializedName("remixDisabled")
    @Expose
    public int remixDisabled;
    @SerializedName("userId")
    @Expose
    public int userId;
    @SerializedName("private")
    @Expose
    public int _private;
    @SerializedName("videoWebmUrl")
    @Expose
    public Object videoWebmUrl;
    @SerializedName("loops")
    @Expose
    public Loops loops;
    @SerializedName("thumbnailUrl")
    @Expose
    public String thumbnailUrl;
    @SerializedName("explicitContent")
    @Expose
    public int explicitContent;
    @SerializedName("repost")
    @Expose
    public Repost repost;
    @SerializedName("verified")
    @Expose
    public int verified;
    @SerializedName("avatarUrl")
    @Expose
    public String avatarUrl;
    @SerializedName("comments")
    @Expose
    public Comments comments;
    @SerializedName("entities")
    @Expose
    public List<Object> entities = null;
    @SerializedName("videoLowURL")
    @Expose
    public String videoLowURL;
    @SerializedName("vanityUrls")
    @Expose
    public List<String> vanityUrls = null;
    @SerializedName("blocked")
    @Expose
    public int blocked;
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("tags")
    @Expose
    public List<Object> tags = null;
    @SerializedName("permalinkUrl")
    @Expose
    public String permalinkUrl;
    @SerializedName("promoted")
    @Expose
    public int promoted;
    @SerializedName("postId")
    @Expose
    public int postId;
    @SerializedName("profileBackground")
    @Expose
    public String profileBackground;
    @SerializedName("videoUrl")
    @Expose
    public String videoUrl;
    @SerializedName("followRequested")
    @Expose
    public int followRequested;
    @SerializedName("created")
    @Expose
    public String created;
    @SerializedName("hasSimilarPosts")
    @Expose
    public int hasSimilarPosts;
    @SerializedName("shareUrl")
    @Expose
    public String shareUrl;
    @SerializedName("myRepostId")
    @Expose
    public int myRepostId;
    @SerializedName("following")
    @Expose
    public int following;
    @SerializedName("reposts")
    @Expose
    public Reposts reposts;
    @SerializedName("likes")
    @Expose
    public Likes likes;
    @SerializedName("hasRemixes")
    @Expose
    public int hasRemixes;
    @SerializedName("venueCategoryId")
    @Expose
    public String venueCategoryId;
    @SerializedName("venueName")
    @Expose
    public String venueName;
    @SerializedName("venueCategoryShortName")
    @Expose
    public String venueCategoryShortName;
    @SerializedName("venueCity")
    @Expose
    public String venueCity;
    @SerializedName("venueCountryCode")
    @Expose
    public String venueCountryCode;
    @SerializedName("venueState")
    @Expose
    public String venueState;
    @SerializedName("venueAddress")
    @Expose
    public String venueAddress;
    @SerializedName("venueCategoryIconUrl")
    @Expose
    public String venueCategoryIconUrl;
    @SerializedName("audio_tracks")
    @Expose
    public List<AudioTrack> audioTracks = null;
}
