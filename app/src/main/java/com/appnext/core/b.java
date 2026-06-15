package com.appnext.core;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class b {
    private String cat;
    private String cc;
    private String cd;
    private int ce;
    private int cf;
    private int cnt;
    private String pbk;

    public b(Ad ad) {
        this.cc = "";
        this.cat = "";
        this.cd = "";
        this.pbk = "";
        try {
            this.cc = ad.getPlacementID();
            this.cat = ad.getCategories();
            this.cd = ad.getSpecificCategories();
            this.pbk = ad.getPostback();
            this.ce = ad.getMinVideoLength();
            this.cf = ad.getMaxVideoLength();
            this.cnt = ad.getCount();
        } catch (Throwable th) {
            com.appnext.base.a.a("AdKey$AdKey", th);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        try {
            if (b.class.isInstance(obj) || obj.getClass().isInstance(this)) {
                if (obj instanceof b) {
                    return ((b) obj).cc.equals(this.cc) && ((b) obj).cat.equals(this.cat) && ((b) obj).cd.equals(this.cd) && ((b) obj).pbk.equals(this.pbk) && ((b) obj).ce == this.ce && ((b) obj).cf == this.cf && ((b) obj).cnt == this.cnt;
                }
                return super.equals(obj);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final int hashCode() {
        return (((((((((((this.cc.hashCode() * 31) + this.cat.hashCode()) * 31) + this.cd.hashCode()) * 31) + this.pbk.hashCode()) * 31) + this.ce) * 31) + this.cf) * 31) + this.cnt;
    }
}
