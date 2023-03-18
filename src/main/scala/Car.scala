
// A car is a drivable vehicle
class Car extends Drivable {

  override def move: String = "A Car can be " + super.move
}

// A boat is a sailable vehicle
class Boat extends Sailable {

  override def move: String = "A Boat can be " + super.move
}

// An aeroplane is a flyable vehicle
class Aeroplane extends Flyable {

  override def move: String = "An Aeroplane can be " + super.move
}

// A flying car is both a drivable and flyable vehicle
class FlyingCars extends Drivable with Flyable {

  override def move: String = "Flying cars can be " + super[Drivable].move + " and " + super[Flyable].move
}

// A hovercraft is both a sailable and drivable vehicle
class Hovercraft extends Sailable with Drivable {

  override def move: String = "Hovercraft can be " + super[Sailable].move + " and " + super[Drivable].move
}
