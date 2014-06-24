package io.github.meshelton.libgdxs.math

import com.badlogic.gdx.math.{Matrix3, Matrix4, Quaternion, 
  Vector2 => JVector2, Vector3 => JVector3, Interpolation}


object Vector3 extends JVector3 {
  def apply() = new Vector3(0, 0, 0)
  def apply(other: JVector3) = new Vector3(other.x, other.y, other.z)
  def apply(x: Float, y: Float, z: Float) = new Vector3(x, y, z)
  def apply(vec: JVector2, z: Float) = new Vector3(vec.x, vec.y, z)
}

class Vector3(x: Float, y: Float, z: Float) extends JVector3(x, y, z) {

  override def clamp(min: Float, max: Float): Vector3 = {
    super.clamp(min, max)
    this
  }

  override def cpy(): Vector3 = {
    Vector3(super.cpy())
  }

  override def interpolate(target: JVector3, alpha: Float, inter: Interpolation): Vector3 = {
    super.interpolate(target, alpha, inter)
    this
  }

  override def lerp(target: JVector3, alpha: Float): Vector3 = {
    super.lerp(target, alpha)
    this
  }

  override def add(values: Float): Vector3 = {
    super.add(values)
    this
  }
  override def add(x: Float, y: Float, z: Float): Vector3 = {
    super.add(x, y, z)
    this
  }
  override def add(other: JVector3): Vector3 = {
    super.add(other)
    this
  }
  override def sub(values: Float): Vector3 = {
    super.sub(values)
    this
  }
  override def sub(x: Float, y: Float, z: Float): Vector3 = {
    super.sub(x, y, z)
    this
  }
  override def sub(other: JVector3): Vector3 = {
    super.sub(other)
    this
  }
  override def crs(x: Float, y: Float, z: Float): Vector3 = {
    super.crs(x, y, z)
    this
  }
  override def crs(other: JVector3): Vector3 = {
    super.crs(other)
    this
  }
  override def mul(mat: Matrix3): Vector3 = {
    super.mul(mat)
    this
  }
  override def mul(mat: Matrix4): Vector3 = {
    super.mul(mat)
    this
  }
  override def mul(quat: Quaternion): Vector3 = {
    super.mul(quat)
    this
  }
  override def mulAdd(vec: JVector3, scalar: Float): Vector3 = {
    super.mulAdd(vec, scalar)
    this
  }
  override def mulAdd(vec: JVector3, mulVec: JVector3): Vector3 = {
    super.mulAdd(vec, mulVec)
    this
  }
  override def nor() = super.nor()
  override def scl(scalar: Float): Vector3 = {
    super.scl(scalar)
    this
  }
  override def scl(x: Float, y: Float, z: Float): Vector3 = {
    super.scl(x, y, z)
    this
  }
  override def scl(v: JVector3): Vector3 = {
    super.scl(v)
    this
  }

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
