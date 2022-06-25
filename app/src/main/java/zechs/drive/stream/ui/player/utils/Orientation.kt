package zechs.drive.stream.ui.player.utils

import android.app.Activity
import android.content.pm.ActivityInfo.*

enum class Orientation(
    val value: Int
) {
    LANDSCAPE(0),
    PORTRAIT(1);
}

fun setOrientation(activity: Activity, orientation: Orientation?) {
    activity.requestedOrientation = when (orientation) {
        Orientation.LANDSCAPE -> SCREEN_ORIENTATION_LANDSCAPE
        Orientation.PORTRAIT -> SCREEN_ORIENTATION_PORTRAIT
        else -> SCREEN_ORIENTATION_FULL_SENSOR
    }
}


fun getNextOrientation(orientation: Orientation?): Orientation {
    return when (orientation) {
        Orientation.LANDSCAPE -> Orientation.PORTRAIT
        Orientation.PORTRAIT -> Orientation.LANDSCAPE
        else -> Orientation.LANDSCAPE
    }
}