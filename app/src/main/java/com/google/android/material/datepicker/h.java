package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* compiled from: MaterialTextInputPicker.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class h<S> extends l<S> {

    /* renamed from: c0  reason: collision with root package name */
    private int f14204c0;

    /* renamed from: d0  reason: collision with root package name */
    private DateSelector<S> f14205d0;

    /* renamed from: e0  reason: collision with root package name */
    private CalendarConstraints f14206e0;

    /* compiled from: MaterialTextInputPicker.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a extends k<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.k
        public void a(S s10) {
            Iterator<k<S>> it = h.this.f14222b0.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> h<T> Y1(DateSelector<T> dateSelector, int i10, CalendarConstraints calendarConstraints) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        hVar.E1(bundle);
        return hVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void R0(Bundle bundle) {
        super.R0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f14204c0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f14205d0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f14206e0);
    }

    @Override // androidx.fragment.app.Fragment
    public void v0(Bundle bundle) {
        super.v0(bundle);
        if (bundle == null) {
            bundle = n();
        }
        this.f14204c0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f14205d0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f14206e0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View z0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f14205d0.G(layoutInflater.cloneInContext(new ContextThemeWrapper(p(), this.f14204c0)), viewGroup, bundle, this.f14206e0, new a());
    }
}
