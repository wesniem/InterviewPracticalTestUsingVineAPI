package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.R;
import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model.Record;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class RecordViewHolder extends RecyclerView.ViewHolder {
    TextView profileBackground;
    TextView liked;
    TextView userName;
    private Record record;

    public RecordViewHolder(View itemView) {
        super(itemView);
        liked = (TextView) itemView.findViewById(R.id.liked);
        profileBackground = (TextView) itemView.findViewById(R.id.profile_background);
        userName = (TextView) itemView.findViewById(R.id.username);
    }

    public void bind(Record record){
        this.record = record;
        profileBackground.setText(record.getProfileBackground());
        liked.setText(record.getLiked());
        userName.setText(record.getUsername());
    }
}
