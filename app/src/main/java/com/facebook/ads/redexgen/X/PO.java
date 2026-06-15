package com.facebook.ads.redexgen.X;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class PO implements InterfaceC1583em {
    public static String[] A02 = {"qG0UPMRGTXd5CQUZlvEnUJh4SiYxbqTd", "jBli3bwyMSD1TOoeRzkjUA7", "y89tkDASx2B7csG1AZ7hbWX7UvNubTul", "sj0qBufHGOHXQvZz1iWrsB2L", "GmHE", "GyRRfsLxZSK8ckGTMUM2G3BZ", "eQ9dSC", "HbjoUe4Mv2Tb3u3EPQBzrDZ"};
    public static final PO A03 = new PO(Collections.emptyMap());
    public int A00;
    public final Map<String, byte[]> A01;

    public PO() {
        this(Collections.emptyMap());
    }

    public PO(Map<String, byte[]> metadata) {
        this.A01 = Collections.unmodifiableMap(metadata);
    }

    public static Map<String, byte[]> A00(Map<String, byte[]> otherMetadata, C1584en c1584en) {
        HashMap hashMap = new HashMap(otherMetadata);
        A01(hashMap, c1584en.A08());
        A02(hashMap, c1584en.A09());
        return hashMap;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(java.util.HashMap<java.lang.String, byte[]> r2, java.util.List<java.lang.String> r3) {
        /*
            r1 = 0
        L1:
            int r0 = r3.size()
            if (r1 >= r0) goto L11
            java.lang.Object r0 = r3.get(r1)
            r2.remove(r0)
            int r1 = r1 + 1
            goto L1
        L11:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.PO.A01(java.util.HashMap, java.util.List):void");
    }

    public static void A02(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (A02[7].length() == 21) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "O8YFDJ0srfU16hiGIa3AqDTvvnovbOx3";
            strArr[0] = "P4eVlFUbQVLxOEADUeRL69YsgYNtbckR";
            hashMap.put(key, A04(entry.getValue()));
        }
    }

    public static boolean A03(Map<String, byte[]> second, Map<String, byte[]> map) {
        if (second.size() != map.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : second.entrySet()) {
            byte[] value = entry.getValue();
            String[] strArr = A02;
            if (strArr[2].charAt(28) != strArr[0].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "4gHZYV7qNEQ2E9KU3anRDvxm";
            strArr2[3] = "hKHw0uXfbDWWetrMARcvXB9h";
            byte[] value2 = value;
            if (!Arrays.equals(value2, map.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static byte[] A04(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(AbstractC1758hd.A06);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public final PO A05(C1584en c1584en) {
        Map<String, byte[]> A00 = A00(this.A01, c1584en);
        Map<String, byte[]> mutatedMetadata = this.A01;
        if (A03(mutatedMetadata, A00)) {
            return this;
        }
        return new PO(A00);
    }

    public final Set<Map.Entry<String, byte[]>> A06() {
        return this.A01.entrySet();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1583em
    public final long A6X(String str, long j10) {
        byte[] bytes = this.A01.get(str);
        if (bytes != null) {
            return ByteBuffer.wrap(bytes).getLong();
        }
        return j10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1583em
    public final String A6Z(String str, String str2) {
        byte[] bArr = this.A01.get(str);
        if (bArr != null) {
            return new String(bArr, AbstractC1758hd.A06);
        }
        return str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A03(this.A01, ((PO) obj).A01);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int i10 = 0;
            for (Map.Entry<String, byte[]> entry : this.A01.entrySet()) {
                int hashCode = entry.getKey().hashCode();
                int hashCode2 = Arrays.hashCode(entry.getValue());
                if (A02[7].length() == 21) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[5] = "1sXwMSmaAdrnJ5Ti8W8uaKU2";
                strArr[3] = "L4okRAxrSmb4Ik3dtrZTMpYe";
                i10 += hashCode ^ hashCode2;
            }
            this.A00 = i10;
        }
        int result = this.A00;
        return result;
    }
}
