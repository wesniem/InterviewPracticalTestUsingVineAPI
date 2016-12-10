package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class Loops {
    @SerializedName("count")
    @Expose
    public float count;
    @SerializedName("velocity")
    @Expose
    public float velocity;
    @SerializedName("onFire")
    @Expose
    public int onFire;

    public float getCount() {
        return count;
    }

    public void setCount(float count) {
        this.count = count;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public int getOnFire() {
        return onFire;
    }

    public void setOnFire(int onFire) {
        this.onFire = onFire;
    }
}
