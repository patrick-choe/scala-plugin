package com.github.patrick.scala

import org.bukkit.plugin.java.JavaPlugin

class ScalaPlugin extends JavaPlugin {
  override def onEnable(): Unit = {
    getLogger.info("Scala library loaded")
  }
}
