package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class l extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private j f7423a;

    /* renamed from: b  reason: collision with root package name */
    private com.applovin.impl.sdk.j f7424b;

    /* renamed from: c  reason: collision with root package name */
    private k2 f7425c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f7426e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, j jVar) {
            super(context);
            this.f7426e = jVar;
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return this.f7426e.g().size();
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            ArrayList arrayList = new ArrayList();
            k kVar = (k) this.f7426e.g().get(i10);
            arrayList.add(l.this.c(kVar.c()));
            if (kVar.b() != null) {
                arrayList.add(l.this.a("AB Test Experiment Name", kVar.b()));
            }
            a8 d10 = kVar.d();
            l lVar = l.this;
            arrayList.add(lVar.a("Device ID Targeting", lVar.a(d10.a())));
            l lVar2 = l.this;
            arrayList.add(lVar2.a("Device Type Targeting", lVar2.b(d10.b())));
            if (d10.c() != null) {
                arrayList.add(l.this.a(d10.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            k kVar = (k) this.f7426e.g().get(i10);
            return (kVar.b() != null ? 1 : 0) + 3 + (kVar.d().c() == null ? 0 : 1);
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            if (i10 == b.TARGETED_WATERFALL.ordinal()) {
                return new m4("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i10 == b.OTHER_WATERFALLS.ordinal()) {
                return new m4("OTHER WATERFALLS");
            }
            return new m4("");
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f7424b;
    }

    public void initialize(final j jVar, final com.applovin.impl.sdk.j jVar2) {
        this.f7423a = jVar;
        this.f7424b = jVar2;
        a aVar = new a(this, jVar);
        this.f7425c = aVar;
        aVar.a(new k2.a() { // from class: com.applovin.impl.kb
            @Override // com.applovin.impl.k2.a
            public final void a(d2 d2Var, j2 j2Var) {
                l.this.a(jVar2, jVar, d2Var, j2Var);
            }
        });
        this.f7425c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f7423a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f7425c);
        listView.setDividerHeight(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k2 k2Var = this.f7425c;
        if (k2Var != null) {
            k2Var.a((k2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        return str.equals("phone") ? "Phones" : str.equals("tablet") ? "Tablets" : "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 c(String str) {
        return j2.a(j2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.j jVar, final j jVar2, final d2 d2Var, j2 j2Var) {
        if (d2Var.a() == 0) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new d.b() { // from class: com.applovin.impl.ib
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    l.a(j.this, d2Var, jVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        } else {
            d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, jVar.e(), new d.b() { // from class: com.applovin.impl.jb
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    l.a(j.this, d2Var, jVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(j jVar, d2 d2Var, com.applovin.impl.sdk.j jVar2, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(jVar, (k) jVar.g().get(d2Var.b()), null, jVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(j jVar, d2 d2Var, com.applovin.impl.sdk.j jVar2, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        k kVar = (k) jVar.g().get(d2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(kVar.c(), kVar.d().c(), jVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 a(String str, String str2) {
        return j2.a(j2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j2 a(List list) {
        j2.b d10 = j2.a(j2.c.DETAIL).d("Segment Targeting");
        return d10.a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        return str.equals("idfa") ? "IDFA Only" : str.equals("dnt") ? "No IDFA Only" : "All";
    }
}
