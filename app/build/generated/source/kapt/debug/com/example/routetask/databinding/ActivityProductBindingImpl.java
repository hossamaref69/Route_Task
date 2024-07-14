package com.example.routetask.databinding;
import com.example.routetask.R;
import com.example.routetask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityProductBindingImpl extends ActivityProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(1, 
            new String[] {"item_product_shimmer_effect", "item_product_shimmer_effect", "item_product_shimmer_effect", "item_product_shimmer_effect"},
            new int[] {3, 4, 5, 6},
            new int[] {com.example.routetask.R.layout.item_product_shimmer_effect,
                com.example.routetask.R.layout.item_product_shimmer_effect,
                com.example.routetask.R.layout.item_product_shimmer_effect,
                com.example.routetask.R.layout.item_product_shimmer_effect});
        sIncludes.setIncludes(2, 
            new String[] {"item_product_shimmer_effect", "item_product_shimmer_effect", "item_product_shimmer_effect", "item_product_shimmer_effect"},
            new int[] {7, 8, 9, 10},
            new int[] {com.example.routetask.R.layout.item_product_shimmer_effect,
                com.example.routetask.R.layout.item_product_shimmer_effect,
                com.example.routetask.R.layout.item_product_shimmer_effect,
                com.example.routetask.R.layout.item_product_shimmer_effect});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.route_imageview, 11);
        sViewsWithIds.put(R.id.search_bar, 12);
        sViewsWithIds.put(R.id.cart_imageview, 13);
        sViewsWithIds.put(R.id.scrollView, 14);
        sViewsWithIds.put(R.id.product_rv, 15);
        sViewsWithIds.put(R.id.product_recycler_view_shimmer, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView11;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView12;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView13;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView14;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView21;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView22;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView23;
    @Nullable
    private final com.example.routetask.databinding.ItemProductShimmerEffectBinding mboundView24;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[13]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.facebook.shimmer.ShimmerFrameLayout) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ScrollView) bindings[14]
            , (com.google.android.material.search.SearchBar) bindings[12]
            );
        this.main.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        this.mboundView12 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[4];
        setContainedBinding(this.mboundView12);
        this.mboundView13 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[5];
        setContainedBinding(this.mboundView13);
        this.mboundView14 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[6];
        setContainedBinding(this.mboundView14);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView21 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[7];
        setContainedBinding(this.mboundView21);
        this.mboundView22 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[8];
        setContainedBinding(this.mboundView22);
        this.mboundView23 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[9];
        setContainedBinding(this.mboundView23);
        this.mboundView24 = (com.example.routetask.databinding.ItemProductShimmerEffectBinding) bindings[10];
        setContainedBinding(this.mboundView24);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView13.invalidateAll();
        mboundView14.invalidateAll();
        mboundView21.invalidateAll();
        mboundView22.invalidateAll();
        mboundView23.invalidateAll();
        mboundView24.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        if (mboundView13.hasPendingBindings()) {
            return true;
        }
        if (mboundView14.hasPendingBindings()) {
            return true;
        }
        if (mboundView21.hasPendingBindings()) {
            return true;
        }
        if (mboundView22.hasPendingBindings()) {
            return true;
        }
        if (mboundView23.hasPendingBindings()) {
            return true;
        }
        if (mboundView24.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView13.setLifecycleOwner(lifecycleOwner);
        mboundView14.setLifecycleOwner(lifecycleOwner);
        mboundView21.setLifecycleOwner(lifecycleOwner);
        mboundView22.setLifecycleOwner(lifecycleOwner);
        mboundView23.setLifecycleOwner(lifecycleOwner);
        mboundView24.setLifecycleOwner(lifecycleOwner);
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
        // batch finished
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView13);
        executeBindingsOn(mboundView14);
        executeBindingsOn(mboundView21);
        executeBindingsOn(mboundView22);
        executeBindingsOn(mboundView23);
        executeBindingsOn(mboundView24);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}