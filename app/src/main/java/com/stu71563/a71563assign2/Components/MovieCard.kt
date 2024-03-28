import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter

import com.stu71563.a71563assign2.Movie

@Composable
fun MovieCard(movie: Movie, modifier: Modifier = Modifier) {
    Card (modifier = modifier)

    {
        Image(
            painter = rememberAsyncImagePainter(model = movie.image),
            contentDescription = movie.name,
            modifier = Modifier.aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Text(text = movie.name)
    }
}