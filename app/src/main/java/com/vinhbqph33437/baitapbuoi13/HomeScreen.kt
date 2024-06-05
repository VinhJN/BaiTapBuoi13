package com.vinhbqph33437.baitapbuoi13

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.vinhbqph33437.baitapbuoi13.repository.Repository
import com.vinhbqph33437.baitapbuoi13.room.StudentsDB
import com.vinhbqph33437.baitapbuoi13.viewmodel.StudentViewModel

@Composable
fun HomeScreen() {
    val context = LocalContext.current
    val db = StudentsDB.getIntance(context)
    val repository = Repository(db)
    val myViewModel = StudentViewModel(repository)
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Main"){
        composable("Main"){ MainScreen(viewModel = myViewModel, navController)}
        composable("Card/{studentId}/{hoTen}/{mssv}/{diemTB}/{daRaTruong}"){
            CardScreen(
                navController,
                viewModel = myViewModel,
                studentId = it.arguments?.getString("studentId"),
                hoTen = it.arguments?.getString("hoTen"),
                mssv = it.arguments?.getString("mssv"),
                diemTB = it.arguments?.getString("diemTB"),
                daRaTruong = it.arguments?.getString("daRaTruong")
            )
        }

    }
}