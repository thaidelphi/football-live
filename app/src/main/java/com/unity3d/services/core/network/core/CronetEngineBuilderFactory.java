package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.jvm.internal.n;
import org.chromium.net.CronetEngine;
/* compiled from: CronetEngineBuilderFactory.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class CronetEngineBuilderFactory {
    public final CronetEngine.Builder createCronetEngineBuilder(Context context) {
        n.f(context, "context");
        return new CronetEngine.Builder(context);
    }
}
