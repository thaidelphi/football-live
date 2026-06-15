package com.ironsource;

import com.ironsource.m3;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class k3 implements l3 {

    /* renamed from: a  reason: collision with root package name */
    private final String f18010a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18011b;

    /* renamed from: c  reason: collision with root package name */
    private final IronSource.AD_UNIT f18012c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18013d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18014e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f18015f;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f18016a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final int f18017b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f18018c = 1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f18019d = 1;

        private a() {
        }
    }

    public k3(String version, String instanceId, IronSource.AD_UNIT adFormat, boolean z10, boolean z11, boolean z12) {
        kotlin.jvm.internal.n.f(version, "version");
        kotlin.jvm.internal.n.f(instanceId, "instanceId");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f18010a = version;
        this.f18011b = instanceId;
        this.f18012c = adFormat;
        this.f18013d = z10;
        this.f18014e = z11;
        this.f18015f = z12;
    }

    public /* synthetic */ k3(String str, String str2, IronSource.AD_UNIT ad_unit, boolean z10, boolean z11, boolean z12, int i10, kotlin.jvm.internal.h hVar) {
        this(str, str2, ad_unit, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? true : z12);
    }

    @Override // com.ironsource.l3
    public ArrayList<n3> a() {
        ArrayList<n3> arrayList = new ArrayList<>();
        arrayList.add(new m3.v(this.f18010a));
        arrayList.add(new m3.x(this.f18011b));
        arrayList.add(new m3.a(this.f18012c));
        if (this.f18013d) {
            arrayList.add(new m3.p(1));
        }
        if (this.f18014e) {
            arrayList.add(new m3.e(1));
        }
        if (this.f18015f) {
            arrayList.add(new m3.o(1));
        }
        return arrayList;
    }
}
