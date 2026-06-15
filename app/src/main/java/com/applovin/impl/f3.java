package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.h3;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class f3 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private h3 f6966a;

    /* renamed from: b  reason: collision with root package name */
    private DataSetObserver f6967b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f6968c;

    /* renamed from: d  reason: collision with root package name */
    private ListView f6969d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.impl.a f6970e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            f3.this.a();
            f3 f3Var = f3.this;
            f3Var.b((Context) f3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.c f6972a;

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class a implements d.b {
            a() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(f3.this.f6966a.s());
            }
        }

        /* renamed from: com.applovin.impl.f3$b$b  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class C0123b implements d.b {
            C0123b() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(f3.this.f6966a.s());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class c implements d.b {
            c() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(f3.this.f6966a.s());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class d implements d.b {
            d() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(f3.this.f6966a.e(), false, f3.this.f6966a.s());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class e implements d.b {
            e() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(f3.this.f6966a.j(), f3.this.f6966a.v(), f3.this.f6966a.s());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class f implements d.b {
            f() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(f3.this.f6966a.u(), f3.this.f6966a.s());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class g implements d.b {
            g() {
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(f3.this.f6966a.n(), true, f3.this.f6966a.s());
            }
        }

        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        class h implements d.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j2 f6981a;

            h(j2 j2Var) {
                this.f6981a = j2Var;
            }

            @Override // com.applovin.impl.d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((r3) this.f6981a).r());
            }
        }

        b(com.applovin.impl.c cVar) {
            this.f6972a = cVar;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            int b10 = d2Var.b();
            if (b10 == h3.e.APP_INFO.ordinal()) {
                d7.a(j2Var.c(), j2Var.b(), f3.this);
            } else if (b10 == h3.e.MAX.ordinal()) {
                if (f3.this.f6966a.a(j2Var)) {
                    com.applovin.impl.d.a(f3.this, MaxDebuggerUnifiedFlowActivity.class, this.f6972a, new a());
                } else {
                    d7.a(j2Var.c(), j2Var.b(), f3.this);
                }
            } else if (b10 == h3.e.PRIVACY.ordinal()) {
                if (d2Var.a() == h3.d.CMP.ordinal()) {
                    if (StringUtils.isValidString(f3.this.f6966a.s().j0().k())) {
                        com.applovin.impl.d.a(f3.this, MaxDebuggerTcfInfoListActivity.class, this.f6972a, new C0123b());
                    } else {
                        d7.a(j2Var.c(), j2Var.b(), f3.this);
                    }
                } else if (d2Var.a() == h3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                    com.applovin.impl.d.a(f3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f6972a, new c());
                }
            } else if (b10 == h3.e.ADS.ordinal()) {
                if (d2Var.a() == h3.b.AD_UNITS.ordinal()) {
                    if (f3.this.f6966a.e().size() > 0) {
                        com.applovin.impl.d.a(f3.this, MaxDebuggerAdUnitsListActivity.class, this.f6972a, new d());
                    } else {
                        d7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", f3.this);
                    }
                } else if (d2Var.a() == h3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (f3.this.f6966a.j().size() > 0 || f3.this.f6966a.v().size() > 0) {
                        if (f3.this.f6966a.s().k0().c()) {
                            d7.a("Restart Required", j2Var.b(), f3.this);
                            return;
                        } else {
                            com.applovin.impl.d.a(f3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f6972a, new e());
                            return;
                        }
                    }
                    d7.a("Complete Integrations", "Please complete integrations in order to access this.", f3.this);
                } else if (d2Var.a() == h3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (f3.this.f6966a.s().k0().c()) {
                        if (f3.this.f6966a.u().size() > 0) {
                            com.applovin.impl.d.a(f3.this, MaxDebuggerTestModeNetworkActivity.class, this.f6972a, new f());
                            return;
                        } else {
                            d7.a("Complete Integrations", "Please complete integrations in order to access this.", f3.this);
                            return;
                        }
                    }
                    f3.this.getSdk().k0().a();
                    d7.a("Restart Required", j2Var.b(), f3.this);
                } else if (d2Var.a() == h3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    com.applovin.impl.d.a(f3.this, MaxDebuggerAdUnitsListActivity.class, this.f6972a, new g());
                }
            } else if ((b10 == h3.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || b10 == h3.e.INCOMPLETE_NETWORKS.ordinal() || b10 == h3.e.COMPLETED_NETWORKS.ordinal()) && (j2Var instanceof r3)) {
                com.applovin.impl.d.a(f3.this, MaxDebuggerDetailActivity.class, this.f6972a, new h(j2Var));
            }
        }
    }

    private void c() {
        a();
        com.applovin.impl.a aVar = new com.applovin.impl.a(this, 50, 16842874);
        this.f6970e = aVar;
        aVar.setColor(-3355444);
        this.f6968c.addView(this.f6970e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f6968c.bringChildToFront(this.f6970e);
        this.f6970e.a();
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        h3 h3Var = this.f6966a;
        if (h3Var != null) {
            return h3Var.s();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f6968c = (FrameLayout) findViewById(16908290);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f6969d = listView;
        listView.setAdapter((ListAdapter) this.f6966a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h3 h3Var = this.f6966a;
        if (h3Var != null) {
            h3Var.unregisterDataSetObserver(this.f6967b);
            this.f6966a.a((k2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            b();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        h3 h3Var = this.f6966a;
        if (h3Var == null || h3Var.w()) {
            return;
        }
        c();
    }

    public void setListAdapter(h3 h3Var, c cVar) {
        DataSetObserver dataSetObserver;
        h3 h3Var2 = this.f6966a;
        if (h3Var2 != null && (dataSetObserver = this.f6967b) != null) {
            h3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f6966a = h3Var;
        this.f6967b = new a();
        b((Context) this);
        this.f6966a.registerDataSetObserver(this.f6967b);
        this.f6966a.a(new b(cVar));
    }

    private void b() {
        String o10 = this.f6966a.o();
        if (TextUtils.isEmpty(o10)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", o10);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.impl.a aVar = this.f6970e;
        if (aVar != null) {
            aVar.b();
            this.f6968c.removeView(this.f6970e);
            this.f6970e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        d7.a(this.f6966a.h(), this.f6966a.g(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final Context context) {
        if (!StringUtils.isValidString(this.f6966a.g()) || this.f6966a.d()) {
            return;
        }
        this.f6966a.b(true);
        runOnUiThread(new Runnable() { // from class: com.applovin.impl.ja
            @Override // java.lang.Runnable
            public final void run() {
                f3.this.a(context);
            }
        });
    }
}
