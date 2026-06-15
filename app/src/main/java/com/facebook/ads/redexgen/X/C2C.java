package com.facebook.ads.redexgen.X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.2C  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C2C extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC2090n9 A00;
    public C2B A01;
    public C1900k1 A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, 15, 71, 64, 66, 68, 67, 78, 78, 74, 15, 64, 69, 82, 15, 67, 64, 79, 79, 68, 83, 15, 66, 77, 72, 66, 74, 68, 69};
    }

    public C2C(C1900k1 c1900k1, String str, InterfaceC2090n9 interfaceC2090n9, C2B c2b) {
        this.A02 = c1900k1;
        this.A03 = str;
        this.A01 = c2b;
        this.A00 = interfaceC2090n9;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        AnonymousClass42.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        AnonymousClass42.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ACU(this.A00);
        }
    }
}
