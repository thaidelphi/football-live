package d7;

import java.math.BigDecimal;
/* compiled from: LazilyParsedNumber.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class e extends Number {

    /* renamed from: a  reason: collision with root package name */
    private final String f24365a;

    public e(String str) {
        this.f24365a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f24365a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            String str = this.f24365a;
            String str2 = ((e) obj).f24365a;
            return str == str2 || str.equals(str2);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f24365a);
    }

    public int hashCode() {
        return this.f24365a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f24365a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f24365a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f24365a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f24365a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f24365a).longValue();
        }
    }

    public String toString() {
        return this.f24365a;
    }
}
