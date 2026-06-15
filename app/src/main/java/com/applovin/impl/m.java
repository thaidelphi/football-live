package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.d;
import com.applovin.impl.j2;
import com.applovin.impl.k2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class m extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private com.applovin.impl.sdk.j f7481a;

    /* renamed from: b  reason: collision with root package name */
    private k2 f7482b;

    /* renamed from: c  reason: collision with root package name */
    private List f7483c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7484d;

    /* renamed from: e  reason: collision with root package name */
    private ListView f7485e;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f7486e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f7486e = list;
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            return m.this.f7483c;
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            return this.f7486e.size();
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            return new m4("");
        }
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f7481a;
    }

    public void initialize(final List<j> list, boolean z10, final com.applovin.impl.sdk.j jVar) {
        this.f7484d = z10;
        this.f7481a = jVar;
        this.f7483c = a(list);
        a aVar = new a(this, list);
        this.f7482b = aVar;
        aVar.a(new k2.a() { // from class: com.applovin.impl.yc
            @Override // com.applovin.impl.k2.a
            public final void a(d2 d2Var, j2 j2Var) {
                m.this.a(list, jVar, d2Var, j2Var);
            }
        });
        this.f7482b.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7484d ? "Selective Init " : "");
        sb.append("Ad Units");
        setTitle(sb.toString());
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f7485e = listView;
        listView.setAdapter((ListAdapter) this.f7482b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.j jVar, d2 d2Var, j2 j2Var) {
        final j jVar2 = (j) list.get(d2Var.a());
        if (jVar2.g().size() == 1) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new d.b() { // from class: com.applovin.impl.wc
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitDetailActivity) activity).initialize(j.this, null, null, jVar);
                }
            });
        } else {
            d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, jVar.e(), new d.b() { // from class: com.applovin.impl.xc
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(j.this, jVar);
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(jVar.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(jVar.b(), -16777216));
            arrayList.add(j2.a(j2.c.DETAIL).b(StringUtils.createSpannedString(jVar.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
