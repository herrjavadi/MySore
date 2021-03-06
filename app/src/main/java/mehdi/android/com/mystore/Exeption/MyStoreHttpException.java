
package mehdi.android.com.mystore.Exeption;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class MyStoreHttpException {

    @SerializedName("error")
    private String mError;
    @SerializedName("message")
    private String mMessage;

    public String getError() {
        return mError;
    }

    public void setError(String error) {
        mError = error;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

}
