package com.facebook.ads.redexgen.X;

import java.util.Collection;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.nK  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C2101nK implements InterfaceC04501y {
    public final /* synthetic */ C1900k1 A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2101nK(JSONObject jSONObject, C1900k1 c1900k1, String str) {
        this.A02 = jSONObject;
        this.A00 = c1900k1;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04501y
    public final String A7E() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04501y
    public final Collection<String> A7f() {
        return AbstractC04511z.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04501y
    public final EnumC04491x A8A() {
        return AbstractC04511z.A00(this.A02);
    }
}
