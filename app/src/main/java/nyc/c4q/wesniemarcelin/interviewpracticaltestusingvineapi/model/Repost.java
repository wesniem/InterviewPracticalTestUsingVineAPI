package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class Repost {
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("verified")
    @Expose
    public int verified;
    @SerializedName("vanityUrls")
    @Expose
    public List<String> vanityUrls = null;
    @SerializedName("flags|platform_lo")
    @Expose
    public int flagsPlatformLo;
    @SerializedName("repostId")
    @Expose
    public String repostId;
    @SerializedName("avatarUrl")
    @Expose
    public String avatarUrl;
//    @SerializedName("userId")
//    @Expose
//    public Integer userId;
    @SerializedName("profileBackground")
    @Expose
    public String profileBackground;
    @SerializedName("created")
    @Expose
    public String created;
    @SerializedName("user")
    @Expose
    public User user;
    @SerializedName("postId")
    @Expose
    public String postId;
    @SerializedName("ipAddress")
    @Expose
    public int ipAddress;
    @SerializedName("flags|platform_hi")
    @Expose
    public int flagsPlatformHi;
    @SerializedName("sourceType")
    @Expose
    public int sourceType;
//    @SerializedName("sourceId")
//    @Expose
//    public int sourceId;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified;
    }

    public List<String> getVanityUrls() {
        return vanityUrls;
    }

    public void setVanityUrls(List<String> vanityUrls) {
        this.vanityUrls = vanityUrls;
    }

    public int getFlagsPlatformLo() {
        return flagsPlatformLo;
    }

    public void setFlagsPlatformLo(int flagsPlatformLo) {
        this.flagsPlatformLo = flagsPlatformLo;
    }

    public String getRepostId() {
        return repostId;
    }

    public void setRepostId(String repostId) {
        this.repostId = repostId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }

    public String getProfileBackground() {
        return profileBackground;
    }

    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(int ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getFlagsPlatformHi() {
        return flagsPlatformHi;
    }

    public void setFlagsPlatformHi(int flagsPlatformHi) {
        this.flagsPlatformHi = flagsPlatformHi;
    }

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

//    public int getSourceId() {
//        return sourceId;
//    }
//
//    public void setSourceId(int sourceId) {
//        this.sourceId = sourceId;
//    }
}
