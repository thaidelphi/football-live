package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class fk {

    /* renamed from: a  reason: collision with root package name */
    public static final fk f17481a = new fk();

    private fk() {
    }

    public static final <T> T a(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(Object obj, String errorMessage) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static final boolean a(Object obj, String errorMessage, boolean z10) {
        kotlin.jvm.internal.n.f(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (!z10) {
            if (z10) {
                throw new i8.l();
            }
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new NullPointerException(errorMessage);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = "reference is null";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return a(obj, str, z10);
    }
}
