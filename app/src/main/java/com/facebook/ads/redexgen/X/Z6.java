package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class Z6 {
    public static byte[] A06;
    public static final Z6 A07;
    @Nullable
    public AbstractC0950Mc A01;
    @Nullable
    public Boolean A02;
    public volatile Map<String, Set<InterfaceC1268Yz>> A04 = new HashMap();
    public final Z5 A03 = new Z5(this);
    public int A00 = 0;
    public volatile long A05 = -1;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A06 = new byte[]{6, -2, 13, -6, -57, -3, -6, 15, -54, -3, -57, -6, 15, -54, -57, -3, -2, -4, 8, -3, -2, 11};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0C(boolean z10, C0954Mg c0954Mg, EnumC0949Mb enumC0949Mb, String str, InterfaceC1268Yz interfaceC1268Yz) {
        if (A0I(z10, c0954Mg) && A0G(str, c0954Mg)) {
            boolean z11 = true;
            synchronized (this) {
                if (this.A00 < c0954Mg.A05) {
                    Set<InterfaceC1268Yz> set = this.A04.get(str);
                    if (set == null) {
                        set = A06();
                        this.A04.put(str, set);
                    }
                    if (set.contains(interfaceC1268Yz)) {
                        z11 = false;
                    } else if (((z10 && c0954Mg.A0M) || (!z10 && c0954Mg.A0L)) && set.size() < c0954Mg.A04) {
                        set.add(interfaceC1268Yz);
                        this.A00++;
                        z11 = false;
                    }
                }
                if (!z11) {
                    try {
                        this.A05 = SystemClock.elapsedRealtime();
                        interfaceC1268Yz.reset();
                        A01().A07(enumC0949Mb, interfaceC1268Yz.hashCode());
                        this.A05 = -1L;
                        return;
                    } catch (IllegalStateException unused) {
                        A0B(str, interfaceC1268Yz);
                        this.A05 = -1L;
                    }
                }
            }
        }
        try {
            if (!c0954Mg.A0Q || (!z10 && !c0954Mg.A0P)) {
                interfaceC1268Yz.stop();
            }
        } finally {
            A01().A06(enumC0949Mb, interfaceC1268Yz.hashCode());
            interfaceC1268Yz.AGj();
            A01().A05(enumC0949Mb, interfaceC1268Yz.hashCode());
        }
    }

    static {
        A08();
        A07 = new Z6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AbstractC0950Mc A01() {
        if (this.A01 != null) {
            return this.A01;
        }
        return C1288Zu.A02;
    }

    private InterfaceC1268Yz A03(boolean z10, C0954Mg c0954Mg, EnumC0949Mb enumC0949Mb, String str) throws MY {
        if (A0I(z10, c0954Mg) && A0G(str, c0954Mg)) {
            synchronized (this) {
                Set<InterfaceC1268Yz> set = this.A04.get(str);
                if (set != null && !set.isEmpty()) {
                    this.A00--;
                    Iterator<InterfaceC1268Yz> it = set.iterator();
                    InterfaceC1268Yz ret = it.next();
                    it.remove();
                    A01().A08(z10, str, enumC0949Mb, ret.hashCode());
                    return ret;
                }
            }
        }
        try {
            MZ A03 = A01().A03(z10, str, enumC0949Mb);
            InterfaceC1268Yz A01 = Z5.A01(this.A03, z10, str);
            A01().A04(A03, A01.hashCode());
            return A01;
        } catch (Exception e8) {
            throw new MY(str, e8);
        }
    }

    public static Z6 A04() {
        return A07;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<InterfaceC1268Yz> A06() {
        if (this.A02 != null && this.A02.booleanValue()) {
            return new CopyOnWriteArraySet();
        }
        return new HashSet();
    }

    private void A09(AbstractC0950Mc abstractC0950Mc) {
        if (this.A01 == null) {
            this.A01 = abstractC0950Mc;
        }
    }

    private void A0A(C0954Mg c0954Mg) {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    this.A02 = Boolean.valueOf(c0954Mg.A0R);
                    if (this.A02.booleanValue()) {
                        this.A04 = new ConcurrentHashMap();
                    }
                }
            }
        }
    }

    private void A0B(String str, InterfaceC1268Yz interfaceC1268Yz) {
        Set<InterfaceC1268Yz> set = this.A04.get(str);
        if (set != null && set.remove(interfaceC1268Yz)) {
            this.A00--;
        }
    }

    public static boolean A0E(String str) {
        return str.equals(A05(0, 22, 78));
    }

    public static boolean A0G(String str, C0954Mg c0954Mg) {
        if (A0E(str) && c0954Mg.A0A) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0I(boolean z10, C0954Mg c0954Mg) {
        if (c0954Mg.A0C && this.A05 != -1 && SystemClock.elapsedRealtime() - this.A05 > ServiceProvider.SCAR_VERSION_FETCH_TIMEOUT) {
            return false;
        }
        return A0J(z10, c0954Mg);
    }

    public static boolean A0J(boolean z10, C0954Mg c0954Mg) {
        return (z10 && c0954Mg.A0M) || (!z10 && c0954Mg.A0L);
    }

    public final InterfaceC1268Yz A0K(boolean z10, C0954Mg c0954Mg, AbstractC0950Mc abstractC0950Mc, EnumC0949Mb enumC0949Mb, String str) throws MY {
        A09(abstractC0950Mc);
        A0A(c0954Mg);
        if (c0954Mg.A0J) {
            return Z5.A00(this.A03, z10, c0954Mg, enumC0949Mb, str);
        }
        return A03(z10, c0954Mg, enumC0949Mb, str);
    }

    public final void A0L(boolean z10, C0954Mg c0954Mg, AbstractC0950Mc abstractC0950Mc, EnumC0949Mb enumC0949Mb, String str, InterfaceC1268Yz interfaceC1268Yz) {
        A09(abstractC0950Mc);
        if (c0954Mg.A0J) {
            Z5.A08(this.A03, z10, c0954Mg, enumC0949Mb, str, interfaceC1268Yz);
        } else {
            A0C(z10, c0954Mg, enumC0949Mb, str, interfaceC1268Yz);
        }
    }
}
