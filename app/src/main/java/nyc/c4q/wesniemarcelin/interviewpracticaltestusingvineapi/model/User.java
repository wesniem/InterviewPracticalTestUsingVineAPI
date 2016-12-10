package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class User {
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("verified")
    @Expose
    public int verified;
    @SerializedName("vanityUrls")
    @Expose
    public List<String> vanityUrls = null;
    @SerializedName("avatarUrl")
    @Expose
    public String avatarUrl;
    @SerializedName("userId")
    @Expose
    public String userId;
    @SerializedName("private")
    @Expose
    public int _private;
    @SerializedName("location")
    @Expose
    public String location;

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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int get_private() {
        return _private;
    }

    public void set_private(int _private) {
        this._private = _private;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
