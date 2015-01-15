package io.github.meshelton.libgdxs.scenes.scene2d.utils

import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener.ChangeEvent
import com.badlogic.gdx.scenes.scene2d.Actor
import scala.language.implicitConversions

object Implicits {
  implicit def blockToChangeListener(f: => Unit): ChangeListener = {
    new ChangeListener(){
      def changed(event: ChangeEvent, actor: Actor): Unit = {
        f
      }
    }
  }
  implicit def blockParamToChangeListener(f: (ChangeEvent, Actor) => Any): ChangeListener = {
    new ChangeListener(){
      def changed(event: ChangeEvent, actor: Actor): Unit = {
        f(event, actor)
      }
    }
  }
  implicit def blockParam1ToChangeListener(f: (ChangeEvent) => Any): ChangeListener = {
    new ChangeListener(){
      def changed(event: ChangeEvent, actor: Actor): Unit = {
        f(event)
      }
    }
  }
  implicit def blockParam2ToChangeListener(f: (Actor) => Any): ChangeListener = {
    new ChangeListener(){
      def changed(event: ChangeEvent, actor: Actor): Unit = {
        f(actor)
      }
    }
  }
}
