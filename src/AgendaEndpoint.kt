package org.icp

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

const val SAMPL_AGENDA = """
{
  "days":[
    {
      "title":"Day 1",
      "date":"5\/4\/19",
      "sessions":[
        {
          "id":0,
          "title":"How to Train Your Dragon",
          "speaker":"Jimmy Neutron"
        },
        {
          "id":1,
          "title":"How to write code even though you have no idea what's going on most of the time",
          "speaker":"All Ofus"
        },
        {
          "id":2,
          "title":"Everything wrong with Game of Thrones Season 8",
          "speaker":"Fans Everywhere"
        },
        {
          "id":3,
          "title":"So you want to be a Jedi?",
          "speaker":"Luke Skywalker"
        }
      ]
    },
    {
      "title":"Day 2",
      "date":"5\/5\/19",
      "sessions":[
        {
          "id":4,
          "title":"Lightsaber Basics",
          "speaker":"Yoda"
        },
        {
          "id":5,
          "title":"Improving your Quirk",
          "speaker":"Shota Aizawa"
        },
        {
          "id":6,
          "title":"Becoming an Avenger",
          "speaker":"Steve Rogers"
        },
        {
          "id":7,
          "title":"Go Super Sayain in 3 Easy Steps",
          "speaker":"Vegeta"
        }
      ]
    }
  ]
}
"""

fun Route.agenda() = get("/agenda") {
    call.respondText(SAMPL_AGENDA.trimIndent(), ContentType.Text.Plain)
}