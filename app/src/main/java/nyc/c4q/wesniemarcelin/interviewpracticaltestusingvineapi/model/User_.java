package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class User_ {
    @SerializedName("private")
    @Expose
    public int _private;

    public int get_private() {
        return _private;
    }

    public void set_private(int _private) {
        this._private = _private;
    }
}
