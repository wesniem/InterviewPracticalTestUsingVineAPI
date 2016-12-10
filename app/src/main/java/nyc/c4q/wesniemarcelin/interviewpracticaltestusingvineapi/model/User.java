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
    public int userId;
    @SerializedName("private")
    @Expose
    public int _private;
    @SerializedName("location")
    @Expose
    public String location;
}
