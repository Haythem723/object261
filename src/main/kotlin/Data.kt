package net.diyigemt.mpu

import kotlinx.serialization.Serializable
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.util.SemVersion

/**
 *@Author hjn
 *@Create 2022/11/19
 */
@Serializable
internal data class PropertyData(
    val name: String,
    val version: SemVersion,
    //val historyVersion: List<SemVersion>
)

@Serializable
data class APIData(
    val downloadURL: String,
    val version: SemVersion,
    val description: String
)

internal data class UpdaterData(
    val downloadUrl: String,
    val description: JvmPluginDescription
)