package io.github.meshelton.libgdxs.graphics.g2d

import io.github.meshelton.libgdxs.graphics.Color
import com.badlogic.gdx.graphics.g2d.{SpriteBatch => JSpriteBatch, Batch}
import com.badlogic.gdx.graphics.glutils.ShaderProgram
import com.badlogic.gdx.math.Matrix4


object SpriteBatch {

  def apply(): SpriteBatch = {
    new JSpriteBatch() with SpriteBatch
  }
  def apply(size: Int): SpriteBatch = {
    new JSpriteBatch(size) with SpriteBatch
  }
  def apply(size: Int, defaultShader: ShaderProgram): SpriteBatch = {
    new JSpriteBatch(size, defaultShader) with SpriteBatch
  }


}

trait SpriteBatch extends JSpriteBatch {

  override def getColor(): Color = Color(super.getColor)

  // Safe to call batch.draw(???) in here
  def render( f: => Any): Unit = {
    implicit val batch: Batch = this
    begin()
    f
    end()
  }
  def render(trans: Matrix4)(proj: Matrix4)( f: => Any): Unit = {
    setTransformMatrix(trans)
    setProjectionMatrix(proj)
    render(f)
  }
  def render(shader: ShaderProgram)(trans: Matrix4)(proj: Matrix4)( f: => Any): Unit = {
    setShader(shader)
    render(trans)(proj)(f)
  }

}
