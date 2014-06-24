package io.github.meshelton.libgdxs.math

import com.badlogic.gdx.math.{Matrix3, Matrix4, Quaternion, 
  Vector2 => JVector2, Vector3 => JVector3}


object Vector3 extends JVector3 {
  def apply() = new Vector3(0, 0, 0)
  def apply(other: JVector3) = new Vector3(other.x, other.y, other.z)
  def apply(x: Float, y: Float, z: Float) = new Vector3(x, y, z)
  def apply(vec: JVector2, z: Float) = new Vector3(vec.x, vec.y, z)
}

class Vector3(x: Float, y: Float, z: Float) extends JVector3(x, y, z) {

  def +(values: Float) = add(values)
  def +(x: Float, y: Float, z: Float) = add(x, y, z)
  def +(other: JVector3) = add(other)
  def -(values: Float) = sub(values)
  def -(x: Float, y: Float, z: Float) = sub(x, y, z)
  def -(other: JVector3) = sub(other)
  def x(x: Float, y: Float, z: Float) = crs(x, y, z)
  def x(other: JVector3) = crs(other)
  def *(mat: Matrix3) = mul(mat)
  def *(mat: Matrix4) = mul(mat)
  def *(quat: Quaternion) = mul(quat)
  def *+(vec: JVector3, scalar: Float) = mulAdd(vec, scalar)
  def *+(vec: JVector3, mulVec: JVector3) = mulAdd(vec, mulVec)
  def ^ = nor()
  def *(scalar: Float) = scl(scalar)
  def *(x: Float, y: Float, z: Float) = scl(x, y, z)
  def *(v: JVector3) = scl(v)

}
