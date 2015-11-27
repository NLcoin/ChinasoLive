package recorder.net;

import java.io.File;
import java.util.List;

import recorder.net.model.CoverInfo;
import recorder.net.model.LiveVideoListInfo;
import recorder.net.model.StopVideoInfo;
import recorder.net.model.UserCheckInfo;
import recorder.net.model.VideoIdInfo;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;
import retrofit.mime.TypedFile;

public interface NetworkServiceAPI {

	
	//get video list
	@GET("/videoinfo//showinfo")
	void getVideoList(Callback<List<LiveVideoListInfo>> cb);

	//create video
	@GET("/video//createvideo")
	void createVideo(@Query("uid") String uid, @Query("name") String name,@Query("avatar") String avatar,@Query("coverTitle") String coverTitle,Callback<VideoIdInfo> cb);

	//stop video
	@GET("/video/deletevideo")
	void stopVideo(@Query("activityId") String activityId, Callback<StopVideoInfo> cb);

	//get token
	@GET("/rong/createtoken")
	void getToken(@Query("uid") String uid, Callback<UserCheckInfo> cb);

	//upload cover
	@GET("/uploadfile/cover")
	void uploadFile(@Query("letvid") String letvid, @Query("coverTitle") String coverTitle,@Query("cover") File cover,Callback<CoverInfo> cb);

}