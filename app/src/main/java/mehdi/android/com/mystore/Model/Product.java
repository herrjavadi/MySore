
package mehdi.android.com.mystore.Model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Product {
    public static final int SORT_LATEST = 0;
    public static final int SORT_POPULAR = 1;
    public static final int SORT_PRICE_HIGH_TO_LOW = 2;
    public static final int SORT_PRICE_LOW_TO_HIGH = 3;


    @SerializedName("discount")
    private Long mDiscount;
    @SerializedName("id")
    private Long mId;
    @SerializedName("image")
    private String mImage;
    @SerializedName("previous_price")
    private Long mPreviousPrice;
    @SerializedName("price")
    private Long mPrice;
    @SerializedName("status")
    private Long mStatus;
    @SerializedName("title")
    private String mTitle;

    public Long getDiscount() {
        return mDiscount;
    }

    public void setDiscount(Long discount) {
        mDiscount = discount;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getImage() {
        return mImage;
    }

    public void setImage(String image) {
        mImage = image;
    }

    public Long getPreviousPrice() {
        return mPreviousPrice;
    }

    public void setPreviousPrice(Long previousPrice) {
        mPreviousPrice = previousPrice;
    }

    public Long getPrice() {
        return mPrice;
    }

    public void setPrice(Long price) {
        mPrice = price;
    }

    public Long getStatus() {
        return mStatus;
    }

    public void setStatus(Long status) {
        mStatus = status;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
