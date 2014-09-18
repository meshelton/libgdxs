package io.github.meshelton.libgdxs.math

import com.badlogic.gdx.math.{Matrix3, Matrix4, Quaternion, 
  Vector2 => JVector2, Vector3 => JVector3, Interpolation}


object Vector3 extends JVector3 {
  import scala.language.implicitConversions
  implicit def tup3fToVector3(tup: (Float, Float, Float)): Vector3 = {
    Vector3(tup._1, tup._2, tup._3)
  }
  implicit def tup3iToVector3(tup: (Int, Int, Int)): Vector3 = {
    Vector3(tup._1, tup._2, tup._3)
  }
  implicit class Vector3FloatOps(val f: Float) {
    def *(vec: Vector3): Vector3 = vec.scl(f)
  }
  implicit def vector3ToList(vec: Vector3): List[Float] = {
    vec.x :: vec.y :: vec.z :: Nil
  }
  def unapply(vec: JVector3): Option[(Float, Float, Float)] = Some((vec.x, vec.y, vec.z))
  def apply(): Vector3 = new Vector3(0, 0, 0)
  def apply(other: JVector3): Vector3 = new Vector3(other.x, other.y, other.z)
  def apply(x: Float, y: Float, z: Float): Vector3 = new Vector3(x, y, z)
  def apply(vec: JVector2, z: Float): Vector3 = new Vector3(vec.x, vec.y, z)
  def apply(values: Array[Float]): Vector3 = Vector3().set(values)
  def X = Vector3(JVector3.X)
  def Y = Vector3(JVector3.Y)
  def Z = Vector3(JVector3.Z)
  def Zero = Vector3(JVector3.Zero)
}

class Vector3(_x: Float, _y: Float, _z: Float) extends JVector3(_x, _y, _z) {

  override def equals(o: Any) = o match {
      case that: JVector3 => that.x == x && that.y == y && that.z == z
      case _ => false
    }

  def +(values: Float): Vector3 = add(values)
  def +(x: Float, y: Float, z: Float): Vector3 = add(x, y, z)
  def +(other: JVector3): Vector3 = add(other)
  def -(values: Float): Vector3 = sub(values)
  def -(x: Float, y: Float, z: Float): Vector3 = sub(x, y, z)
  def -(other: JVector3): Vector3 = sub(other)
  def *(mat: Matrix3): Vector3 = mul(mat)
  def *(mat: Matrix4): Vector3 = mul(mat)
  def *(quat: Quaternion): Vector3 = mul(quat)
  def *+(vec: JVector3, scalar: Float): Vector3 = mulAdd(vec, scalar)
  def *+(vec: JVector3, mulVec: JVector3): Vector3 = mulAdd(vec, mulVec)
  def ^ = nor()
  def *(scalar: Float): Vector3 = scl(scalar)
  def *(x: Float, y: Float, z: Float): Vector3 = scl(x, y, z)
  def *(v: JVector3): Vector3 = scl(v)

  def toList: List[Float] = List(this.x, this.y, this.z)
  def toTuple: (Float, Float, Float) = (x, y, z)

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

  override def limit(limit: Float): Vector3 = {
    super.limit(limit)
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
  override def mul4x3(matrix: Array[Float]): Vector3 = {
    super.mul4x3(matrix)
    this
  }
  override def prj(matrix: Matrix4): Vector3 = {
    super.prj(matrix)
    this
  }
  override def rot(matrix: Matrix4): Vector3 = {
    super.rot(matrix)
    this
  }
  override def rotate(degree: Float, axisX: Float, axisY: Float, axisZ: Float): Vector3 = {
    super.rotate(degree, axisX, axisY, axisZ)
    this
  }
  override def rotate(axis: JVector3, degrees: Float): Vector3 = {
    super.rotate(axis, degrees)
    this
  }
  override def rotateRad(radians: Float, axisX: Float, axisY: Float, axisZ: Float): Vector3 = {
    super.rotateRad(radians, axisX, axisY, axisZ)
    this
  }
  override def rotateRad(axis: JVector3, radians: Float): Vector3 = {
    super.rotateRad(axis, radians)
    this
  }
  override def nor() = {
    super.nor()
    this
  }
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
  override def set(values: Array[Float]): Vector3 = {
    super.set(values)
    this
  }
  override def set(x: Float, y: Float, z: Float): Vector3 = {
    super.set(x, y, z)
    this
  }
  override def set(vec: JVector2, z: Float): Vector3 = {
    super.set(vec, z)
    this
  }
  override def set(vec: JVector3): Vector3 = {
    super.set(vec)
    this
  }
  override def setZero(): Vector3 = {
    super.setZero()
    this
  }
  override def slerp(target: JVector3, alpha: Float): Vector3 = {
    super.slerp(target, alpha)
    this
  }
  override def traMul(mat: Matrix3): Vector3 = {
    super.traMul(mat)
    this
  }
  override def traMul(mat: Matrix4): Vector3 = {
    super.traMul(mat)
    this
  }
  override def unrotate(mat: Matrix4): Vector3 = {
    super.unrotate(mat)
    this
  }
  override def untransform(mat: Matrix4): Vector3 = {
    super.untransform(mat)
    this
  }




}
