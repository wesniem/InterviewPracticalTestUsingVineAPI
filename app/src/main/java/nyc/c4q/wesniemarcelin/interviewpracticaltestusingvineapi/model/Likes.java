package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class Likes {
    @SerializedName("count")
    @Expose
    public int count;
    @SerializedName("anchorStr")
    @Expose
    public String anchorStr;
    @SerializedName("records")
    @Expose
    public List<Record_> records = null;
    @SerializedName("previousPage")
    @Expose
    public Object previousPage;
    @SerializedName("backAnchor")
    @Expose
    public String backAnchor;
//    @SerializedName("anchor")
//    @Expose
//    public int anchor;
    @SerializedName("nextPage")
    @Expose
    public int nextPage;
    @SerializedName("size")
    @Expose
    public int size;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getAnchorStr() {
        return anchorStr;
    }

    public void setAnchorStr(String anchorStr) {
        this.anchorStr = anchorStr;
    }

    public List<Record_> getRecords() {
        return records;
    }

    public void setRecords(List<Record_> records) {
        this.records = records;
    }

    public Object getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Object previousPage) {
        this.previousPage = previousPage;
    }

    public String getBackAnchor() {
        return backAnchor;
    }

    public void setBackAnchor(String backAnchor) {
        this.backAnchor = backAnchor;
    }

//    public int getAnchor() {
//        return anchor;
//    }
//
//    public void setAnchor(int anchor) {
//        this.anchor = anchor;
//    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
