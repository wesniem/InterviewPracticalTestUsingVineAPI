package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.recyclerview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.R;
import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model.Record;

import static android.content.ContentValues.TAG;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public class RecordViewHolder extends RecyclerView.ViewHolder {
    TextView profileBackground;
    TextView liked;
    TextView userName;
    private Record record;
    View view;

    public RecordViewHolder(View itemView) {
        super(itemView);
        liked = (TextView) itemView.findViewById(R.id.liked);
        profileBackground = (TextView) itemView.findViewById(R.id.profile_background);
        userName = (TextView) itemView.findViewById(R.id.username);
        view = itemView;
    }

    public void bind(Record record) {

        this.record = record;

        if (record.getProfileBackground() != null) {
            String color = String.valueOf(record.getProfileBackground()).substring(2, record.getProfileBackground().length());
            profileBackground.setText(color);
            liked.setText(String.valueOf(record.getLikes().getCount()));
            userName.setText(record.getUsername());
            Log.d(TAG, "bind: " + color);
            view.setBackgroundColor(Color.parseColor("#" + color));
        }

    }
}
