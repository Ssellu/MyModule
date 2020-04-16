package com.issell.mymodule

import android.content.Context
import android.widget.Toast

class MyTest {
    fun test(context: Context, message:String){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}