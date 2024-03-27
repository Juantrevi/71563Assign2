package com.stu71563.a71563assign2.Navigation

sealed class Routes(val route: String) {
    object MainView : Routes("main_view")
    object SecondScreen : Routes("second_screen")
    object ThirdScreen : Routes("third_screen")
}