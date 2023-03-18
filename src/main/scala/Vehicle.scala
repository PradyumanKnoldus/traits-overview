// All the required traits are specified in this file

trait Vehicle {
  def move: String
}

trait Drivable extends Vehicle {
  override def move: String = "Driven"
}

trait Sailable extends Vehicle {
  override def move: String = "Sailed"
}

trait Flyable extends Vehicle {
  override def move: String = "Flown"
}
