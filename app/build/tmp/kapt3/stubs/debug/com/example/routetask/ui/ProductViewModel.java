package com.example.routetask.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/example/routetask/ui/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "getProductUseCase", "Lcom/example/domain/usecase/GetProductUseCase;", "(Lcom/example/domain/usecase/GetProductUseCase;)V", "productListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/domain/model/Product;", "getProductListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setProductListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "viewMessageLiveData", "Lcom/example/routetask/model/ViewMessage;", "getViewMessageLiveData", "setViewMessageLiveData", "getAllProducts", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.domain.usecase.GetProductUseCase getProductUseCase = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.model.Product>> productListLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<com.example.routetask.model.ViewMessage> viewMessageLiveData;
    
    @javax.inject.Inject
    public ProductViewModel(@org.jetbrains.annotations.NotNull
    com.example.domain.usecase.GetProductUseCase getProductUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.model.Product>> getProductListLiveData() {
        return null;
    }
    
    public final void setProductListLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.example.domain.model.Product>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.routetask.model.ViewMessage> getViewMessageLiveData() {
        return null;
    }
    
    public final void setViewMessageLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<com.example.routetask.model.ViewMessage> p0) {
    }
    
    public final void getAllProducts() {
    }
}