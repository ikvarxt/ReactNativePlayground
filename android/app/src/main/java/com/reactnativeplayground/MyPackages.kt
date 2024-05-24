package com.reactnativeplayground

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager
import com.facebook.react.views.image.ReactImageManager

class MyPackages : ReactPackage {

  override fun createNativeModules(p0: ReactApplicationContext): MutableList<NativeModule> {
    return mutableListOf()
  }

  override fun createViewManagers(reactContext: ReactApplicationContext): MutableList<ViewManager<*, *>> {
    return mutableListOf(ReactImageManager(reactContext))
  }

}