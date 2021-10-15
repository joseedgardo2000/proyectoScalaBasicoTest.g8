import org.scalatest.funspec.AnyFunSpec

class PrincipalTest extends AnyFunSpec {
  describe("Un objeto pricipal:"){
    it("Realiza lo siguiente"){
      val res = (5*2) == 10
      assert(res)
      info("Una actividad que se puede probar")
    }
  }
}