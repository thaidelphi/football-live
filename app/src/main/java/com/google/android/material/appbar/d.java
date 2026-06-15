package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.a0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ViewOffsetHelper.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final View f13879a;

    /* renamed from: b  reason: collision with root package name */
    private int f13880b;

    /* renamed from: c  reason: collision with root package name */
    private int f13881c;

    /* renamed from: d  reason: collision with root package name */
    private int f13882d;

    /* renamed from: e  reason: collision with root package name */
    private int f13883e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13884f = true;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13885g = true;

    public d(View view) {
        this.f13879a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        View view = this.f13879a;
        a0.b0(view, this.f13882d - (view.getTop() - this.f13880b));
        View view2 = this.f13879a;
        a0.a0(view2, this.f13883e - (view2.getLeft() - this.f13881c));
    }

    public int b() {
        return this.f13882d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f13880b = this.f13879a.getTop();
        this.f13881c = this.f13879a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f13885g || this.f13883e == i10) {
            return false;
        }
        this.f13883e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f13884f || this.f13882d == i10) {
            return false;
        }
        this.f13882d = i10;
        a();
        return true;
    }
}
