package mehdi.android.com.mystore.Model.api;

import java.util.List;

import io.reactivex.Single;
import mehdi.android.com.mystore.Model.Banners;
import mehdi.android.com.mystore.Model.Product;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("product/list")
    Single<List<Product>> getProducts(
            @Query("sort") int sort
    );

    @GET("banner/slider")
    Single<List<Banners>> getBanerrs();
}
