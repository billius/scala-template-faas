package function

import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.Directives._

trait Handler {

  def routeMap: Route = {
    complete("pong")
  }
}
