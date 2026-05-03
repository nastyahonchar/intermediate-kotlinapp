package com.example.intermediate_kotlinapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.intermediate_kotlinapp.ui.root.AppScaffold
import com.example.intermediate_kotlinapp.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme{
                AppScaffold()
            }
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    AppTheme{
        AppScaffold()
    }
}