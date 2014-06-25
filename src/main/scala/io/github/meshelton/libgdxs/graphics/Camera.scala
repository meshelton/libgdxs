package io.github.meshelton.libgdxs.graphics

import com.badlogic.gdx.graphics.{Camera => JCamera}
import com.badlogic.gdx.math.{Vector3 => JVector3}
import io.github.meshelton.libgdxs.math.Vector3

object Camera {
}

trait Camera extends JCamera {
  override def project(worldCoords: JVector3): Vector3 = {
    Vector3(super.project(worldCoords))
  }
  override def project(worldCoords: JVector3, 
                       viewX: Float, 
                       viewY: Float, 
                       viewWidth: Float, 
                       viewHeight: Float): Vector3 = {
    Vector3(super.project(worldCoords, viewX, viewY, viewWidth, viewHeight))
  }
  override def unproject(worldCoords: JVector3): Vector3 = {
    Vector3(super.unproject(worldCoords))
  }
  override def unproject(worldCoords: JVector3, 
                       viewX: Float, 
                       viewY: Float, 
                       viewWidth: Float, 
                       viewHeight: Float): Vector3 = {
    Vector3(super.unproject(worldCoords, viewX, viewY, viewWidth, viewHeight))
  }
  def apply() = update()
  def apply(updateFrustrum: Boolean) = update(updateFrustrum)
}
