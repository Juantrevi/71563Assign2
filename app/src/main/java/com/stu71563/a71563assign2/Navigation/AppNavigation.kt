package com.stu71563.a71563assign2.Navigation

import MainView
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.stu71563.a71563assign2.Views.MovieDetails


@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.MainView,
    ) {
        composable(route = Routes.MainView)
        {
            MainView(navController = navController)
        }
        composable(route = Routes.MovieDetails) { backStackEntry ->
            val movieId = backStackEntry.arguments?.getString("movieId")
            MovieDetails(movieName = movieId, navController = navController)
        }
    }
}