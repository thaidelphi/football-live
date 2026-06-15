package b7;

import java.math.BigInteger;
/* compiled from: JsonPrimitive.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class o extends j {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?>[] f5275b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a  reason: collision with root package name */
    private Object f5276a;

    public o(Boolean bool) {
        u(bool);
    }

    private static boolean p(o oVar) {
        Object obj = oVar.f5276a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    private static boolean r(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f5275b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f5276a == null) {
            return oVar.f5276a == null;
        } else if (p(this) && p(oVar)) {
            return m().longValue() == oVar.m().longValue();
        } else {
            Object obj2 = this.f5276a;
            if ((obj2 instanceof Number) && (oVar.f5276a instanceof Number)) {
                double doubleValue = m().doubleValue();
                double doubleValue2 = oVar.m().doubleValue();
                if (doubleValue != doubleValue2) {
                    return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
                }
                return true;
            }
            return obj2.equals(oVar.f5276a);
        }
    }

    public boolean h() {
        if (o()) {
            return i().booleanValue();
        }
        return Boolean.parseBoolean(n());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f5276a == null) {
            return 31;
        }
        if (p(this)) {
            doubleToLongBits = m().longValue();
        } else {
            Object obj = this.f5276a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(m().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    Boolean i() {
        return (Boolean) this.f5276a;
    }

    public double j() {
        return q() ? m().doubleValue() : Double.parseDouble(n());
    }

    public int k() {
        return q() ? m().intValue() : Integer.parseInt(n());
    }

    public long l() {
        return q() ? m().longValue() : Long.parseLong(n());
    }

    public Number m() {
        Object obj = this.f5276a;
        return obj instanceof String ? new d7.e((String) obj) : (Number) obj;
    }

    public String n() {
        if (q()) {
            return m().toString();
        }
        if (o()) {
            return i().toString();
        }
        return (String) this.f5276a;
    }

    public boolean o() {
        return this.f5276a instanceof Boolean;
    }

    public boolean q() {
        return this.f5276a instanceof Number;
    }

    public boolean s() {
        return this.f5276a instanceof String;
    }

    void u(Object obj) {
        if (obj instanceof Character) {
            this.f5276a = String.valueOf(((Character) obj).charValue());
            return;
        }
        d7.a.a((obj instanceof Number) || r(obj));
        this.f5276a = obj;
    }

    public o(Number number) {
        u(number);
    }

    public o(String str) {
        u(str);
    }
}
