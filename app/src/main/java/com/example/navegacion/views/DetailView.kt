package com.example.navegacion.views

import android.annotation.SuppressLint
import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.navegacion.components.ActionButton
import com.example.navegacion.components.MainIconButton
import com.example.navegacion.components.Space
import com.example.navegacion.components.TitleView
import com.example.navegacion.components.TittleBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(navController: NavController, id: Int, opcional: String?){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TittleBar (name= "Detail view" ) },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton (icon = Icons.Default.ArrowBack){
                        navController.popBackStack()
                    }
                }
            )
        },
        floatingActionButton = {
            ActionButton()
        }
    ) {
        ContentDetailView(navController, id, opcional)
    }
}

@Composable
fun ContentDetailView(navController: NavController, id: Int, opcional: String?) {
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        TitleView(name = "Detail View")
        Space()
        TitleView(name = id.toString())
        Space()
        TitleView(name = opcional.toString().orEmpty())


    }
}
