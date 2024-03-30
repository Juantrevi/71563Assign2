package com.stu71563.a71563assign2.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.stu71563.a71563assign2.movieList

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun MovieDetails(movieName: String?, navController: NavController) {

    val movie = movieList.find { it.name == movieName }

    Text(text = "Movie Details: $movieName")

    Scaffold(
        topBar = {
            TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                titleContentColor = MaterialTheme.colorScheme.primary,
            ), title = {
                Text("${movie?.name}")
            })
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Seats Available: ${movie?.seatsRemaining?.value}",
                    modifier = Modifier.padding(start = 16.dp)
                )
                Text(
                    text = "Seats Selected: ${movie?.seatsSelected?.value}",
                    modifier = Modifier.padding(start = 16.dp)
                )
                IconButton(onClick = {
                    if (movie?.seatsRemaining?.value!! > 0) {
                        movie.seatsSelected.value++
                        movie.seatsRemaining.value--
                    }
                }) {
                    Icon(Icons.Default.KeyboardArrowUp, contentDescription = "Add Seat")
                }
                IconButton(onClick = {
                    if (movie?.seatsSelected?.value!! > 0) {
                        movie.seatsSelected.value--
                        movie.seatsRemaining.value++
                    }
                }) {
                    Icon(Icons.Default.KeyboardArrowDown, contentDescription = "Remove Seat")
                }
            }
            }
        }
    ) {
        LazyColumn(
            contentPadding = PaddingValues(top = 60.dp),
            modifier = Modifier
                .fillMaxSize()
            .background(Color(android.graphics.Color.parseColor("#191919"))),


        ) {
            item {
                Image(
                    painter = rememberAsyncImagePainter(model = movie?.image),
                    contentDescription = movie?.name,
                    modifier = Modifier
                        .aspectRatio(1f)
                        .fillMaxWidth()
                        .height(300.dp),
                    contentScale = ContentScale.FillBounds
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Certification: ${movie?.certification ?: ""}",
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Blue
                    )
                    Text(
                        text = "Description: ${movie?.description ?: ""}",
                        fontSize = 16.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        color = Color.White
                    )
                    Row {
                        Text(
                            text = "Starring: ${
                                movie?.starring?.joinToString(separator = ", ") ?: ""
                            }",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Light,
                            modifier = Modifier.weight(1f),
                            color = Color.Gray
                        )
                        Text(
                            text = "Run time: ${movie?.runningTimeMins ?: ""} minutes",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Light,
                            modifier = Modifier.weight(1f),
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}