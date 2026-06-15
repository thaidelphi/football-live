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
public abstract class w6 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f9519a;

    /* renamed from: b  reason: collision with root package name */
    private List f9520b;

    /* renamed from: c  reason: collision with root package name */
    private k2 f9521c;

    /* renamed from: d  reason: collision with root package name */
    private List f9522d;

    /* renamed from: e  reason: collision with root package name */
    private ListView f9523e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f9524e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f9524e = list;
        }

        @Override // com.applovin.impl.k2
        protected j2 a() {
            return new j2.b(j2.c.SECTION_CENTERED).d("Select a network to load test ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            return w6.this.f9522d;
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            return this.f9524e.size();
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            return new m4("TEST MODE NETWORKS");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class b implements k2.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f9526a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.j f9527b;

        b(List list, com.applovin.impl.sdk.j jVar) {
            this.f9526a = list;
            this.f9527b = jVar;
        }

        @Override // com.applovin.impl.k2.a
        public void a(d2 d2Var, j2 j2Var) {
            List u10 = ((y2) this.f9526a.get(d2Var.a())).u();
            if (u10.equals(this.f9527b.k0().b())) {
                this.f9527b.k0().a((List) null);
            } else {
                this.f9527b.k0().a(u10);
            }
            w6.this.f9521c.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c extends r3 {

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ y2 f9529p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(y2 y2Var, Context context, y2 y2Var2) {
            super(y2Var, context);
            this.f9529p = y2Var2;
        }

        @Override // com.applovin.impl.r3, com.applovin.impl.j2
        public int d() {
            if (this.f9529p.u().equals(w6.this.f9519a.k0().b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.r3, com.applovin.impl.j2
        public int e() {
            if (this.f9529p.u().equals(w6.this.f9519a.k0().b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.j2
        public SpannedString k() {
            return StringUtils.createSpannedString(this.f9529p.g(), o() ? -16777216 : -7829368, 18, 1);
        }
    }

    public w6() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f9519a;
    }

    public void initialize(List<y2> list, com.applovin.impl.sdk.j jVar) {
        this.f9519a = jVar;
        this.f9520b = list;
        this.f9522d = a(list);
        a aVar = new a(this, list);
        this.f9521c = aVar;
        aVar.a(new b(list, jVar));
        this.f9521c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Test Mode Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f9523e = listView;
        listView.setAdapter((ListAdapter) this.f9521c);
    }

    @Override // com.applovin.impl.g3, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f9522d = a(this.f9520b);
        this.f9521c.notifyDataSetChanged();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            y2 y2Var = (y2) it.next();
            arrayList.add(new c(y2Var, this, y2Var));
        }
        return arrayList;
    }
}
