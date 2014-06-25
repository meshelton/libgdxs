package io.github.meshelton.libgdxs.graphics.g2d

import io.github.meshelton.libgdxs.graphics.Color
import com.badlogic.gdx.graphics.g2d.{TextureRegion, Batch, Sprite => JSprite}
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.glutils.ShaderProgram
import com.badlogic.gdx.math.Matrix4


object Sprite {

  def apply(): Sprite = {
    new JSprite() with Sprite
  }
  def apply(sprite: JSprite): Sprite = {
    new JSprite(sprite) with Sprite
  }
  def apply(texture: Texture): Sprite = {
    new JSprite(texture) with Sprite
  }
  def apply(texture: Texture, srcWidth: Int, srcHeight: Int): Sprite = {
    new JSprite(texture, srcWidth, srcHeight) with Sprite
  }
  def apply(texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int): Sprite = {
    new JSprite(texture, srcX, srcY, srcWidth, srcHeight) with Sprite
  }
  def apply(region: TextureRegion): Sprite = {
    new JSprite(region) with Sprite
  }
  def apply(region: TextureRegion, 
            srcX: Int, 
            srcY: Int, 
            srcWidth: Int, 
            srcHeight: Int): Sprite = {
    new JSprite(region, srcX, srcY, srcWidth, srcHeight) with Sprite
  }

}

trait Sprite extends JSprite {

  def render(implicit batch: Batch): Unit = {
    draw(batch)
  }

  def render(alphaModulation: Float)(implicit batch: Batch): Unit = {
    draw(batch, alphaModulation)
  }

  override def getColor(): Color = Color(super.getColor)

}
