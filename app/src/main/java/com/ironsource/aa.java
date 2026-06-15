package com.ironsource;

import android.content.Context;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class aa implements mf {

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16280a;

        static {
            int[] iArr = new int[w9.values().length];
            try {
                iArr[w9.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w9.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w9.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w9.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16280a = iArr;
        }
    }

    @Override // com.ironsource.mf
    public ca a(Context context, w9 source) {
        z9 z9Var;
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(source, "source");
        int i10 = a.f16280a[source.ordinal()];
        if (i10 == 1) {
            z9Var = new z9(context, "supersonic_shared_preferen");
        } else if (i10 == 2) {
            z9Var = new z9(context, "unityads-installinfo");
        } else if (i10 != 3) {
            if (i10 == 4) {
                return null;
            }
            throw new i8.l();
        } else {
            z9Var = new z9(context, ba.f16737c);
        }
        return z9Var;
    }
}
