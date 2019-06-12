package org.icp

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.Route
import io.ktor.routing.get

const val SAMPLE_EVENT_INFO = """
{
  "title":"Super Hero Conf",
  "description":"Learn from your favorite heroes"
}
"""

fun Route.event() = get("/") {
    call.respondText(SAMPLE_EVENT_INFO.trimIndent(), ContentType.Text.Plain)
}