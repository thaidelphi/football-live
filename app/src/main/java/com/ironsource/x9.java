package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class x9 implements di, ci {

    /* renamed from: a  reason: collision with root package name */
    private final mf f21387a;

    public x9() {
        this(null, 1, null);
    }

    public x9(mf sharedSignalsStorageFactory) {
        kotlin.jvm.internal.n.f(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.f21387a = sharedSignalsStorageFactory;
    }

    public /* synthetic */ x9(mf mfVar, int i10, kotlin.jvm.internal.h hVar) {
        this((i10 & 1) != 0 ? new aa() : mfVar);
    }

    @Override // com.ironsource.di
    public String a(Context context, w9 source, String key) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(key, "key");
        ca a10 = this.f21387a.a(context, source);
        if (a10 != null) {
            return ax.a(a10, key, null, 2, null);
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.error("Shared storage does not exist for source: " + source);
        return null;
    }

    @Override // com.ironsource.ci
    public void a(Context context, w9 source, String key, String value) {
        i8.w wVar;
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(source, "source");
        kotlin.jvm.internal.n.f(key, "key");
        kotlin.jvm.internal.n.f(value, "value");
        ca a10 = this.f21387a.a(context, source);
        if (a10 != null) {
            a10.a(key, value);
            wVar = i8.w.f26638a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Shared storage does not exist for source: " + source);
        }
    }
}
