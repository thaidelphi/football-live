package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class rr {

    /* renamed from: a  reason: collision with root package name */
    private final String f20015a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20016b;

    /* renamed from: c  reason: collision with root package name */
    private final List<IronSource.AD_UNIT> f20017c;

    public rr(String appKey, String str, List<IronSource.AD_UNIT> legacyAdFormats) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(legacyAdFormats, "legacyAdFormats");
        this.f20015a = appKey;
        this.f20016b = str;
        this.f20017c = legacyAdFormats;
    }

    public /* synthetic */ rr(String str, String str2, List list, int i10, kotlin.jvm.internal.h hVar) {
        this(str, (i10 & 2) != 0 ? null : str2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ rr a(rr rrVar, String str, String str2, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = rrVar.f20015a;
        }
        if ((i10 & 2) != 0) {
            str2 = rrVar.f20016b;
        }
        if ((i10 & 4) != 0) {
            list = rrVar.f20017c;
        }
        return rrVar.a(str, str2, list);
    }

    public final rr a(String appKey, String str, List<IronSource.AD_UNIT> legacyAdFormats) {
        kotlin.jvm.internal.n.f(appKey, "appKey");
        kotlin.jvm.internal.n.f(legacyAdFormats, "legacyAdFormats");
        return new rr(appKey, str, legacyAdFormats);
    }

    public final String a() {
        return this.f20015a;
    }

    public final void a(List<? extends IronSource.AD_UNIT> adFormats) {
        kotlin.jvm.internal.n.f(adFormats, "adFormats");
        this.f20017c.clear();
        this.f20017c.addAll(adFormats);
    }

    public final String b() {
        return this.f20016b;
    }

    public final List<IronSource.AD_UNIT> c() {
        return this.f20017c;
    }

    public final String d() {
        return this.f20015a;
    }

    public final List<IronSource.AD_UNIT> e() {
        return this.f20017c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rr) {
            rr rrVar = (rr) obj;
            return kotlin.jvm.internal.n.a(this.f20015a, rrVar.f20015a) && kotlin.jvm.internal.n.a(this.f20016b, rrVar.f20016b) && kotlin.jvm.internal.n.a(this.f20017c, rrVar.f20017c);
        }
        return false;
    }

    public final String f() {
        return this.f20016b;
    }

    public int hashCode() {
        int hashCode = this.f20015a.hashCode() * 31;
        String str = this.f20016b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f20017c.hashCode();
    }

    public String toString() {
        return "SdkInitRequest(appKey=" + this.f20015a + ", userId=" + this.f20016b + ", legacyAdFormats=" + this.f20017c + ')';
    }
}
