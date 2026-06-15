package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
import java.util.Calendar;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YearGridAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class p extends RecyclerView.h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final e<?> f14228a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearGridAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14229a;

        a(int i10) {
            this.f14229a = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.f14228a.q2(p.this.f14228a.h2().e(Month.b(this.f14229a, p.this.f14228a.j2().f14139b)));
            p.this.f14228a.r2(e.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class b extends RecyclerView.c0 {

        /* renamed from: a  reason: collision with root package name */
        final TextView f14231a;

        b(TextView textView) {
            super(textView);
            this.f14231a = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(e<?> eVar) {
        this.f14228a = eVar;
    }

    private View.OnClickListener b(int i10) {
        return new a(i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int i10) {
        return i10 - this.f14228a.h2().m().f14140c;
    }

    int d(int i10) {
        return this.f14228a.h2().m().f14140c + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: e */
    public void onBindViewHolder(b bVar, int i10) {
        int d10 = d(i10);
        String string = bVar.f14231a.getContext().getString(d5.i.f24093k);
        bVar.f14231a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(d10)));
        bVar.f14231a.setContentDescription(String.format(string, Integer.valueOf(d10)));
        com.google.android.material.datepicker.b i22 = this.f14228a.i2();
        Calendar i11 = o.i();
        com.google.android.material.datepicker.a aVar = i11.get(1) == d10 ? i22.f14156f : i22.f14154d;
        for (Long l10 : this.f14228a.k2().L()) {
            i11.setTimeInMillis(l10.longValue());
            if (i11.get(1) == d10) {
                aVar = i22.f14155e;
            }
        }
        aVar.d(bVar.f14231a);
        bVar.f14231a.setOnClickListener(b(d10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: f */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(d5.h.f24080p, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f14228a.h2().n();
    }
}
