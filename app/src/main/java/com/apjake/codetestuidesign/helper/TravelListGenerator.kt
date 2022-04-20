package com.apjake.codetestuidesign.helper

import com.apjake.codetestuidesign.model.Travel

object TravelListGenerator {
    fun generate(): List<Travel> = listOf(
        Travel(
            name = "Inlay Lake",
            address = "Myanmar, Inlay",
            poster = "https://upload.wikimedia.org/wikipedia/commons/d/d8/Inle_Lake_%28Myanmar%29.jpg"
        ),
        Travel(
            name = "Shan",
            address = "Myanmar, Shan State",
            poster = "https://thumbs.dreamstime.com/b/landscapes-shan-state-myanmar-84930556.jpg"
        ),
        Travel(
            name = "Pyin Oo Lwin City of flower",
            address = "Myanmar, Pyin Oo Lwin",
            poster = "https://www.remotelands.com/travelogues/app/uploads/2019/04/Pyin-Oo-Lwin-06.jpg"
        ),
        Travel(
            name = "Chin Mountain",
            address = "Myanmar, Chin",
            poster = "https://intriguingmyanmar.com/wp-content/uploads/2020/07/20200713_113924954_iOS-1024x704.jpg"
        ),
        Travel(
            name = "Bagan",
            address = "Myanmar, Bagan",
            poster = "https://blog.darlingmagazine.org/wp-content/uploads/2016/01/Bagan-Birmania.jpg"
        ),
    )
}