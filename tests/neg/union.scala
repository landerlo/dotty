object Test {

  class A
  class B extends A
  class C extends A
  class D extends A

  val b = true

  val x: B | C = if (b) new B else new C

  val y:  B | C = x  // Explicit union ascription is kept
  val ok: B | C = y  // ok

  val z = x // We lose the Union ascription as it's not explicit
  val error: B | C = z // error as z has lost union ascription
}
