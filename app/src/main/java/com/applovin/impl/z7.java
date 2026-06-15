package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.j2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class z7 extends g3 {

    /* renamed from: a  reason: collision with root package name */
    private String f9836a;

    /* renamed from: b  reason: collision with root package name */
    private com.applovin.impl.sdk.j f9837b;

    /* renamed from: c  reason: collision with root package name */
    private k2 f9838c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class a extends k2 {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List f9839e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, List list) {
            super(context);
            this.f9839e = list;
        }

        @Override // com.applovin.impl.k2
        protected j2 a() {
            return new j2.b(j2.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.k2
        protected int b() {
            return 1;
        }

        @Override // com.applovin.impl.k2
        protected List c(int i10) {
            return this.f9839e;
        }

        @Override // com.applovin.impl.k2
        protected int d(int i10) {
            return this.f9839e.size();
        }

        @Override // com.applovin.impl.k2
        protected j2 e(int i10) {
            return new m4("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j2.a(j2.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.g3
    protected com.applovin.impl.sdk.j getSdk() {
        return this.f9837b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.j jVar) {
        this.f9836a = str;
        this.f9837b = jVar;
        a aVar = new a(this, a(list));
        this.f9838c = aVar;
        aVar.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.g3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f9836a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f9838c);
    }
}
