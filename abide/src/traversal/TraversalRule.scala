package scala.tools.abide
package traversal

trait TraversalRule extends Rule { self : Traversal =>
  val analyzer : TraversalAnalyzer

  type State <: scala.tools.abide.State
}
