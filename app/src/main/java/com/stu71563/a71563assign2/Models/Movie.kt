package com.stu71563.a71563assign2

data class Movie(
    val name: String,
    val image: Int,
    val certification: String,
    val description: String,
    val starring: Array<String>,
    val runningTimeMins: Int,
    var seatsRemaining: Int,
    var seatsSelected: Int
)



val movieList = listOf(
    Movie("Movie 1",
        1,
        "Certification 1",
        "Description 1",
        arrayOf("Star 1", "Star 2"),
        120,
        100,
        0),

    Movie("Movie 2",
        2,
        "Certification 2",
        "Description 2",
        arrayOf("Star 3", "Star 4"),
        130,
        90,
        0),

    Movie("Movie 3",
        3,
        "Certification 3",
        "Description 3",
        arrayOf("Star 5", "Star 6"),
        140,
        80,
        0),

    Movie("Movie 4",
        4,
        "Certification 4",
        "Description 4",
        arrayOf("Star 7", "Star 8"),
        150,
        70,
        0)
)