package io.github.meshelton.libgdxscala.math

import com.badlogic.gdx.math.{Matrix3, Vector2 => JVector2, Vector3 => JVector3}

object Vector2 extends JVector2 {
  def apply() = new Vector2(0, 0)
  def apply(other: JVector2) = new Vector2(other.x, other.y)
  def apply(x: Float, y: Float) = new Vector2(x, y)
  def apply(vec: Vector3) = new Vector2(vec.x, vec.y)
}

class Vector2(x: Float, y: Float) extends JVector2(x, y) {

  def +(x: Float, y: Float) = add(x, y)
  def +(other: JVector2) = add(other)
  def -(x: Float, y: Float) = sub(x, y)
  def -(other: JVector2) = sub(other)
  def x(x: Float, y: Float) = crs(x, y)
  def x(other: JVector2) = crs(other)
  def *(mat: Matrix3) = mul(mat)
  def *+(vec: JVector2, scalar: Float) = mulAdd(vec, scalar)
  def *+(vec: JVector2, mulVec: JVector2) = mulAdd(vec, mulVec)
  def ^ = nor()
  def *(scalar: Float) = scl(scalar)
  def *(x: Float, y: Float) = scl(x, y)
  def *(v: JVector2) = scl(v)

}
