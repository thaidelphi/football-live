package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
/* renamed from: com.facebook.ads.redexgen.X.kr  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1952kr extends C4L {
    public final C4L A00 = new C1953ks(this);
    public final MG A01;

    public C1952kr(MG mg) {
        this.A01 = mg;
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(MG.class.getName());
        if ((view instanceof MG) && !A0B()) {
            MG mg = (MG) view;
            if (mg.getLayoutManager() != null) {
                mg.getLayoutManager().A1t(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final void A08(View view, AnonymousClass56 anonymousClass56) {
        super.A08(view, anonymousClass56);
        anonymousClass56.A0O(MG.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(anonymousClass56);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C4L
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1V(i10, bundle);
        }
        return false;
    }

    public final C4L A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
