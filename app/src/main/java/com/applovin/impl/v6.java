package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class v6 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f9469a;

    /* renamed from: b  reason: collision with root package name */
    private List f9470b;

    /* renamed from: c  reason: collision with root package name */
    private List f9471c;

    /* renamed from: d  reason: collision with root package name */
    private k2 f9472d;

    /* renamed from: e  reason: collision with root package name */
    private List f9473e;

    /* renamed from: f  reason: collision with root package name */
    private List f9474f;

    /* renamed from: g  reason: collision with root package name */
    private ListView f9475g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {
        a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.k2
        protected j2 a() {
            return new j2.b(j2.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            return i10 == c.BIDDERS.ordinal() ? v6.this.f9473e : v6.this.f9474f;
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            return i10 == c.BIDDERS.ordinal() ? v6.this.f9473e.size() : v6.this.f9474f.size();
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            if (i10 == c.BIDDERS.ordinal()) {
                return new m4("BIDDERS");
            }
            return new m4("WATERFALL");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b extends r3 {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ m2 f9477p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(y2 y2Var, Context context, m2 m2Var) {
            super(y2Var, context);
            this.f9477p = m2Var;
        }

        @Override // com.applovin.impl.r3, com.applovin.impl.j2
        public int d() {
            if (v6.this.f9469a.k0().b() == null || !v6.this.f9469a.k0().b().equals(this.f9477p.b())) {
                return 0;
            }
            return R.drawable.applovin_ic_check_mark_borderless;
        }

        @Override // com.applovin.impl.r3, com.applovin.impl.j2
        public int e() {
            if (v6.this.f9469a.k0().b() == null || !v6.this.f9469a.k0().b().equals(this.f9477p.b())) {
                return super.e();
            }
            return -16776961;
        }

        @Override // com.applovin.impl.j2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f9477p.a(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public v6() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f9469a;
    }

    public void initialize(List<m2> list, List<m2> list2, final com.applovin.impl.sdk.j jVar) {
        this.f9469a = jVar;
        this.f9470b = list;
        this.f9471c = list2;
        this.f9473e = a(list);
        this.f9474f = a(list2);
        a aVar = new a(this);
        this.f9472d = aVar;
        aVar.a(new k2.a() { // from class: com.applovin.impl.if
            @Override // com.applovin.impl.k2.a
            public final void a(d2 d2Var, j2 j2Var) {
                v6.this.a(jVar, d2Var, j2Var);
            }
        });
        this.f9472d.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9475g = listView;
        listView.setAdapter((ListAdapter) this.f9472d);
    }

    @Override // com.applovin.impl.g3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f9473e = a(this.f9470b);
        this.f9474f = a(this.f9471c);
        this.f9472d.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.j jVar, d2 d2Var, j2 j2Var) {
        List b10 = a(d2Var).b();
        if (b10.equals(jVar.k0().b())) {
            jVar.k0().a((List) null);
        } else {
            jVar.k0().a(b10);
        }
        this.f9472d.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m2 m2Var = (m2) it.next();
            arrayList.add(new b(m2Var.d(), this, m2Var));
        }
        return arrayList;
    }

    private m2 a(d2 d2Var) {
        if (d2Var.b() == c.BIDDERS.ordinal()) {
            return (m2) this.f9470b.get(d2Var.a());
        }
        return (m2) this.f9471c.get(d2Var.a());
    }
}
