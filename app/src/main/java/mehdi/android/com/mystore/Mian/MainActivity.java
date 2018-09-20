package mehdi.android.com.mystore.Mian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import io.reactivex.SingleObserver;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import mehdi.android.com.mystore.Model.Product;
import mehdi.android.com.mystore.R;

public class MainActivity extends BaseActivity {
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new MainViewModel();

        setUpViews();
        observe();
    }

    private void observe() {
        viewModel.latestProducts().subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<Product>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onSuccess(List<Product> products) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }

    private void setUpViews() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public int getCoordinatorLayoutId() {
        return R.id.coordinator_main;
    }
}
