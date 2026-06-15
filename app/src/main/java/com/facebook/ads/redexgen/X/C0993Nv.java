package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Nv  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C0993Nv<K, V> extends AbstractC2005lm<K, V> {
    public static String[] A03 = {"BLd", "8EKeVjTJIU6MDNPM6ZTo", "HWbOsw9VtzWta1ewMSd8SFleZB3uycJV", "4g", "oHZcZe8PYtJP7zuLK1jInYJjmOVWCxEe", "hqSXyAZ2zuGNDHd4PkKakj6NBzhfvhom", "1gwnz8jAk7EqAxYvZHDnpar6edM6d04", "wfrdBhaNwCqY"};
    public static final AbstractC2005lm<Object, Object> A04 = new C0993Nv(null, new Object[0], 0);
    public static final long serialVersionUID = 0;
    public final transient Object[] A00;
    public final transient int A01;
    @CheckForNull
    public final transient Object A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static <K, V> C0993Nv<K, V> A00(int n10, Object[] alternatingKeysAndValues, C2003lk<K, V> builder) {
        Object obj;
        if (n10 == 0) {
            return (C0993Nv) A04;
        }
        if (n10 == 1) {
            AbstractC1949ko.A03(Objects.requireNonNull(alternatingKeysAndValues[0]), Objects.requireNonNull(alternatingKeysAndValues[1]));
            return new C0993Nv<>(null, alternatingKeysAndValues, 1);
        }
        AbstractC1790iD.A01(n10, alternatingKeysAndValues.length >> 1);
        Object A02 = A02(alternatingKeysAndValues, n10, OG.A03(n10), 0);
        if (A02 instanceof Object[]) {
            Object[] objArr = (Object[]) A02;
            C2002lj c2002lj = (C2002lj) objArr[2];
            if (builder == null) {
                throw c2002lj.A02();
            }
            builder.A01 = c2002lj;
            obj = objArr[0];
            n10 = ((Integer) objArr[1]).intValue();
            alternatingKeysAndValues = Arrays.copyOf(alternatingKeysAndValues, n10 * 2);
        } else {
            obj = A02;
        }
        return new C0993Nv<>(obj, alternatingKeysAndValues, n10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nv != com.google.common.collect.RegularImmutableMap<K, V> */
    public C0993Nv(@CheckForNull Object hashTable, Object[] alternatingKeysAndValues, int size) {
        this.A02 = hashTable;
        this.A00 = alternatingKeysAndValues;
        this.A01 = size;
    }

    @CheckForNull
    public static Object A01(@CheckForNull Object hashTableObject, @CheckForNull Object[] alternatingKeysAndValues, int size, int keyOffset, Object key) {
        int keyIndex;
        if (key == null) {
            return null;
        }
        if (size == 1) {
            if (!Objects.requireNonNull(alternatingKeysAndValues[keyOffset]).equals(key)) {
                return null;
            }
            Object obj = alternatingKeysAndValues[keyOffset ^ 1];
            if (A03[3].length() == 2) {
                String[] strArr = A03;
                strArr[4] = "QVSrtcZKARogVSSTsDMErisHHhx3s08I";
                strArr[2] = "AM5zanCyyloF9oZfJSoNtkvSUtakyhf1";
                return Objects.requireNonNull(obj);
            }
        } else if (hashTableObject == null) {
            return null;
        } else {
            if (hashTableObject instanceof byte[]) {
                String[] strArr2 = A03;
                if (strArr2[4].charAt(30) != strArr2[2].charAt(30)) {
                    String[] strArr3 = A03;
                    strArr3[0] = "33E";
                    strArr3[7] = "0IVWz8DDpNA7";
                    byte[] bArr = (byte[]) hashTableObject;
                    int mask = bArr.length - 1;
                    int A00 = AbstractC1990lX.A00(key.hashCode());
                    while (true) {
                        int i10 = A00 & mask;
                        byte b10 = bArr[i10];
                        String[] strArr4 = A03;
                        if (strArr4[0].length() == strArr4[7].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr5 = A03;
                        strArr5[4] = "Av4xGd01JYXCpVUXSFBX5Q3qG21nzo21";
                        strArr5[2] = "UuPO1t2w2j7pNt6wRWMrea5HC47YMJTH";
                        keyIndex = b10 & 255;
                        if (keyIndex == 255) {
                            return null;
                        }
                        boolean equals = key.equals(alternatingKeysAndValues[keyIndex]);
                        String[] strArr6 = A03;
                        if (strArr6[0].length() != strArr6[7].length()) {
                            A03[6] = "uEfKnUldtWRHisqrfIDf4ni9PGEoRP0";
                            if (equals) {
                                break;
                            }
                            A00 = i10 + 1;
                        } else {
                            A03[1] = "rg32th7lbb1pJpYlIRnh";
                            if (equals) {
                                break;
                            }
                            A00 = i10 + 1;
                        }
                    }
                    Object obj2 = alternatingKeysAndValues[keyIndex ^ 1];
                    if (A03[1].length() != 20) {
                        return obj2;
                    }
                    A03[1] = "OPXdJDLfRI5AGRwdD0N1";
                    return obj2;
                }
            } else if (hashTableObject instanceof short[]) {
                short[] sArr = (short[]) hashTableObject;
                int mask2 = sArr.length - 1;
                int A002 = AbstractC1990lX.A00(key.hashCode());
                while (true) {
                    int i11 = A002 & mask2;
                    int h10 = sArr[i11] & 65535;
                    if (h10 == 65535) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h10])) {
                        return alternatingKeysAndValues[h10 ^ 1];
                    }
                    A002 = i11 + 1;
                }
            } else {
                int[] iArr = (int[]) hashTableObject;
                int mask3 = iArr.length - 1;
                int A003 = AbstractC1990lX.A00(key.hashCode());
                while (true) {
                    int i12 = A003 & mask3;
                    int h11 = iArr[i12];
                    if (h11 == -1) {
                        return null;
                    }
                    if (key.equals(alternatingKeysAndValues[h11])) {
                        return alternatingKeysAndValues[h11 ^ 1];
                    }
                    A003 = i12 + 1;
                }
            }
        }
        throw new RuntimeException();
    }

    @CheckForNull
    public static Object A02(Object[] alternatingKeysAndValues, int n10, int tableSize, int keyOffset) {
        if (n10 == 1) {
            AbstractC1949ko.A03(Objects.requireNonNull(alternatingKeysAndValues[keyOffset]), Objects.requireNonNull(alternatingKeysAndValues[keyOffset ^ 1]));
            return null;
        }
        int h10 = tableSize - 1;
        C2002lj c2002lj = null;
        int i10 = -1;
        if (tableSize > 128) {
            if (tableSize <= 32768) {
                short[] hashTable = new short[tableSize];
                Arrays.fill(hashTable, (short) -1);
                int keyIndex = 0;
                for (int i11 = 0; i11 < n10; i11++) {
                    int i12 = (i11 * 2) + keyOffset;
                    int h11 = (keyIndex * 2) + keyOffset;
                    Object value = Objects.requireNonNull(alternatingKeysAndValues[i12]);
                    Object requireNonNull = Objects.requireNonNull(alternatingKeysAndValues[i12 ^ 1]);
                    AbstractC1949ko.A03(value, requireNonNull);
                    int A00 = AbstractC1990lX.A00(value.hashCode());
                    while (true) {
                        int i13 = A00 & h10;
                        int i14 = hashTable[i13] & 65535;
                        if (i14 == 65535) {
                            hashTable[i13] = (short) h11;
                            if (keyIndex < i11) {
                                alternatingKeysAndValues[h11] = value;
                                alternatingKeysAndValues[h11 ^ 1] = requireNonNull;
                            }
                            keyIndex++;
                        } else {
                            boolean equals = value.equals(alternatingKeysAndValues[i14]);
                            if (A03[5].charAt(16) != 'P') {
                                throw new RuntimeException();
                            }
                            A03[5] = "XeR3XdSVagosh0VhP9e0zQ2n8NaTx8OB";
                            if (equals) {
                                c2002lj = new C2002lj(value, requireNonNull, Objects.requireNonNull(alternatingKeysAndValues[i14 ^ 1]));
                                alternatingKeysAndValues[i14 ^ 1] = requireNonNull;
                                break;
                            }
                            A00 = i13 + 1;
                        }
                    }
                }
                return keyIndex == n10 ? hashTable : new Object[]{hashTable, Integer.valueOf(keyIndex), c2002lj};
            }
            int[] hashTable2 = new int[tableSize];
            Arrays.fill(hashTable2, -1);
            int i15 = 0;
            int i16 = 0;
            while (i16 < n10) {
                int i17 = (i16 * 2) + keyOffset;
                int i18 = (i15 * 2) + keyOffset;
                Object requireNonNull2 = Objects.requireNonNull(alternatingKeysAndValues[i17]);
                Object requireNonNull3 = Objects.requireNonNull(alternatingKeysAndValues[i17 ^ 1]);
                AbstractC1949ko.A03(requireNonNull2, requireNonNull3);
                int outKeyIndex = AbstractC1990lX.A00(requireNonNull2.hashCode());
                while (true) {
                    int outKeyIndex2 = outKeyIndex & h10;
                    int i19 = hashTable2[outKeyIndex2];
                    if (i19 == i10) {
                        hashTable2[outKeyIndex2] = i18;
                        if (i15 < i16) {
                            alternatingKeysAndValues[i18] = requireNonNull2;
                            alternatingKeysAndValues[i18 ^ 1] = requireNonNull3;
                        }
                        i15++;
                    } else if (requireNonNull2.equals(alternatingKeysAndValues[i19])) {
                        c2002lj = new C2002lj(requireNonNull2, requireNonNull3, Objects.requireNonNull(alternatingKeysAndValues[i19 ^ 1]));
                        alternatingKeysAndValues[i19 ^ 1] = requireNonNull3;
                        break;
                    } else {
                        outKeyIndex = outKeyIndex2 + 1;
                        i10 = -1;
                    }
                }
                i16++;
                i10 = -1;
            }
            return i15 == n10 ? hashTable2 : new Object[]{hashTable2, Integer.valueOf(i15), c2002lj};
        }
        byte[] bArr = new byte[tableSize];
        Arrays.fill(bArr, (byte) -1);
        int i20 = 0;
        for (int i21 = 0; i21 < n10; i21++) {
            int i22 = (i21 * 2) + keyOffset;
            int i23 = (i20 * 2) + keyOffset;
            Object requireNonNull4 = Objects.requireNonNull(alternatingKeysAndValues[i22]);
            Object requireNonNull5 = Objects.requireNonNull(alternatingKeysAndValues[i22 ^ 1]);
            AbstractC1949ko.A03(requireNonNull4, requireNonNull5);
            int keyIndex2 = AbstractC1990lX.A00(requireNonNull4.hashCode());
            while (true) {
                int keyIndex3 = keyIndex2 & h10;
                int previousKeyIndex = bArr[keyIndex3] & 255;
                if (previousKeyIndex == 255) {
                    bArr[keyIndex3] = (byte) i23;
                    if (i20 < i21) {
                        alternatingKeysAndValues[i23] = requireNonNull4;
                        alternatingKeysAndValues[i23 ^ 1] = requireNonNull5;
                    }
                    i20++;
                } else if (requireNonNull4.equals(alternatingKeysAndValues[previousKeyIndex])) {
                    c2002lj = new C2002lj(requireNonNull4, requireNonNull5, Objects.requireNonNull(alternatingKeysAndValues[previousKeyIndex ^ 1]));
                    alternatingKeysAndValues[previousKeyIndex ^ 1] = requireNonNull5;
                    break;
                } else {
                    keyIndex2 = keyIndex3 + 1;
                }
            }
        }
        return i20 == n10 ? bArr : new Object[]{bArr, Integer.valueOf(i20), c2002lj};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nv != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2005lm
    public final AbstractC1996ld<V> A0A() {
        return new C04793b(this.A00, 1, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nv != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2005lm
    public final OG<Map.Entry<K, V>> A0D() {
        return new C04933p(this, this.A00, 0, this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nv != com.google.common.collect.RegularImmutableMap<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<K> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2005lm
    public final OG<K> A0E() {
        final C04793b c04793b = new C04793b(this.A00, 0, this.A01);
        return new OG<K>(this, c04793b) { // from class: com.facebook.ads.redexgen.X.3o
            public final transient OI<K> A00;
            public final transient AbstractC2005lm<K, ?> A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3o != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<K> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lm != com.google.common.collect.ImmutableMap<K, ?> */
            {
                this.A01 = this;
                this.A00 = c04793b;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3o != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
            public final int A0I(Object[] dst, int offset) {
                return A0J().A0I(dst, offset);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3o != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.X.OG, com.facebook.ads.redexgen.X.AbstractC1996ld
            public final OI<K> A0J() {
                return this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3o != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3o != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            /* renamed from: A0N */
            public final AbstractC2173oj<K> iterator() {
                return A0J().iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3o != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // com.facebook.ads.redexgen.X.AbstractC1996ld, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final boolean contains(@CheckForNull Object object) {
                return this.A01.get(object) != null;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.3o != com.google.common.collect.RegularImmutableMap$KeySet<K> */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public final int size() {
                return this.A01.size();
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nv != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2005lm
    public final boolean A0F() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nv != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC2005lm, java.util.Map
    @CheckForNull
    public final V get(@CheckForNull Object key) {
        V v10 = (V) A01(this.A02, this.A00, this.A01, 0, key);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Nv != com.google.common.collect.RegularImmutableMap<K, V> */
    @Override // java.util.Map
    public final int size() {
        return this.A01;
    }
}
