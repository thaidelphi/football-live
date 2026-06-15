package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class gs implements yh {
    @Override // com.ironsource.yh
    public void a(Context context, String key, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        IronSourceUtils.saveIntToSharedPrefs(context, key, i10);
    }

    @Override // com.ironsource.yh
    public void a(Context context, String key, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        IronSourceUtils.saveLongToSharedPrefs(context, key, j10);
    }

    @Override // com.ironsource.yh
    public int b(Context context, String key, int i10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        return IronSourceUtils.getIntFromSharedPrefs(context, key, i10);
    }

    @Override // com.ironsource.yh
    public long b(Context context, String key, long j10) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(key, "key");
        return IronSourceUtils.getLongFromSharedPrefs(context, key, j10);
    }
}
