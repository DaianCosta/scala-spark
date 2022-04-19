package br.com.daian.scala

object MainCollection {
  def printList(printFunction: (Int) => Unit, aList: List[Int]) : Unit = {
    for (x <- aList) {
      printFunction(x)
    }
  }
  def main(args: Array[String]) {

    val listaIdade = List(5, 22, 15, 27, 7)
    println("Escreve as idades")
    printList(x => println(x), listaIdade)

    println("Escreve o dobro das idades")
    printList(x => println(x * 2), listaIdade)

    println("Filtra Idades maiores que 10")
    val listaFiltrada = listaIdade.filter(x => x > 10)
    printList(x => println(x), listaFiltrada)

    println("Filtra Idades não sejam menores que 10")
    val listaFiltrada2 = listaIdade.filterNot (x => x < 10)
    printList(x => println(x), listaFiltrada2)

  }
}
