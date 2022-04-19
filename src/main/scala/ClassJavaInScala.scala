package br.com.daian.scala

import java.net.ServerSocket
import java.text.SimpleDateFormat
import java.util
import java.util.Date

object ClassJavaInScala {
  def main(args: Array[String]) {

    val lista = new util.ArrayList[String]
    val lista2 = new util.ArrayList[String]
    lista.add("Eduardo")
    lista.add("Luiz")
    lista.add("Bruna")

    lista2.add("jair")

    val agora = new Date()
    val dateFormatter = new SimpleDateFormat("dd/MM/yyyy")
    println(dateFormatter format agora)

    val socket = new ServerSocket(9999)
    socket.accept();
    socket.close();

  }
}
