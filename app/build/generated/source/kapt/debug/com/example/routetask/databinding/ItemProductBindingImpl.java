package com.example.routetask.databinding;
import com.example.routetask.R;
import com.example.routetask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemProductBindingImpl extends ItemProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.add_to_favorites, 7);
        sViewsWithIds.put(R.id.linearLayout, 8);
        sViewsWithIds.put(R.id.linearLayout2, 9);
        sViewsWithIds.put(R.id.review_tv, 10);
        sViewsWithIds.put(R.id.imageView, 11);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[7]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[2]
            );
        this.cardView.setTag(null);
        this.descriptionTv.setTag(null);
        this.discountTv.setTag(null);
        this.priceTv.setTag(null);
        this.productCover.setTag(null);
        this.ratingTv.setTag(null);
        this.titleTv.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.product == variableId) {
            setProduct((com.example.domain.model.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.example.domain.model.Product Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String productTitle = null;
        java.lang.Double productDiscountPercentage = null;
        java.lang.String productThumbnail = null;
        com.example.domain.model.Product product = mProduct;
        java.lang.String productDiscountPercentageToString = null;
        java.lang.String productDescription = null;
        java.lang.Double productPrice = null;
        java.lang.Double productRating = null;
        java.lang.String productRatingToString = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.discountPercentage
                    productDiscountPercentage = product.getDiscountPercentage();
                    // read product.thumbnail
                    productThumbnail = product.getThumbnail();
                    // read product.description
                    productDescription = product.getDescription();
                    // read product.price
                    productPrice = product.getPrice();
                    // read product.rating
                    productRating = product.getRating();
                }


                if (productDiscountPercentage != null) {
                    // read product.discountPercentage.toString()
                    productDiscountPercentageToString = productDiscountPercentage.toString();
                }
                if (productRating != null) {
                    // read product.rating.toString()
                    productRatingToString = productRating.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.descriptionTv, productDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.discountTv, productDiscountPercentageToString);
            com.example.routetask.utils.BindingAdapterKt.setPriceWithEGP(this.priceTv, productPrice);
            com.example.routetask.utils.BindingAdapterKt.imageUrl(this.productCover, productThumbnail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.ratingTv, productRatingToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleTv, productTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}