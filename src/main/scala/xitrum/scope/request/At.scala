package xitrum.scope.request

import scala.collection.mutable.HashMap
import xitrum.util.Json

/** Equivalent to @xxx variables of Rails */
class At extends HashMap[String, Any] {
  def apply[T](key: String): T = super.apply(key).asInstanceOf[T]

  def toJson(key: String): String = {
    val obj = apply[AnyRef](key)
    Json.serialize(obj)
  }
}
