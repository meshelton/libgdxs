package io.github.meshelton.libgdxs.graphics.g3d

import com.badlogic.gdx.graphics.Camera
import com.badlogic.gdx.graphics.g3d.{ModelBatch => JModelBatch}
import com.badlogic.gdx.graphics.g3d.RenderableProvider

object ModelBatch {

  def apply(): ModelBatch = {
    new JModelBatch() with ModelBatch
  }
}

trait ModelBatch extends JModelBatch {
  def apply(camera: Camera)( f: => Any ): Unit = {
    begin(camera)
    f
    end()
  }
  def render(toRender: Seq[RenderableProvider]) : Unit = {
    toRender.foreach{ this.render }
  }
}
