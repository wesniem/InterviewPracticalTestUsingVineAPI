package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class Record_ {
    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("verified")
    @Expose
    public int verified;
    @SerializedName("vanityUrls")
    @Expose
    public List<String> vanityUrls = null;
    @SerializedName("created")
    @Expose
    public String created;
    @SerializedName("userId")
    @Expose
    public int userId;
    @SerializedName("user")
    @Expose
    public User_ user;
    @SerializedName("likeId")
    @Expose
    public int likeId;
}
