package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class d extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    private static final int f14159d;

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f14160a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14161b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14162c;

    static {
        f14159d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public d() {
        Calendar k10 = o.k();
        this.f14160a = k10;
        this.f14161b = k10.getMaximum(7);
        this.f14162c = k10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f14162c;
        int i12 = this.f14161b;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f14161b) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f14161b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(d5.h.f24076l, viewGroup, false);
        }
        this.f14160a.set(7, b(i10));
        textView.setText(this.f14160a.getDisplayName(7, f14159d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(d5.i.f24092j), this.f14160a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
