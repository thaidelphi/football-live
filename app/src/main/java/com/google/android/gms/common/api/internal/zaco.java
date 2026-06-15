package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.concurrent.NumberedThreadFactory;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class zaco {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f12356a = com.google.android.gms.internal.base.zap.zaa().zaa(new NumberedThreadFactory("GAC_Transform"), 1);

    public static ExecutorService a() {
        return f12356a;
    }
}
