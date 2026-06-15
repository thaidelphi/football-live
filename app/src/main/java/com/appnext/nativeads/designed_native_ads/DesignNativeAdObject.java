package com.appnext.nativeads.designed_native_ads;

import android.content.Context;
import com.appnext.nativeads.NativeAdObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class DesignNativeAdObject extends NativeAdObject {
    public static final String AUID = "950";

    public DesignNativeAdObject(Context context, String str) {
        super(context, str);
    }

    @Override // com.appnext.nativeads.NativeAdObject, com.appnext.core.Ad
    public String getAUID() {
        return AUID;
    }
}
