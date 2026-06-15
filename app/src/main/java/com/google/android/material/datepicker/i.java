package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class i extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    static final int f14208f = o.k().getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    final Month f14209a;

    /* renamed from: b  reason: collision with root package name */
    final DateSelector<?> f14210b;

    /* renamed from: c  reason: collision with root package name */
    private Collection<Long> f14211c;

    /* renamed from: d  reason: collision with root package name */
    b f14212d;

    /* renamed from: e  reason: collision with root package name */
    final CalendarConstraints f14213e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f14209a = month;
        this.f14210b = dateSelector;
        this.f14213e = calendarConstraints;
        this.f14211c = dateSelector.L();
    }

    private void e(Context context) {
        if (this.f14212d == null) {
            this.f14212d = new b(context);
        }
    }

    private boolean h(long j10) {
        Iterator<Long> it = this.f14210b.L().iterator();
        while (it.hasNext()) {
            if (o.a(j10) == o.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j10) {
        a aVar;
        if (textView == null) {
            return;
        }
        if (this.f14213e.g().j(j10)) {
            textView.setEnabled(true);
            if (h(j10)) {
                aVar = this.f14212d.f14152b;
            } else if (o.i().getTimeInMillis() == j10) {
                aVar = this.f14212d.f14153c;
            } else {
                aVar = this.f14212d.f14151a;
            }
        } else {
            textView.setEnabled(false);
            aVar = this.f14212d.f14157g;
        }
        aVar.d(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.c(j10).equals(this.f14209a)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.f14209a.i(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i10) {
        return b() + (i10 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f14209a.g();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f14209a.g() || i10 > i()) {
            return null;
        }
        return Long.valueOf(this.f14209a.h(j(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = d5.h.f24075k
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.Month r8 = r5.f14209a
            int r2 = r8.f14142e
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f14209a
            long r7 = r8.h(r7)
            com.google.android.material.datepicker.Month r3 = r5.f14209a
            int r3 = r3.f14140c
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.d()
            int r4 = r4.f14140c
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.c.a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.c.d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.i.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(int i10) {
        return i10 % this.f14209a.f14141d == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i10) {
        return (i10 + 1) % this.f14209a.f14141d == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f14209a.f14142e + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f14209a.f14141d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return (this.f14209a.g() + this.f14209a.f14142e) - 1;
    }

    int j(int i10) {
        return (i10 - this.f14209a.g()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l10 : this.f14211c) {
            l(materialCalendarGridView, l10.longValue());
        }
        DateSelector<?> dateSelector = this.f14210b;
        if (dateSelector != null) {
            for (Long l11 : dateSelector.L()) {
                l(materialCalendarGridView, l11.longValue());
            }
            this.f14211c = this.f14210b.L();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean n(int i10) {
        return i10 >= b() && i10 <= i();
    }
}
