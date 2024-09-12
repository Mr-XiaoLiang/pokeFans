package com.lollipop.pokefans

import android.os.Bundle
import com.lollipop.pokefans.base.BaseWebActivity

class BbsActivity: BaseWebActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadUrl("https://bbs.pokefans.cn/")
    }

}