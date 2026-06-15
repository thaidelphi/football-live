package com.facebook.ads.redexgen.X;

import com.ironsource.b9;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\u0002J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0007H\u0087\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\nH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\rH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig;", "", "<init>", "()V", "CONFIG", "", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$ID;", "", "INTEGER_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$INTEGER_ID;", "", "LONG_CONFIG", "Lcom/facebook/video/heroplayer/exocustom/MetaExoPlayerUpgradeConfig$LONG_ID;", "", "get", "upgradeIdentifier", "set", "", b9.h.X, "getInteger", "setInteger", "getLong", "setLong", "ID", "INTEGER_ID", "LONG_ID", "fbandroid.java.com.facebook.video.heroplayer.exocustom.exocustom"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.Mq  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0962Mq {
    public static byte[] A00;
    public static final C0962Mq A01;
    public static final Map<EnumC0959Mn, Boolean> A02;
    public static final Map<EnumC0960Mo, Integer> A03;
    public static final Map<EnumC0961Mp, Long> A04;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{126, 73, 93, 89, 69, 94, 73, 72, 12, 90, 77, 64, 89, 73, 12, 91, 77, 95, 12, 66, 89, 64, 64, 2, 39, 34, 53, 32, 51, 54, 55, 27, 54, 55, 60, 38, 59, 52, 59, 55, 32};
    }

    static {
        EnumC0961Mp[] values;
        A02();
        A01 = new C0962Mq();
        A02 = new EnumMap(EnumC0959Mn.class);
        A03 = new EnumMap(EnumC0960Mo.class);
        A04 = new EnumMap(EnumC0961Mp.class);
        for (EnumC0959Mn enumC0959Mn : EnumC0959Mn.valuesCustom()) {
            A02.put(enumC0959Mn, false);
        }
        for (EnumC0960Mo enumC0960Mo : EnumC0960Mo.valuesCustom()) {
            A03.put(enumC0960Mo, -1);
        }
        for (EnumC0961Mp id : EnumC0961Mp.values()) {
            A04.put(id, -1L);
        }
        A02.put(EnumC0959Mn.A0V, true);
        A02.put(EnumC0959Mn.A0Q, true);
        A02.put(EnumC0959Mn.A1X, true);
        A03.put(EnumC0960Mo.A05, 100);
    }

    @JvmStatic
    public static final int A00(EnumC0960Mo enumC0960Mo) {
        C2126nk.A09(enumC0960Mo, A01(24, 17, 40));
        Integer num = A03.get(enumC0960Mo);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException(A01(0, 24, 86).toString());
    }

    @JvmStatic
    public static final boolean A03(EnumC0959Mn enumC0959Mn) {
        C2126nk.A09(enumC0959Mn, A01(24, 17, 40));
        return C2126nk.A0C(true, A02.get(enumC0959Mn));
    }
}
