package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.j2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y2;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r3 extends j2 {

    /* renamed from: n  reason: collision with root package name */
    private final y2 f8540n;

    /* renamed from: o  reason: collision with root package name */
    private final Context f8541o;

    public r3(y2 y2Var, Context context) {
        super(j2.c.DETAIL);
        this.f8540n = y2Var;
        this.f8541o = context;
        this.f7267c = t();
        this.f7268d = s();
    }

    private SpannedString q() {
        if (this.f8540n.A()) {
            if (!TextUtils.isEmpty(this.f8540n.c())) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f8540n.c(), -16777216));
                if (this.f8540n.B()) {
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", j0.a(R.color.applovin_sdk_orangeColor, this.f8541o)));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f8540n.k(), -16777216));
                }
                if (!this.f8540n.C()) {
                    spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
                    spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", -65536));
                }
                return new SpannedString(spannableStringBuilder);
            }
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
    }

    private SpannedString s() {
        if (o()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) u());
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) q());
            if (this.f8540n.q() == y2.a.INVALID_INTEGRATION) {
                spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
                spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
            }
            return new SpannedString(spannableStringBuilder);
        }
        return null;
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.f8540n.g(), o() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (this.f8540n.F()) {
            if (!StringUtils.isValidString(this.f8540n.p())) {
                return StringUtils.createListItemDetailSpannedString(this.f8540n.A() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f8540n.p(), -16777216));
            return new SpannedString(spannableStringBuilder);
        }
        return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
    }

    @Override // com.applovin.impl.j2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.j2
    public int e() {
        return j0.a(R.color.applovin_sdk_disclosureButtonColor, this.f8541o);
    }

    @Override // com.applovin.impl.j2
    public int h() {
        int h10 = this.f8540n.h();
        return h10 > 0 ? h10 : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.j2
    public boolean o() {
        return this.f8540n.q() != y2.a.MISSING;
    }

    public y2 r() {
        return this.f8540n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f7267c) + ", detailText=" + ((Object) this.f7268d) + ", network=" + this.f8540n + "}";
    }
}
