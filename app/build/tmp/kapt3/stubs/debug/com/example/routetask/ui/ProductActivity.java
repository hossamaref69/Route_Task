package com.example.routetask.ui;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\\\u0010\u0019\u001a\u00020\u00102\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010 2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010 H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/example/routetask/ui/ProductActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/routetask/ui/ProductAdapter;", "binding", "Lcom/example/routetask/databinding/ActivityProductBinding;", "dialog", "Landroid/app/AlertDialog;", "productFragmentViewModel", "Lcom/example/routetask/ui/ProductViewModel;", "getProductFragmentViewModel", "()Lcom/example/routetask/ui/ProductViewModel;", "productFragmentViewModel$delegate", "Lkotlin/Lazy;", "bindProduct", "", "productsList", "", "Lcom/example/domain/model/Product;", "initRecyclerView", "observes", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showDialog", "title", "", "message", "posButtonTitle", "negButtonTitle", "onPosButtonClick", "Lkotlin/Function0;", "onNegButtonClick", "app_debug"})
public final class ProductActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.routetask.databinding.ActivityProductBinding binding;
    @org.jetbrains.annotations.Nullable
    private com.example.routetask.ui.ProductAdapter adapter;
    @org.jetbrains.annotations.Nullable
    private android.app.AlertDialog dialog;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy productFragmentViewModel$delegate = null;
    
    public ProductActivity() {
        super();
    }
    
    private final com.example.routetask.ui.ProductViewModel getProductFragmentViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRecyclerView() {
    }
    
    private final void observes() {
    }
    
    private final void bindProduct(java.util.List<com.example.domain.model.Product> productsList) {
    }
    
    private final void showDialog(java.lang.String title, java.lang.String message, java.lang.String posButtonTitle, java.lang.String negButtonTitle, kotlin.jvm.functions.Function0<kotlin.Unit> onPosButtonClick, kotlin.jvm.functions.Function0<kotlin.Unit> onNegButtonClick) {
    }
}