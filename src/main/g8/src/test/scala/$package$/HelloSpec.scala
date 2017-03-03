package $package$

import org.specs2._

class HelloSpec extends mutable.Specification {
  "The Hello object" should {
    "say hello" in {
      Hello.greeting === "hello $name$"
    }
}
}
