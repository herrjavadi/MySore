package mehdi.android.com.mystore.Mian;

import java.util.List;

import io.reactivex.Single;
import mehdi.android.com.mystore.Model.Banners;
import mehdi.android.com.mystore.Model.Product;
import mehdi.android.com.mystore.Model.api.ApiService;
import mehdi.android.com.mystore.Provider.ApiServiceProvider;

public class MainViewModel {
    private ApiService apiService = ApiServiceProvider.provideApiService();

    public Single<List<Product>> latestProducts() {
        return apiService.getProducts(Product.SORT_LATEST);
    }

    public Single<List<Product>> popularProducts() {
        return apiService.getProducts(Product.SORT_POPULAR);
    }

    public Single<List<Product>> highToLowProducts() {
        return apiService.getProducts(Product.SORT_PRICE_HIGH_TO_LOW);
    }

    public Single<List<Product>> lowToHighProducts() {
        return apiService.getProducts(Product.SORT_PRICE_LOW_TO_HIGH);
    }

    public Single<List<Banners>> getBanner() {
        return apiService.getBanerrs();
    }
}
