package br.com.daian.scala

object Sample {
  def fazConta(callback: (Int, Int) => Int, x: Int, y: Int) {
    println(callback(x, y))
  }

  def soma(x: Int, y: Int): Int = {
    x + y
  }

  def multiplicacao(x: Int, y: Int): Int = {
    x * y
  }

  def divisao(x: Int, y: Int): Int = {
    x * y
  }

  def subtracao(x: Int, y: Int): Int = {
    x * y
  }

  def main(args: Array[String]): Unit = {
    println("Realiza as operações matemáticas:")
    fazConta(soma, 5, 3);
    fazConta(multiplicacao, 5, 3);
    fazConta(divisao, 5, 3);
    fazConta(subtracao, 5, 3);
  }
}
