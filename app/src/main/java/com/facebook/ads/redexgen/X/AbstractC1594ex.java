package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.ex  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC1594ex {
    public static Method A00;
    public static byte[] A01;
    public static String[] A02 = {"yo3rzsHP", "ovGXPfera5IqPEl3yU6zb5JBHB3EIWiy", "u74kyRaxonnBYt1Y6p51HpVqv6hsrgGn", "QtPwpOHXWsaUu4k3Vckzdn9pXy2eEal7", "mlzCy4wxJD9Se8jXAiMGCsQSs6QItMsI", "apx1YwFHo6hUNLh041KALOIOcxntWD5v", "DpuUZqleS9Sqvpcm8LX8B8CCleS5JVHp", "asAzLd28WO2RncRAV7tJWCdNYMaRZ2g0"};

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 74);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-59, -8, -15, -25, -17, -24, -40, -9, -20, -17, -59, -32, -24, -21, -28, -29, -97, -13, -18, -97, -24, -19, -11, -18, -22, -28, -97, -26, -28, -13, -56, -63, -24, -19, -29, -28, -15, -97, -11, -24, -32, -97, -15, -28, -27, -21, -28, -30, -13, -24, -18, -19, -65, -38, -30, -27, -34, -35, -103, -19, -24, -103, -21, -34, -19, -21, -30, -34, -17, -34, -103, -32, -34, -19, -62, -69, -30, -25, -35, -34, -21, -103, -26, -34, -19, -31, -24, -35, 39, 37, 52, 9, 2, 41, 46, 36, 37, 50};
    }

    static {
        A03();
    }

    public static IBinder A00(Bundle bundle, String str) {
        if (AbstractC1672gE.A02 >= 18) {
            return bundle.getBinder(str);
        }
        return A01(bundle, str);
    }

    public static IBinder A01(Bundle bundle, String str) {
        Method method = A00;
        String A022 = A02(0, 10, 57);
        if (method == null) {
            try {
                Method getIBinder = Bundle.class.getMethod(A02(88, 10, 118), String.class);
                A00 = getIBinder;
                Method getIBinder2 = A00;
                getIBinder2.setAccessible(true);
                method = A00;
            } catch (NoSuchMethodException e8) {
                AbstractC1633fb.A09(A022, A02(52, 36, 47), e8);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            if (A02[6].charAt(28) != 'M') {
                A02[6] = "KeBilsTN2QfbLy1yq08AcqYsRCtkUmmi";
                AbstractC1633fb.A09(A022, A02(10, 42, 53), e10);
                return null;
            }
            throw new RuntimeException();
        }
    }
}
