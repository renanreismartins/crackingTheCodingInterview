package arraysandstrings

import org.scalatest.{FlatSpec, Matchers}

class URLifyTest extends FlatSpec with Matchers {

  "URLify" should "replace spaces with %20" in {
    URLify.urlify("Mr John Smith".toCharArray) should be("Mr%20John%20Smith")
    URLify.urlify("a b".toCharArray) should be("a%20b")
  }

  it should "not change strings without spaces" in {
    URLify.urlify("Mr".toCharArray) should be("Mr")
  }

}
