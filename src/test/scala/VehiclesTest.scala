import org.scalatest.flatspec.AnyFlatSpec

class VehiclesTest extends AnyFlatSpec {

  "A Car" should "be drivable" in {
    val car = new Car()
    assert(car.move == "A Car can be Driven")
  }

  "A Boat" should "be sailable" in {
    val boat = new Boat()
    assert(boat.move == "A Boat can be Sailed")
  }

  "An Aeroplane" should "be fly-able" in {
    val aeroplane = new Aeroplane()
    assert(aeroplane.move == "An Aeroplane can be Flown")
  }

  "A Flying Car" should "be drivable and flyable" in {
    val flyingCar = new FlyingCars()
    assert(flyingCar.move == "Flying cars can be Driven and Flown")
  }

  "A Hovercraft" should "be drivable and sail-able" in {
    val hovercraft = new Hovercraft()
    assert(hovercraft.move == "Hovercraft can be Sailed and Driven")
  }

}
