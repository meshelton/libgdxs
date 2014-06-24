package io.github.meshelton.libgdxs.math

import com.badlogic.gdx.math.{Matrix3, Interpolation, Vector2 => JVector2, Vector3 => JVector3}

object Vector2 extends JVector2 {
  import scala.language.implicitConversions
  implicit def tup2fToVector2(tup: (Float, Float)): Vector2 = Vector2(tup._1, tup._2)
  implicit def tup2iToVector2(tup: (Int, Int)): Vector2 = Vector2(tup._1, tup._2)
  implicit class Vector2FloatOps(val f: Float) {
    def *(vec: Vector2): Vector2 = vec.scl(f)
  }
  def apply() = new Vector2(0, 0)
  def apply(other: JVector2) = new Vector2(other.x, other.y)
  def apply(x: Float, y: Float) = new Vector2(x, y)
  def apply(vec: Vector3) = new Vector2(vec.x, vec.y)
  def unapply(vec: JVector2): Option[(Float, Float)] = Some((vec.x, vec.y))
  val X = Vector2(JVector2.X)
  val Y = Vector2(JVector2.Y)
  val Zero = Vector2(JVector2.Zero)

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

  override def add(x: Float, y: Float): Vector2 = {
    super.add(x, y)
    this
  }
  override def add(other: JVector2): Vector2 = {
    super.add(other)
    this
  }
  override def clamp(min: Float, max: Float): Vector2 = {
    super.clamp(min, max)
    this
  }
  override def cpy(): Vector2 = {
    Vector2(super.cpy())
  }
  override def interpolate(target: JVector2, alpha: Float, inter: Interpolation): Vector2 = {
    super.interpolate(target, alpha, inter)
    this
  }
  override def lerp(target: JVector2, alpha: Float): Vector2 = {
    super.lerp(target, alpha)
    this
  }
  override def limit(limit: Float): Vector2 = {
    super.limit(limit)
    this
  }
  override def sub(x: Float, y: Float): Vector2 = {
    super.sub(x, y)
    this
  }
  override def sub(other: JVector2): Vector2 = {
    super.sub(other)
    this
  }
  override def mul(mat: Matrix3): Vector2 = {
    super.mul(mat)
    this
  }
  override def mulAdd(vec: JVector2, scalar: Float): Vector2 = {
    super.mulAdd(vec, scalar)
    this
  }
  override def mulAdd(vec: JVector2, mulVec: JVector2): Vector2 = {
    super.mulAdd(vec, mulVec)
    this
  }
  override def nor = {
    super.nor()
    this
  }
  override def rotate(degree: Float): Vector2 = {
    super.rotate(degree)
    this
  }
  override def rotate90(dir: Int): Vector2 = {
    super.rotate90(dir)
    this
  }
  override def rotateRad(radians: Float): Vector2 = {
    super.rotateRad(radians)
    this
  }
  override def set(x: Float, y: Float): Vector2 = {
    super.set(x, y)
    this
  }
  override def set(vec: JVector2): Vector2 = {
    super.set(vec)
    this
  }
  override def setAngle(degrees: Float): Vector2 = {
    super.setAngle(degrees)
    this
  }
  override def setAngleRad(radians: Float): Vector2 = {
    super.setAngleRad(radians)
    this
  }
  override def setZero(): Vector2 = {
    super.setZero()
    this
  }
  override def scl(scalar: Float): Vector2 = {
    super.scl(scalar)
    this
  }
  override def scl(x: Float, y: Float): Vector2 = {
    super.scl(x, y)
    this
  }
  override def scl(v: JVector2): Vector2 = {
    super.scl(v)
    this
  }
}
