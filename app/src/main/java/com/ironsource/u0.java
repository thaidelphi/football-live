package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class u0 {

    /* renamed from: q  reason: collision with root package name */
    public static final a f20895q = new a(null);

    /* renamed from: r  reason: collision with root package name */
    public static final int f20896r = -1;

    /* renamed from: a  reason: collision with root package name */
    private final IronSource.AD_UNIT f20897a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20898b;

    /* renamed from: c  reason: collision with root package name */
    private final List<NetworkSettings> f20899c;

    /* renamed from: d  reason: collision with root package name */
    private final o5 f20900d;

    /* renamed from: e  reason: collision with root package name */
    private int f20901e;

    /* renamed from: f  reason: collision with root package name */
    private final int f20902f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20903g;

    /* renamed from: h  reason: collision with root package name */
    private final int f20904h;

    /* renamed from: i  reason: collision with root package name */
    private final int f20905i;

    /* renamed from: j  reason: collision with root package name */
    private final o2 f20906j;

    /* renamed from: k  reason: collision with root package name */
    private final i2 f20907k;

    /* renamed from: l  reason: collision with root package name */
    private final long f20908l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f20909m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f20910n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f20911o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f20912p;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.h hVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u0(IronSource.AD_UNIT adUnit, String str, List<? extends NetworkSettings> list, o5 auctionSettings, int i10, int i11, boolean z10, int i12, int i13, o2 loadingData, i2 interactionData, long j10, boolean z11, boolean z12, boolean z13, boolean z14) {
        kotlin.jvm.internal.n.f(adUnit, "adUnit");
        kotlin.jvm.internal.n.f(auctionSettings, "auctionSettings");
        kotlin.jvm.internal.n.f(loadingData, "loadingData");
        kotlin.jvm.internal.n.f(interactionData, "interactionData");
        this.f20897a = adUnit;
        this.f20898b = str;
        this.f20899c = list;
        this.f20900d = auctionSettings;
        this.f20901e = i10;
        this.f20902f = i11;
        this.f20903g = z10;
        this.f20904h = i12;
        this.f20905i = i13;
        this.f20906j = loadingData;
        this.f20907k = interactionData;
        this.f20908l = j10;
        this.f20909m = z11;
        this.f20910n = z12;
        this.f20911o = z13;
        this.f20912p = z14;
    }

    public /* synthetic */ u0(IronSource.AD_UNIT ad_unit, String str, List list, o5 o5Var, int i10, int i11, boolean z10, int i12, int i13, o2 o2Var, i2 i2Var, long j10, boolean z11, boolean z12, boolean z13, boolean z14, int i14, kotlin.jvm.internal.h hVar) {
        this(ad_unit, str, list, o5Var, i10, i11, z10, i12, i13, o2Var, i2Var, j10, z11, z12, z13, (i14 & 32768) != 0 ? false : z14);
    }

    public final int a() {
        return this.f20905i;
    }

    public final NetworkSettings a(String instanceName) {
        kotlin.jvm.internal.n.f(instanceName, "instanceName");
        List<NetworkSettings> j10 = j();
        Object obj = null;
        if (j10 != null) {
            Iterator<T> it = j10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((NetworkSettings) next).getProviderInstanceName().equals(instanceName)) {
                    obj = next;
                    break;
                }
            }
            return (NetworkSettings) obj;
        }
        return null;
    }

    public final void a(int i10) {
        this.f20901e = i10;
    }

    public final void a(boolean z10) {
        this.f20903g = z10;
    }

    public final IronSource.AD_UNIT b() {
        return this.f20897a;
    }

    public final void b(boolean z10) {
        this.f20912p = z10;
    }

    public final boolean c() {
        return this.f20903g;
    }

    public final o5 d() {
        return this.f20900d;
    }

    public final long e() {
        return this.f20908l;
    }

    public final int f() {
        return this.f20904h;
    }

    public final i2 g() {
        return this.f20907k;
    }

    public final o2 h() {
        return this.f20906j;
    }

    public final int i() {
        return this.f20901e;
    }

    public List<NetworkSettings> j() {
        return this.f20899c;
    }

    public final boolean k() {
        return this.f20909m;
    }

    public final boolean l() {
        return this.f20911o;
    }

    public final boolean m() {
        return this.f20912p;
    }

    public final int n() {
        return this.f20902f;
    }

    public String o() {
        return this.f20898b;
    }

    public final boolean p() {
        return this.f20910n;
    }

    public final boolean q() {
        return this.f20900d.g() > 0;
    }

    public final String r() {
        String format = String.format(Locale.getDefault(), "%s: %d, %s: %b, %s: %b", com.ironsource.mediationsdk.d.f18578x, Integer.valueOf(this.f20901e), com.ironsource.mediationsdk.d.f18579y, Boolean.valueOf(this.f20903g), com.ironsource.mediationsdk.d.f18580z, Boolean.valueOf(this.f20912p));
        kotlin.jvm.internal.n.e(format, "format(\n          Locale…     showPriorityEnabled)");
        return format;
    }
}
