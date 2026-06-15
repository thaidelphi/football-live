package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.lW  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1989lW implements InterfaceC04983u {
    private C04993v A00(InterfaceC04973t interfaceC04973t) {
        return (C04993v) interfaceC04973t.A74();
    }

    public final void A01(InterfaceC04973t interfaceC04973t) {
        if (!interfaceC04973t.A9H()) {
            interfaceC04973t.AIr(0, 0, 0, 0);
            return;
        }
        float A8I = A8I(interfaceC04973t);
        float A8h = A8h(interfaceC04973t);
        float elevation = AbstractC05013x.A00(A8I, A8h, interfaceC04973t.A8g());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = AbstractC05013x.A01(A8I, A8h, interfaceC04973t.A8g());
        int ceil = (int) Math.ceil(elevation2);
        interfaceC04973t.AIr(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final ColorStateList A6r(InterfaceC04973t interfaceC04973t) {
        return A00(interfaceC04973t).A05();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final float A7l(InterfaceC04973t interfaceC04973t) {
        return interfaceC04973t.A75().getElevation();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final float A8I(InterfaceC04973t interfaceC04973t) {
        return A00(interfaceC04973t).A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final float A8N(InterfaceC04973t interfaceC04973t) {
        return A8h(interfaceC04973t) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final float A8O(InterfaceC04973t interfaceC04973t) {
        return A8h(interfaceC04973t) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final float A8h(InterfaceC04973t interfaceC04973t) {
        return A00(interfaceC04973t).A04();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void AA4() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void AA6(InterfaceC04973t interfaceC04973t, Context context, ColorStateList colorStateList, float f10, float f11, float f12) {
        C04993v background = new C04993v(colorStateList, f10);
        interfaceC04973t.AIQ(background);
        View view = interfaceC04973t.A75();
        view.setClipToOutline(true);
        view.setElevation(f11);
        AId(interfaceC04973t, f12);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void ACf(InterfaceC04973t interfaceC04973t) {
        AId(interfaceC04973t, A8I(interfaceC04973t));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void AEe(InterfaceC04973t interfaceC04973t) {
        AId(interfaceC04973t, A8I(interfaceC04973t));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void AIP(InterfaceC04973t interfaceC04973t, ColorStateList colorStateList) {
        A00(interfaceC04973t).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void AIV(InterfaceC04973t interfaceC04973t, float f10) {
        interfaceC04973t.A75().setElevation(f10);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void AId(InterfaceC04973t interfaceC04973t, float f10) {
        A00(interfaceC04973t).A07(f10, interfaceC04973t.A9H(), interfaceC04973t.A8g());
        A01(interfaceC04973t);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04983u
    public final void AIp(InterfaceC04973t interfaceC04973t, float f10) {
        A00(interfaceC04973t).A06(f10);
    }
}
