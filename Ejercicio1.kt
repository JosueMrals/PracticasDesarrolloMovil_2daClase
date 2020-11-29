open class personas{
    open fun recorrer()
    {println("I am person")}
}
class Josh:personas(){
    override fun recorrer(){println("I am Josh")}
}
class Vistor:personas(){
    override fun recorrer(){println("I am Vistor")}
}
class Bellatrix:personas(){
    override fun recorrer(){println("I am Bellatrix")}
}
fun main(){
    var person_list= ArrayList<personas>()
    
    var Josh= Josh()
    var Vistor= Vistor()
    var Bellatrix= Bellatrix()

    person_list.add(Josh)
    person_list.add(Vistor)
    person_list.add(Bellatrix)

    //Ciclo for
    for(persons in person_list)
    {
        persons.recorrer()
    }

}