package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Map;
import javax.annotation.CheckForNull;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum A02 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class O3 implements InterfaceC1771hs<Map.Entry<?, ?>, Object> {
    public static byte[] A00;
    public static final /* synthetic */ O3[] A01;
    public static final O3 A02;
    public static final O3 A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-61, -67, -47, 4, -17, -6, 3, -13};
    }

    static {
        A02();
        final String A012 = A01(0, 3, 56);
        A02 = new O3(A012, 0) { // from class: com.facebook.ads.redexgen.X.4M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.InterfaceC1771hs
            @CheckForNull
            /* renamed from: A00 */
            public final Object A41(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        };
        final String A013 = A01(3, 5, 110);
        A03 = new O3(A013, 1) { // from class: com.facebook.ads.redexgen.X.4J
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.InterfaceC1771hs
            @CheckForNull
            /* renamed from: A00 */
            public final Object A41(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        };
        A01 = A03();
    }

    public O3(String $enum$name, int $enum$ordinal) {
    }

    public /* synthetic */ O3(String str, int i10, O8 o82) {
        this(str, i10);
    }

    public static /* synthetic */ O3[] A03() {
        return new O3[]{A02, A03};
    }

    public static O3 valueOf(String name) {
        return (O3) Enum.valueOf(O3.class, name);
    }

    public static O3[] values() {
        return (O3[]) A01.clone();
    }
}
