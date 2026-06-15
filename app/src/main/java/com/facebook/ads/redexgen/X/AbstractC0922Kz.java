package com.facebook.ads.redexgen.X;

import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Arrays;
import java.util.Formattable;
import java.util.MissingFormatArgumentException;
import java.util.UnknownFormatConversionException;
import javax.annotation.Nullable;
/* renamed from: com.facebook.ads.redexgen.X.Kz  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class AbstractC0922Kz {
    public static byte[] A00;
    public static String[] A01 = {"8Sd1qkECxTgChNdlguLEZkZWMegMfOE5", "eE6tYG5sq9M8IjBBtVPbkf6Vz6TlptaI", "QOK7QojphBw5FabNaFdniimN5leZGYDr", "7RC2mif7S53CKwDAOZDI7R724V8msIlw", "uAGCbL6a5SqKA6tsA4uR", "AhKYWwBlorMFpY7WjQZRM9a3PetGdW8", "8WuUCWPLRijzu2iy4u5OiIf4MXR0TAdJ", "jN3W5Bup4fcwVqh0edpT69G47IDoXIn2"};
    public static final Object[] A02;

    public static String A0G(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[6].charAt(15) == 'n') {
                throw new RuntimeException();
            }
            A01[1] = "skGE7NcFmlK9UGwd3HQe5P1GOhX2S0Sv";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 14);
            i13++;
        }
    }

    public static void A0L() {
        A00 = new byte[]{-117, 113, -35, -14, -7, -1, -10, -18, -86, -8, -7, -2, -86, -20, -17, -86, -8, -1, -10, -10, -86, -1, -8, -18, -17, -4, -86, -8, -7, -4, -9, -21, -10, -86, -19, -13, -4, -19, -1, -9, -3, -2, -21, -8, -19, -17, -3, -43, -36, -45, -45};
    }

    static {
        A0L();
        A02 = new Object[]{null};
    }

    public static int A00(String str) {
        return A0C(null, str, 0, null, null, null, null);
    }

    public static int A01(String str, int i10) {
        int length = str.length();
        char ch = 0;
        while (i10 < length) {
            int index = str.charAt(i10);
            if (index == 37) {
                int formatLen = A02(str, i10);
                if (formatLen == -100) {
                    int index2 = i10 + 1;
                    if (str.charAt(index2) == 37) {
                        i10++;
                        ch = 1;
                    } else {
                        int index3 = i10 + 2;
                        return index3;
                    }
                } else {
                    continue;
                }
            }
            i10++;
        }
        return ch != 0 ? AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES : AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    }

    public static int A02(String str, int i10) {
        int i11 = i10 + 1;
        int nextIndex = str.length();
        if (nextIndex > i11) {
            char charAt = str.charAt(i11);
            if (charAt == 's' || charAt == 'd') {
                return -100;
            }
            char nextChar = A01[6].charAt(15);
            if (nextChar != 'n') {
                A01[1] = "DuYzmbbLi8NR0v6nZg86VBAdA9cmFFLr";
                if (charAt == '%') {
                    return -100;
                }
                return -101;
            }
            throw new RuntimeException();
        }
        return -101;
    }

    public static int A03(@Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4, Object[] objArr) {
        switch (i10) {
            case 0:
                return A00(str);
            case 1:
                return A04(str, obj);
            case 2:
                return A05(str, obj, obj2);
            case 3:
                return A06(str, obj, obj2, obj3);
            case 4:
                return A07(str, obj, obj2, obj3, obj4);
            default:
                return A08(str, objArr);
        }
    }

    public static int A04(@Nullable String str, Object obj) {
        return A0C(null, str, 1, obj, null, null, null);
    }

    public static int A05(@Nullable String str, @Nullable Object obj, Object obj2) {
        return A0C(null, str, 2, obj, obj2, null, null);
    }

    public static int A06(@Nullable String str, @Nullable Object obj, @Nullable Object obj2, Object obj3) {
        return A0C(null, str, 3, obj, obj2, obj3, null);
    }

    public static int A07(@Nullable String str, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4) {
        return A0C(null, str, 4, obj, obj2, obj3, obj4);
    }

    public static int A08(@Nullable String str, Object[] objArr) {
        return A0F(null, str, objArr);
    }

    public static int A09(@Nullable StringBuilder sb, @Nullable Object obj) {
        int i10 = 0;
        if (obj == null) {
            String A0G = A0G(47, 4, 89);
            if (sb == null) {
                int length = A0G.length();
                i10 = 0 + length;
            } else {
                sb.append(A0G);
            }
        } else {
            boolean z10 = obj instanceof Integer;
            if (A01[1].charAt(0) != 'K') {
                A01[6] = "qj7fRfmIIB6kzsQFMAkTgCFneI3s8jGM";
                if (z10) {
                    if (sb == null) {
                        i10 = 0 + 11;
                    } else if (A01[6].charAt(15) != 'n') {
                        A01[6] = "O4ypdRTgmt7luw9ydfRW3B9AFY3tOHa9";
                        int length2 = ((Number) obj).intValue();
                        sb.append(length2);
                    } else {
                        int length3 = ((Number) obj).intValue();
                        sb.append(length3);
                    }
                } else if (obj instanceof Short) {
                    if (sb == null) {
                        i10 = 0 + 6;
                    } else {
                        int length4 = ((Number) obj).intValue();
                        sb.append(length4);
                    }
                } else {
                    boolean z11 = obj instanceof Byte;
                    if (A01[4].length() != 19) {
                        String[] strArr = A01;
                        strArr[3] = "csKQFPsvsd8Y7y0GZsslTGMfIZRxrswf";
                        strArr[2] = "wF53Kmv7ZDAYUPjR0E2wAbKHzATsDJ47";
                        if (z11) {
                            if (sb == null) {
                                i10 = 0 + 4;
                            } else {
                                int length5 = ((Number) obj).intValue();
                                sb.append(length5);
                            }
                        } else if (obj instanceof Long) {
                            if (sb == null) {
                                i10 = 0 + 20;
                            } else {
                                sb.append(((Long) obj).longValue());
                            }
                        } else if (sb == null) {
                            return -1;
                        } else {
                            throw new AssertionError();
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        if (sb == null) {
            return i10;
        }
        return -3;
    }

    public static int A0A(@Nullable StringBuilder sb, @Nullable Object obj) {
        if (obj instanceof Formattable) {
            if (sb == null) {
                return -1;
            }
            throw new AssertionError();
        }
        String str = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else if (obj != null) {
            str = obj.toString();
        }
        if (str == null) {
            str = A0G(47, 4, 89);
        }
        if (sb == null) {
            return str.length();
        }
        sb.append(str);
        return -3;
    }

    public static int A0B(@Nullable StringBuilder sb, String str, int i10, int i11, boolean z10) {
        int length = str.length();
        int i12 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == '%') {
                int formatLen = i10 + 1;
                if (length > formatLen) {
                    int formatLen2 = i10 + 1;
                    if (str.charAt(formatLen2) == 37) {
                        i10++;
                    }
                }
                if (z10) {
                    int index = A01[6].charAt(15);
                    if (index != 110) {
                        A01[1] = "fVpeC838v4d09FxkUxUgJ6CBFHJaQPQZ";
                        return -1;
                    }
                    throw new RuntimeException();
                }
                throw new AssertionError();
            }
            if (sb == null) {
                i12++;
            } else {
                sb.append(charAt);
            }
            i10++;
        }
        if (z10) {
            return i11 + i12;
        }
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r11 != (-201)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005d, code lost:
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005f, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0060, code lost:
        return -3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
        return A0B(r16, r17, r11, r6, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0C(@javax.annotation.Nullable java.lang.StringBuilder r16, @javax.annotation.Nullable java.lang.String r17, @javax.annotation.Nullable int r18, @javax.annotation.Nullable java.lang.Object r19, @javax.annotation.Nullable java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
        /*
            r11 = 0
            r6 = 0
            r5 = 0
            r7 = r16
            if (r7 != 0) goto L53
            r4 = 1
        L8:
            r3 = -1
            r8 = r18
            if (r8 != 0) goto Le
            r5 = -1
        Le:
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC0922Kz.A01
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 19
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC0922Kz.A01
            java.lang.String r1 = "8ynbtcYvJcGQo99l12TWemlAPLQxISIP"
            r0 = 7
            r2[r0] = r1
            r0 = r5
        L23:
            r2 = r17
            if (r0 >= r8) goto L55
            r9 = r7
            r10 = r2
            r15 = r22
            r14 = r21
            r13 = r20
            r12 = r19
            r16 = r0
            int r1 = A0D(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r1 != r3) goto L3a
            return r3
        L3a:
            if (r4 == 0) goto L3d
            int r6 = r6 + r1
        L3d:
            int r11 = A01(r2, r11)
            if (r0 != r5) goto L4b
            r1 = -200(0xffffffffffffff38, float:NaN)
            if (r11 != r1) goto L4d
            if (r4 == 0) goto L4d
            r0 = -2
            return r0
        L4b:
            r1 = -200(0xffffffffffffff38, float:NaN)
        L4d:
            if (r11 >= 0) goto L50
            goto L57
        L50:
            int r0 = r0 + 1
            goto L23
        L53:
            r4 = 0
            goto L8
        L55:
            r1 = -200(0xffffffffffffff38, float:NaN)
        L57:
            if (r11 == r1) goto L5d
            r0 = -201(0xffffffffffffff37, float:NaN)
            if (r11 != r0) goto L62
        L5d:
            if (r4 == 0) goto L60
            return r6
        L60:
            r0 = -3
            return r0
        L62:
            int r0 = A0B(r7, r2, r11, r6, r4)
            return r0
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0922Kz.A0C(java.lang.StringBuilder, java.lang.String, int, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):int");
    }

    public static int A0D(@Nullable StringBuilder sb, @Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, Object obj3, Object obj4, int i11) {
        switch (i11) {
            case -1:
                return A0E(sb, str, i10, null, false);
            case 0:
                return A0E(sb, str, i10, obj, true);
            case 1:
                return A0E(sb, str, i10, obj2, true);
            case 2:
                int A0E = A0E(sb, str, i10, obj3, true);
                if (A01[1].charAt(0) != 'K') {
                    A01[1] = "lLENtgmJN01kc6wViYFGzWwEkJhXf84x";
                    return A0E;
                }
                throw new RuntimeException();
            case 3:
                return A0E(sb, str, i10, obj4, true);
            default:
                throw new AssertionError();
        }
    }

    public static int A0E(@Nullable StringBuilder sb, @Nullable String str, int i10, Object obj, boolean z10) {
        int index;
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt == '%') {
                if (A02(str, i10) != -100) {
                    return -1;
                }
                int index2 = i10 + 1;
                int length2 = str.charAt(index2);
                if (!z10 && length2 != 37) {
                    return -1;
                }
                int formatLen = 1;
                if (length2 == 115) {
                    index = A0A(sb, obj);
                } else if (length2 == 100) {
                    index = A09(sb, obj);
                } else if (length2 == 37) {
                    formatLen = 0;
                    if (sb != null) {
                        sb.append('%');
                    }
                    index = 1;
                    i10++;
                } else {
                    index = -1;
                }
                if (index == -1) {
                    return -1;
                }
                if (sb == null) {
                    i11 += index;
                }
                if (formatLen != 0) {
                    break;
                }
            } else if (sb == null) {
                i11++;
            } else {
                sb.append(charAt);
            }
            i10++;
        }
        if (sb == null) {
            return i11;
        }
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000a, code lost:
        if (r0 == 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A0F(@javax.annotation.Nullable java.lang.StringBuilder r11, @javax.annotation.Nullable java.lang.String r12, java.lang.Object... r13) {
        /*
            r7 = 0
            r6 = 0
            r5 = 0
            if (r11 != 0) goto L50
            r4 = 1
        L6:
            r10 = 0
            if (r13 == 0) goto Lc
            int r0 = r13.length
            if (r0 != 0) goto L25
        Lc:
            java.lang.Object[] r13 = com.facebook.ads.redexgen.X.AbstractC0922Kz.A02
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC0922Kz.A01
            r0 = 0
            r1 = r1[r0]
            r0 = 8
            char r1 = r1.charAt(r0)
            r0 = 103(0x67, float:1.44E-43)
            if (r1 == r0) goto L60
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.AbstractC0922Kz.A01
            java.lang.String r1 = "FyR6wqN"
            r0 = 4
            r2[r0] = r1
            r10 = 1
        L25:
            r9 = 0
            int r8 = r13.length
        L27:
            r3 = -201(0xffffffffffffff37, float:NaN)
            r2 = -200(0xffffffffffffff38, float:NaN)
            if (r5 >= r8) goto L42
            r1 = r13[r5]
            r0 = r10 ^ 1
            int r1 = A0E(r11, r12, r7, r1, r0)
            r0 = -1
            if (r1 != r0) goto L39
            return r0
        L39:
            if (r4 == 0) goto L3c
            int r6 = r6 + r1
        L3c:
            int r7 = A01(r12, r7)
            if (r7 != r2) goto L48
        L42:
            if (r4 == 0) goto L52
            if (r9 != 0) goto L52
            r0 = -2
            return r0
        L48:
            if (r7 != r3) goto L4c
            r9 = 1
            goto L42
        L4c:
            r9 = 1
            int r5 = r5 + 1
            goto L27
        L50:
            r4 = 0
            goto L6
        L52:
            if (r7 == r2) goto L56
            if (r7 != r3) goto L5b
        L56:
            if (r4 == 0) goto L59
            return r6
        L59:
            r0 = -3
            return r0
        L5b:
            int r0 = A0B(r11, r12, r7, r6, r4)
            return r0
        L60:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0922Kz.A0F(java.lang.StringBuilder, java.lang.String, java.lang.Object[]):int");
    }

    public static String A0H(@Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4, Object[] objArr) {
        switch (i10) {
            case 0:
                return A0K(str, new Object[0]);
            case 1:
                return A0K(str, obj);
            case 2:
                return A0K(str, obj, obj2);
            case 3:
                Object[] objArr2 = {obj, obj2, obj3};
                if (A01[6].charAt(15) != 'n') {
                    A01[0] = "XCWvLacnK9ECASwOW0Hv8sDP0GvXvxfm";
                    return A0K(str, objArr2);
                }
                throw new RuntimeException();
            case 4:
                return A0K(str, obj, obj2, obj3, obj4);
            default:
                return A0K(str, objArr);
        }
    }

    public static String A0I(@Nullable String str, @Nullable int i10, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, Object obj4, Object[] objArr) {
        int A03 = A03(str, i10, obj, obj2, obj3, obj4, objArr);
        if (A03 == -1) {
            return A0H(str, i10, obj, obj2, obj3, obj4, objArr);
        }
        if (A03 == -2) {
            return str;
        }
        StringBuilder sb = new StringBuilder(A03);
        if (i10 == -1) {
            A0F(sb, str, objArr);
        } else {
            A0C(sb, str, i10, obj, obj2, obj3, obj4);
        }
        return sb.toString();
    }

    public static String A0J(@Nullable String str, Object obj) {
        return A0I(str, 1, obj, null, null, null, null);
    }

    public static String A0K(@Nullable String str, Object... objArr) {
        try {
            return String.format(null, str, (Object[]) L8.A00(objArr, A0G(2, 45, 124)));
        } catch (MissingFormatArgumentException | UnknownFormatConversionException ex) {
            throw new RuntimeException(ex.getMessage() + A0G(0, 2, 67) + str);
        }
    }
}
