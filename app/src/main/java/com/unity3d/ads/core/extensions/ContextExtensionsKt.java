package com.unity3d.ads.core.extensions;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import kotlin.jvm.internal.n;
/* compiled from: ContextExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class ContextExtensionsKt {
    public static final File unityAdsDataStoreFile(Context context, String fileName) {
        n.f(context, "<this>");
        n.f(fileName, "fileName");
        File filesDir = context.getApplicationContext().getFilesDir();
        return new File(filesDir, UnityAdsConstants.Cache.DATASTORE_PATH + fileName);
    }
}
