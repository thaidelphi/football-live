package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.j2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class a3 extends k2 {

    /* renamed from: e  reason: collision with root package name */
    private final y2 f6485e;

    /* renamed from: f  reason: collision with root package name */
    private List f6486f;

    /* renamed from: g  reason: collision with root package name */
    private final List f6487g;

    /* renamed from: h  reason: collision with root package name */
    private final List f6488h;

    /* renamed from: i  reason: collision with root package name */
    private final List f6489i;

    /* renamed from: j  reason: collision with root package name */
    private final List f6490j;

    /* renamed from: k  reason: collision with root package name */
    private SpannedString f6491k;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a3(y2 y2Var, Context context) {
        super(context);
        this.f6485e = y2Var;
        if (y2Var.q() == y2.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f6491k = new SpannedString(spannableString);
        } else {
            this.f6491k = new SpannedString("");
        }
        this.f6486f = g();
        this.f6487g = b(y2Var.n());
        this.f6488h = e();
        this.f6489i = a(y2Var.f());
        this.f6490j = j();
        notifyDataSetChanged();
    }

    private j2 f() {
        if (this.f6485e.H()) {
            return null;
        }
        return j2.a().d("Initialization Status").c(f(this.f6485e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private j2 i() {
        j2.b c10 = j2.a().d("SDK").c(this.f6485e.p());
        if (TextUtils.isEmpty(this.f6485e.p())) {
            c10.a(a(this.f6485e.F())).b(b(this.f6485e.F()));
        }
        return c10.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f6485e.v())) {
            arrayList.add(j2.a(j2.c.DETAIL).d(this.f6485e.v()).a());
        }
        if (this.f6485e.y() == y2.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f6485e.s() != null) {
            arrayList.add(c(this.f6485e.s()));
        }
        arrayList.add(a(this.f6485e.y()));
        return arrayList;
    }

    public boolean a(d2 d2Var) {
        return d2Var.b() == a.TEST_ADS.ordinal() && d2Var.a() == this.f6490j.size() - 1;
    }

    @Override // com.applovin.impl.k2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.k2
    protected List c(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f6486f;
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f6487g;
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f6488h;
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f6489i;
        }
        return this.f6490j;
    }

    @Override // com.applovin.impl.k2
    protected int d(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return this.f6486f.size();
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return this.f6487g.size();
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return this.f6488h.size();
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return this.f6489i.size();
        }
        return this.f6490j.size();
    }

    @Override // com.applovin.impl.k2
    protected j2 e(int i10) {
        if (i10 == a.INTEGRATIONS.ordinal()) {
            return new m4("INTEGRATIONS");
        }
        if (i10 == a.PERMISSIONS.ordinal()) {
            return new m4("PERMISSIONS");
        }
        if (i10 == a.CONFIGURATION.ordinal()) {
            return new m4("CONFIGURATION");
        }
        if (i10 == a.DEPENDENCIES.ordinal()) {
            return new m4("DEPENDENCIES");
        }
        return new m4("TEST ADS");
    }

    public y2 h() {
        return this.f6485e;
    }

    public void k() {
        this.f6486f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e1 e1Var = (e1) it.next();
                arrayList.add(a(e1Var.b(), e1Var.a(), e1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f4 f4Var = (f4) it.next();
                arrayList.add(a(f4Var.b(), f4Var.a(), f4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i10) {
        return (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() == i10 || MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() == i10 || MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() == i10) ? "Initialized" : MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10 ? "Failure" : MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10 ? "Initializing..." : "Not Initialized";
    }

    private j2 a(y2.b bVar) {
        j2.b a10 = j2.a();
        if (bVar == y2.b.READY) {
            a10.a(this.f7386a);
        }
        return a10.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        return j0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f7386a);
    }

    private j2 c(List list) {
        return j2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private j2 d() {
        j2.b c10 = j2.a().d("Adapter").c(this.f6485e.c());
        if (TextUtils.isEmpty(this.f6485e.c())) {
            c10.a(a(this.f6485e.A())).b(b(this.f6485e.A()));
        }
        return c10.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f6485e.E()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.j.w0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        return j0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f7386a);
    }

    private j2 a(String str, String str2, boolean z10, boolean z11) {
        return j2.a(z10 ? j2.c.RIGHT_DETAIL : j2.c.DETAIL).d(str).a(z10 ? null : this.f6491k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? j0.a(R.color.applovin_sdk_checkmarkColor, this.f7386a) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
