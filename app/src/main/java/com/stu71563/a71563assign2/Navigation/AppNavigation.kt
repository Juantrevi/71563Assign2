package com.stu71563.a71563assign2.Navigation

import MainView
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.MainView.route,
    ) {
        composable(route = Routes.MainView.route)
        {
            MainView(navController = navController)
        }
        // Add other screens here when they're ready
    }
}