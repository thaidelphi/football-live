package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import d9.k;
import d9.p0;
import g9.l0;
import g9.w;
import kotlin.jvm.internal.n;
/* compiled from: AndroidLifecycleDataSource.kt */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, m {
    private final w<Boolean> appActive = l0.a(Boolean.TRUE);

    /* compiled from: AndroidLifecycleDataSource.kt */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidLifecycleDataSource() {
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        k.d(p0.b(), null, null, new AndroidLifecycleDataSource$registerAppLifecycle$1(this, null), 3, null);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return this.appActive.getValue().booleanValue();
    }

    @Override // androidx.lifecycle.m
    public void onStateChanged(p source, i.a event) {
        n.f(source, "source");
        n.f(event, "event");
        w<Boolean> wVar = this.appActive;
        int i10 = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean z10 = true;
        if (i10 == 1) {
            z10 = false;
        } else if (i10 != 2) {
            z10 = this.appActive.getValue().booleanValue();
        }
        wVar.setValue(Boolean.valueOf(z10));
    }
}
