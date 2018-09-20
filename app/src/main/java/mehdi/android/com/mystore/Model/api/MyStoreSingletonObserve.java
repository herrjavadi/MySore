package mehdi.android.com.mystore.Model.api;

import io.reactivex.SingleObserver;
import mehdi.android.com.mystore.Exeption.ExceptionMessageFactory;
import mehdi.android.com.mystore.Mian.BaseActivity;
import retrofit2.HttpException;

abstract class MyStoreSingleObserve<T> implements SingleObserver<T> {
    private BaseActivity activity;

    public MyStoreSingleObserve(BaseActivity activity) {
        this.activity = activity;
    }

    @Override
    public void onError(Throwable e) {
        activity.showSnackBarMessage(ExceptionMessageFactory.getMessageException(e));
//        if (e instanceof HttpException) {
//
//        }

    }
}
