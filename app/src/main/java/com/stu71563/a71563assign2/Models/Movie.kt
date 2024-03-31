package com.stu71563.a71563assign2

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import kotlin.random.Random

data class Movie(
    val name: String,
    val image: String,
    val certification: String,
    val description: String,
    val starring: Array<String>,
    val runningTimeMins: Int,
    var seatsRemaining: MutableState<Int>,
    var seatsSelected: MutableState<Int>
)



val movieList = listOf(
    Movie("IMMACULATE",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/b3d828fc-f999-4d6b-8bf6-299a4998c46e_immaculate_posters_0825-bb-immaculate_1-sheet_aw-08022024_712px.jpg?mw=450&rev=9e640bbf86ae4a9591e22686c36569da",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/16.png?mw=25&mh=25&rev=a22f1322c3ee478cb4b50f8de5ee741d",
        "Cecilia, a woman of devout faith, is warmly welcomed to the picture-perfect Italian countryside where she is offered a new role at an illustrious convent. But it becomes clear to Cecilia that her new home harbors dark and horrifying secrets.",
        arrayOf("Sydney Sweeney", "Benedetta Porcaroli", "Alvaro Morte", "Simona Tabasco"),
        89,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0)
    ),

    Movie("KUNG FU PANDA 4",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/a223aaeb-6a2d-4561-92f0-e3efa105a21e_kung-fu-panda-4_posters_kf4_intl_dgtl_payoff_1sheet_uk_712px.jpg?mw=450&rev=7239547d058742c7b4ee0899fe51c29e",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/pg.png?mw=25&mh=25&rev=be4a86333c51431593fef1189e30e84e",
        "After Po is tapped to become the Spiritual Leader of the Valley of Peace, he needs to find and train a new Dragon Warrior, while a wicked sorceress plans to re-summon all the master villains whom Po has vanquished to the spirit realm.",
        arrayOf("Jack Black", "Awkwafina", "Viola David", "Dustin Hoffman"),
        130,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0)),

    Movie("BOB MARLEY: ONE LOVE",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/bob-marley-one-love_posters_bmol_intl_dgtl_teaser_1sheet_2025x3000_spotlight_uk_712px.jpg?mw=450&rev=1fb201cf08754f18b77f98fd4f28ed4b",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/12a.png?mw=25&mh=25&rev=d1b78b8f625a43b098703bf1bf397269",
        "BOB MARLEY: ONE LOVE celebrates the life and music of an icon who inspired generations through his message of love and unity. On the big screen for the first time, discover Bob’s powerful story of overcoming adversity and the journey behind his revolutionary music. Produced in partnership with the Marley family and starring Kingsley Ben-Adir as the legendary musician and Lashana Lynch as his wife Rita.",
        arrayOf("Lashana Lynch", "Tosin Cole", "Kingsley Ben-Adir", "James Norton", "Anthony Welsh"),
        110,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0)),

    Movie("IMAGINARY",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/f607e5c8-c8db-4dbb-92d0-dad9ab8c68c3_imaginary_posters_imaginary_1sheet_686x1016_712px.jpg?mw=450&rev=795a2eed0ad641b297101bd70e72eca7",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/15a.png?mw=25&mh=25&rev=fd3786da538c4502b4e4c02ea3c7b44e",
        "From Blumhouse, the genre-defining masterminds behind FIVE NIGHTS AT FREDDY’S and M3GAN. When Jessica (DeWanda Wise) moves back into her childhood home with her family, her youngest stepdaughter Alice (Pyper Braun) develops an eerie attachment to a stuffed bear named Chauncey she finds in the basement. Alice starts playing games with Chauncey that begin playful and become increasingly sinister. As Alice’s behaviour becomes more and more concerning, Jessica intervenes only to realize Chauncey is much more than the stuffed toy bear she believed him to be.",
        arrayOf("Betty Buckley", "DeWanda Wise", "Tom Payne"),
        104,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0)),

    Movie("MOTHERS’ INSTINCT",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/c177f35c-a26b-4ffc-bedf-71a2758fc90f_mothers-instinct_posters_mothers--instinct-artworks---online-uk.jpg?mw=450&rev=ce7f869488c94122b2072c28cc23ce81",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/15a.png?mw=25&mh=25&rev=fd3786da538c4502b4e4c02ea3c7b44e",
        "Starring Academy Award winners Jessica Chastain and Anne Hathaway, Mothers’ Instinct is an unnerving psychological thriller about two best friends and neighbors, Alice and Céline, whose perfect lives in ‘60s suburbia are shattered by a tragic accident involving one of their children. Marking the directorial debut of acclaimed cinematographer Benoit Delhomme, we follow Alice and Céline as their familial bonds are gradually undermined by guilt and paranoia and a gripping battle of wills develops, revealing the darker side of maternal love.",
        arrayOf("Jessica Chastain", "Anne Hathaway"),
        94,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0)),

    Movie("LATE NIGHT WITH THE DEVIL",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/import/fbba555e-0b86-42ef-bf03-b6622edd07cb_late-night-with-the-devil_posters_lnwtd_6sht_p4p_712px.jpg?mw=450&rev=54cc9cb298c749f290f17921f84d3efb",
        "https://www.myvue.com/-/jssmedia/vuecinemas/img/certificates/ie/16.png?mw=25&mh=25&rev=a22f1322c3ee478cb4b50f8de5ee741d",
        "October 31, 1977. Johnny Carson rival Jack Delroy hosts a syndicated late night talk show ‘Night Owls’ that has long been a trusted companion to insomniacs around the country. A year after the tragic death of Jack’s wife, ratings have plummeted. Desperate to turn his fortunes around, Jack plans a Halloween special like no other, unaware that he is about to unleash evil into the living rooms of America.",
        arrayOf("David Dastmalchian", "Fayssal Bazzi", "Laura Gordon", "Ian Bliss"),
        93,
        mutableIntStateOf(Random.nextInt(0, 16)),
        mutableIntStateOf(0)),

)