package com.example.routetask.ui

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.domain.model.Product
import com.example.routetask.databinding.ItemProductBinding

class ProductAdapter(private var productList: List<Product?>) :
    RecyclerView.Adapter<ProductAdapter.ViewHolder>() {
    var productDiffUtils: ProductDiffUtils? = null

    class ViewHolder(val binding: ItemProductBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product?) {
            binding.product = product
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productList[position]
        holder.bind(product)
        applyStrikeThrough(holder.binding.discountTv)
    }

    class ProductDiffUtils(
        private val oldList: List<Product?>,
        private val newList: List<Product?>
    ) : DiffUtil.Callback() {
        override fun getOldListSize(): Int = oldList.size

        override fun getNewListSize(): Int = newList.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldList[oldItemPosition] == newList[newItemPosition]
        }

    }

    fun updateList(newList: List<Product?>) {
        productDiffUtils = ProductDiffUtils(productList, newList)
        val diffResult = DiffUtil.calculateDiff(productDiffUtils!!)
        productList = newList
        diffResult.dispatchUpdatesTo(this)

    }

    private fun applyStrikeThrough(textView: TextView) {
        textView.paintFlags = textView.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
    }
}