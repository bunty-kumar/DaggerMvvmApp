package com.bunty.daggermvvmapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.bunty.daggermvvmapp.viewmodel.ProductViewModel
import com.bunty.daggermvvmapp.viewmodel.ProductViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var productViewModel: ProductViewModel

    @Inject
    lateinit var productViewModelFactory: ProductViewModelFactory

    private val tvProduct: TextView
        get() = findViewById(R.id.tvProduct)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as ProductApplication).applicationComponents.inject(this)

        var map = (application as ProductApplication).applicationComponents.getMap()
        productViewModel = ViewModelProvider(this, productViewModelFactory)[ProductViewModel::class.java]


        productViewModel.productLiveData.observe(this) {
            tvProduct.text = it.joinToString { x -> x.title + "\n\n" }
        }
    }
}