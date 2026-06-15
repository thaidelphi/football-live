package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.s6;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class i0 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f7185a;

    /* renamed from: b  reason: collision with root package name */
    private k2 f7186b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f7187e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f7188f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ List f7189g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List f7190h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ List f7191i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f7187e = list;
            this.f7188f = list2;
            this.f7189g = list3;
            this.f7190h = list4;
            this.f7191i = list5;
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            List<s6> list;
            boolean z10 = true;
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f7187e;
            } else if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f7188f;
            } else {
                if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.f7189g;
                } else if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.f7190h;
                } else {
                    list = this.f7191i;
                }
                z10 = false;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (s6 s6Var : list) {
                arrayList.add(i0.this.a(s6Var, z10));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f7187e.size();
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.f7188f.size();
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.f7189g.size();
            }
            if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                return this.f7190h.size();
            }
            return this.f7191i.size();
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            if (i10 == c.MISSING_TC_NETWORKS.ordinal()) {
                return new m4("MISSING TCF VENDORS (TC STRING)");
            }
            if (i10 == c.MISSING_AC_NETWORKS.ordinal()) {
                return new m4("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i10 == c.LISTED_TC_NETWORKS.ordinal()) {
                return new m4("LISTED TCF VENDORS (TC STRING)");
            }
            if (i10 == c.LISTED_AC_NETWORKS.ordinal()) {
                return new m4("LISTED ATP NETWORKS (AC STRING)");
            }
            return new m4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements k2.a {
        b() {
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            d7.a(j2Var.c(), j2Var.b(), i0.this);
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f7185a;
    }

    public void initialize(List<s6> list, List<s6> list2, List<s6> list3, List<s6> list4, List<s6> list5, com.applovin.impl.sdk.j jVar) {
        this.f7185a = jVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f7186b = aVar;
        aVar.a(new b());
        this.f7186b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f7186b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 a(s6 s6Var, boolean z10) {
        j2.b a10 = j2.a();
        boolean b10 = this.f7185a.j0().b();
        s6.a f10 = s6Var.f();
        s6.a aVar = s6.a.TCF_VENDOR;
        if (f10 != aVar && (s6Var.f() != s6.a.ATP_NETWORK || !b10)) {
            a10.d(s6Var.b());
        } else {
            String c10 = s6Var.c();
            String str = s6Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            j2.b b11 = a10.d(c10).d(z10 ? -65536 : -16777216).b(c10);
            b11.a(str + s6Var.d()).a(true);
        }
        return a10.a();
    }
}
