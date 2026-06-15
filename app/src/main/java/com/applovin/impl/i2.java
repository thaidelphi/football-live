package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class i2 {

    /* renamed from: a  reason: collision with root package name */
    public TextView f7204a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f7205b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f7206c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f7207d;

    /* renamed from: e  reason: collision with root package name */
    private j2 f7208e;

    /* renamed from: f  reason: collision with root package name */
    private int f7209f;

    public void a(int i10) {
        this.f7209f = i10;
    }

    public j2 b() {
        return this.f7208e;
    }

    public int a() {
        return this.f7209f;
    }

    public void a(j2 j2Var) {
        this.f7208e = j2Var;
        this.f7204a.setText(j2Var.k());
        this.f7204a.setTextColor(j2Var.l());
        if (this.f7205b != null) {
            if (!TextUtils.isEmpty(j2Var.f())) {
                this.f7205b.setTypeface(null, 0);
                this.f7205b.setVisibility(0);
                this.f7205b.setText(j2Var.f());
                this.f7205b.setTextColor(j2Var.g());
                if (j2Var.p()) {
                    this.f7205b.setTypeface(null, 1);
                }
            } else {
                this.f7205b.setVisibility(8);
            }
        }
        if (this.f7206c != null) {
            if (j2Var.h() > 0) {
                this.f7206c.setImageResource(j2Var.h());
                this.f7206c.setColorFilter(j2Var.i());
                this.f7206c.setVisibility(0);
            } else {
                this.f7206c.setVisibility(8);
            }
        }
        if (this.f7207d != null) {
            if (j2Var.d() > 0) {
                this.f7207d.setImageResource(j2Var.d());
                this.f7207d.setColorFilter(j2Var.e());
                this.f7207d.setVisibility(0);
                return;
            }
            this.f7207d.setVisibility(8);
        }
    }
}
