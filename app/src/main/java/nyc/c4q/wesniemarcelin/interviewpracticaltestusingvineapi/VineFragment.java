package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model.Data;
import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model.Record;
import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model.VineResponse;
import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.network.VineService;
import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.recyclerview.RecordAdapter;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VineFragment extends Fragment {
    private static final String BASE_URL = "https://vine.co/api/" ;
    private static final String TAG ="YOOOOO" ;
    RecyclerView recordRView;
    RecordAdapter recordAdapter;
    List<Record> recordList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mroot = inflater.inflate(R.layout.activity_vine_fragment, container, false);

        //Identify the recyclerView and pass it through the fragment
        recordRView = (RecyclerView) mroot.findViewById(R.id.fragment_rv);
        recordRView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        //Make retrofit call before you return the view thats supposed to show to the user
        fetchRecordListCall();
        return mroot;
    }

    private void fetchRecordListCall() {

        //Retrofit call
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //Service Call
        VineService vineService = retrofit.create(VineService.class);
        //Call method in service class
        Call<VineResponse> call = vineService.getPojo();
        //Make asynchronous call to know if there is a success or failure
        call.enqueue(new Callback<VineResponse>() {
            @Override
            public void onResponse(Call<VineResponse> call, Response<VineResponse> response) {
                //Log statement
                Log.d(TAG, "Success: " + response.body().toString());


                //Create variable for response
                VineResponse vineResponse = response.body();
                Record record = (Record) vineResponse.getData().getRecords();
                recordList = vineResponse.getData().getRecords();

                Log.d("POJO", "POJOs have downloaded: ");


                Log.d("success", "in there");
                //Call Adapter from before.... needed next(put arraylist into it
                recordAdapter = new RecordAdapter((ArrayList) recordList);
                //Set the adapter to the recyclerView
                recordRView.setAdapter(recordAdapter);
                Log.d("Adapter", "adapter attached");
                recordAdapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<VineResponse> call, Throwable t) {
                Log.d("Fail: ", t.getMessage());
            }
        });

    }
}
