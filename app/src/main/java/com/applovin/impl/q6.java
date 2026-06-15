package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class q6 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f8467a;

    /* renamed from: b  reason: collision with root package name */
    private k2 f8468b;

    /* renamed from: c  reason: collision with root package name */
    private final List f8469c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final List f8470d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private final List f8471e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final List f8472f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List f8473g = new ArrayList();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            return i10 == e.IAB_TCF_PARAMETERS.ordinal() ? q6.this.c() : q6.this.a();
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            if (i10 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return d.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            if (i10 == e.IAB_TCF_PARAMETERS.ordinal()) {
                return new m4("IAB TCF Parameters");
            }
            return new m4("CMP CONFIGURATION");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r6 f8475a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f8476b;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f8478a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f8479b;

            a(String str, String str2) {
                this.f8478a = str;
                this.f8479b = str2;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f8478a, this.f8479b, b.this.f8476b);
            }
        }

        /* renamed from: com.applovin.impl.q6$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0132b implements d.b {
            C0132b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(q6.this.f8471e, q6.this.f8472f, q6.this.f8469c, q6.this.f8470d, q6.this.f8473g, b.this.f8476b);
            }
        }

        b(r6 r6Var, com.applovin.impl.sdk.j jVar) {
            this.f8475a = r6Var;
            this.f8476b = jVar;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            String a10;
            String c10;
            if (d2Var.b() == e.IAB_TCF_PARAMETERS.ordinal()) {
                if (d2Var.a() == d.TC_STRING.ordinal()) {
                    a10 = q4.f8456s.a();
                    c10 = this.f8475a.k();
                } else {
                    a10 = q4.f8457t.a();
                    c10 = this.f8475a.c();
                }
                com.applovin.impl.d.a(q6.this, MaxDebuggerTcfStringActivity.class, this.f8476b.e(), new a(a10, c10));
            } else if (d2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                com.applovin.impl.d.a(q6.this, MaxDebuggerCmpNetworksListActivity.class, this.f8476b.e(), new C0132b());
            } else {
                d7.a(j2Var.c(), j2Var.b(), q6.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    private enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f8467a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.f8467a = jVar;
        r6 j02 = jVar.j0();
        a(j02.i());
        a aVar = new a(this);
        this.f8468b = aVar;
        aVar.a(new b(j02, jVar));
        this.f8468b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f8468b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k2 k2Var = this.f8468b;
        if (k2Var != null) {
            k2Var.a((k2.a) null);
        }
    }

    private void a(List list) {
        boolean b10 = this.f8467a.j0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            s6 s6Var = (s6) it.next();
            if (s6Var.f() == s6.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(s6Var.a())) {
                    a(s6Var, this.f8469c);
                } else {
                    a(s6Var, this.f8471e);
                }
            } else if (s6Var.f() != s6.a.ATP_NETWORK) {
                this.f8473g.add(s6Var);
            } else if (b10) {
                if (Boolean.TRUE.equals(s6Var.a())) {
                    a(s6Var, this.f8470d);
                } else {
                    a(s6Var, this.f8472f);
                }
            } else {
                this.f8473g.add(s6Var);
            }
        }
    }

    private j2 b() {
        j2.b a10;
        String a11 = q4.f8453p.a();
        Integer e8 = this.f8467a.j0().e();
        if (StringUtils.isValidString(this.f8467a.j0().d())) {
            a10 = j2.a(j2.c.RIGHT_DETAIL);
        } else {
            j2.b b10 = j2.a(j2.c.DETAIL).b("Unknown CMP SDK ID");
            a10 = b10.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a11 + " is " + e8 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(j0.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        a10.d(a11);
        a10.c(e8 != null ? e8.toString() : "No value set");
        a10.c(e8 != null ? -16777216 : -65536);
        return a10.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g10 = this.f8467a.j0().g();
        String k10 = this.f8467a.j0().k();
        String c10 = this.f8467a.j0().c();
        arrayList.add(a(q4.f8455r.a(), g10));
        arrayList.add(a(q4.f8456s.a(), k10, !u6.b(k10)));
        arrayList.add(a(q4.f8457t.a(), c10, false));
        return arrayList;
    }

    private void a(s6 s6Var, List list) {
        if (s6Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (s6Var.d().equals(((s6) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(s6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f8471e.size() + this.f8472f.size();
        arrayList.add(b());
        arrayList.add(a(q4.f8454q.a(), this.f8467a.j0().f()));
        arrayList.add(j2.a(j2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        j2.b d10 = j2.a(j2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = "Missing " + size + " network(s)";
        } else {
            str = "";
        }
        arrayList.add(d10.c(str).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private j2 a(String str, Integer num) {
        return j2.a(j2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private j2 a(String str, String str2, boolean z10) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        j2.b d10 = j2.a(j2.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        j2.b a10 = d10.c(str2).c(z10 ? -65536 : -16777216).a(isValidString);
        if (isValidString) {
            a10.a(this);
        }
        return a10.a();
    }
}
