package com.renatoarg.rxexamples

import android.net.Uri
import androidx.navigation.NavController
import androidx.navigation.NavDirections

/*
 * Prevents crash if there are multiple navigate calls dispatched, eg on user click
 * @param currentDestinationId the id of current destination which we navigate from
 * @param directions the directions we want to navigate to
 * @return Boolean if navigation was successful
 */
fun NavController.safeNavigate(currentDestinationId: Int, directions: NavDirections): Boolean {
    if (currentDestination == null || currentDestination!!.id == currentDestinationId) {
        navigate(directions)
        return true
    }

    return false
}

/*
 * Prevents crash if there are multiple navigate calls dispatched, eg on user click
 * @param currentDestinationId the id of current destination which we navigate from
 * @param resId the id of navigate action
 * @return Boolean if navigation was successful
 */
fun NavController.safeNavigate(currentDestinationId: Int, resId: Int): Boolean {
    if (currentDestination == null || currentDestination!!.id == currentDestinationId) {
        navigate(resId)
        return true
    }

    return false
}

/*
 * Prevents crash if there are multiple navigate calls dispatched, eg on user click
 * @param currentDestinationId the id of current destination which we navigate from
 * @param deepLink the id uri to navigate to
 * @return Boolean if navigation was successful
 */
fun NavController.safeNavigate(currentDestinationId: Int, deepLink: Uri): Boolean {
    if (currentDestination == null || currentDestination!!.id == currentDestinationId) {
        navigate(deepLink)
        return true
    }

    return false
}

/*
 * Prevents crash if there are multiple navigate calls dispatched, eg on user click
 * @param currentDestinationId the id of current destination which we navigate from
 * @return Boolean if navigation was successful
 */
fun NavController.safeNavigateUp(currentDestinationId: Int): Boolean {
    if (currentDestination == null || currentDestination!!.id == currentDestinationId) {
        navigateUp()
        return true
    }

    return false
}
