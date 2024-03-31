package com.stu71563.a71563assign2.Views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDownward
import androidx.compose.material.icons.filled.ArrowUpward
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.EventSeat
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

                val iconColor = if (movie?.seatsRemaining?.value!! > 3) Color.Green else Color.Red
                Icon(Icons.Filled.EventSeat, contentDescription = "Seat Available", tint = iconColor)

                Text(
                    text = "Seats Selected: ${movie?.seatsSelected?.value}",
                    modifier = Modifier.padding(start = 16.dp)
                )

                IconButton(onClick = {
                    if (movie?.seatsSelected?.value!! > 0) {
                        movie.seatsSelected.value--
                        movie.seatsRemaining.value++
                    }
                }) {
                    Icon(Icons.Filled.ArrowDownward, contentDescription = "Remove Seat")
                }
                IconButton(onClick = {
                    if (movie?.seatsRemaining?.value!! > 0) {
                        movie.seatsSelected.value++
                        movie.seatsRemaining.value--
                    }
                }) {
                    Icon(Icons.Filled.ArrowUpward, contentDescription = "Add Seat")
                }
            }
            }
        }
    ) {
        LazyColumn(
            contentPadding = PaddingValues(top = 60.dp),
            modifier = Modifier
                .fillMaxSize()
                .background(Color(android.graphics.Color.parseColor("#000000"))),


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

                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "${movie?.name }",
                            fontSize = 26.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(android.graphics.Color.parseColor("#D3D3D3"))
                        )
                        Spacer(modifier = Modifier.width(16.dp))
                        Image(
                            painter = rememberAsyncImagePainter(model = movie?.certification),
                            contentDescription = movie?.certification,
                            modifier = Modifier.size(26.dp),
                            contentScale = ContentScale.FillBounds
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Row {

                        Text(
                            text = "Starring ",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(android.graphics.Color.parseColor("#D3D3D3"))
                        )
                        Text(
                            text = "Starring: ${movie?.starring?.joinToString()}",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(android.graphics.Color.parseColor("#6E6E6E"))
                        )
                    }
                    Spacer(modifier = Modifier.height(4.dp))

                    Row {

                        Text(
                            text = "Running Time ",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(android.graphics.Color.parseColor("#D3D3D3"))
                        )
                        Text(
                            text = "${movie?.runningTimeMins} mins",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color(android.graphics.Color.parseColor("#6E6E6E"))
                        )
                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "${movie?.description}",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.White,
                        maxLines = 10,
                        overflow = TextOverflow.Ellipsis
                    )




                }
            }
        }
    }
}