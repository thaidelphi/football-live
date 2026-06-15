package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthsPagerAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class j extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final CalendarConstraints f14214a;

    /* renamed from: b  reason: collision with root package name */
    private final DateSelector<?> f14215b;

    /* renamed from: c  reason: collision with root package name */
    private final e.l f14216c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14217d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f14218a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f14218a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f14218a.getAdapter2().n(i10)) {
                j.this.f14216c.a(this.f14218a.getAdapter2().getItem(i10).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b extends RecyclerView.c0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f14220a;

        /* renamed from: b  reason: collision with root package name */
        final MaterialCalendarGridView f14221b;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(d5.f.f24055t);
            this.f14220a = textView;
            a0.r0(textView, true);
            this.f14221b = (MaterialCalendarGridView) linearLayout.findViewById(d5.f.f24051p);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, e.l lVar) {
        Month m7 = calendarConstraints.m();
        Month h10 = calendarConstraints.h();
        Month l10 = calendarConstraints.l();
        if (m7.compareTo(l10) <= 0) {
            if (l10.compareTo(h10) <= 0) {
                this.f14217d = (i.f14208f * e.l2(context)) + (f.B2(context) ? e.l2(context) : 0);
                this.f14214a = calendarConstraints;
                this.f14215b = dateSelector;
                this.f14216c = lVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month b(int i10) {
        return this.f14214a.m().n(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence c(int i10) {
        return b(i10).l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(Month month) {
        return this.f14214a.m().o(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i10) {
        Month n10 = this.f14214a.m().n(i10);
        bVar.f14220a.setText(n10.l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f14221b.findViewById(d5.f.f24051p);
        if (materialCalendarGridView.getAdapter2() != null && n10.equals(materialCalendarGridView.getAdapter2().f14209a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        } else {
            i iVar = new i(n10, this.f14215b, this.f14214a);
            materialCalendarGridView.setNumColumns(n10.f14141d);
            materialCalendarGridView.setAdapter((ListAdapter) iVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(d5.h.f24078n, viewGroup, false);
        if (f.B2(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f14217d));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f14214a.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i10) {
        return this.f14214a.m().n(i10).m();
    }
}
