package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.s6;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class o6 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f8277a;

    /* renamed from: b  reason: collision with root package name */
    private k2 f8278b;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ArrayList f8279e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ArrayList f8280f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f8281g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z10) {
            super(context);
            this.f8279e = arrayList;
            this.f8280f = arrayList2;
            this.f8281g = z10;
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return this.f8279e;
            }
            return this.f8280f;
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return this.f8279e.size();
            }
            return this.f8280f.size();
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            if (i10 == b.TC_NETWORKS.ordinal()) {
                return new m4("TCF VENDORS (TC STRING)");
            }
            return new m4(this.f8281g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private j2 a(String str, String str2) {
        return j2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f8277a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f8277a = jVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a10 = m0.b().a(this);
        boolean b10 = jVar.j0().b();
        if (!b10) {
            arrayList2.add(a("Has User Consent", a10));
        }
        for (s6 s6Var : jVar.j0().i()) {
            Boolean a11 = s6Var.a();
            if (a11 != null) {
                if (s6Var.f() == s6.a.TCF_VENDOR) {
                    arrayList.add(a(s6Var.b(), String.valueOf(a11)));
                } else if (s6Var.f() == s6.a.ATP_NETWORK) {
                    arrayList2.add(a(s6Var.b(), String.valueOf(a11)));
                }
            } else if (b10 && s6Var.f() == s6.a.ATP_NETWORK) {
                arrayList2.add(a(s6Var.b(), a10));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b10);
        this.f8278b = aVar;
        aVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f8278b);
    }
}
