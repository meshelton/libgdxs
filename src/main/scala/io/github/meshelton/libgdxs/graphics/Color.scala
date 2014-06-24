package io.github.meshelton.libgdxscala.graphics

import com.badlogic.gdx.graphics.{Color => JColor}

object Color extends JColor {
  def apply(): Color = new Color(0, 0, 0, 0)
  def apply(color: JColor): Color = new Color(color.r, color.g, color.b, color.a)
  def apply(r: Float, g: Float, b: Float, a: Float): Color = new Color(r, g, b, a)
  def apply(rgba8888: Int): Color = {
    val color = Color()
    JColor.rgba8888ToColor(color, rgba8888)
    color
  }
  def valueOf(hex: String): Color = {
    Color(JColor.valueOf(hex))
  }
}

class Color(r: Float, g: Float, b: Float, a: Float) extends JColor(r, g, b, a){
  override def add(color: JColor): Color = {
    super.add(color)
    this
  }
  override def add(r: Float, g: Float, b: Float, a: Float): Color = {
    super.add(r, g, b, a)
    this
  }
  override def clamp(): Color = {
    super.clamp()
    this
  }
  override def cpy(): Color = {
    Color(super.cpy())
  }
  override def sub(color: JColor): Color = {
    super.sub(color)
    this
  }
  override def sub(r: Float, g: Float, b: Float, a: Float): Color = {
    super.sub(r, g, b, a)
    this
  }
  override def mul(color: JColor): Color = {
    super.mul(color)
    this
  }
  override def mul(r: Float, g: Float, b: Float, a: Float): Color = {
    super.mul(r, g, b, a)
    this
  }
  override def mul(values: Float): Color = {
    super.mul(values)
    this
  }
  override def lerp(target: JColor, t: Float): Color = {
    super.lerp(target, t)
    this
  }
  override def lerp(r: Float, g: Float, b: Float, a: Float, t: Float): Color = {
    super.lerp(r, g, b, a, t)
    this
  }
  override def premultiplyAlpha(): Color = {
    super.premultiplyAlpha()
    this
  }
  override def set(color: JColor): Color = {
    super.set(color)
    this
  }
  override def set(r: Float, g: Float, b: Float, a: Float): Color = {
    super.set(r, g, b, a)
    this
  }
  override def set(rgba: Int): Color = {
    super.set(rgba)
    this
  }
  override def tmp(): Color = {
    Color(super.tmp())
  }
  def +(color: JColor): Color = add(color) 
  def +(r: Float, g: Float, b: Float, a: Float): Color = add(r, g, b, a) 
  def +(values: Float) = add(values, values, values, values)
  def -(color: JColor): Color = sub(color) 
  def -(r: Float, g: Float, b: Float, a: Float): Color = sub(r, g, b, a) 
  def -(values: Float) = sub(values, values, values, values)
  def *(color: JColor): Color = mul(color) 
  def *(r: Float, g: Float, b: Float, a: Float): Color = 
    mul(r, g, b, a) 
  def *(values: Float): Color = mul(values) 
}
