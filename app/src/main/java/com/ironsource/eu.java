package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class eu {

    /* renamed from: a  reason: collision with root package name */
    private final String f17328a;

    /* renamed from: b  reason: collision with root package name */
    private final String f17329b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f17330c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f17331d;

    public eu(String str, boolean z10, Boolean bool, String str2) {
        this.f17328a = str2;
        this.f17329b = str;
        this.f17330c = z10;
        this.f17331d = bool;
    }

    public /* synthetic */ eu(String str, boolean z10, Boolean bool, String str2, int i10, kotlin.jvm.internal.h hVar) {
        this(str, z10, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? null : str2);
    }

    public final String a() {
        return this.f17328a;
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.AD_UNIT adUnit) {
        kotlin.jvm.internal.n.f(networkSettings, "networkSettings");
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        String str = this.f17329b;
        if (str == null || str.length() == 0) {
            return true;
        }
        lu luVar = lu.f18358a;
        return kotlin.jvm.internal.n.a(luVar.a(networkSettings), this.f17329b) && luVar.a(networkSettings, adUnit) == this.f17330c;
    }

    public final boolean b() {
        return kotlin.jvm.internal.n.a(this.f17331d, Boolean.TRUE);
    }
}
