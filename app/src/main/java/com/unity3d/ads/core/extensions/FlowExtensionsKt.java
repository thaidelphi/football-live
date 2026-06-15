package com.unity3d.ads.core.extensions;

import g9.e;
import g9.g;
import i8.w;
import kotlin.jvm.internal.n;
import m8.d;
import t8.a;
import t8.p;
/* compiled from: FlowExtensions.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes3.dex */
public final class FlowExtensionsKt {
    public static final <T> e<T> timeoutAfter(e<? extends T> eVar, long j10, boolean z10, p<? super a<w>, ? super d<? super w>, ? extends Object> block) {
        n.f(eVar, "<this>");
        n.f(block, "block");
        return g.h(new FlowExtensionsKt$timeoutAfter$1(j10, z10, block, eVar, null));
    }

    public static /* synthetic */ e timeoutAfter$default(e eVar, long j10, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return timeoutAfter(eVar, j10, z10, pVar);
    }
}
