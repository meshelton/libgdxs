package io.github.meshelton.libgdxs.graphics

import com.badlogic.gdx.graphics.{PerspectiveCamera => JPerspectiveCamera}

object PerspectiveCamera extends JPerspectiveCamera {
  def apply(): PerspectiveCamera = new PerspectiveCamera(60, 800, 800)
  def apply(fov: Float, viewWidth: Float, viewHeight: Float): PerspectiveCamera = {
    new PerspectiveCamera(fov, viewWidth, viewHeight)
  }
}

class PerspectiveCamera(fov: Float, 
                        viewWidth: Float, 
                        viewHeight: Float) extends JPerspectiveCamera(fov, 
                                                                      viewWidth, 
                                                                      viewHeight) with Camera {
}
