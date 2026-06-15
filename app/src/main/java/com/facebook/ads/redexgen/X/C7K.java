package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.7K  reason: invalid class name */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C7K {
    public static byte[] A08;
    public InterfaceC1364bE A02;
    public String A05;
    public final InterfaceC1509dZ A06;
    public final Object A07;
    public TO A01 = TL.A01();
    public InterfaceC1536e1 A03 = new C1038Pq();
    public int A00 = 1048576;
    @MetaExoPlayerCustomization(type = {"MERGED"}, value = "https://github.com/androidx/media/pull/1754")
    public InterfaceC1801iP<InterfaceExecutorC1651ft> A04 = new InterfaceC1801iP() { // from class: com.facebook.ads.redexgen.X.Qz
        @Override // com.facebook.ads.redexgen.X.InterfaceC1801iP
        public final Object get() {
            return C7K.A01();
        }
    };

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{110, 89, 89, 68, 89, 11, 66, 69, 88, 95, 74, 69, 95, 66, 74, 95, 66, 69, 76, 11, 111, 78, 77, 74, 94, 71, 95, 110, 83, 95, 89, 74, 72, 95, 68, 89, 88, 109, 74, 72, 95, 68, 89, 82, 77, 65, 67, 0, 73, 65, 65, 73, 66, 75, 0, 79, 64, 74, 92, 65, 71, 74, 0, 75, 86, 65, 94, 66, 79, 87, 75, 92, 28, 0, 75, 86, 90, 92, 79, 77, 90, 65, 92, 0, 106, 75, 72, 79, 91, 66, 90, 107, 86, 90, 92, 79, 77, 90, 65, 92, 93, 104, 79, 77, 90, 65, 92, 87};
    }

    public C7K(InterfaceC1509dZ interfaceC1509dZ) {
        this.A06 = interfaceC1509dZ;
    }

    public static /* synthetic */ RB A00(UO uo, RK rk) {
        return new RB(uo);
    }

    public static /* synthetic */ InterfaceExecutorC1651ft A01() {
        return null;
    }

    @MetaExoPlayerCustomization("Custom reflection logic to avoid loading DefaultExtractorsFactory")
    public final C6O A04(Uri uri) {
        String A02 = A02(0, 44, 87);
        if (this.A02 == null) {
            try {
                final UO uo = (UO) Class.forName(A02(44, 64, 82)).asSubclass(UO.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                this.A02 = new InterfaceC1364bE() { // from class: com.facebook.ads.redexgen.X.R0
                    @Override // com.facebook.ads.redexgen.X.InterfaceC1364bE
                    public final InterfaceC1365bF A5N(RK rk) {
                        return C7K.A00(UO.this, rk);
                    }
                };
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(A02, e8);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(A02, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(A02, e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException(A02, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException(A02, e13);
            }
        }
        return new C6O(new PH().A00(uri).A02(this.A05).A01(this.A07).A05(), this.A06, this.A02, this.A01, this.A03, this.A00, null);
    }
}
