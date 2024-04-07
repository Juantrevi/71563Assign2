package com.stu71563.a71563assign2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.stu71563.a71563assign2.Navigation.AppNavigation
import com.stu71563.a71563assign2.ui.theme._71563Assign2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _71563Assign2Theme {
                AppNavigation()

        }
    }
}
}
