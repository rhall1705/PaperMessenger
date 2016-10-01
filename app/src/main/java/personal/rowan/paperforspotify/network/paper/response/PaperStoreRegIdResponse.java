package personal.rowan.paperforspotify.network.paper.response;

import personal.rowan.paperforspotify.network.BaseResponse;

public class PaperStoreRegIdResponse
		extends BaseResponse {

	private String mUserId;
	private String mName;
	private String mImageUrl;
	private String mRegId;

	public PaperStoreRegIdResponse(String responseString, Exception e) {
		super(responseString, e);
		if(mResponseObject != null) {
			mUserId = optString(mResponseObject, "id");
			mName = optString(mResponseObject, "name");
			mImageUrl = optString(mResponseObject, "imageUrl");
			mRegId = optString(mResponseObject, "regId");
		}
	}

	public String getUserId() {
		return mUserId;
	}

	public String getName() {
		return mName;
	}

	public String getImageUrl() {
		return mImageUrl;
	}

	public String getRegId() { return mRegId; }

}
