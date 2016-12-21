package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.R;
import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model.Record;

/**re
 * Created by wesniemarcelin on 12/10/16.
 */

public class RecordAdapter extends RecyclerView.Adapter<RecordViewHolder> {
    private List<Record> recordList;

    public RecordAdapter(List<Record> recordList) {
        this.recordList = recordList;
    }

    @Override
    public RecordViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.record_item, parent, false);
        return new RecordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecordViewHolder holder, int position) {
        Record record = recordList.get(position);
        holder.bind(record);
    }

    @Override
    public int getItemCount() {
         return recordList.size();
    }
}
