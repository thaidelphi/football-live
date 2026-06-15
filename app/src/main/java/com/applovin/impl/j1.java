package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.j2;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class j1 extends j2 {

    /* renamed from: n  reason: collision with root package name */
    private final k1 f7263n;

    /* renamed from: o  reason: collision with root package name */
    private final Context f7264o;

    public j1(k1 k1Var, Context context) {
        super(j2.c.DETAIL);
        this.f7263n = k1Var;
        this.f7264o = context;
        this.f7267c = r();
        this.f7268d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + d7.a(this.f7263n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f7263n.c());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f7263n.d());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.j2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.j2
    public int e() {
        return j0.a(R.color.applovin_sdk_disclosureButtonColor, this.f7264o);
    }

    @Override // com.applovin.impl.j2
    public boolean o() {
        return true;
    }
}
