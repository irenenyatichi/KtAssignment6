fun main() {
    val car=Car("Subaru","Legacy","White",35)
    car.carry(45)
    car.identity()
    println(car.calculateParkingFees(6))
    val bus= Bus("Isuzu","DX","Black",20)
    println(bus.maxTripFare(70.0))
    println(bus.calculateParkingFees(5))
}
open class Car(var make:String, var model:String, var color:String, var capacity:Int){
    fun carry(people:Int){
        if (people<=capacity){
            println()
        }
        else{
            val x=people-capacity
            println("Overcapacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int):Int{
        return (hours*20)
    }
}
class Bus(make:String, model:String, color:String, capacity:Int): Car(make,model,color,capacity){
    fun maxTripFare(fare:Double): Double{
        return (capacity*fare)
    }
    override fun calculateParkingFees(hours:Int):Int{
        return (hours*capacity)
    }
}