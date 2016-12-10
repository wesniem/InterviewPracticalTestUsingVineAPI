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
//    @SerializedName("userId")
//    @Expose
//    public Integer userId;
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
//    @SerializedName("avatarUrl")
//    @Expose
//    public String avatarUrl;
//    @SerializedName("comments")
//    @Expose
//    public Comments comments;
//    @SerializedName("entities")
//    @Expose
//    public List<Object> entities = null;
//    @SerializedName("videoLowURL")
//    @Expose
//    public String videoLowURL;
//    @SerializedName("vanityUrls")
//    @Expose
//    public List<String> vanityUrls = null;
//    @SerializedName("blocked")
//    @Expose
//    public int blocked;
    @SerializedName("username")
    @Expose
    public String username;
//    @SerializedName("description")
//    @Expose
//    public String description;
//    @SerializedName("tags")
//    @Expose
//    public List<Object> tags = null;
//    @SerializedName("permalinkUrl")
//    @Expose
//    public String permalinkUrl;
//    @SerializedName("promoted")
//    @Expose
//    public int promoted;
//    @SerializedName("postId")
//    @Expose
//    public int postId;
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
    public String myRepostId;
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

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public String getVideoDashUrl() {
        return videoDashUrl;
    }

    public void setVideoDashUrl(String videoDashUrl) {
        this.videoDashUrl = videoDashUrl;
    }

    public String getFoursquareVenueId() {
        return foursquareVenueId;
    }

    public void setFoursquareVenueId(String foursquareVenueId) {
        this.foursquareVenueId = foursquareVenueId;
    }

    public int getRemixDisabled() {
        return remixDisabled;
    }

    public void setRemixDisabled(int remixDisabled) {
        this.remixDisabled = remixDisabled;
    }

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }

    public int get_private() {
        return _private;
    }

    public void set_private(int _private) {
        this._private = _private;
    }

    public Object getVideoWebmUrl() {
        return videoWebmUrl;
    }

    public void setVideoWebmUrl(Object videoWebmUrl) {
        this.videoWebmUrl = videoWebmUrl;
    }

    public Loops getLoops() {
        return loops;
    }

    public void setLoops(Loops loops) {
        this.loops = loops;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getExplicitContent() {
        return explicitContent;
    }

    public void setExplicitContent(int explicitContent) {
        this.explicitContent = explicitContent;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified;
    }

//    public String getAvatarUrl() {
//        return avatarUrl;
//    }
//
//    public void setAvatarUrl(String avatarUrl) {
//        this.avatarUrl = avatarUrl;
//    }
//
//    public Comments getComments() {
//        return comments;
//    }
//
//    public void setComments(Comments comments) {
//        this.comments = comments;
//    }
//
//    public List<Object> getEntities() {
//        return entities;
//    }
//
//    public void setEntities(List<Object> entities) {
//        this.entities = entities;
//    }
//
//    public String getVideoLowURL() {
//        return videoLowURL;
//    }
//
//    public void setVideoLowURL(String videoLowURL) {
//        this.videoLowURL = videoLowURL;
//    }
//
//    public List<String> getVanityUrls() {
//        return vanityUrls;
//    }
//
//    public void setVanityUrls(List<String> vanityUrls) {
//        this.vanityUrls = vanityUrls;
//    }
//
//    public int getBlocked() {
//        return blocked;
//    }
//
//    public void setBlocked(int blocked) {
//        this.blocked = blocked;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public List<Object> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<Object> tags) {
//        this.tags = tags;
//    }
//
//    public String getPermalinkUrl() {
//        return permalinkUrl;
//    }
//
//    public void setPermalinkUrl(String permalinkUrl) {
//        this.permalinkUrl = permalinkUrl;
//    }
//
//    public int getPromoted() {
//        return promoted;
//    }
//
//    public void setPromoted(int promoted) {
//        this.promoted = promoted;
//    }
//
//    public int getPostId() {
//        return postId;
//    }
//
//    public void setPostId(int postId) {
//        this.postId = postId;
//    }

    public String getProfileBackground() {
        return profileBackground;
    }

    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getFollowRequested() {
        return followRequested;
    }

    public void setFollowRequested(int followRequested) {
        this.followRequested = followRequested;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getHasSimilarPosts() {
        return hasSimilarPosts;
    }

    public void setHasSimilarPosts(int hasSimilarPosts) {
        this.hasSimilarPosts = hasSimilarPosts;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getMyRepostId() {
        return myRepostId;
    }

    public void setMyRepostId(String myRepostId) {
        this.myRepostId = myRepostId;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public Reposts getReposts() {
        return reposts;
    }

    public void setReposts(Reposts reposts) {
        this.reposts = reposts;
    }

    public Likes getLikes() {
        return likes;
    }

    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    public int getHasRemixes() {
        return hasRemixes;
    }

    public void setHasRemixes(int hasRemixes) {
        this.hasRemixes = hasRemixes;
    }

    public String getVenueCategoryId() {
        return venueCategoryId;
    }

    public void setVenueCategoryId(String venueCategoryId) {
        this.venueCategoryId = venueCategoryId;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getVenueCategoryShortName() {
        return venueCategoryShortName;
    }

    public void setVenueCategoryShortName(String venueCategoryShortName) {
        this.venueCategoryShortName = venueCategoryShortName;
    }

    public String getVenueCity() {
        return venueCity;
    }

    public void setVenueCity(String venueCity) {
        this.venueCity = venueCity;
    }

    public String getVenueCountryCode() {
        return venueCountryCode;
    }

    public void setVenueCountryCode(String venueCountryCode) {
        this.venueCountryCode = venueCountryCode;
    }

    public String getVenueState() {
        return venueState;
    }

    public void setVenueState(String venueState) {
        this.venueState = venueState;
    }

    public String getVenueAddress() {
        return venueAddress;
    }

    public void setVenueAddress(String venueAddress) {
        this.venueAddress = venueAddress;
    }

    public String getVenueCategoryIconUrl() {
        return venueCategoryIconUrl;
    }

    public void setVenueCategoryIconUrl(String venueCategoryIconUrl) {
        this.venueCategoryIconUrl = venueCategoryIconUrl;
    }

    public List<AudioTrack> getAudioTracks() {
        return audioTracks;
    }

    public void setAudioTracks(List<AudioTrack> audioTracks) {
        this.audioTracks = audioTracks;
    }
}
