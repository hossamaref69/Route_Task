package com.example.routetask.ui

import android.app.AlertDialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.domain.model.Product
import com.example.routetask.R
import com.example.routetask.databinding.ActivityProductBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class ProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductBinding
    private var adapter: ProductAdapter? = null
    private var dialog: AlertDialog? = null
    private val productFragmentViewModel: ProductViewModel by viewModels<ProductViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()
        productFragmentViewModel.getAllProducts()
        observes()
    }

    private fun initRecyclerView() {
        adapter = ProductAdapter(listOf())
        binding.productRv.adapter = adapter
    }

    private fun observes() {
        productFragmentViewModel.productListLiveData.observe(this) { list ->
            bindProduct(list)
        }
        productFragmentViewModel.viewMessageLiveData.observe(this){
            showDialog(
                it.title,
                it.message,
                it.posButtonTitle,
                it.negButtonTitle,
                it.onPosButtonClick,
                it.onNegButtonClick
            )
        }
    }

    private fun bindProduct(productsList: List<Product?>) {
        if (productsList.isNullOrEmpty()) return
        Handler(Looper.getMainLooper()).postDelayed({
            binding.productRecyclerViewShimmer.stopShimmer()
            binding.productRecyclerViewShimmer.visibility = View.INVISIBLE
            adapter?.updateList(productsList)
            binding.productRv.adapter = adapter
        }, 2000)

    }

    private fun showDialog(
        title: String? = null,
        message: String? = null,
        posButtonTitle: String? = null,
        negButtonTitle: String? = null,
        onPosButtonClick: (() -> Unit)? = null,
        onNegButtonClick: (() -> Unit)? = null,

        ) {
        val builder = AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setCancelable(false)
        posButtonTitle.let {
            builder.setPositiveButton(
                posButtonTitle
            ) { dialog, _ ->
                dialog?.dismiss()
                onPosButtonClick?.invoke()
            }
        }
        negButtonTitle.let {
            builder.setNegativeButton(
                negButtonTitle
            ) { dialog, _ ->
                dialog?.dismiss()
                onNegButtonClick?.invoke()
            }
        }
        builder.create().show()
    }

}