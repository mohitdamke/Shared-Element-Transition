package com.example.mypractice

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun navcontol() {

    val navcontroller = rememberNavController()

    NavHost(navController = navcontroller, startDestination = "one") {
        composable("one") {
            one(navcontroller)
        }

        composable("two/{image}/{title}/{description}/{size}",
            arguments = listOf(
                navArgument("image") { type = NavType.IntType },
                navArgument("title") { type = NavType.StringType },
                navArgument("description") { type = NavType.StringType },
                navArgument("size") { type = NavType.IntType }
            )
        ) {

            val image = it.arguments?.getInt("image") ?: 0
            val title = it.arguments?.getString("title") ?: ""
            val description = it.arguments?.getString("description") ?: ""
            val size = it.arguments?.getInt("size")?: 0

            two(img = image, title = title, desp = description, size = size)
        }

    }
}
















