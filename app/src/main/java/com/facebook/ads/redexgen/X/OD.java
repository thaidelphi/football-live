package com.facebook.ads.redexgen.X;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class OD {
    public static String[] A05 = {"0BKZdbiMK21cfN3DVH", "bDTrafSU2yR61ulXmmxRl3QWDaNfGOmb", "OZEM", "vmJx", "LpQQIWayl0NlCdExkUhaAGtWnbTZCPW3", "2gYXqUdZP", "1B1yyPY864hZmLPG6EyqRdQa", "9qLoIS8t6u9FHWbHpW1s0YPXfy7"};
    public final int A00;
    public final int A01;
    public final ZM A02;
    public final ZM A03;
    public final String A04;

    public OD(String str, ZM zm, ZM zm2, int i10, int i11) {
        AbstractC1589es.A07(i10 == 0 || i11 == 0);
        this.A04 = AbstractC1589es.A05(str);
        this.A03 = (ZM) AbstractC1589es.A01(zm);
        this.A02 = (ZM) AbstractC1589es.A01(zm2);
        this.A01 = i10;
        this.A00 = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OD od = (OD) obj;
        if (this.A01 == od.A01 && this.A00 == od.A00 && this.A04.equals(od.A04) && this.A03.equals(od.A03)) {
            ZM zm = this.A02;
            if (A05[0].length() != 18) {
                throw new RuntimeException();
            }
            A05[0] = "SAbEVVjFZaS9IcgdLB";
            if (zm.equals(od.A02)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A01;
        int hashCode2 = this.A04.hashCode();
        int hashCode3 = this.A02.hashCode();
        return (((((((((17 * 31) + hashCode) * 31) + this.A00) * 31) + hashCode2) * 31) + this.A03.hashCode()) * 31) + hashCode3;
    }
}
