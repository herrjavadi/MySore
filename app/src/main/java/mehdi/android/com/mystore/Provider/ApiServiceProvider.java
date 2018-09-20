package mehdi.android.com.mystore.Provider;

import mehdi.android.com.mystore.Model.api.ApiService;
import mehdi.android.com.mystore.Model.api.RetrofitSingleton;

public class ApiServiceProvider {
    private static ApiService apiService;

    public static ApiService provideApiService() {
        if (apiService == null) {
            apiService = RetrofitSingleton.getInstance().create(ApiService.class);
        }
        return apiService;
    }
}
