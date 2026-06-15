package com.facebook.ads.redexgen.X;

import java.util.Map;
/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class OW<K, V> extends C1959ky<K, V>.Itr<Map.Entry<K, V>> {
    public final /* synthetic */ C1959ky A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OW(final C1959ky this$0) {
        super(this$0, null);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A00 */
    public final Map.Entry<K, V> A03(int entry) {
        return new OT(this.A00, entry);
    }
}
