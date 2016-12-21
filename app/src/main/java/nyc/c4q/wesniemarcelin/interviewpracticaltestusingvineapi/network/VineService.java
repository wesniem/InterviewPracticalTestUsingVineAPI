package nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.network;

import nyc.c4q.wesniemarcelin.interviewpracticaltestusingvineapi.model.VineResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by wesniemarcelin on 12/10/16.
 */

public interface VineService {
    @GET("api/timelines/users/918753190470619136")
    Call<VineResponse> getPojo();
}
