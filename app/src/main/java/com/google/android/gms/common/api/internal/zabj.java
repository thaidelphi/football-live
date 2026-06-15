package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zabj {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f12325a = com.google.android.gms.internal.base.zap.zaa().zac(2, new NumberedThreadFactory("GAC_Executor"), 2);

    public static ExecutorService a() {
        return f12325a;
    }
}
