package com.apkfuns.jsbridgesample;

import android.widget.Toast;

import com.apkfuns.jsbridge.JBCallback;
import com.apkfuns.jsbridge.JSBridgeMethod;
import com.apkfuns.jsbridge.JsModule;

/**
 * Created by pengwei on 2017/5/27.
 */

public class ShareModule extends JsModule {
    @Override
    public String getModuleName() {
        return "share";
    }

    @JSBridgeMethod
    public void share(int platform, String msg, JBCallback success, JBCallback failure) {
        Toast.makeText(getContext(), "abc", Toast.LENGTH_SHORT).show();
    }

    @JSBridgeMethod
    public int version() {
        return 10;
    }
}
