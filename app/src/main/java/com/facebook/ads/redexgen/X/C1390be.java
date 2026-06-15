package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.facebook.ads.redexgen.X.be  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1390be implements IQ {
    public static String[] A0C = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public C1433cL A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC1409bx A07 = new KW(this);
    public final AbstractC1415c3 A06 = new KV(this);
    public final AbstractC1407bv A08 = new KU(this);
    public final AbstractC1404bs A09 = new KT(this);
    public final AbstractC1398bm A0A = new KS(this);
    public final Handler A05 = new Handler();
    public final List<InterfaceC0861Iq> A0B = new ArrayList();
    public int A00 = 2000;

    public C1390be(boolean z10) {
        this.A02 = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<InterfaceC0861Iq> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z10, boolean z11) {
        for (InterfaceC0861Iq interfaceC0861Iq : this.A0B) {
            interfaceC0861Iq.A40(z10, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0D(EnumC0860Ip enumC0860Ip) {
        for (InterfaceC0861Iq interfaceC0861Iq : this.A0B) {
            if (interfaceC0861Iq.A91() != enumC0860Ip) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i10) {
        this.A00 = i10;
    }

    public final void A0I(InterfaceC0861Iq interfaceC0861Iq) {
        this.A0B.add(interfaceC0861Iq);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AAk(C1433cL c1433cL) {
        this.A01 = c1433cL;
        c1433cL.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.IQ
    public final void AJa(C1433cL c1433cL) {
        A03();
        c1433cL.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
