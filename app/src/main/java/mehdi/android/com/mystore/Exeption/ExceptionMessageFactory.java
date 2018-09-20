package mehdi.android.com.mystore.Exeption;

import com.google.gson.Gson;

import retrofit2.HttpException;

public class ExceptionMessageFactory {
    public static String getMessageException(Throwable throwable) {
        if (throwable instanceof HttpException) {
            switch (((HttpException) throwable).code()) {
                case 422:
                    Gson gson = new Gson();

                    try {
                        MyStoreHttpException exception = gson.fromJson(((HttpException) throwable).response().errorBody().toString(), MyStoreHttpException.class);

                        return exception.getMessage();

                    } catch (Exception e) {
                        e.getStackTrace();
                    }

                    break;
                default:
                    return "اختلال در دریافت اطلاعات";
            }


        }
        return "خطای نامشخص";

    }

    private ExceptionMessageFactory() {

    }
}

