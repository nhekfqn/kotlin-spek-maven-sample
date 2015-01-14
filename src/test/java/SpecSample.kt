import kotlin.test.assertEquals
import org.jetbrains.spek.api.Spek

class BlaherSpecs: Spek() {{

    given("Let's test Blaher") {
        val blaher = Blaher()
        on("Blaher blah") {
            val blah = blaher.blah()
            it("should be Blah!") {
                assertEquals("Blah1!", blah)
            }
        }
    }
}}
